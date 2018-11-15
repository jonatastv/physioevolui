/*
 * Copyright (c) Criado por: Vitor Pimenta Marques  2018.
 */

package com.projetointegrador.physioevolui.utils;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

/**
 * classe responsável pelos métodos que podem ser utilizados em todas os pacotes
 */
@Component
public class Utils {

    public boolean isEmpty(String s) {
        if (s != null && !s.trim().equals(""))
            return false;
        else return true;
    }

    public URI retornarURL(String string) {
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/" + string).build().toUri();
        return uri;
    }
}
