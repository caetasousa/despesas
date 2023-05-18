package com.financa.api.receitas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/receita")
public class ReceitasControler {
    @GetMapping
    public String consultarReceita() {
        return "Nenhuma receita incerida!";
    }
    @PostMapping
    public void cadastrarReceita(@RequestBody Receitas dados) {
        System.out.println( dados.getValor());
        System.out.println( dados.getDataDeInsercao());

    }
}
