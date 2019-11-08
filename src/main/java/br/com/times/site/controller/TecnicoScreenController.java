package br.com.times.site.controller;

import br.com.times.site.service.TecnicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("tecnico-screen")
public class TecnicoScreenController {

    @Autowired private TecnicoService tecnicoService;

    @GetMapping("{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        var tecnico = tecnicoService.findOne(id).get();
        model.addAttribute("tecnico", tecnico);
        return "tecnico";
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("tecnicoList", tecnicoService.findAll());
        return "tecnicos";
    }
}
