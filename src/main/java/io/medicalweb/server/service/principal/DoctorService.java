package io.medicalweb.server.service.principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.medicalweb.server.model.principal.Doctor;
import io.medicalweb.server.repository.DoctorRepository;

@Service
public class DoctorService {
	
	@Autowired
	private DoctorRepository doctorRepository;
	
	public Doctor getDoctor(String cin)
	{
		return doctorRepository.findOne(cin);
	}
	
	public void addDoctor(Doctor doctor)
	{
		doctorRepository.save(doctor);
	}

}
