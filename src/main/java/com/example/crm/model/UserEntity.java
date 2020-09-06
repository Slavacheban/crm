package com.example.crm.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class UserEntity extends BaseEntity {
    private String login;
    private String password;
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
}


