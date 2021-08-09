package com.brandjunhoe.redisexample.person.domain;


import java.util.List;
import java.util.Optional;

public interface PersonRepository {

    List<Person> findAll();

    Optional<Person> findById(String personId);

    Person save(Person person);

}
