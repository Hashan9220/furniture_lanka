package com.furniture_lanka.repository;


import com.furniture_lanka.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Hashan Saminda <hashansaminda21@gmail.com> (Rdxhashan.tk/)
 * @since 10/9/2021
 */
public interface LoginRepo extends JpaRepository<Login,String> {
    public Login getLoginByName(String name);
}
