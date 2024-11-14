package com.example.miproyecto.repositorios;

import com.example.miproyecto.modelos.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RepositorioCliente extends JpaRepository<Cliente, Long> {
    @Query(value = "select c from Cliente c order by c.id desc")
    List<Cliente> consultar();
}
