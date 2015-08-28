package com.lennonjesus.app.controller;

import com.lennonjesus.app.entity.Mensagem;
import com.lennonjesus.app.repository.IMensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by lennonjesus on 28/08/15.
 */
@RestController
public class MensagemController {


    @Autowired
    private IMensagemRepository mensagemRepository;

    @RequestMapping(value = "/mensagem", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void salvar(@Valid @RequestBody Mensagem mensagem) {
        mensagemRepository.save(mensagem);
    }

}
