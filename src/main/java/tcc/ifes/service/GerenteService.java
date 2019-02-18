package tcc.ifes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import tcc.ifes.model.Gerente;
import tcc.ifes.repositories.GerenteRepository;
import tcc.ifes.services.exceptions.DataIntegrityException;
import tcc.ifes.services.exceptions.ObjectNotFoundException;

@Service
public class GerenteService {

	@Autowired
	private GerenteRepository professorRepository;
	
	public Gerente find(Integer id) {
		Gerente obj = professorRepository.findOne(id);
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Gerente.class.getName());
		}
		return obj;
	}
	
	public List<Gerente> findAll() {
		return professorRepository.findAll();
	}
	
	public Gerente insert(Gerente obj) {
		obj.setId(null);
		return professorRepository.save(obj);
	}
	
	public Gerente update(Gerente obj) {
		find(obj.getId());
		return professorRepository.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			professorRepository.delete(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir um Gerente que possui Projetos");
		}
	}
}
