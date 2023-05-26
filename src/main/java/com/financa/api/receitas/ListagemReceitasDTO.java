package com.financa.api.receitas;

import java.math.BigDecimal;

public class ListagemReceitasDTO {
    private BigDecimal valor;

    public ListagemReceitasDTO(Receita receita) {
        this.valor = receita.getValor();
    }

    public ListagemReceitasDTO() {
    }

    public BigDecimal getValor() {
        return valor;
    }

}
