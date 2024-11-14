package com.example.miproyecto.controladoras;

import com.example.miproyecto.modelos.Cliente;
import com.example.miproyecto.servicios.ServicioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ControladoraCliente {
    @Autowired
    private ServicioCliente servicioCliente;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> consultarClientes(){
        List<Cliente> clientes = servicioCliente.consultarClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }
}
