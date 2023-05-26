package com.financa.api.despesas;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import com.financa.api.despesas.enums.Categoria;

import java.math.BigDecimal;

public class CadastroDespesasDTO {
    @NotNull
    private BigDecimal valor;
    @NotBlank
    private String descricao;
    @NotNull
    private Categoria categoria;
    @NotNull
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "O formato da data deve ser yyyy-MM-dd")
    private String vencimento;

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
