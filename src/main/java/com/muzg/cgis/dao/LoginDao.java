package com.muzg.cgis.dao;

import org.springframework.stereotype.Component;

@Component(value = "loginMapper")
public interface LoginDao {

    String findUsername(String username);

    String findPassword(String username,String password);

    String superFindUsername(String username);

    String superFindPassword(String username,String password);

}
