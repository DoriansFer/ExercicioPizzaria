package com.soudcodeapi.demo.models;
import jakarta.persistence.*;

import java.util.List;

@Entity

public class Tamanho {
    @Id
    private Integer idTamanho;

    private String nome;

    private Float desconto;

    @OneToMany(mappedBy = "tamanho")
    private List<PizzaPedida> pizzasPedidas;
}
