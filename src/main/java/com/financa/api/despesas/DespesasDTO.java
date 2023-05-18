package com.financa.api.despesas;

import com.financa.api.enums.Caetegoria;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DespesasDTO {
    private BigDecimal valor;
    private String descricao;
    private Caetegoria categoria;
    private LocalDate vencimento;
    private LocalDate dataDeInsercao = LocalDate.now();

    public BigDecimal getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public Caetegoria getCategoria() {
        return categoria;
    }

    public LocalDate getVencimento() {
        return vencimento;
    }

    public LocalDate getDataDeInsercao() {
        return dataDeInsercao;
    }
}
