package io.github.wagmedrado.eqprental.controllers;

import io.github.wagmedrado.eqprental.models.Customer;
import io.github.wagmedrado.eqprental.services.CustomerService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerService service;

    @GetMapping
    public ResponseEntity<Page<Customer>> findAll(Customer filter, @PageableDefault(
            page = 0,
            size = 10,
            sort = "id",
            direction = Sort.Direction.ASC) Pageable pageable) {
        ExampleMatcher matcher = ExampleMatcher
                .matching()
                .withIgnoreCase()
                .withStringMatcher(ExampleMatcher.StringMatcher.CONTAINING);
        Example<Customer> example = Example.of(filter, matcher);
        return ResponseEntity.ok(service.findAll(example, pageable));
    }

    @GetMapping("{id}")
    public ResponseEntity<Customer> updateOne(@PathVariable Integer id) {
        Optional<Customer> optional = service.findById(id);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("{id}")
    public ResponseEntity<Customer> findById(@PathVariable Integer id, @Valid @RequestBody Customer customer) {
        Optional<Customer> optional = service.findById(id);
        if (optional.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        BeanUtils.copyProperties(optional.get(), customer, "id");
        return ResponseEntity.ok(service.save(customer));
    }

    @PostMapping
    public ResponseEntity<Customer> saveOne(@Valid @RequestBody Customer customer) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(customer));
    }
}
