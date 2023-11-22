package com.autico.auticoapp.Models;

import java.io.Serializable;
import java.util.Date;

import com.autico.auticoapp.Shared.Enums.Role;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@DynamicUpdate
@Table(name="user_login")
public class User implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="username")
    private String username;
    @Column(name="password")
    private String password;
    @Column(name="prev_password")
    private String prevPassword;
    @Column(name="wrong_login_atempt")
    private Integer wrongLoginAtempt;
    @Column(name="login_acccess")
    private Integer loginAcccess;
    @Column(name="role")
    private Role role;
    @Column(name="is_logged")
    private String isLogged;
    @Column(name="last_logged_day")
    private Date lastLoggedDay;
    @Column(name="lopd")
    private boolean lopd;
}
