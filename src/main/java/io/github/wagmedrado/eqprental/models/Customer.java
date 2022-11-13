package io.github.wagmedrado.eqprental.models;

import lombok.Data;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Data
@Entity
@Table(name = "customer", schema = "eqprental")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotEmpty(message = "Property name canot be empty")
    @Column(name = "name", length = 100, nullable = false)
    private String name;

    @Column(name = "address", length = 100)
    private String address;

    @CPF
    @Column(name = "cpf", length = 11)
    private String cpf;

    @CNPJ
    @Column(name = "cnpj", length = 14)
    private String cnpj;
}
