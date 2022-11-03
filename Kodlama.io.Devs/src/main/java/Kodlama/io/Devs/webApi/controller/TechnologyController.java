package Kodlama.io.Devs.webApi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.entities.Dto.TechnologyDto;
import Kodlama.io.Devs.entities.concretes.Technology;
@RestController
@RequestMapping("/technology")
public class TechnologyController {
	private TechnologyService service;

	@Autowired
	public TechnologyController(TechnologyService service) {
		super();
		this.service = service;
	}
@PostMapping("/add")
 public void add( TechnologyDto technologyDto) {
	 
	 service.add(technologyDto);
 }
@DeleteMapping("/delete")
public void delete(int  id) {
	service.delete(id);

}

@PutMapping("/update")
public void update( TechnologyDto technologyDto) {
	
	service.update(technologyDto);
}

@GetMapping("/findById")
public Technology findBytechnologyId(int id) {
	return service.findBytechnologyId(id);
}


@GetMapping("/getall")
public List<Technology> getAll(){
	return service.getAll();
}

}
