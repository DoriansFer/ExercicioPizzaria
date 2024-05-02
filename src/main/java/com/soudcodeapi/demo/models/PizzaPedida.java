package com.soudcodeapi.demo.models;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class PizzaPedida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPizzaPedida;

    private Long idPedido;

    private Integer idPizza;

    private Integer idTamanho;

    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "idTamanho") // 1 pizza pode ter apenas 1 tamanho
    private Tamanho tamanho;

    @OneToMany(mappedBy = "pizzaPedida") // vários ingredientes
    private List<PizzaPedidaHasIngrediente> ingredientes;

    @ManyToOne
    @JoinColumn(name = "idPedido")
    private Pedido pedido; // estar em 1 pedido

    public Long getIdPizzaPedida() {
        return idPizzaPedida;
    }

    public void setIdPizzaPedida(Long idPizzaPedida) {
        this.idPizzaPedida = idPizzaPedida;
    }

    public Long getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Long idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdTamanho() {
        return idTamanho;
    }

    public void setIdTamanho(Integer idTamanho) {
        this.idTamanho = idTamanho;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(Integer idPizza) {
        this.idPizza = idPizza;
    }

    @Entity

    public static class Tamanho {
        @Id
        private Integer idTamanho;

        private String nome;

        private Float desconto;

        @OneToMany(mappedBy = "tamanho")
        private List<PizzaPedida> pizzasPedidas;
    }


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
}
