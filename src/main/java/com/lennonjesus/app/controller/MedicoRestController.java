package com.lennonjesus.app.controller;

import com.lennonjesus.app.entity.Medico;
import com.lennonjesus.app.service.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 *
 */
@RestController
public class MedicoRestController {

    @Autowired
    private IMedicoService medicoService;

    @RequestMapping(value = "/medico", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void salvar(@Valid @RequestBody Medico medico) {

        medicoService.salvar(medico);


    }


}
