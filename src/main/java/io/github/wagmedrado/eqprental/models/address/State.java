package io.github.wagmedrado.eqprental.models.address;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "state", schema = "eqprental")
public class State {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotEmpty(message = "Property name canot be empty")
    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @NotEmpty(message = "Property short name canot be empty")
    @Column(name = "short_name", length = 20, nullable = false)
    private String shortName;

    @ManyToOne
    @JoinColumn(name = "country_fk")
    private Country country;
}
