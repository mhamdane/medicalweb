package io.medicalweb.server.controller.principal;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import io.medicalweb.server.model.dto.principal.DoctorDTO;
import io.medicalweb.server.model.principal.Doctor;
import io.medicalweb.server.model.principal.PrincipalAuthentication;
import io.medicalweb.server.service.principal.DoctorService;
import io.medicalweb.server.service.principal.PrincipalAuthenticationService;

@Controller
public class PrincipalController
{
	@Autowired
	private DoctorService					doctorService;
	@Autowired
	private PrincipalAuthenticationService	principalAuthenticationService;

	@RequestMapping(method = RequestMethod.POST, value = "/addDoctor")
	public String addDoctor(@ModelAttribute("doctorDTO") DoctorDTO doctorDTO, Model model)
	{

		principalAuthenticationService.addPrincipalAuthentication(new PrincipalAuthentication(doctorDTO.getUsername(), doctorDTO.getPassword()));
		doctorService.addDoctor(new Doctor(doctorDTO.getCin(), doctorDTO.getFirstname(), doctorDTO.getLastname(), doctorDTO.getPhonenumber(), new Date(), doctorDTO.getEmail(),
				doctorDTO.getProfessionField(), new PrincipalAuthentication(doctorDTO.getUsername(), doctorDTO.getPassword())));

		return "redirect:login";
	}

}
