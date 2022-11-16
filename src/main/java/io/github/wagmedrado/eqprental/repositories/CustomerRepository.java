package io.github.wagmedrado.eqprental.repositories;

import io.github.wagmedrado.eqprental.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
