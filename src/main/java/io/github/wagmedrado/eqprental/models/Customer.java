package io.github.wagmedrado.eqprental.models;

import io.github.wagmedrado.eqprental.models.address.State;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customer", schema = "eqprental")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotEmpty(message = "Property first name canot be empty")
    @Column(name = "first_name", length = 50, nullable = false)
    private String firstName;

    @NotEmpty(message = "Property last name canot be empty")
    @Column(name = "last_name", length = 100, nullable = false)
    private String lastName;

    @ManyToOne
    @JoinColumn(name = "state_fk")
    private State state;

    // @NotEmpty(message = "Property city canot be empty")
    @Column(name = "city", length = 100)
    private String city;

    @Column(name = "address", length = 100)
    private String address;

    @Column(name = "zipCode", length = 12)
    private String zipCode;

    @CPF
    @Column(name = "cpf", length = 11)
    private String cpf;

    @CNPJ
    @Column(name = "cnpj", length = 14)
    private String cnpj;

    @Email(message = "Informe um e-mail válido")
    @Column(name = "email", length = 100)
    private String email;

    @Column(name = "phone_number", length = 30)
    private String phoneNumber;

//    @JsonIgnore
//    @OneToMany(mappedBy = "customer")
//    private List<Rental> rentals = new ArrayList<>();
}
