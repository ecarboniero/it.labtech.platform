package it.labtech.platform.api.om;

import java.io.Serializable;
import java.util.Set;

public class Order implements Serializable {
    private static final long serialVersionUID = -4649034874357333870L;
    private Integer number;
    private String code;
    private Set<User> users;

    public Order() {
    }

    public Order(Integer number, String code) {
        this.number = number;
        this.code = code;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
