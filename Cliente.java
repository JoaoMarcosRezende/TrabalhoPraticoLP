package com.yourcompany.trabalho.model;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

@Entity @Getter @Setter
public class Cliente {

    @Column(length=5)
    @Id
    int id;

    @Column(length=75)
    @Required
    String nome;

    @Column(length=50)
    @Required
    String email;

    @Column(length=9)
    @Required
    String telefone;
}
