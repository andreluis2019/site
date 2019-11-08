package br.com.times.site.service.impl;

import br.com.times.site.data.TimeData;
import br.com.times.site.framework.CrudServiceImpl;
import br.com.times.site.model.Time;
import br.com.times.site.service.TimeService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class TimeServiceImpl extends CrudServiceImpl<Time, Long> implements TimeService {

    private final TimeData timeData;

    public TimeServiceImpl(TimeData timeData) {
        this.timeData = timeData;
    }

    @Override
    public JpaRepository<Time, Long> getRepository() {
        return timeData;
    }
}
