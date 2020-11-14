package org.tek.code.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.tek.code.model.TestUser;

/**
 * @author Nick
 * @date 2020/11/14
 */
@Mapper
public interface TestUserMapper {

    TestUser getUserById(String id);

}
