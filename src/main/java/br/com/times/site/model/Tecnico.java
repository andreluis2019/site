package br.com.times.site.model;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "TECNICO")
@Data
public class Tecnico {

    @Id
    @Column(name = "ID_TECNICO")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_TIME")
    private Time time;

}
