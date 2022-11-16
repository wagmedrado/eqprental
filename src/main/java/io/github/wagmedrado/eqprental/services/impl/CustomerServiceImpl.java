package io.github.wagmedrado.eqprental.services.impl;

import io.github.wagmedrado.eqprental.models.Customer;
import io.github.wagmedrado.eqprental.repositories.CustomerRepository;
import io.github.wagmedrado.eqprental.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository repository;

    @Override
    public Optional<Customer> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public Page<Customer> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    public Page<Customer> findAll(Example<Customer> example, Pageable pageable) {
        return repository.findAll(example, pageable);
    }

    @Override
    public Customer save(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public void delete(Customer customer) {
        repository.delete(customer);
    }
}
