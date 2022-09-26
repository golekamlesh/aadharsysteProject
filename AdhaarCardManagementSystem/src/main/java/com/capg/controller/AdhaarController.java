package com.capg.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.entity.Adhaar;
import com.capg.exception.RecordNotFoundException;
import com.capg.repository.AdhaarRepository;

@RestController
@RequestMapping("/adhaar")
public class AdhaarController {

	@Autowired
	private AdhaarRepository repository;

	@PostMapping("/create-adhaar")
	public ResponseEntity<Adhaar> createAdhaar(@Valid @RequestBody Adhaar adh) {
		Adhaar adhaar = repository.save(adh);
		return new ResponseEntity<Adhaar>(adhaar, HttpStatus.CREATED);
	}

	@GetMapping("/adhaar-list")
	public List<Adhaar> getAllAdhaar() {
		return (List<Adhaar>) repository.findAll();
	}

	@GetMapping("/adhaar-list/{aid}")
	public ResponseEntity<Adhaar> getAdhaarById(@PathVariable int aid) throws RecordNotFoundException {
		if(repository.findById(aid).isPresent()) {
		Adhaar adhaar = repository.findById(aid).get();
		return new ResponseEntity<Adhaar>(adhaar,HttpStatus.OK);
		}
		else
		{
			throw new RecordNotFoundException("Adhaar with Id: " + aid + " doesn't exist!!");
		}
		
	}

	@PutMapping("/update-adhaar")
	public Adhaar updateAdhaar(@RequestBody Adhaar obj) {
		return repository.save(obj);
	}

	@DeleteMapping("/delete-adhaar/{aid}")
	public void updateAdhaar(@PathVariable int aid) {

		 repository.deleteById(aid);
	}

}