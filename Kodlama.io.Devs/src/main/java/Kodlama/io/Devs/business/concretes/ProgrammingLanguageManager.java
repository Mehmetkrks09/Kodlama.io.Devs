package Kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import Kodlama.io.Devs.dataAccess.concretes.InMemoryProgrammingLanguageRepository;
import Kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private InMemoryProgrammingLanguageRepository repository;

	@Autowired
	public ProgrammingLanguageManager(InMemoryProgrammingLanguageRepository repository) {
		super();
		this.repository = repository;
	}

	@Override
	public void add(ProgrammingLanguage programmingLanguage) {

		boolean check = true;
		for (ProgrammingLanguage language : repository.getAll()) {

			if (programmingLanguage.getName().equals(language.getName()) || programmingLanguage.getName() == "") {

				System.out.println("Sistemde  Kayıtlı veya Boş Metin girdiniz");
				check = false;
				break;
			}
		}
		if (check) {
			repository.add(programmingLanguage);
		}

	}

	@Override
	public void delete(int id) {

		repository.delete(id);

	}

	@Override
	public void update(ProgrammingLanguage programmingLanguage) {

		for (ProgrammingLanguage language : repository.getAll()) {

			if (programmingLanguage.getName().equals(language.getName()) || programmingLanguage.getName().equals("")) {

				System.out.println("Sistemde  Kayıtlı veya Boş Metin girdiniz");
				break;
			}
		}
		repository.update(programmingLanguage);

	}

	@Override
	public List<ProgrammingLanguage> getAll() {

		return repository.getAll();
	}

	@Override
	public ProgrammingLanguage getById(int id) {

		return repository.getById(id);
	}

}
