package br.com.times.site.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "TIME")
@Data
public class Time {

    @Id
    @Column(name = "ID_TIME")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "AGREMIACAO", length = 100, nullable = false)
    private String agremiacao;

}
