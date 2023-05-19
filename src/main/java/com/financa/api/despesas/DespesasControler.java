package com.financa.api.despesas;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/despesas")
public class DespesasControler {

    @Autowired
    private DespesaRepository repository;

    @PostMapping
    @Transactional
    public void AdicionarDespesa(@RequestBody @Valid DespesasDTO despesasDTO) {
        repository.save(new Despesa( despesasDTO));
    }
}
