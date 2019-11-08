package br.com.times.site.controller;

import br.com.times.site.framework.CrudRestController;
import br.com.times.site.framework.CrudService;
import br.com.times.site.model.Tecnico;
import br.com.times.site.service.TecnicoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("tecnico")
public class TecnicoController extends CrudRestController<Tecnico, Long> {

    private final TecnicoService tecnicoService;

    public TecnicoController(TecnicoService tecnicoService) {
        this.tecnicoService = tecnicoService;
    }

    @Override
    public CrudService<Tecnico, Long> getService() {
        return tecnicoService;
    }
}
