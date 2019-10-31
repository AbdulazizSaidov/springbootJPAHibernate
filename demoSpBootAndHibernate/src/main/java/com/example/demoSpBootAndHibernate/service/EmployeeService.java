package com.example.demoSpBootAndHibernate.service;

import com.example.demoSpBootAndHibernate.model.User;
import com.example.demoSpBootAndHibernate.repositories.EmployeeRepository;
import com.example.demoSpBootAndHibernate.model.Employee;
import com.example.demoSpBootAndHibernate.repositories.RoleRepository;
import com.example.demoSpBootAndHibernate.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository imp;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    public Employee create(Employee employee){
        imp.save(employee);
        return employee;
    }

    public boolean verification(String login, String password){

        User user = userRepository.findByName(login);
        if (user!=null){
            return true;
        }else{
            return false;
        }

    }
}
