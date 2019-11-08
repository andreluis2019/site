package br.com.times.site.controller;

import br.com.times.site.service.JogadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("jogador-screen")
public class JogadorScreenController {

    @Autowired private JogadorService jogadorService;

    @GetMapping("{id}")
    public String findById(@PathVariable("id") Long id, Model model) {
        var jogador = jogadorService.findOne(id).get();
        model.addAttribute("jogador", jogador);
        return "jogador";
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("jogadorList", jogadorService.findAll());
        return "jogadores";
    }
}
