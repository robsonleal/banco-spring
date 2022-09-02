package com.exercicio.bancospring.exception;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.Instant;

@ControllerAdvice
public class NaoEncontradoExceptionHandler {

   @ExceptionHandler(NaoEncontradoException.class)
    public ResponseEntity<MensagemException> naoEncontradoException (NaoEncontradoException e, HttpServletRequest request){

       MensagemException msg = new MensagemException();

       msg.setTimestamp(Instant.now());
       msg.setStatus(HttpStatus.NOT_FOUND.value());
       msg.setErros("Não encontrado");
       msg.setMessage(e.getMessage());
       msg.setPath(request.getRequestURI());


       return ResponseEntity.status(HttpStatus.NOT_FOUND).body(msg);
   }



}
