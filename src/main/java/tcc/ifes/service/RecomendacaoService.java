package tcc.ifes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import tcc.ifes.model.Item;
import tcc.ifes.model.Recomendacao;
import tcc.ifes.model.Usuario;
import tcc.ifes.repositories.RecomendacaoRepository;
import tcc.ifes.services.exceptions.DataIntegrityException;
import tcc.ifes.services.exceptions.ObjectNotFoundException;

@Service
public class RecomendacaoService {
	
	@Autowired
	private RecomendacaoRepository recomendacaoRepository;
	
	public Recomendacao find(Integer id) {
		Recomendacao obj = recomendacaoRepository.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Recomendacao.class.getName());
		}
		return obj;
	}
	
	public Recomendacao insert(Recomendacao obj) {
		obj.setId(null);
		return recomendacaoRepository.save(obj);
	}
	
	public Recomendacao update(Recomendacao obj) {
		find(obj.getId());
		return recomendacaoRepository.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			recomendacaoRepository.delete(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma Cidade que possui Bairros");
		}
	}
	
	public List<Recomendacao> findAll() {
		return recomendacaoRepository.findAll();
	}
	
	public List<Recomendacao> findByItem(Item item) {
		return recomendacaoRepository.findByItem(item);
	}
	
	public List<Recomendacao> findByUsuario(Usuario usuario) {
		return recomendacaoRepository.findByUsuario(usuario);
	}

}
