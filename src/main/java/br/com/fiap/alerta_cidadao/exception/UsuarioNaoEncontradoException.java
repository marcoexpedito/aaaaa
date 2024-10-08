package br.com.fiap.alerta_cidadao.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UsuarioNaoEncontradoException
        extends RuntimeException{
    public UsuarioNaoEncontradoException(String message) {
        super(message);
    }
}
