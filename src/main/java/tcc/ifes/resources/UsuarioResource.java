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
import tcc.ifes.model.Recomendacao;
import tcc.ifes.model.Usuario;
import tcc.ifes.service.AvaliacaoService;
import tcc.ifes.service.RecomendacaoService;
import tcc.ifes.service.UsuarioService;

@RestController
@RequestMapping(value="/usuarios")
public class UsuarioResource {

	@Autowired
	private UsuarioService service;
	
	@Autowired
	private AvaliacaoService avaliacaoService;
	
	@Autowired
	private RecomendacaoService recomendacaoService;
	
	/*@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	/*@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<Usuario> find(@PathVariable Integer id) {
		Usuario obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}*/
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Usuario obj) {
		obj = service.insert(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody Usuario obj) {
		obj = service.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value="/{usuario_id}/avaliacoes", method=RequestMethod.GET)
	public ResponseEntity<List<Avaliacao>> findAvaliacoes(@PathVariable Integer usuario_id) {
		Usuario usuario = new Usuario();
		usuario.setId(usuario_id);
		List<Avaliacao> list = avaliacaoService.findByUsuario(usuario);
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value="/{usuario_id}/recomendacoes", method=RequestMethod.GET)
	public ResponseEntity<List<Recomendacao>> findRecomendacoes(@PathVariable Integer usuario_id) {
		Usuario usuario = new Usuario();
		usuario.setId(usuario_id);
		List<Recomendacao> list = recomendacaoService.findByUsuario(usuario);
		return ResponseEntity.ok().body(list);
	}
}
