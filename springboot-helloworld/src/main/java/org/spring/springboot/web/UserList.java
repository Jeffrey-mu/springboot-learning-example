package org.spring.springboot.web;

/**
 * @author wjf
 */
public class UserList {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer id;

    public String name;

    public String password;

    public UserList(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }



}
