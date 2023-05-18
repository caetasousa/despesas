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
    private Instant dataDeInsercao;

    public Receita(ReceitasDTO receitasDTO) {
        Id = null;
        this.valor = receitasDTO.getValor();
        this.dataDeInsercao = Instant.now();
    }
}
