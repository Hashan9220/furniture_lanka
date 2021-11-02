package com.furniture_lanka.service;

import com.furniture_lanka.dto.LoginDTO;
import com.furniture_lanka.entity.Login;
import com.furniture_lanka.repository.LoginRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Console;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)

 */
@Service
@Transactional
public class LoginService {

    @Autowired
    private LoginRepo repo;

    public boolean saveLogin(LoginDTO dto){
        Login user = repo.getLoginByName(dto.getName());

        if (user.getPassword() == dto.getPassword()) {
            System.out.println("Success");
            return true;
        }


        return false;

    }
}
