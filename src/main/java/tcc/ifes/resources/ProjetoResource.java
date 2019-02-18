package tcc.ifes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tcc.ifes.model.Item;
import tcc.ifes.model.Projeto;
import tcc.ifes.model.Usuario;
import tcc.ifes.service.ItemService;
import tcc.ifes.service.ProjetoService;
import tcc.ifes.service.UsuarioService;

@RestController
@RequestMapping(value="/projetos")
public class ProjetoResource {

	@Autowired
	private ProjetoService service;
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired 
	private ItemService itemService;
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Projeto>> findAll() {
		List<Projeto> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Projeto> find(@PathVariable Integer id) {
		Projeto obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Projeto obj) {
		obj = service.insert(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Projeto obj) {
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{projeto_id}/usuarios", method=RequestMethod.GET)
	public ResponseEntity<List<Usuario>> findUsuarios(@PathVariable Integer projeto_id) {
		Projeto projeto = new Projeto();
		projeto.setId(projeto_id);
		List<Usuario> list = usuarioService.findByProjeto(projeto);
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value="/{projeto_id}/itens", method=RequestMethod.GET)
	public ResponseEntity<List<Item>> findItens(@PathVariable Integer projeto_id) {
		Projeto projeto = new Projeto();
		projeto.setId(projeto_id);
		List<Item> list = itemService.findByProjeto(projeto);
		return ResponseEntity.ok().body(list);
	}
	
}
