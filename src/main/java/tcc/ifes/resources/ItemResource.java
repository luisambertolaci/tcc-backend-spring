package tcc.ifes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tcc.ifes.model.Avaliacao;
import tcc.ifes.model.Item;
import tcc.ifes.service.AvaliacaoService;
import tcc.ifes.service.ItemService;

@RestController
@RequestMapping(value="/item")
public class ItemResource {
	
	@Autowired
	private ItemService service;
	
	@Autowired
	private AvaliacaoService avaliacaoService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Item>> findAll() {
		List<Item> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Item> find(@PathVariable Integer id) {
		Item obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Item obj) {
		obj = service.insert(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Item obj) {
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{item_id}/avaliacoes", method=RequestMethod.GET)
	public ResponseEntity<List<Avaliacao>> findAvaliacoes(@PathVariable Integer item_id) {
		Item item = new Item();
		item.setId(item_id);
		List<Avaliacao> list = avaliacaoService.findByItem(item);
		return ResponseEntity.ok().body(list);
	}
}
