package tcc.ifes.service.algoritmos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tcc.ifes.model.Avaliacao;
import tcc.ifes.model.Item;
import tcc.ifes.model.ItemTag;
import tcc.ifes.model.Tag;
import tcc.ifes.model.Usuario;
import tcc.ifes.repositories.AvaliacaoRepository;
import tcc.ifes.repositories.ItemRepository;
import tcc.ifes.repositories.ItemTagRepository;
import tcc.ifes.repositories.ProjetoRepository;
import tcc.ifes.repositories.TagRepository;
import tcc.ifes.repositories.UsuarioRepository;

@Service
public class criandoPerfisService {

	@Autowired
	UsuarioRepository usuarioRepository;

	@Autowired
	ItemTagRepository itemTagRepository;

	@Autowired
	AvaliacaoRepository avaliacaoRepository;

	@Autowired
	TagRepository tagRepository;

	@Autowired
	ItemRepository itemRepository;

	@Autowired
	ProjetoRepository projetoRepository;

	private List<ItemTag> tags = new ArrayList<ItemTag>();
	private List<Avaliacao> avaliacao = new ArrayList<Avaliacao>();

	public Usuario showUsuario() {
		Usuario usuario = usuarioRepository.findOne(1);
		avaliacao = avaliacaoRepository.findByUsuario(usuario);
		System.out.println(usuario + " " + avaliacao);
		for (int i = 0; i < avaliacao.size(); i++) {
			for (ItemTag item : avaliacao.get(i).getItem().getItens()) {
				item.setTag(tagRepository.findOne(item.getTag().getId()));
				item.setItem(avaliacao.get(i).getItem());
				System.out.println(item);
				tags.add(item);
			}
		}
		System.out.println(tags);

		return usuario;
	}

	public float[][] matriz() {
		List<Item> lin = itemRepository.findByProjeto(projetoRepository.findOne(1));
		List<Tag> col = tagRepository.findByProjeto(projetoRepository.findOne(1));
		Usuario usuario = usuarioRepository.findOne(2);
		avaliacao = avaliacaoRepository.findByUsuario(usuario);

		// int linhas = itemRepository.findAll().size() + 1;
		int linhas = lin.size() + 1;
		int colunas = col.size();

		float matriz[][] = new float[linhas][colunas];
		int i = 0;
		System.out.println("linhas : " + linhas + " colunas : " + colunas);
		for (i = 0; i < colunas; i++) {
			matriz[0][i] = tagRepository.getOne(i + 1).getId();
			System.out.println(matriz[0][i]);

			// System.out.println();
		}
		for (i = 0; i < avaliacao.size(); i++) {
			for (ItemTag item : avaliacao.get(i).getItem().getItens()) {
				float nota = avaliacao.get(i).getNota();
				item.setTag(tagRepository.findOne(item.getTag().getId()));
				//matriz[lin.indexOf(item.getItem()) + 1][item.getTag().getId() - 1] = nota;
				matriz[lin.indexOf(item.getItem()) + 1][col.indexOf(item.getTag())] = nota;
				System.out.println("linha :" + item.getItem().getId() + " coluna :" + (col.indexOf(item.getTag())) + " "
						+ matriz[lin.indexOf(item.getItem()) + 1][col.indexOf(item.getTag())]);
			}

		}
		for (int p = 0; p < linhas; p++) {
			for (int k = 0; k < colunas; k++) {
				System.out.print(matriz[p][k] + " ");
			}
			System.out.println();
		}
		return matriz;
	}

	public List<Float> media() {
		float[][] matriz = matriz();
		List<Item> lin = itemRepository.findByProjeto(projetoRepository.findOne(1));
		List<Tag> col = tagRepository.findByProjeto(projetoRepository.findOne(1));
		
		int linhas = lin.size() + 1;
		int colunas = col.size();
		float soma = 0.0f;
		int z = 0;
		
		List<Float> somatorio = new ArrayList<Float>();
		List<Float> media = new ArrayList<Float>();
		
		for (int p = 0; p < colunas; p++) {
			for (int k = 1; k < linhas; k++) {
				soma = soma + matriz[k][p];
			}
			somatorio.add(soma);
			System.out.println(soma);
			soma = 0.0f;
		}
		
		for (int p = 0; p < colunas; p++) {
			for (int k = 1; k < linhas; k++) {
				if(matriz[k][p] != 0.0) {
					z++;
				}
			}
			float valor = somatorio.get(p) / z;
			media.add(valor);
			z = 0;
		}
		
		return media;
	}
	
	public List<Float> normalizacao(){
		List<Float> media = media();
		int colunas = media.size();
		float maximo = 0.0f;
		List<Float> normalizacao = new ArrayList<Float>();
		
		for(int p = 0; p < colunas; p++) {
			if(media.get(p) > maximo) {
				maximo = media.get(p);
			}
		}
		
		for(int p = 0; p < colunas; p++) {
			normalizacao.add(media.get(p) / maximo);
		}
		
		return normalizacao;
	}
	
}
