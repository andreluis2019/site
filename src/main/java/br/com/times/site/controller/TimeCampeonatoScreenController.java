package br.com.times.site.controller;

import br.com.times.site.service.TimeCampeonatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("time-campeonato-screen")
public class TimeCampeonatoScreenController {

    @Autowired private TimeCampeonatoService timeCampeonatoService;

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("timeCampeonatoList", timeCampeonatoService.findAll());
        return "timesCampeonatos";
    }

    @GetMapping("deletar/{id}")
    public String delete(@PathVariable("id") Long id) {
        timeCampeonatoService.delete(id);
        return "redirect:/time-campeonato-screen";
    }
}
