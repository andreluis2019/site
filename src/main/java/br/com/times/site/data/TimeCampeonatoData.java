package br.com.times.site.data;

import br.com.times.site.model.TimeCampeonato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeCampeonatoData extends JpaRepository<TimeCampeonato, Long> {
}
