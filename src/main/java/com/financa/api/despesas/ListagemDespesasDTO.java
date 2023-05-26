package com.financa.api.despesas;

import com.financa.api.despesas.enums.Categoria;

import java.math.BigDecimal;


public class ListagemDespesasDTO {
    private BigDecimal valor;
    private String descricao;
    private Categoria categoria;
    private String vencimento;

    public ListagemDespesasDTO() {
    }

    public ListagemDespesasDTO(Despesa despesa) {
        this.valor = despesa.getValor();
        this.descricao = despesa.getDescricao();
        this.categoria = despesa.getCategoria();
        this.vencimento = despesa.getVencimento();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public String getVencimento() {
        return vencimento;
    }
}
