package io.medicalweb.server.repository;

import org.springframework.data.repository.CrudRepository;

import io.medicalweb.server.model.principal.Principal;

public interface PrincipalRepository extends CrudRepository<Principal, String>
{

}
