package com.example.propertylist.service.impl;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.propertylist.dto.PropertyDTO;
import com.example.propertylist.entity.PropertyCategory;
import com.example.propertylist.repo.PropertyDAO;
import com.example.propertylist.service.PropertyService;

@Service
public class PropertyServiceImpl implements PropertyService {
	
	@Autowired
	private final PropertyDAO propertyDAO;

	@Autowired
	public PropertyServiceImpl(PropertyDAO propertyDAO) {
		this.propertyDAO = propertyDAO;
	}

	@Override
	public PropertyDTO createProperty(PropertyDTO propertyDTO) {
		return null;
	}

	@Override
	public PropertyDTO getPropertyById(Long id) {
		return null;
	}

	@Override
	public List<PropertyDTO> getAllProperties() {
		return null;
	}

	@Override
	public PropertyDTO updateProperty(Long id, PropertyDTO propertyDTO) {
		return null;
	}

	@Override
	public boolean deleteProperty(Long id) {
		return false;
	}

	@Override
	public List<PropertyDTO> searchPropertiesByName(String name) {
		return null;
	}

	@Override
	public List<PropertyDTO> searchPropertiesByPrice(Double price) {
		return null;
	}

	@Override
	public List<PropertyDTO> searchPropertiesByCategory(PropertyCategory category) {
		return null;
	}
}
