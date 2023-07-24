package com.example.propertylist.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


import com.example.propertylist.service.PropertyService;


@RestController
@CrossOrigin
public class PropertyController {
	
	@Autowired
	private PropertyService propertyService;

}
