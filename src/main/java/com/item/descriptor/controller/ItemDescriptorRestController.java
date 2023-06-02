package com.item.descriptor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.item.descriptor.configuration.ItemDescriptorConfiguration;

@RestController
public class ItemDescriptorRestController {
	
	@Autowired
	ItemDescriptorConfiguration configuration;
	
	/*
	 * @Value("${item-descriptor.name}") private String password;
	 */
	 
	@GetMapping("/details")
	public String getConfigurationDetails() {
		return configuration.getName() + configuration.getField();
	}

}
