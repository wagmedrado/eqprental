package io.github.wagmedrado.eqprental.repositories;

import io.github.wagmedrado.eqprental.models.address.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Integer> {
}
