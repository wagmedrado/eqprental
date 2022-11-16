package io.github.wagmedrado.eqprental.services.impl;

import io.github.wagmedrado.eqprental.models.Equipment;
import io.github.wagmedrado.eqprental.repositories.EquipmentRepository;
import io.github.wagmedrado.eqprental.services.EquipmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EquipmentServiceImpl implements EquipmentService {

    @Autowired
    private EquipmentRepository repository;

    @Override
    public Optional<Equipment> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Page<Equipment> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Equipment> filterAll(Example<Equipment> example, Pageable pageable) {
        return repository.findAll(example, pageable);
    }

    @Override
    public Equipment save(Equipment customer) {
        return repository.save(customer);
    }

    @Override
    public void delete(Equipment customer) {
        repository.delete(customer);
    }
}
