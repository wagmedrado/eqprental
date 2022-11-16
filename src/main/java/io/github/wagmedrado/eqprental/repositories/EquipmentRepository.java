package io.github.wagmedrado.eqprental.repositories;

import io.github.wagmedrado.eqprental.models.Equipment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipmentRepository extends JpaRepository<Equipment, Integer> {
}
