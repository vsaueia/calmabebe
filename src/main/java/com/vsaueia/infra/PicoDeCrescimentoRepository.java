package com.vsaueia.infra;

import com.vsaueia.model.PicoDeCrescimento;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface PicoDeCrescimentoRepository extends CrudRepository<PicoDeCrescimento, Long>{
    @Query("SELECT p FROM PicoDeCrescimento p WHERE :semanasDoBebe BETWEEN p.semanas_inicial and p.semanas_final")
    List<PicoDeCrescimento> findPicoDeCrescimento(@Param("semanasDoBebe") int semanasDoBebe);
}
