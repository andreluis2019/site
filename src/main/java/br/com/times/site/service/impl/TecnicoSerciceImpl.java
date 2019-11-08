package br.com.times.site.service.impl;

import br.com.times.site.data.TecnicoData;
import br.com.times.site.framework.CrudServiceImpl;
import br.com.times.site.model.Tecnico;
import br.com.times.site.service.TecnicoService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TecnicoSerciceImpl extends CrudServiceImpl<Tecnico, Long> implements TecnicoService {

    private final TecnicoData tecnicoData;

    public TecnicoSerciceImpl(TecnicoData tecnicoData) {
        this.tecnicoData = tecnicoData;
    }

    @Override
    public JpaRepository<Tecnico, Long> getRepository() {
        return tecnicoData;
    }
}
