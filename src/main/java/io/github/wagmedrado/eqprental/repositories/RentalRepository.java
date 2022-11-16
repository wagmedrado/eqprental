package io.github.wagmedrado.eqprental.repositories;

import io.github.wagmedrado.eqprental.models.Rental;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentalRepository extends JpaRepository<Rental, Integer> {
}
