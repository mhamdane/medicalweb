package io.medicalweb.server.repository;

import org.springframework.data.repository.CrudRepository;

import io.medicalweb.server.model.principal.PrincipalAuthentication;

public interface PrincipalAuthenticationRepository extends CrudRepository<PrincipalAuthentication, String> {

}
