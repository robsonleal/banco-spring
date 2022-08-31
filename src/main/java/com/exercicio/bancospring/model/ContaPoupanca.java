package com.exercicio.bancospring.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.math.RoundingMode;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tb_conta_poupanca")
public class ContaPoupanca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPoupanca;

    @OneToOne
    private Cliente cliente;

    private BigDecimal saldo = new BigDecimal(0).setScale(4, RoundingMode.HALF_EVEN);

    public Double depoistar(Double valor){
        this.saldo = saldo.add(new BigDecimal(valor).setScale(4, RoundingMode.HALF_EVEN));
        return saldo.doubleValue();
    }

    public Double retirar(Double valor){
        this.saldo = saldo.subtract(new BigDecimal(valor).setScale(4, RoundingMode.HALF_EVEN));
        return saldo.doubleValue();
    }

}
