package br.com.times.site.data;

import br.com.times.site.model.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorData extends JpaRepository<Jogador, Long> {
}
