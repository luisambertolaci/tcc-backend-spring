package tcc.ifes.algoritmos;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tcc.ifes.model.Avaliacao;
import tcc.ifes.model.ItemTag;
import tcc.ifes.model.Usuario;
import tcc.ifes.repositories.AvaliacaoRepository;
import tcc.ifes.repositories.ItemRepository;
import tcc.ifes.repositories.ItemTagRepository;
import tcc.ifes.repositories.TagRepository;
import tcc.ifes.repositories.UsuarioRepository;

@Service
public class CriandoPerfis {

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

	public void criandoMatriz() {

		Usuario usuario = usuarioRepository.findOne(3);
		avaliacao = avaliacaoRepository.findByUsuario(usuario);
		int linhas = itemRepository.findAll().size() + 1;
		int colunas = tagRepository.findAll().size();
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
				matriz[item.getItem().getId()][item.getTag().getId() - 1] = nota;
				System.out.println("linha :" + item.getItem().getId() + " coluna :" + (item.getTag().getId() - 1) + " "
						+ matriz[item.getItem().getId()][item.getTag().getId() - 1]);
			}

		}
		for (int p = 0; p < linhas; p++) {
			for (int k = 0; k < colunas; k++) {
				System.out.print(matriz[p][k] + " ");
			}
			System.out.println();
		}
	}
}
