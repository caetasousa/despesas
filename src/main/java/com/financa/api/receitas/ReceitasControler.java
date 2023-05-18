package com.financa.api.receitas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/receitas")
public class ReceitasControler {

    @Autowired
    private ReceitaRepository repository;

    @PostMapping
    public void cadastrarReceita(@RequestBody ReceitasDTO receitasDTO) {
        repository.save(new Receita(receitasDTO));
    }
}
