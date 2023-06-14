package com.financa.api.despesas;

import com.financa.api.despesas.enums.Categoria;
import jakarta.persistence.*;


import java.math.BigDecimal;
import java.time.Instant;


@Table(name = "despesas")
@Entity(name = "despesa")
public class Despesa {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    private BigDecimal valor;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;

    private String vencimento;
    private String dataDeInsercao;

    public Despesa() {
    }

    public Despesa(CadastroDespesasDTO despesasDTO) {
        this.Id = null;
        this.valor = despesasDTO.getValor();
        this.descricao = despesasDTO.getDescricao();
        this.categoria = despesasDTO.getCategoria();
        this.vencimento = despesasDTO.getVencimento();
        this.dataDeInsercao = String.valueOf(Instant.now());
    }

    public Long getId() {
        return Id;
    }

    public String getDataDeInsercao() {
        return dataDeInsercao;
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

    public void atualizarDespesa(AtualizacaoDespesasDTO atualizacaoDespesasDTO) {
        if (atualizacaoDespesasDTO.getValor() != null) {
            this.valor = atualizacaoDespesasDTO.getValor();
        }

        if (atualizacaoDespesasDTO.getDescricao() != null) {
            this.descricao = atualizacaoDespesasDTO.getDescricao();
        }

        if (atualizacaoDespesasDTO.getCategoria() != null) {
            this.categoria = atualizacaoDespesasDTO.getCategoria();
        }

        if (atualizacaoDespesasDTO.getVencimento() != null) {
            this.vencimento = atualizacaoDespesasDTO.getVencimento();
        }
    }
}
