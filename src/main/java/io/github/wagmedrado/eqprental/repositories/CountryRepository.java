package io.github.wagmedrado.eqprental.repositories;

import io.github.wagmedrado.eqprental.models.address.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {
}
