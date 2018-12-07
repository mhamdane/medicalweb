package io.medicalweb.server.repository;

import org.springframework.data.repository.CrudRepository;

import io.medicalweb.server.model.principal.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, String>
{

}
