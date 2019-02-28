package tcc.ifes.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tcc.ifes.model.Usuario;
import tcc.ifes.service.criandoPerfisService;
import tcc.ifes.services.exceptions.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/perfis")
public class criandoPerfisResource {

	@Autowired
	private criandoPerfisService service;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<Usuario> findAll() {
		Usuario list = service.showUsuario();
		if (list == null) {
			throw new ObjectNotFoundException("deu merda aq");
		}
		return ResponseEntity.ok().body(list);
	}

}
