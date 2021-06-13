package com.callflow.task.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity // This tells Hibernate to make a table out of this class
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "star")
public class Star {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    private  String name;
    private Float mass;
    private Float size;
    private Float light;
    private Integer temperatura;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "galaxy_id", nullable = false)
    private Galaxy galaxy;

    @OneToMany(mappedBy = "star", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private Set<Planet> planets;
}
