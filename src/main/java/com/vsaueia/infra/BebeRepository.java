package com.vsaueia.infra;


import com.vsaueia.model.Bebe;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;

public interface BebeRepository extends CrudRepository<Bebe, Long>{
    Collection<Bebe> findByNome(String nome);
}
