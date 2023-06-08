package com.financa.api.despesas;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/despesas")
public class DespesasControler {

    @Autowired
    private DespesaRepository repository;

    @PostMapping
    @Transactional
    public void AdicionarDespesa(@RequestBody @Valid CadastroDespesasDTO despesasDTO) {
        repository.save(new Despesa( despesasDTO));
    }

    @GetMapping
    public Page<ListagemDespesasDTO> listarDespesa(Pageable paginacao) {
        return repository.findAll(paginacao).map(ListagemDespesasDTO::new);
    }
}
