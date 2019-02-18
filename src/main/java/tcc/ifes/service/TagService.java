package tcc.ifes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import tcc.ifes.model.Tag;
import tcc.ifes.repositories.TagRepository;
import tcc.ifes.services.exceptions.DataIntegrityException;
import tcc.ifes.services.exceptions.ObjectNotFoundException;

@Service
public class TagService {
	
	@Autowired
	private TagRepository tagRepository;
	
	public Tag find(Integer id) {
		Tag obj = tagRepository.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Tag.class.getName());
		}
		return obj;
	}
	
	public List<Tag> findAll(){
		return tagRepository.findAll();	
	}
	
	public Tag insert(Tag obj) {
		obj.setId(null);
		return tagRepository.save(obj);
	}
	
	public Tag update(Tag obj) {
		find(obj.getId());
		return tagRepository.save(obj);
	}
	
	public void delete(Integer id) {
		find(id);
		try {
			tagRepository.delete(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir uma Tag vinculada a itens!");
		}
	}
	
}
