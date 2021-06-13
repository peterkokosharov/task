package com.callflow.task.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "planet")
@NoArgsConstructor
@AllArgsConstructor
public class Planet {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private  String name;

    Boolean habblit;

    @Enumerated(EnumType.STRING)
    PlanetType planetType;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "star_id", nullable = false)
    private Star star;

    @OneToMany(mappedBy = "planet", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Moon> moons;
}
