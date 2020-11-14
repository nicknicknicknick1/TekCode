package org.tek.code.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Nick
 * @date 2020/11/14
 */
@Data
public class TestUser {

    private String id;
    private String name;
    private String age;
    private String phone;
    private String address;

    @Override
    public String toString() {
        return "testUser{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public TestUser() {
    }

    public TestUser(String id, String name, String age, String phone, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }
}
