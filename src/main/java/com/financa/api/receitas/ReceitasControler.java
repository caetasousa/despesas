package com.financa.api.receitas;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/receitas")
public class ReceitasControler {

    @Autowired
    private ReceitaRepository repository;

    @PostMapping
    public void cadastrarReceita(@RequestBody @Valid ReceitasDTO receitasDTO) {

        repository.save(new Receita(receitasDTO));
    }

    @GetMapping
    public Page<ListagemReceitasDTO> listarReceitas(@PageableDefault(size = 10) Pageable paginacao) {
        return repository.findAll(paginacao).map(ListagemReceitasDTO::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid AtualizarReceitasDTO atualizarReceitasDTO) {
        var receita = repository.getReferenceById(atualizarReceitasDTO.getId());
        receita.atualizarReceita(atualizarReceitasDTO);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }
}
