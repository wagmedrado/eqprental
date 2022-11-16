package io.github.wagmedrado.eqprental.services;

import io.github.wagmedrado.eqprental.models.Customer;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CustomerService {

    public Optional<Customer> findById(Integer id);
    public Page<Customer> findAll(Pageable pageable);
    public Page<Customer> findAll(Example<Customer> example, Pageable pageable);
    public Customer save(Customer customer);
    public void delete(Customer customer);
}
