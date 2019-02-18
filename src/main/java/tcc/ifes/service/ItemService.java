package tcc.ifes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import tcc.ifes.model.Item;
import tcc.ifes.model.ItemTag;
import tcc.ifes.model.Projeto;
import tcc.ifes.repositories.ItemRepository;
import tcc.ifes.repositories.ItemTagRepository;
import tcc.ifes.repositories.TagRepository;
import tcc.ifes.services.exceptions.DataIntegrityException;
import tcc.ifes.services.exceptions.ObjectNotFoundException;

@Service
public class ItemService {

	@Autowired
	private ItemRepository itemRepository;
	@Autowired
	private ItemTagRepository itemTagRepository;
	@Autowired
	private TagRepository tagRepository;
	
	public Item find(Integer id) {
		Item obj = itemRepository.findOne(id);
		if (obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: " + id
					+ ", Tipo: " + Item.class.getName());
		}
		return obj;
	}
	
	public Item insert(Item obj) {
		obj.setId(null);
		obj = itemRepository.save(obj);
		
		for (ItemTag item : obj.getItens()) {
			item.setTag(tagRepository.findOne(item.getTag().getId()));
			item.setItem(obj);
		}
		
		itemTagRepository.save(obj.getItens());
		return obj;
	}
	
	public Item update(Item objNew) {
		find(objNew.getId());
		
		Item objOld = itemRepository.findOne(objNew.getId());
		itemTagRepository.delete(objOld.getItens());
		
		for (ItemTag item : objNew.getItens()) {
			item.setTag(tagRepository.findOne(item.getTag().getId()));
			item.setItem(objNew);
		}
		
		itemTagRepository.save(objNew.getItens());
		objNew = itemRepository.save(objNew);
		
		return objNew;
	}

	public void delete(Integer id) {
		find(id);
		try {
			Item obj = itemRepository.findOne(id);
			itemTagRepository.delete(obj.getItens());
			itemRepository.delete(id);
		}
		catch (DataIntegrityViolationException e) {
			throw new DataIntegrityException("Não é possível excluir!");
		}
	}
	
	public List<Item> findAll() {
		return itemRepository.findAll();
	}
	
	public List<Item> findByProjeto(Projeto projeto) {
		return itemRepository.findByProjeto(projeto);
	}
}
