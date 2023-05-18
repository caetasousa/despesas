package com.financa.api.despesas;

import com.financa.api.enums.Caetegoria;

import java.math.BigDecimal;

public class DespesasDTO {
    private BigDecimal valor;
    private String descricao;
    private Caetegoria categoria;
    private String vencimento;

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
