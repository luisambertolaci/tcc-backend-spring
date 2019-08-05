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
public class FiltragemConteudoService {

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

	private List<Avaliacao> avaliacao = new ArrayList<Avaliacao>();

	public float[][] matriz(Integer projeto_id, Integer usuario_id) {
		List<Item> lin = itemRepository.findByProjeto(projetoRepository.findOne(projeto_id));
		List<Tag> col = tagRepository.findByProjeto(projetoRepository.findOne(projeto_id));
		Usuario usuario = usuarioRepository.findOne(usuario_id);
		avaliacao = avaliacaoRepository.findByUsuario(usuario);

		int linhas = lin.size() + 1;
		int colunas = col.size();

		float matriz[][] = new float[linhas][colunas];
		int i = 0;

		for (i = 0; i < colunas; i++) {
			matriz[0][i] = col.get(i).getId();
		}

		for (i = 0; i < avaliacao.size(); i++) {
			for (ItemTag item : avaliacao.get(i).getItem().getItens()) {
				float nota = avaliacao.get(i).getNota();
				item.setTag(tagRepository.findOne(item.getTag().getId()));
				matriz[lin.indexOf(item.getItem()) + 1][col.indexOf(item.getTag())] = nota;
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

	public List<Float> media(Integer projeto_id, Integer usuario_id) {
		float[][] matriz = matriz(projeto_id, usuario_id);
		List<Item> lin = itemRepository.findByProjeto(projetoRepository.findOne(projeto_id));
		List<Tag> col = tagRepository.findByProjeto(projetoRepository.findOne(projeto_id));

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
			soma = 0.0f;
		}

		for (int p = 0; p < colunas; p++) {
			for (int k = 1; k < linhas; k++) {
				if (matriz[k][p] != 0.0) {
					z++;
				}
			}
			if (z != 0) {
				float valor = somatorio.get(p) / z;
				media.add(valor);
			} else {
				media.add(0.0f);
			}
			z = 0;
		}

		return media;
	}

	public List<Float> normalizacao(Integer projeto_id, Integer usuario_id) {
		List<Float> media = media(projeto_id, usuario_id);
		int colunas = media.size();
		float maximo = 0.0f;
		List<Float> normalizacao = new ArrayList<Float>();

		for (int p = 0; p < colunas; p++) {
			if (media.get(p) > maximo) {
				maximo = media.get(p);
			}
		}

		for (int p = 0; p < colunas; p++) {
			normalizacao.add(media.get(p) / maximo);
		}

		return normalizacao;
	}

	public List<Float> distanciaEuclidiana(Integer projeto_id, Integer usuario_id) {
		List<Float> normalizacao = normalizacao(projeto_id, usuario_id);
		int colunas = normalizacao.size();
		float matriz[][] = matrizConteudo(projeto_id);
		float somaDistancia = 0.0f;
		List<Float> distanciaEuclidiana = new ArrayList<>();

		for (int i = 1; i < matriz.length; i++) {
			for (int c = 0; c < colunas; c++) {
				
				somaDistancia = somaDistancia + (float) Math.pow(normalizacao.get(c) - matriz[i][c], 2);
			}
			somaDistancia = (float) Math.sqrt(somaDistancia);
			System.out.println("soma completa: " + somaDistancia);
			distanciaEuclidiana.add(somaDistancia);
			somaDistancia = 0.0f;
			System.out.println("reset: " + somaDistancia);
		}
		

		return distanciaEuclidiana;
	}
	
	public float[][] matrizConteudo(Integer projeto_id) {
		List<Item> lin = itemRepository.findByProjeto(projetoRepository.findOne(projeto_id));
		List<Tag> col = tagRepository.findByProjeto(projetoRepository.findOne(projeto_id));

		System.out.println(lin);
		int linhas = lin.size() + 1;
		int colunas = col.size();

		float matriz[][] = new float[linhas][colunas];
		int i = 0;

		for (i = 0; i < colunas; i++) {
			matriz[0][i] = col.get(i).getId();
		}
		
		for (i = 0; i < lin.size(); i++) {
			for (ItemTag item : lin.get(i).getItens()) {
				System.out.println(i + " " + item);
				item.setTag(tagRepository.findOne(item.getTag().getId()));
				matriz[lin.indexOf(item.getItem()) + 1][col.indexOf(item.getTag())] = 1;
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

}
