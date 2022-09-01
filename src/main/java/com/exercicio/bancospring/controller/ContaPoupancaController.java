package com.exercicio.bancospring.controller;

import com.exercicio.bancospring.model.ContaPoupanca;
import com.exercicio.bancospring.service.ContaPoupancaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/contapoupanca")
public class ContaPoupancaController {
    @Autowired
    ContaPoupancaService contaPoupancaService;

    @GetMapping("/contapoupanca/info/{id}")
    public ContaPoupanca informacoesPoupanca(@PathVariable Long id){
        return contaPoupancaService.informacoesPoupanca(id);
    }
}
