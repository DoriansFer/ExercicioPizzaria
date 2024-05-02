package com.soudcodeapi.demo.models;

import jakarta.persistence.*;

@Entity
public class PizzaPedidaHasIngrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idPizzaPedida;

    private Integer idIngrediente;

    @ManyToOne
    @JoinColumn(name = "idPizzaPedida")
    private PizzaPedida pizzaPedida;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdPizzaPedida() {
        return idPizzaPedida;
    }

    public void setIdPizzaPedida(Long idPizzaPedida) {
        this.idPizzaPedida = idPizzaPedida;
    }

    public Integer getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(Integer idIngrediente) {
        this.idIngrediente = idIngrediente;
    }
}
