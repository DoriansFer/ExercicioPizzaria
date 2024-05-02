package com.soudcodeapi.demo.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Bebida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nome;

    @Column
    private BigDecimal preco;

    @ManyToMany(mappedBy = "bebidas")
    private Set<Pedido> pedidos = new HashSet<>();
}
