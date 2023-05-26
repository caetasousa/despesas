package com.financa.api.despesas;

import com.financa.api.despesas.enums.Caetegoria;
import jakarta.persistence.*;


import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Table(name = "despesas")
@Entity(name = "despesa")
public class Despesa {

    @Id @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long Id;
    private BigDecimal valor;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private Caetegoria categoria;

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

    public Caetegoria getCategoria() {
        return categoria;
    }

    public String getVencimento() {
        return vencimento;
    }
}
