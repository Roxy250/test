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
	public service s;

	  @GetMapping
	    public List<entity> displayEntities() {
	        return s.displayEntity();
	    }

	    @GetMapping("display/{id}")
	    public Optional<entity> displayEntityById(@PathVariable int id) {
	        return s.displayEntityById(id);
	    }

	    @PostMapping("/add")
	    public entity addEntity(@RequestBody entity entity) {
	        return s.addEntity(entity);
	    }

	    @PutMapping("/update/{id}")
	    public entity updateEntity(@PathVariable int id, @RequestBody entity entity) {
	        return s.updateEntity(id, entity);
	    }

	    @DeleteMapping("/delete/{id}")
	    public String deleteEntity(@PathVariable int id) {
	        return s.deleteEntityById(id);
	    }
}
