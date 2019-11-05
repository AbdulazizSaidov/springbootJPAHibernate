package com.example.demoSpBootAndHibernate.controller;

import com.example.demoSpBootAndHibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;


    HttpSession session;

    @GetMapping("/test")
    public boolean autarization(@RequestParam("login") String login,
                                @RequestParam("password") String password, HttpServletRequest request){


        if (request.getSession(false)==null) {
            session = request.getSession();
        }
        session.setAttribute("login", login);
        session.setAttribute("password", password);
//        return service.verification(login, password);
        return false;

     }
}
