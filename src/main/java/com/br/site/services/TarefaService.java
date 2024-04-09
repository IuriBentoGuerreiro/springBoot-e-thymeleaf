package com.br.site.services;

import com.br.site.models.TarefaModel;
import com.br.site.repositorys.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarefaService {

    @Autowired
    TarefaRepository tarefaRepository;


    public TarefaModel salvarTarefa(TarefaModel tarefaModel) {
        return tarefaRepository.save(tarefaModel);
    }

    public List<TarefaModel> listarTarefas(TarefaModel tarefaModel) {
        return tarefaRepository.findAll();
    }

    public void excluir(Long id){
        tarefaRepository.deleteById(id);
    }
}