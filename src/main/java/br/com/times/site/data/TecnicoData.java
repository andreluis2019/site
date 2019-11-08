package br.com.times.site.data;

import br.com.times.site.model.Tecnico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TecnicoData extends JpaRepository<Tecnico, Long> {
}
