package com.financa.api.receitas;

import java.math.BigDecimal;

public class ListagemReceitasDTO {

    private Long id;
    private BigDecimal valor;

    public ListagemReceitasDTO(Receita receita) {

        this.id = receita.getId();
        this.valor = receita.getValor();
    }

    public ListagemReceitasDTO() {
    }

    public BigDecimal getValor() {

        return valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
