package it.labtech.platform.api.endpoint;

import it.labtech.platform.api.om.Order;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping(value = "/order", produces = MediaType.APPLICATION_JSON_VALUE)
public interface IOrder {

    @GetMapping
    Order getOrder();
}
