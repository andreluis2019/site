package br.com.times.site.controller;

import br.com.times.site.service.CampeonatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("campeonato-screen")
public class CampeonatoScreenController {

    @Autowired private CampeonatoService campeonatoService;

    @GetMapping("{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        var campeonato = campeonatoService.findOne(id).get();
        model.addAttribute("campeonato", campeonato);
        return "campeonato";
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("campeonatoList", campeonatoService.findAll());
        return "campeonatos";
    }
}
