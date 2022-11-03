package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.TechnologyService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.dataAccess.abstracts.TechnologyRepository;
import Kodlama.io.Devs.entities.Dto.TechnologyDto;
import Kodlama.io.Devs.entities.concretes.Technology;

@Service
public class TechnologyManager implements TechnologyService {
	
	private TechnologyRepository repository;
	private ProgrammingLanguageRepository languageRepository;

	@Autowired
	public TechnologyManager(TechnologyRepository repository,ProgrammingLanguageRepository languageRepository) {
		super();
		this.repository = repository;
		this.languageRepository=languageRepository;
	}

	@Override
	public String add(TechnologyDto technology) {
		Technology tech = new Technology();
		tech.setTechnologyId(technology.getTechnologyId());
		tech.setTechnologyName(technology.getTechnologyName());
		tech.setProgrammingLanguage(languageRepository.findById(technology.getId()));
		repository.save(tech);
		return tech.getTechnologyName()+" Eklendi";
		
		
	}

	@Override
	public String delete(int  id) {

		Technology tech= new Technology();
		tech.setTechnologyId(id);
		repository.delete(tech);
		return "  Programlama Dili Teknolojisi  Silindi"; 
		
		
	}

	@Override
	public String update(TechnologyDto technology) {
		Technology tech = new Technology();
		tech.setTechnologyId(technology.getTechnologyId());
		tech.setTechnologyName(technology.getTechnologyName());
		tech.setProgrammingLanguage(languageRepository.findById(technology.getId()) );
		repository.save (tech);
		return tech.getTechnologyName()+" Güncellendi";
		
		
	}

	@Override
	public List<Technology> getAll() {

		return repository.findAll();
		
	}

	@Override
	public Technology findBytechnologyId(int id) {

		return repository.findBytechnologyId(id);
	}

}
