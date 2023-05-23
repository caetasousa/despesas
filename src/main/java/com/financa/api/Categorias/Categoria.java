package com.financa.api.Categorias;

import com.financa.api.receitas.Receita;

import java.math.BigDecimal;

public class Categoria {

    private String nomeDaCategoria;
    private BigDecimal orcamentoDaCategoria;
    private Receita receita;

    public Categoria(String nomeDaCategoria, BigDecimal orcamentoDaCategoria, Receita receita) {
        this.nomeDaCategoria = nomeDaCategoria;
        addOrcamento(receita, orcamentoDaCategoria);
        this.receita = receita;
    }

    public void addOrcamento(Receita receita, BigDecimal orcamentoDaCategoria) {
        try {
            if (orcamentoDaCategoria.intValue() <= receita.getValor().intValue()){
                this.orcamentoDaCategoria = orcamentoDaCategoria;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
