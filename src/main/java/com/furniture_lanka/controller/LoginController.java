package com.furniture_lanka.controller;

import com.furniture_lanka.dto.LoginDTO;
import com.furniture_lanka.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)

 */
@RestController
@RequestMapping("/api/v1/login")
@CrossOrigin("*")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping
    public boolean saveLogin(@RequestBody LoginDTO dto){
        boolean b=loginService.saveLogin(dto);
        return b;
    }
}
