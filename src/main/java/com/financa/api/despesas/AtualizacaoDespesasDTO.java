package com.financa.api.despesas;

import com.financa.api.despesas.enums.Categoria;
import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public class AtualizacaoDespesasDTO {

    @NotNull
    private Long id;
    private BigDecimal valor;
    private String descricao;
    private Categoria categoria;
    private String vencimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String vencimento) {
        this.vencimento = vencimento;
    }
}
