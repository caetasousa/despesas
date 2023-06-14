package com.financa.api.despesas;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


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
    public Page<ListagemDespesasDTO> listarDespesa(@PageableDefault(size = 10, sort = {"descricao"}) Pageable paginacao) {
        return repository.findAll(paginacao).map(ListagemDespesasDTO::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid AtualizacaoDespesasDTO atualizacaoDespesasDTO) {
        var despesa = repository.getReferenceById(atualizacaoDespesasDTO.getId());
        despesa.atualizarDespesa(atualizacaoDespesasDTO);
    }
}
