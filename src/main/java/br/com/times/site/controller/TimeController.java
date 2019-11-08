package br.com.times.site.controller;

import br.com.times.site.framework.CrudRestController;
import br.com.times.site.framework.CrudService;
import br.com.times.site.model.Time;
import br.com.times.site.service.TimeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("time")
public class TimeController extends CrudRestController<Time, Long> {

    private final TimeService timeService;

    public TimeController(TimeService timeService) {
        this.timeService = timeService;
    }

    @Override
    public CrudService<Time, Long> getService() {
        return timeService;
    }
}
