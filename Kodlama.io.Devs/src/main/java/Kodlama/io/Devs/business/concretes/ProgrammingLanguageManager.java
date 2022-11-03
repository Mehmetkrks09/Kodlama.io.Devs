package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.Dto.ProgrammingLanguageDto;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository repository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public String add(ProgrammingLanguageDto programmingLanguageDto) {

	if (repository.existsByName(programmingLanguageDto.getName())|| programmingLanguageDto.getName().equals(" ")) {
			
		System.out.println( "Bu Dil Sistemde Mevcut ");
		System.out.println(programmingLanguageDto);
		return null;
			
		}
		else {
			ProgrammingLanguage language = new ProgrammingLanguage();
			language.setId(programmingLanguageDto.getId());
			language.setName(programmingLanguageDto.getName());
			repository.save(language);
			return language.getName()+" Güncellendi";
		}
}

	@Override
	public String delete(int id) {
   ProgrammingLanguage language = new ProgrammingLanguage();
   language.setId(id);
   repository.delete(language);
   return " Programlama Dil Silindi";
	}

	@Override
	public String update(ProgrammingLanguageDto programmingLanguageDto) {
		
if (repository.existsByName(programmingLanguageDto.getName())|| programmingLanguageDto.getName().equals("")) {
			
			return "Bu Dil Sistemde Mevcut ";
			
		}
		else {
			
			ProgrammingLanguage language = new ProgrammingLanguage();
			language.setId(programmingLanguageDto.getId());
			language.setName(programmingLanguageDto.getName());
			repository.save(language);
			
			
		}
   return programmingLanguageDto.getName()+" Güncellendi";
	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return repository.findAll();
	}

	@Override
	public ProgrammingLanguage findById(int id) {

		return repository.findById(id);
	}

}
