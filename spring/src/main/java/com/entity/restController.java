package com.entity;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restController {
	@Autowired
	public repositary repo;

	@GetMapping("/display")
	public List<entity> displayEntity() {
		return repo.findAll();
	}

	@GetMapping("/display/{id}")
	public Optional<entity> displayEntityById(@PathVariable int id) {

		return repo.findById(id);
	}

	@PostMapping("/add")
	public entity addEntity(@RequestBody entity e) {
		
		return repo.save(e);
	}

	@PutMapping("/update/{id}")
	public entity updateEntity(@PathVariable int id, @RequestBody entity e) {
		repo.deleteById(id);
		return repo.save(e);
	}

	@DeleteMapping("delete/{id}")
	public String deleteentity(@PathVariable int id) {
	repo.deleteById(id);
		
		return "Successfully deletd";
	}
}
