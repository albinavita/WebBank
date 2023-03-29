package com.example.webBank.model;

import com.example.webBank.views.Views;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="balance")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="currentBalance")
    @JsonView(Views.CurrentBalance.class)
    private Long currentBalance;

}
