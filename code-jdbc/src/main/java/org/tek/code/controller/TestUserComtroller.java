package org.tek.code.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.tek.code.model.TestUser;
import org.tek.code.service.impl.TestUserServiceImpl;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Nick
 * @date 2020/11/14
 */
@RestController
public class TestUserComtroller {

    @Autowired
    private TestUserServiceImpl testUserService;

    @GetMapping(value = "/getUserInfoById")
    @ResponseBody
    public TestUser getUserInfo(String id) {
        return testUserService.getUserById(id);
    }
}
