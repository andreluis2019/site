package br.com.times.site.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "CAMPEONATO")
@Data
public class Campeonato {

    @Id
    @Column(name = "ID_CAMPEONATO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DESCRICAO", length = 100, nullable = false)
    private String descricao;

    @Column(name= "DATA_INICIO", nullable = false)
    private LocalDate dataInicio;

    @Column(name= "DATA_FIM", nullable = false)
    private LocalDate dataFim;

    @Column(name = "PREMIO")
    private BigDecimal premio;

}
