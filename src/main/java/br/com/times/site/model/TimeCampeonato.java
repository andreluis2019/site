package br.com.times.site.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "TIME_CAMPEONATO")
public class TimeCampeonato {

    @Id
    @Column(name = "ID_TIME_CAMPEONATO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_TIME")
    private Time time;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_CAMPEONATO")
    private Campeonato campeonato;

}
