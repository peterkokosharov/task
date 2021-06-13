package com.callflow.task.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "galaxy")
@NoArgsConstructor
@AllArgsConstructor
public class Galaxy {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    private String name;
    @Enumerated(EnumType.STRING)
    private GalaxyType galaxyType;
    private  Float age;
    @Enumerated(EnumType.STRING)
    private GalaxyAgeType ageType;

    @OneToMany(mappedBy = "galaxy", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Star> stars;
}
