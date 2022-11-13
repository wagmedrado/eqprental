package io.github.wagmedrado.eqprental;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EqprentalApplication {

	public static void main(String[] args) {
		SpringApplication.run(EqprentalApplication.class, args);
	}

	@RequestMapping("/")
	public String appIndex() {
		return "Equipament Rental Application - version 0.1";
	}
}
