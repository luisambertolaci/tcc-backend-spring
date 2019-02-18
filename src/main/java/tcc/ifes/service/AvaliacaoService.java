package tcc.ifes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import tcc.ifes.model.Avaliacao;
import tcc.ifes.model.Item;
import tcc.ifes.model.Usuario;
import tcc.ifes.repositories.AvaliacaoRepository;
import tcc.ifes.services.exceptions.DataIntegrityException;
import tcc.ifes.services.exceptions.ObjectNotFoundException;

@Service
public class AvaliacaoService {

	@Autowired
	private AvaliacaoRepository avaliacaoRepository;
	
	public Avaliacao find(Integer id) {
		Avaliacao obj = avaliacaoRepository.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Avaliacao.class.getName());
		}
		return obj;
	}
	
	public Avaliacao insert(Avaliacao obj) {
		obj.setId(null);
		return avaliacaoRepository.save(obj);
	}
	
	public Avaliacao update(Avaliacao obj) {
		find(obj.getId());
		return avaliacaoRepository.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			avaliacaoRepository.delete(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma Cidade que possui Bairros");
		}
	}
	
	public List<Avaliacao> findAll() {
		return avaliacaoRepository.findAll();
	}
	
	public List<Avaliacao> findByItem(Item item) {
		return avaliacaoRepository.findByItem(item);
	}
	
	public List<Avaliacao> findByUsuario(Usuario usuario) {
		return avaliacaoRepository.findByUsuario(usuario);
	}
}
