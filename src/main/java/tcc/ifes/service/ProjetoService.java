package tcc.ifes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import tcc.ifes.model.Gerente;
import tcc.ifes.model.Projeto;
import tcc.ifes.repositories.ProjetoRepository;
import tcc.ifes.services.exceptions.DataIntegrityException;
import tcc.ifes.services.exceptions.ObjectNotFoundException;

@Service
public class ProjetoService {
	
	@Autowired
	private ProjetoRepository projetoRepository;
	
	public Projeto find(Integer id) {
		Projeto obj = projetoRepository.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Projeto.class.getName());
		}
		return obj;
	}
	
	public Projeto insert(Projeto obj) {
		obj.setId(null);
		return projetoRepository.save(obj);
	}
	
	public Projeto update(Projeto obj) {
		find(obj.getId());
		return projetoRepository.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			projetoRepository.delete(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma Cidade que possui Bairros");
		}
	}
	
	public List<Projeto> findAll() {
		return projetoRepository.findAll();
	}
	
	public List<Projeto> findByGerente(Gerente gerente) {
		return projetoRepository.findByGerente(gerente);
	}
}
