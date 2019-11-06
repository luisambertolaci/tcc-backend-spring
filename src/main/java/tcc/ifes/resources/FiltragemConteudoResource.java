package tcc.ifes.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import tcc.ifes.model.Item;
import tcc.ifes.service.algoritmos.FiltragemConteudoService;

@RestController
@RequestMapping(value = "/filtragemBaseadaEmConteudo")
public class FiltragemConteudoResource {

	@Autowired
	private FiltragemConteudoService service;

	/*
	 * @RequestMapping(value ="/matriz", method = RequestMethod.GET) public
	 * float[][] matriz() { return service.matriz(projeto_id, usuario_id);
	 * 
	 * }
	 * 
	 * @RequestMapping(value ="/media", method = RequestMethod.GET) public
	 * List<Float> media() { return service.media(projeto_id, usuario_id);
	 * 
	 * }
	 
	@RequestMapping(value = "/normalizacao/{projeto_id}/{usuario_id}", method = RequestMethod.GET)
	public List<Float> normalizacao(@PathVariable Integer projeto_id, @PathVariable Integer usuario_id) {
		return service.normalizacao(projeto_id, usuario_id);
	}*/

	@RequestMapping(value = "/distanciaEuclidiana/{projeto_id}/{usuario_id}", method = RequestMethod.GET)
	public float[][] DistanciaEuclidiana(@PathVariable Integer projeto_id, @PathVariable Integer usuario_id) {
		return service.distanciaEuclidiana(projeto_id, usuario_id);
	}
	
	@RequestMapping(value = "/matrizDistanciaEuclidianaProjeto/{projeto_id}", method = RequestMethod.GET)
	public float[][] DistanciaEuclidianaProjeto(@PathVariable Integer projeto_id) {
		return service.distanciaEuclidianaProjeto(projeto_id);
	}
	
	@RequestMapping(value = "/getRecomendacaoLimiteUsuario/{projeto_id}/{usuario_id}", method = RequestMethod.GET)
	public List<Item> MediaDistanciaEuclidianaUsuario(@PathVariable Integer projeto_id, @PathVariable Integer usuario_id) {
		return service.mediaDistanciaEuclidianaUsuario(projeto_id, usuario_id);
	}
	
	@RequestMapping(value = "/getRecomendacaoLimiteManual/{projeto_id}/{usuario_id}/{limite}", method = RequestMethod.GET)
	public List<Item> distanciaEuclidianaManual(@PathVariable Integer projeto_id, @PathVariable Integer usuario_id, @PathVariable float limite) {
		return service.distanciaEuclidianaManual(projeto_id, usuario_id, limite);
	}

	@RequestMapping(value = "/getMatrizRecomendacaoLimiteManual/{projeto_id}/{limite}", method = RequestMethod.GET)
	public Object[][] distanciaEuclidianaProjetoManual(@PathVariable Integer projeto_id, @PathVariable float limite) {
		return service.distanciaEuclidianaProjetoManual(projeto_id, limite);
	}
	
	/*@RequestMapping(value = "/getMatrizRecomendacaoLimiteUsuario/{projeto_id}/{usuario_id}", method = RequestMethod.GET)
	public List<Item> MediaDistanciaEuclidianaUsuario(@PathVariable Integer projeto_id, @PathVariable Integer usuario_id) {
		return service.mediaDistanciaEuclidianaUsuario(projeto_id, usuario_id);
	}*/

}
