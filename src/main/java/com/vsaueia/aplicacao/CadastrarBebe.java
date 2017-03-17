package com.vsaueia.aplicacao;

import com.vsaueia.infra.BebeRepository;
import com.vsaueia.model.Bebe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class CadastrarBebe {

    private BebeRepository bebeRepository;

    @Autowired
    public CadastrarBebe(BebeRepository bebeRepository) {
        this.bebeRepository = bebeRepository;
    }

    public BebeDto inserir(BebeDto bebeDto) {
        Bebe novoBebe = new Bebe(bebeDto.nome, LocalDate.parse(bebeDto.dataDeNascimento,
                DateTimeFormatter.ISO_DATE));
        Bebe bebeSalvo = bebeRepository.save(novoBebe);
        return new BebeDto(bebeSalvo.getId());
    }
}
