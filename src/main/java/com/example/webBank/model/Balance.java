package com.example.webBank.model;

import com.example.webBank.views.ViewsJson;
import com.fasterxml.jackson.annotation.JsonView;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name="balance")
public class Balance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @Column(name="currentBalance")
    @JsonView(ViewsJson.CurrentBalance.class)
    private BigDecimal currentBalance;
}
