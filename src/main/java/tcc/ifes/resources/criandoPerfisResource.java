package tcc.ifes.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tcc.ifes.model.Usuario;
import tcc.ifes.service.algoritmos.criandoPerfisService;

@RestController
@RequestMapping(value = "/perfis")
public class criandoPerfisResource {

	@Autowired
	private criandoPerfisService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Usuario> findAll() {
		Usuario list = service.showUsuario();
		return ResponseEntity.ok().body(list);
	}
	
	@RequestMapping(value ="/matriz", method = RequestMethod.GET)
	public float[][] matriz() {
		return service.matriz();
		
	}

}
