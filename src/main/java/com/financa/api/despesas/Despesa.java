package com.financa.api.despesas;

import com.financa.api.enums.Caetegoria;
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

    private LocalDate vencimento;
    private Instant dataDeInsercao;

    public Despesa(DespesasDTO despesasDTO) {
        this.Id = null;
        this.valor = despesasDTO.getValor();
        this.descricao = despesasDTO.getDescricao();
        this.categoria = despesasDTO.getCategoria();
        this.vencimento = LocalDate.parse(despesasDTO.getVencimento());
        this.dataDeInsercao = Instant.now();
    }
}
