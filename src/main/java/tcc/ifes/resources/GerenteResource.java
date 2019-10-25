package tcc.ifes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tcc.ifes.model.Gerente;
import tcc.ifes.model.Projeto;
import tcc.ifes.service.GerenteService;
import tcc.ifes.service.ProjetoService;

@RestController
@RequestMapping(value = "/gerente")
public class GerenteResource {

	@Autowired
	private GerenteService service;

	@Autowired
	private ProjetoService projetoService;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Gerente>> findAll() {
		List<Gerente> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Gerente> find(@PathVariable Integer id) {
		Gerente obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Gerente obj) {
		obj = service.insert(obj);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Gerente obj) {
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

	@RequestMapping(value = "/{gerente_id}/projetos", method = RequestMethod.GET)
	public ResponseEntity<List<Projeto>> findProjetos(@PathVariable Integer gerente_id) {
		Gerente gerente = new Gerente();
		gerente.setId(gerente_id);
		List<Projeto> list = projetoService.findByGerente(gerente);
		return ResponseEntity.ok().body(list);
	}

}
