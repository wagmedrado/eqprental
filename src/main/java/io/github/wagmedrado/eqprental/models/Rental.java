package io.github.wagmedrado.eqprental.models;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "rental", schema = "eqprental")
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "notes", columnDefinition = "TEXT")
    private String name;

    @ManyToOne
    @JoinColumn(name = "customer_fk")
    private Customer customer;

    @ManyToMany
    @JoinTable(name = "retal_equipment",
            schema = "eqprental",
            joinColumns = @JoinColumn(name = "rental_fk"),
            inverseJoinColumns = @JoinColumn(name = "equipment_fk"))
    private Set<Equipment> equipments = new HashSet<>();

    @NotNull(message = "Expected rental date cannot be null")
    @Column(name = "expected_rental_date")
    private LocalDateTime expectedRentalDate;

    @NotNull(message = "Expected return date cannot be null")
    @Column(name = "expected_return_date")
    private LocalDateTime expectedReturnDate;

    @Column(name = "rental_date")
    private LocalDateTime rentalDate;

    @Column(name = "return_date")
    private LocalDateTime devolutionDate;

}
