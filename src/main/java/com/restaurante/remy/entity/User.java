package com.restaurante.remy.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "user")
public class User {
    @Column(name = "username", nullable = false, length = 16)
    private String username;

    @Column(name = "email")
    private String email;

    @Column(name = "password", nullable = false, length = 32)
    private String password;

    @Column(name = "create_time")
    private Instant createTime;

}