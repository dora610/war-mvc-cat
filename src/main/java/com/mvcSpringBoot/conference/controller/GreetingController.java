/**
 * 
 */
package com.mvcSpringBoot.conference.controller;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author surajitkaruri
 *
 */

@Controller
public class GreetingController {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@GetMapping("greeting")
	public String greeting(
			Map<String, Object> model, 
			@RequestParam(name = "name", defaultValue = "Coco") String name) {
		logger.info("Name: "+ name);
		model.put("name", name);
		return "greeting";
	}
}
