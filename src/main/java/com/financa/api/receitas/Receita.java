package com.financa.api.receitas;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.Instant;

@Table(name = "receitas")
@Entity(name = "receita")
public class Receita {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private BigDecimal valor;
    private String dataDeInsercao;

    public Receita(ReceitasDTO receitasDTO) {
        Id = null;
        this.valor = receitasDTO.getValor();
        this.dataDeInsercao = String.valueOf(Instant.now());
    }

    public Receita() {
    }

    public Long getId() {
        return Id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getDataDeInsercao() {
        return dataDeInsercao;
    }
}
