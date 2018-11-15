package io.medicalweb.server.repository;

import org.springframework.data.repository.CrudRepository;

import io.medicalweb.server.model.developer.Developer;

public interface DeveloperRepository extends CrudRepository<Developer, String>
{

}
