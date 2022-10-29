package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	void add(ProgrammingLanguage programmingLanguage);
	void delete(int id);
	void update(ProgrammingLanguage programmingLanguage);
	List<ProgrammingLanguage> getAll();
	ProgrammingLanguage getById(int id);
	

}
