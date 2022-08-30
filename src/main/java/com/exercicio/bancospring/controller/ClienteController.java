package com.exercicio.bancospring.controller;


import com.exercicio.bancospring.model.Cliente;
import com.exercicio.bancospring.service.ClienteService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {


    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listaClientes(){
        return clienteService.listaClientes();
    }

    @PostMapping
    public ResponseEntity<Cliente> addCliente (@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.addCliente(cliente));
    }

}
