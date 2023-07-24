package com.example.propertylist.dto;

import com.example.propertylist.entity.PropertyCategory;

public class PropertyDTO {
	private Long id;

	private String name;

	private Integer rooms;

	private Double price;

	private PropertyCategory category;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRooms() {
		return rooms;
	}

	public void setRooms(Integer rooms) {
		this.rooms = rooms;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public PropertyCategory getCategory() {
		return category;
	}

	public void setCategory(PropertyCategory category) {
		this.category = category;
	}

}
