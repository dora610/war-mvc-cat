/**
 * 
 */
package com.mvcSpringBoot.conference.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.mvcSpringBoot.conference.model.Registration;

/**
 * @author surajitkaruri
 *
 */
@Controller
public class RegistrationController {
	private Logger logger = LoggerFactory.getLogger(Registration.class);

	@GetMapping("registration")
	public String getRegistration(@ModelAttribute(" ") Registration registration) {
		return "registration";
	}
	
	@PostMapping("registration")
	public String addRegistration(@ModelAttribute("registration") Registration registration,
			Map<String, String> model) {
		logger.info(registration.getName());
		model.put("successMessage", "Registration successful");
		return "registration";
	}
}
