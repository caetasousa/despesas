package com.financa.api.receitas;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class ReceitasDTO {

    @NotNull
    private BigDecimal valor;

    public BigDecimal getValor() {
        return valor;
    }
}
