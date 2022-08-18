package org.spring.springboot.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wjf
 */
@RestController
public class UserListController {
    UserList userItem =  new UserList(1, "jf", "123");
    UserList[] list =  new UserList[]{userItem, userItem};
    @RequestMapping("/userList")
    public UserList[] returnUser( ) {
        return  list;
    }
}
