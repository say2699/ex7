package kz.iitu.projects.ex7;

import kz.iitu.projects.ex7.entity.Books;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import kz.iitu.projects.ex7.repository.BookRepository;

@SpringBootApplication
public class Ex7Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex7Application.class, args);
	}

}