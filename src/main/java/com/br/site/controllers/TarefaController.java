package com.br.site.controllers;

import org.springframework.ui.Model;
import com.br.site.models.TarefaModel;
import com.br.site.services.TarefaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
public class TarefaController {

    @Autowired
    TarefaService tarefaService;

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/index")
    public String create(){
        return "index";
    }

    @RequestMapping("/cadastro")
    public String cadastro(TarefaModel tarefaModel){
        return "cadastro";
    }

    @PostMapping("/cadastrar")
    public String cadastrar(@ModelAttribute TarefaModel tarefaModel){
        tarefaService.salvarTarefa(tarefaModel);
        return "redirect:/cadastro";
    }

    @RequestMapping("/list")
    public String listar(){
        return "list";
    }

    @GetMapping("/listar")
    public String listar(TarefaModel tarefaModel, Model model){
        List<TarefaModel> tarefas = tarefaService.listarTarefas(tarefaModel);
        model.addAttribute("tarefas", tarefas);
        return "list";
    }

    @GetMapping("/delete/{id}")
    public String excluir(@PathVariable Long id){
        tarefaService.excluir(id);
        return "redirect:/listar";
    }
}
