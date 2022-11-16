package io.github.wagmedrado.eqprental.services;

import io.github.wagmedrado.eqprental.models.Equipment;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface EquipmentService {

    public Optional<Equipment> findById(Integer id);
    public Page<Equipment> findAll(Pageable pageable);
    public Page<Equipment> filterAll(Example<Equipment> example, Pageable pageable);
    public Equipment save(Equipment equipment);
    public void delete(Equipment equipment);
}
