package org.tek.code.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tek.code.mapper.TestUserMapper;
import org.tek.code.model.TestUser;
import org.tek.code.service.TestUserService;

/**
 * @author Nick
 * @date 2020/11/14
 */
@Service
public class TestUserServiceImpl implements TestUserService {

    @Autowired
    private TestUserMapper testUserMapper;

    @Override
    public TestUser getUserById(String id) {
        return testUserMapper.getUserById(id);
    }
}
