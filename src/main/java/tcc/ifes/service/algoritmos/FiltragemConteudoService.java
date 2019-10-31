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
			System.out.println(p  + " " + media.get(p) / maximo);
		}

		return normalizacao;
	}

	public float[][] distanciaEuclidiana(Integer projeto_id, Integer usuario_id) {
		List<Item> col = itemRepository.findByProjeto(projetoRepository.findOne(projeto_id));
		List<Float> normalizacao = normalizacao(projeto_id, usuario_id);
		int colunas = normalizacao.size();
		float matriz[][] = matrizConteudo(projeto_id);
		float somaDistancia = 0.0f;
		float distanciaEuclidiana[][] = new float[2][col.size()];
		
		for (int i = 0; i < col.size(); i++) {
			distanciaEuclidiana[0][i] = col.get(i).getId();
			System.out.println(distanciaEuclidiana[0][i]);
		}
		
		for (int i = 1; i < matriz.length; i++) {
			for (int c = 0; c < colunas; c++) {
				somaDistancia = somaDistancia + (float) Math.pow(normalizacao.get(c) - matriz[i][c], 2);
			}
			somaDistancia = (float) Math.sqrt(somaDistancia);
			System.out.println("soma completa: " + somaDistancia);
			distanciaEuclidiana[1][i -1] =somaDistancia;
			somaDistancia = 0.0f;
			System.out.println("reset: " + somaDistancia);
		}

		return distanciaEuclidiana;
	}

	public float[][] matrizConteudo(Integer projeto_id) {
		List<Item> lin = itemRepository.findByProjeto(projetoRepository.findOne(projeto_id));
		List<Tag> col = tagRepository.findByProjeto(projetoRepository.findOne(projeto_id));

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
	
	public List<Item> mediaDistanciaEuclidianaUsuario(Integer projeto_id, Integer usuario_id) {
		List<Item> lin = itemRepository.findByProjeto(projetoRepository.findOne(projeto_id));
		List<Item> lin2 = itemRepository.findByProjeto(projetoRepository.findOne(projeto_id));
		avaliacao = avaliacaoRepository.findByUsuario(usuarioRepository.findOne(usuario_id));
		float distancia[][] = distanciaEuclidiana(projeto_id, usuario_id);
		float somaDistancia = 0.0f;
		float media105 = 0.0f;

		float mediaDistanciaEuclidianaUsuario[][] = new float[2][avaliacao.size()];

		for (int i = 0; i < avaliacao.size(); i++) {
			Item item = avaliacao.get(i).getItem();
			mediaDistanciaEuclidianaUsuario[0][i] = distancia[0][lin.indexOf(item)];
			mediaDistanciaEuclidianaUsuario[1][i] = distancia[1][lin.indexOf(item)];
		}
		
		for (int p = 0; p < 2; p++) {
			for (int k = 0; k < avaliacao.size(); k++) {
				System.out.print(mediaDistanciaEuclidianaUsuario[p][k] + " ");
			}
			System.out.println();
		}
		
		for (int p = 1; p < 2; p++) {
			for (int k = 0; k < avaliacao.size(); k++) {
				somaDistancia = somaDistancia + (float) mediaDistanciaEuclidianaUsuario[p][k];
			}
			somaDistancia = somaDistancia / avaliacao.size();
			somaDistancia = somaDistancia * 1.05f;
			System.out.println("soma completa: " + somaDistancia);
			media105 = somaDistancia;
		}
		
		
		
		for (int i = 0; i < avaliacao.size(); i++) {
			while(lin.contains(avaliacao.get(i).getItem())) {
				lin.remove(avaliacao.get(i).getItem());
				System.out.println(lin);
				System.out.println(lin.size());
			}
		}
		
		List<Item> listRecomendacao = new ArrayList<>();
		
		for(int j = 0; j < lin.size(); j++) {
			Item item = lin.get(j);
			if(distancia[1][lin2.indexOf(item)] <= media105) {
				listRecomendacao.add(lin.get(j));
				System.out.println(lin.get(j).getId() + " " + lin.get(j));
			}
			
		}
		return listRecomendacao;
	}
	
	public List<Item> distanciaEuclidianaManual(Integer projeto_id, Integer usuario_id, float limite) {
		List<Item> lin = itemRepository.findByProjeto(projetoRepository.findOne(projeto_id));
		List<Item> lin2 = itemRepository.findByProjeto(projetoRepository.findOne(projeto_id));
		avaliacao = avaliacaoRepository.findByUsuario(usuarioRepository.findOne(usuario_id));
		float distancia[][] = distanciaEuclidiana(projeto_id, usuario_id);

		for (int i = 0; i < avaliacao.size(); i++) {
			while(lin.contains(avaliacao.get(i).getItem())) {
				lin.remove(avaliacao.get(i).getItem());
				System.out.println(lin);
				System.out.println(lin.size());
			}
		}
		
		List<Item> listRecomendacao = new ArrayList<>();
		for(int j = 0; j < lin.size(); j++) {
			Item item = lin.get(j);
			System.out.println(limite);
			if(distancia[1][lin2.indexOf(item)] <= limite) {
				listRecomendacao.add(lin.get(j));
			}
		}
		
		System.out.println(listRecomendacao);
		return listRecomendacao;
	}

}
