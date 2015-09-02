package com.lennonjesus.app.controller;

import com.lennonjesus.app.entity.Mensagem;
import com.lennonjesus.app.repository.IMensagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by lennonjesus on 28/08/15.
 */
@RestController
public class MensagemRestController {


    @Autowired
    private IMensagemRepository mensagemRepository;

    @RequestMapping(value = "/mensagem", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public void salvar(@Valid @RequestBody Mensagem mensagem) {
        mensagemRepository.save(mensagem);
    }

    @RequestMapping(value = "/mensagem/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody Mensagem recuperar(@PathVariable("id") String id) {
        Mensagem mensagem = new Mensagem();
        mensagem.setTexto("O AngularJS está funcionando!"); //FIXME hardcoded

        return mensagem;
    }

    @RequestMapping(value = "/mensagem", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody List<Mensagem> listar() {
        return mensagemRepository.findAll();
    }

}
