package br.com.times.site.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "JOGADOR")
@Data
public class Jogador {

    @Id
    @Column(name = "ID_JOGADOR")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;

    @Enumerated(EnumType.STRING)
    @Column(name = "POSICAO", nullable = false, length = 20)
    private JogadorPosicao jogadorPosicao;

    @Column(name = "IDADE", length = 100, nullable = false)
    private Integer idade;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ID_TIME")
    private Time time;


}
