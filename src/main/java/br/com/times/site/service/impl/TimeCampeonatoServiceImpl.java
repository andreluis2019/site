package br.com.times.site.service.impl;

import br.com.times.site.data.TimeCampeonatoData;
import br.com.times.site.framework.CrudServiceImpl;
import br.com.times.site.model.TimeCampeonato;
import br.com.times.site.service.TimeCampeonatoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TimeCampeonatoServiceImpl extends CrudServiceImpl<TimeCampeonato, Long> implements TimeCampeonatoService {

    private final TimeCampeonatoData timeCampeonatoData;

    public TimeCampeonatoServiceImpl(TimeCampeonatoData timeCampeonatoData) {
        this.timeCampeonatoData = timeCampeonatoData;
    }

    @Override
    public JpaRepository<TimeCampeonato, Long> getRepository() {
        return timeCampeonatoData;
    }
}
