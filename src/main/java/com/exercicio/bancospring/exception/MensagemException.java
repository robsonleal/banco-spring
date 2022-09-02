package com.exercicio.bancospring.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.Instant;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MensagemException implements Serializable {

    private Instant timestamp;
    private Integer status;
    private String erros;
    private String message;
    private String path;


}
