package com.muzg.cgis.service;

public interface LoginService {

    String findUsername(String username);

    String findPassword(String username,String password);

    String superFindUsername(String username);

    String superFindPassword(String username,String password);

}
