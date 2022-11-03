package Kodlama.io.Devs.webApi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.entities.Dto.ProgrammingLanguageDto;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/programminglanguages")

public class ProgrammingLanguageController {
	
	private ProgrammingLanguageService service;

	public ProgrammingLanguageController(ProgrammingLanguageService service) {
		super();
		this.service = service;
	}
	
	@PostMapping("/add")
	public void add(ProgrammingLanguageDto programmingLanguageDto) {
		
		service.add(programmingLanguageDto);
		
	}
	
	@DeleteMapping("/delete")
	public void delete( int	id) {
		
		service.delete(id);
		
	}
	
	@PutMapping("/update")
	public void update( ProgrammingLanguageDto programmingLanguageDto) {
		
		service.update(programmingLanguageDto);
		
	}
	
	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll(){
		return service.getAll();
	}
	
	@GetMapping("/getbyid")
	public ProgrammingLanguage getById(@RequestBody int id){
		return service.findById(id);
	}

}
