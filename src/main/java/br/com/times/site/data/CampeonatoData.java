package br.com.times.site.data;

import br.com.times.site.model.Campeonato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampeonatoData extends JpaRepository<Campeonato, Long> {
}
