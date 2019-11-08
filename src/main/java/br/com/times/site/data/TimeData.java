package br.com.times.site.data;

import br.com.times.site.model.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeData extends JpaRepository<Time, Long> {
}
