package com.soudcodeapi.demo.repositories;

import com.soudcodeapi.demo.models.Pedido;
import com.soudcodeapi.demo.models.PizzaPedida;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class PizzaRepository {

    @Repository
    public interface PizzaPedidaRepository extends JpaRepository<PizzaPedida, Long> {
    }

    @Repository
    public interface TamanhoRepository extends JpaRepository<PizzaPedida.Tamanho, Integer> {
    }

    @Repository
    public interface PizzaPedidaHasIngredienteRepository extends JpaRepository<PizzaPedida.PizzaPedidaHasIngrediente, Long> {
    }

    @Repository
    public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    }
}
