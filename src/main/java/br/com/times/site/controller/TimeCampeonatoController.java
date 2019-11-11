package br.com.times.site.controller;

import br.com.times.site.framework.CrudRestController;
import br.com.times.site.framework.CrudService;
import br.com.times.site.model.TimeCampeonato;
import br.com.times.site.service.TimeCampeonatoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("timeCampeonato")
public class TimeCampeonatoController extends CrudRestController<TimeCampeonato, Long> {

    private final TimeCampeonatoService timeCampeonatoService;

    public TimeCampeonatoController(TimeCampeonatoService timeCampeonatoService) {
        this.timeCampeonatoService = timeCampeonatoService;
    }

    @Override
    public CrudService<TimeCampeonato, Long> getService() {
        return timeCampeonatoService;
    }
}
