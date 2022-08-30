package com.exercicio.bancospring.service;


import com.exercicio.bancospring.model.Cliente;
import com.exercicio.bancospring.repository.ClienteRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //Lista todos os clientes
    public List<Cliente> listaClientes() {
        return clienteRepository.findAll();
    }

    //Adiciona Cliente
    public Cliente addCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }


    //Deleta cliente por id
    public void deletaCliente(Long id) {

//        Cliente cliente = clienteRepository.findById(id).orElseThrow( () -> new EntidadeNaoEncontradaException("Id de cliente não encontrado"));
//
//        clienteRepository.deleteById(cliente.getIdCliente());

        clienteRepository.deleteById(id);
    }

    //Localiza cliente por ID
    public Cliente clientePorId(Long id) {

        Cliente cliente = clienteRepository.findById(id).get();

//        Cliente cliente = clienteRepository.findById(id).orElseThrow( () -> new EntidadeNaoEncontradaException("Id de cliente não encontrado"));

        return cliente;
    }


    //Edita cliente
    public Cliente editaCliente(Long id, Cliente cliente) {
        Cliente clienteEditado = clienteRepository.findById(id).get();
        //Tratar a exceção

        BeanUtils.copyProperties(cliente, clienteEditado, "idCliente");

        return clienteRepository.save(clienteEditado);

    }

    //Localizar cliente por nome
    //Localizar cliente por cidade
    //Localizar Cliente por tipo de conta



}
