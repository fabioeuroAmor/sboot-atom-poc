package br.gov.cnpq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@SpringBootApplication
@SpringBootApplication(scanBasePackages = "br.gov.cnpq")
public class SbootAtomPocApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbootAtomPocApplication.class, args);
	}

}
