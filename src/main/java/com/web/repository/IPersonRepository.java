package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.entity.Person;

public interface IPersonRepository extends JpaRepository<Person, Integer> 
{

}
