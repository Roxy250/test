package com.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class service {
	@Autowired
	public repositary repo;


	public List<entity> displayEntity() {
		return repo.findAll();
	}

	public Optional<entity> displayEntityById(int id) {

		return repo.findById(id);
	}

	public entity addEntity(entity e) {
		
		return repo.save(e);
	}

	public entity updateEntity(int id, entity e) {
		repo.deleteById(id);
		return repo.save(e);
	}

	public String deleteEntityById(int id) {
	repo.deleteById(id);
		
		return "Successfully deletd";
	}
}
