package com.vsaueia.api;

import com.vsaueia.aplicacao.BebeDto;
import com.vsaueia.aplicacao.CadastrarBebe;
import com.vsaueia.aplicacao.ConsultaBebe;
import com.vsaueia.aplicacao.DadosDoBebeDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/bebes")
public class BebeController {

    private CadastrarBebe cadastrarBebe;
    private ConsultaBebe consultaBebe;

    @Autowired
    public BebeController(CadastrarBebe cadastrarBebe, ConsultaBebe consultaBebe) {
        this.cadastrarBebe = cadastrarBebe;
        this.consultaBebe = consultaBebe;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{nome}")
    public DadosDoBebeDto obterDadosDoBebe(@PathVariable String nome) {
        DadosDoBebeDto bebeDto = consultaBebe.buscar(nome);
        return bebeDto;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> cadastrar(@RequestBody BebeDto bebeDto) {
        BebeDto bebeBuscado = consultaBebe.buscarPeloNome(bebeDto.nome);
        if (bebeBuscado != null) {
            throw new RuntimeException("Bebe já cadastrado");
        }
        BebeDto bebeSalvo = cadastrarBebe.inserir(bebeDto);
        URI localizacao = ServletUriComponentsBuilder
                .fromCurrentRequest().path("/{id}")
                .buildAndExpand(bebeSalvo.id).toUri();

        return ResponseEntity.created(localizacao).build();
    }
}
