package com.yourcompany.trabalho.model;

import java.math.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Produto {
    @Column(length=5)
    @Id
    int id;

    @Column(length=20)
    @Required
    String produto;

    @Column(length=255)
    @Required
    String descricao;

    @Stereotype("MONEY")
    BigDecimal price;

}