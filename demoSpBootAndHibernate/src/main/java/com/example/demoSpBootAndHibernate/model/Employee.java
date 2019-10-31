package com.example.demoSpBootAndHibernate.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity(name = "Employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "middle_name")
    private String middleName;
    private String login;
    private String password;
    private String confirmPassword;
    private String position;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "phone_number")
    private String phoneNumber;
    private String filial;
    private String action;
    private String filter;



}
