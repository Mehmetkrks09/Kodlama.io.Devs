package Kodlama.io.Devs.business.abstracts;

import java.util.List;

import Kodlama.io.Devs.entities.Dto.TechnologyDto;
import Kodlama.io.Devs.entities.concretes.Technology;

public interface TechnologyService {

	String add(TechnologyDto technology);
	String delete(int id);
	String update(TechnologyDto technology);
	List<Technology> getAll();
	Technology findBytechnologyId(int id);
}
