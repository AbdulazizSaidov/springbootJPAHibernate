package com.example.demoSpBootAndHibernate.controller;
import com.example.demoSpBootAndHibernate.model.User;
import com.example.demoSpBootAndHibernate.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/test")
    public boolean autarization(@RequestParam("login") String login,
                             @RequestParam("password") String password){
        return service.verification(login, password);
    }
}
