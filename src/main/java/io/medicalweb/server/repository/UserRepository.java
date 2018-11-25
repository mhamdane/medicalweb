package io.medicalweb.server.repository;

import org.springframework.data.repository.CrudRepository;

import io.medicalweb.server.model.principal.UserLogin;

public interface UserRepository extends CrudRepository<UserLogin, String> {

}
