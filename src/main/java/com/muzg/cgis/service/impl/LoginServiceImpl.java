package com.muzg.cgis.service.impl;

import com.muzg.cgis.dao.LoginDao;
import com.muzg.cgis.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    LoginDao loginDao;

    public String findUsername(String username){
        return loginDao.findUsername(username);
    }

    public String findPassword(String username,String password){
        return loginDao.findPassword(username,password);
    }

    public String superFindUsername(String username){
        return loginDao.superFindUsername(username);
    }

    public String superFindPassword(String username,String password){
        return loginDao.superFindPassword(username,password);
    }
}
