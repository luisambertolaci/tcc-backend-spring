package tcc.ifes.algoritmos;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import tcc.ifes.model.Avaliacao;
import tcc.ifes.model.ItemTag;
import tcc.ifes.model.Usuario;
import tcc.ifes.repositories.AvaliacaoRepository;
import tcc.ifes.repositories.ItemTagRepository;
import tcc.ifes.repositories.UsuarioRepository;

@Configuration
public class CriandoPerfis {
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Autowired
	ItemTagRepository itemTagRepository;
	
	@Autowired
	AvaliacaoRepository avaliacaoRepository;
	
	public Usuario showUsuario() {
		
		Usuario usuario =  usuarioRepository.findOne(7);
		List<Avaliacao> avaliacao = avaliacaoRepository.findByUsuario(usuario);
		//List<Avaliacao> itens = avaliacaoRepository.findByItem(avaliacao);
		System.out.println(usuario + " " + avaliacao);
		for(int i = 0; i < avaliacao.size(); i++) {
				System.out.println(avaliacao.get(i).getItem().getItens());
			}
	
	return usuario;
	}

}
