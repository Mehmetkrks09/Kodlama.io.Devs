package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.Dto.ProgrammingLanguageDto;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	String add(ProgrammingLanguageDto programmingLanguage);
	String delete(int id);
	String update(ProgrammingLanguageDto programmingLanguage);
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage findById(int id);
	

}
