package com.lennonjesus.app.service.core;

import com.lennonjesus.app.entity.Medico;
import com.lennonjesus.app.repository.MedicoRepository;
import com.lennonjesus.app.service.IMedicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 */
@Service
public class MedicoService implements IMedicoService {

    @Autowired
    private MedicoRepository medicoRepository;

    @Override
    public void salvar(Medico medico) {
        medicoRepository.save(medico);
    }
}
