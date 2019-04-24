package tcc.ifes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tcc.ifes.service.algoritmos.criandoPerfisService;

@RestController
@RequestMapping(value = "/perfis")
public class criandoPerfisResource {

	@Autowired
	private criandoPerfisService service;

	
	@RequestMapping(value ="/matriz", method = RequestMethod.GET)
	public float[][] matriz() {
		return service.matriz();
		
	}
	
	@RequestMapping(value ="/media", method = RequestMethod.GET)
	public List<Float> media() {
		return service.media();
		
	}
	
	@RequestMapping(value ="/normalizacao", method = RequestMethod.GET)
	public List<Float> normalizacao(){
		return service.normalizacao();
	}
	
	@RequestMapping(value ="/distanciaEuclidiana", method = RequestMethod.GET)
	public List<Float> DistanciaEuclidiana(){
		return service.distanciaEuclidiana();
	}

}
