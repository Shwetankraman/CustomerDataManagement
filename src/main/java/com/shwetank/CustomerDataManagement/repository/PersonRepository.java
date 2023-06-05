package com.shwetank.CustomerDataManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shwetank.CustomerDataManagement.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Integer>{

}
