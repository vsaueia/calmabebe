package com.vsaueia.aplicacao;

import com.vsaueia.infra.BebeRepository;
import com.vsaueia.infra.PicoDeCrescimentoRepository;
import com.vsaueia.model.Bebe;
import com.vsaueia.model.PicoDeCrescimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Collection;
import java.util.Optional;

@Service
public class ConsultaBebe {

    private BebeRepository bebeRepository;
    private PicoDeCrescimentoRepository picoDeCrescimentoRepository;

    @Autowired
    public ConsultaBebe(BebeRepository bebeRepository, PicoDeCrescimentoRepository picoDeCrescimentoRepository) {
        this.bebeRepository = bebeRepository;
        this.picoDeCrescimentoRepository = picoDeCrescimentoRepository;
    }

    public DadosDoBebeDto buscar(String nome) {
        Collection<Bebe> bebeBuscado = bebeRepository.findByNome(nome);
        if (!bebeBuscado.stream().findFirst().isPresent()) {
            throw new RuntimeException(String.format("Bebê com nome %s não cadastrado", nome));
        }
        Bebe bebe = bebeBuscado.stream().findFirst().get();
        long idadeDoBebeEmSemanas = calcularSemanasDoBebe(bebe.getDataDeNascimento());
        Optional<PicoDeCrescimento> picoDeCrescimento = picoDeCrescimentoRepository
                .findPicoDeCrescimento(Math.toIntExact(idadeDoBebeEmSemanas)).stream().findFirst();
        String descricaoPicoDeCrescimento = "Seu bebê não está em pico de crescimento";
        if (picoDeCrescimento.isPresent()) {
            descricaoPicoDeCrescimento = picoDeCrescimento.get().getDescricao();
        }
        return new DadosDoBebeDto(bebe.getNome(), idadeDoBebeEmSemanas, descricaoPicoDeCrescimento);
    }

    private long calcularSemanasDoBebe(LocalDate dataDeNascimento) {
        return ChronoUnit.WEEKS.between(dataDeNascimento, LocalDate.now());
    }

    public BebeDto buscarPeloNome(String nome) {
        Collection<Bebe> bebes = bebeRepository.findByNome(nome);
        if (!bebes.stream().findFirst().isPresent()) {
            return null;
        }
        Bebe bebe = bebes.stream().findFirst().get();
        return new BebeDto(bebe.getId(), bebe.getNome(), bebe.getDataDeNascimento().format(DateTimeFormatter.ISO_DATE));
    }
}
