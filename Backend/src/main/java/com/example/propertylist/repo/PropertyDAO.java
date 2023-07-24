package com.example.propertylist.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.propertylist.entity.Property;

@Repository
public interface PropertyDAO extends JpaRepository<Property, Long> {

}
