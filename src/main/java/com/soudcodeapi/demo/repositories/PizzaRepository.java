package com.soudcodeapi.demo.repositories;

import com.soudcodeapi.demo.models.Pedido;
import com.soudcodeapi.demo.models.PizzaPedida;
import com.soudcodeapi.demo.models.PizzaPedidaHasIngrediente;
import com.soudcodeapi.demo.models.Tamanho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public class PizzaRepository {

    @Repository
    public interface PizzaPedidaRepository extends JpaRepository<PizzaPedida, Long> {
    }

    @Repository
    public interface TamanhoRepository extends JpaRepository<Tamanho, Integer> {
    }

    @Repository
    public interface PizzaPedidaHasIngredienteRepository extends JpaRepository<PizzaPedidaHasIngrediente, Long> {
    }

    @Repository
    public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    }
}
