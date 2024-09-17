package com.eazybytes.loans;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@OpenAPIDefinition(
        info = @Info(
                title = "Loans Microservice Rest API Documentation",
                description = "Eazybank Loans",
                version = "V1",
                contact = @Contact(
                        name = "Dovi Douviz",
                        email = "tutor@eazybytes.com",
                        url = "dovi.com"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "example.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Eazybank loans microservice REST API Documentation",
                url = "https://github.com/zhocem/microservices-eazybytes-original/tree/3.2.3"
        )
)
public class LoansApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoansApplication.class, args);
    }

}