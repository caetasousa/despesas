package com.financa.api.receitas;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Receitas {

    private BigDecimal valor;
    private LocalDate dataDeInsercao = LocalDate.now();

    public BigDecimal getValor() {
        return valor;
    }

    public LocalDate getDataDeInsercao() {
        return dataDeInsercao;
    }
}
