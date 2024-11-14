package com.example.miproyecto.servicios;

import com.example.miproyecto.modelos.Cliente;
import com.example.miproyecto.repositorios.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicioCliente {

    @Autowired
    private RepositorioCliente rep;

    public List<Cliente> consultarClientes(){
        return rep.consultar();
    }
}
