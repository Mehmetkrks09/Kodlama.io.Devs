package Kodlama.io.Devs.webApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")

public class ProgrammingLanguageController {
	
	private ProgrammingLanguageService service;

	public ProgrammingLanguageController(ProgrammingLanguageService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/add")
	public void add( ProgrammingLanguage programmingLanguage) {
		
		service.add(programmingLanguage);
		
	}
	
	@PostMapping("/delete")
	public void delete( int id) {
		
		service.delete(id);
		
	}
	
	@PutMapping("/update")
	public void update( ProgrammingLanguage programmingLanguage) {
		
		service.update(programmingLanguage);
		
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(@RequestParam int id){
		return service.getById(id);
	}

}
