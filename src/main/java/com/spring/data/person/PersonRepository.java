package com.spring.data.person;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Created by krishna1bhat on 4/30/17.
 */

@RepositoryRestResource
interface PersonRepository extends CrudRepository<Person, Long> {
    //List<Person> findByLastName(@Param("name") String name);
}