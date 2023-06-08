package com.financa.api.receitas;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/receitas")
public class ReceitasControler {

    @Autowired
    private ReceitaRepository repository;

    @PostMapping
    public void cadastrarReceita(@RequestBody @Valid ReceitasDTO receitasDTO) {

        repository.save(new Receita(receitasDTO));
    }

    @GetMapping
    public Page<ListagemReceitasDTO> listarReceitas(Pageable paginacao) {
        return repository.findAll(paginacao).map(ListagemReceitasDTO::new);
    }
}
