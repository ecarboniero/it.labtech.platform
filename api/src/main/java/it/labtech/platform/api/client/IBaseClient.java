package it.labtech.platform.api.client;

import it.labtech.platform.api.om.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Set;

@FeignClient("base")
public interface IBaseClient {

    @RequestMapping(method = RequestMethod.GET, value = "/user")
    Set<User> getUsers();

}
