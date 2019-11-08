package br.com.times.site.controller;

import br.com.times.site.framework.CrudRestController;
import br.com.times.site.framework.CrudService;
import br.com.times.site.model.Campeonato;
import br.com.times.site.service.CampeonatoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("campeonato")
public class CampeonatoController extends CrudRestController<Campeonato, Long> {

    private final CampeonatoService campeonatoService;

    public CampeonatoController(CampeonatoService campeonatoService) {
        this.campeonatoService = campeonatoService;
    }

    @Override
    public CrudService<Campeonato, Long> getService() {
        return campeonatoService;
    }
}
