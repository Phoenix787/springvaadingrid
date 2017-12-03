package com.example.springvaadingrid;

import com.example.springvaadingrid.model.Person;
import com.example.springvaadingrid.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
public class SpringvaadingridApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringvaadingridApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner loadData(PersonRepository repository){
//		return (args)->{
//			repository.save(new Person("Mark", "Johnson"));
//			repository.save(new Person("Mary Jane", "mary@boom.com"));
//			repository.save(new Person("Mark Rom", "mark@rom.com"));
//		};
//	}

}


