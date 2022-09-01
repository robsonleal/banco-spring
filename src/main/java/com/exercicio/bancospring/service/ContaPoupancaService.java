package com.exercicio.bancospring.service;

import com.exercicio.bancospring.model.ContaPoupanca;
import com.exercicio.bancospring.repository.ContaPoupancaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContaPoupancaService {
    @Autowired
    ContaPoupancaRepository contaPoupancaRepository;

    public ContaPoupanca validarContaPoupanca(Long id){
        Optional<ContaPoupanca> auxConta = contaPoupancaRepository.findById(id);
        if(auxConta.isEmpty()){
            return null;
        }
        return auxConta.get();
    }
    public ContaPoupanca informacoesPoupanca(Long id) {
        return validarContaPoupanca(id);
    }
}
