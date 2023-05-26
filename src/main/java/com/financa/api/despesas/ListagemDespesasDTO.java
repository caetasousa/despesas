package com.financa.api.despesas;

import com.financa.api.despesas.enums.Caetegoria;

import java.math.BigDecimal;


public class ListagemDespesasDTO {
    private BigDecimal valor;
    private String descricao;
    private Caetegoria categoria;
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

    public Caetegoria getCategoria() {
        return categoria;
    }

    public String getVencimento() {
        return vencimento;
    }
}
