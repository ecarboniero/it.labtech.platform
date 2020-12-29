package it.labtech.platform.api.impl;

import it.labtech.platform.api.client.IBaseClient;
import it.labtech.platform.api.endpoint.IOrder;
import it.labtech.platform.api.om.Order;
import it.labtech.platform.api.om.User;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class DefaultOrderImpl implements IOrder {

    private IBaseClient baseClient;

    public DefaultOrderImpl(IBaseClient baseClient) {
        this.baseClient = baseClient;
    }

    @Override
    public Order getOrder() {
        Order order = new Order(1000, "QWERTY");

        Set<User> users = this.baseClient.getUsers();
        order.setUsers(users);

        return order;
    }
}
