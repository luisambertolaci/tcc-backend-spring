package tcc.ifes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import tcc.ifes.model.Projeto;
import tcc.ifes.model.Usuario;
import tcc.ifes.repositories.UsuarioRepository;
import tcc.ifes.services.exceptions.DataIntegrityException;
import tcc.ifes.services.exceptions.ObjectNotFoundException;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public Usuario find(Integer id) {
		Usuario obj = usuarioRepository.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Usuario.class.getName());
		}
		return obj;
	}
	
	public Usuario insert(Usuario obj) {
		obj.setId(null);
		return usuarioRepository.save(obj);
	}
	
	public Usuario update(Usuario obj) {
		find(obj.getId());
		return usuarioRepository.save(obj);
	}

	public void delete(Integer id) {
		find(id);
		try {
			usuarioRepository.delete(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma Cidade que possui Bairros");
		}
	}
	
	public List<Usuario> findAll() {
		return usuarioRepository.findAll();
	}
	
	public List<Usuario> findByProjeto(Projeto projeto) {
		return usuarioRepository.findByProjeto(projeto);
	}
}
