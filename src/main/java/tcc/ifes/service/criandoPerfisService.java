package tcc.ifes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tcc.ifes.algoritmos.CriandoPerfis;
import tcc.ifes.model.Usuario;

@Service
public class criandoPerfisService {
	
	@Autowired
	private CriandoPerfis criando;
	
	
	public Usuario showUsuario() {
		Usuario obj = criando.showUsuario();
		return obj;
	}
}
