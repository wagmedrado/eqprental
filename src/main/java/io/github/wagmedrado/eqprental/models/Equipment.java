package io.github.wagmedrado.eqprental.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "equipment", schema = "eqprental")
public class Equipment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotEmpty(message = "Name cannot be empty.")
    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @NotNull(message = "Quantity cannot be null.")
    @Column(name = "quantity", nullable = false)
    private Integer quantity = 1;
}
