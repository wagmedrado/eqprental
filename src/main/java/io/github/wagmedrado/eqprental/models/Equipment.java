package io.github.wagmedrado.eqprental.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "equipment", schema = "eqprental")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotEmpty(message = "Property name canot be empty")
    @Column(name = "name", length = 100, nullable = false)
    private String name;
}
