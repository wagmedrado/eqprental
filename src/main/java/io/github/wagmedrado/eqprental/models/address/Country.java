package io.github.wagmedrado.eqprental.models.address;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "country", schema = "eqprental")
public class Country {
    @Id
    @Column(name = "id")
    private String id;

    @NotEmpty(message = "Property name canot be empty")
    @Column(name = "name", length = 100, nullable = false, unique = true)
    private String name;
}
