package com.lennonjesus.app.repository;

import com.lennonjesus.app.entity.Mensagem;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by lennonjesus on 28/08/15.
 */
public interface IMensagemRepository extends CrudRepository<Mensagem, Long> {
}
