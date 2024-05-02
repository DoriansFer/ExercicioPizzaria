package com.soudcodeapi.demo.models;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.List;


@Entity
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;

    private Long idCliente;

    private Integer idFornada;

    private Timestamp dataHora;

    @OneToMany(mappedBy = "pedido")
    private List<PizzaPedida> pizzasPedidas;

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public Integer getIdFornada() {
        return idFornada;
    }

    public void setIdFornada(Integer idFornada) {
        this.idFornada = idFornada;
    }

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }
}
