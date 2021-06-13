package com.callflow.task.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "moon")
@NoArgsConstructor
@AllArgsConstructor
public class Moon {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private  String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "planet_id", nullable = false)
    private Planet planet;
}
