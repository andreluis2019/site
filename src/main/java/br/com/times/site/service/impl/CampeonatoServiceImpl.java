package br.com.times.site.service.impl;

import br.com.times.site.data.CampeonatoData;
import br.com.times.site.framework.CrudServiceImpl;
import br.com.times.site.model.Campeonato;
import br.com.times.site.service.CampeonatoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CampeonatoServiceImpl extends CrudServiceImpl<Campeonato, Long> implements CampeonatoService {

    private final CampeonatoData campeonatoData;

    public CampeonatoServiceImpl(CampeonatoData campeonatoData) {
        this.campeonatoData = campeonatoData;
    }

    @Override
    public JpaRepository<Campeonato, Long> getRepository() {
        return campeonatoData;
    }
}
