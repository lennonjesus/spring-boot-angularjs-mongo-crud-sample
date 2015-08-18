package com.lennonjesus.app.repository;

import com.lennonjesus.app.entity.Medico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 */
@Repository
public interface MedicoRepository extends CrudRepository<Medico, Long> {

}
