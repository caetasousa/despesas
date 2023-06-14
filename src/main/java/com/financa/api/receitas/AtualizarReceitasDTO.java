package com.financa.api.receitas;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class AtualizarReceitasDTO {

    @NotNull
    private Long Id;
    private BigDecimal valor;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
