package com.financa.api.despesas;

import com.financa.api.despesas.enums.Caetegoria;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

import java.math.BigDecimal;

public class CadastroDespesasDTO {
    @NotNull
    private BigDecimal valor;
    @NotBlank
    private String descricao;
    @NotNull
    private Caetegoria categoria;
    @NotNull
    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "O formato da data deve ser yyyy-MM-dd")
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
