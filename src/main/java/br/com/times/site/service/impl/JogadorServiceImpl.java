package br.com.times.site.service.impl;

import br.com.times.site.data.JogadorData;
import br.com.times.site.framework.CrudServiceImpl;
import br.com.times.site.model.Jogador;
import br.com.times.site.service.JogadorService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class JogadorServiceImpl extends CrudServiceImpl<Jogador, Long> implements JogadorService {

    private final JogadorData jogadorData;

    public JogadorServiceImpl(JogadorData jogadorData) {
        this.jogadorData = jogadorData;
    }

    @Override
    public JpaRepository<Jogador, Long> getRepository() {
        return jogadorData;
    }
}
