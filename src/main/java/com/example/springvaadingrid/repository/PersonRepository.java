package com.example.springvaadingrid.repository;

import com.example.springvaadingrid.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
