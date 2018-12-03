package io.medicalweb.server.repository;

import org.springframework.data.repository.CrudRepository;

import io.medicalweb.server.model.principal.UserForm;

public interface UserRepository extends CrudRepository<UserForm, String> {

}
