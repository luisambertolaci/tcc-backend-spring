package tcc.ifes.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tcc.ifes.model.Avaliacao;
import tcc.ifes.model.Item;
import tcc.ifes.model.ItemTag;
import tcc.ifes.model.Gerente;
import tcc.ifes.model.Projeto;
import tcc.ifes.model.Recomendacao;
import tcc.ifes.model.Tag;
import tcc.ifes.model.Usuario;
import tcc.ifes.repositories.AvaliacaoRepository;
import tcc.ifes.repositories.ItemRepository;
import tcc.ifes.repositories.ItemTagRepository;
import tcc.ifes.repositories.GerenteRepository;
import tcc.ifes.repositories.ProjetoRepository;
import tcc.ifes.repositories.RecomendacaoRepository;
import tcc.ifes.repositories.TagRepository;
import tcc.ifes.repositories.UsuarioRepository;

@Service
public class DBService {

	@Autowired
	private AvaliacaoRepository avaliacaoRepository;
	@Autowired
	private ItemRepository itemRepository;
	@Autowired
	private GerenteRepository gerenteRepository;
	@Autowired
	private ItemTagRepository itemTagRepository;
	@Autowired
	private ProjetoRepository projetoRepository;
	@Autowired
	private RecomendacaoRepository recomendacaoRepository;
	@Autowired
	private TagRepository tagRepository;
	@Autowired
	private UsuarioRepository usuarioRepository;

	public void instantiateTestDatabase() throws ParseException {

		// Instanciando os objetos de modelo
		
		Gerente gerente1 = new Gerente(null, "Luisa Bertolaci", "luisa", "abc123");
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
		
		Projeto projeto1 = new Projeto(null, "Filmes", sdf.parse("05/02/2019 18:15"), gerente1);
		
		Usuario usuario1 = new Usuario(null, "Ana", "ana", "abc123", projeto1, null, null, null, null, null);
		Usuario usuario2 = new Usuario(null, "Marcos", "marcos", "abc123", projeto1, null, null, null, null, null);
		Usuario usuario3 = new Usuario(null, "Pedro", "pedro", "abc123", projeto1, null, null, null, null, null);
		Usuario usuario4 = new Usuario(null, "Claudia", "claudia", "abc123", projeto1, null, null, null, null, null);
		Usuario usuario5 = new Usuario(null, "Adriano", "adriano", "abc123", projeto1, null, null, null, null, null);
		Usuario usuario6 = new Usuario(null, "Janaina", "janaina", "abc123", projeto1, null, null, null, null, null);
		Usuario usuario7 = new Usuario(null, "Leonardo", "leonardo", "abc123", projeto1, null, null, null, null, null);
		
		Item item1 = new Item(null, "Freddy","", projeto1, null, null, null, null, null);
		Item item2 = new Item(null, "O Ultimato Bourne","", projeto1, null, null, null, null, null);
		Item item3 = new Item(null, "Star Trek","", projeto1, null, null, null, null, null);
		Item item4 = new Item(null, "Exterminador do Futuro","", projeto1, null, null, null, null, null);
		Item item5 = new Item(null, "Norbit","", projeto1, null, null, null, null, null);
		Item item6 = new Item(null, "Star Wars","", projeto1, null, null, null, null, null);
		
		Tag tag1 = new Tag(null, "Ação");
		Tag tag2 = new Tag(null, "Comédia");
		Tag tag3 = new Tag(null, "Terror");
		Tag tag4 = new Tag(null, "1971-1980");
		Tag tag5 = new Tag(null, "1981-1990");
		Tag tag6 = new Tag(null, "1991-2010");
		Tag tag7 = new Tag(null, "2011-2020");
		Tag tag8 = new Tag(null, "Jonny Depp");
		Tag tag9 = new Tag(null, "Matt Damon");
		Tag tag10 = new Tag(null, "Chris Pine");
		Tag tag11 = new Tag(null, "Arnold Schwarzenegger");
		Tag tag12 = new Tag(null, "Eddie Murphy");
		Tag tag13 = new Tag(null, "Mark Hamill");
		
		ItemTag itemTag1 = new ItemTag(item1, tag3);
		ItemTag itemTag2 = new ItemTag(item1, tag4);
		ItemTag itemTag3 = new ItemTag(item1, tag8);
		
		ItemTag itemTag4 = new ItemTag(item2, tag1);
		ItemTag itemTag5 = new ItemTag(item2, tag6);
		ItemTag itemTag6 = new ItemTag(item2, tag9);
		
		ItemTag itemTag7 = new ItemTag(item3, tag1);
		ItemTag itemTag8 = new ItemTag(item3, tag4);
		ItemTag itemTag9 = new ItemTag(item3, tag10);
		
		ItemTag itemTag10 = new ItemTag(item4, tag1);
		ItemTag itemTag11 = new ItemTag(item4, tag5);
		ItemTag itemTag12 = new ItemTag(item4, tag11);
		
		ItemTag itemTag13 = new ItemTag(item5, tag2);
		ItemTag itemTag14 = new ItemTag(item5, tag6);
		ItemTag itemTag15 = new ItemTag(item5, tag12);
		
		ItemTag itemTag16 = new ItemTag(item6, tag1);
		ItemTag itemTag17 = new ItemTag(item6, tag7);
		ItemTag itemTag18 = new ItemTag(item6, tag13);
		
		item1.setItens(Arrays.asList(itemTag1, itemTag2, itemTag3));
		item2.setItens(Arrays.asList(itemTag4, itemTag5, itemTag6));
		item3.setItens(Arrays.asList(itemTag7, itemTag8, itemTag9));
		item4.setItens(Arrays.asList(itemTag10, itemTag11, itemTag12));
		item5.setItens(Arrays.asList(itemTag13, itemTag14, itemTag15));
		item6.setItens(Arrays.asList(itemTag16, itemTag17, itemTag18));
		
		
		Avaliacao avaliacao1 = new Avaliacao(null, 2.5f, sdf.parse("05/02/2018 18:23"), usuario1, item1);
		Avaliacao avaliacao2 = new Avaliacao(null, 3.5f, sdf.parse("05/02/2018 18:23"), usuario1, item2);
		Avaliacao avaliacao3 = new Avaliacao(null, 3.0f, sdf.parse("05/02/2018 18:23"), usuario1, item3);
		Avaliacao avaliacao4 = new Avaliacao(null, 3.5f, sdf.parse("05/02/2018 18:23"), usuario1, item4);
		Avaliacao avaliacao5 = new Avaliacao(null, 2.5f, sdf.parse("05/02/2018 18:23"), usuario1, item5);
		Avaliacao avaliacao6 = new Avaliacao(null, 3.0f, sdf.parse("05/02/2018 18:23"), usuario1, item6);
		
		Avaliacao avaliacao7 = new Avaliacao(null, 3.0f, sdf.parse("05/02/2018 18:23"), usuario2, item1);
		Avaliacao avaliacao8 = new Avaliacao(null, 3.5f, sdf.parse("05/02/2018 18:23"), usuario2, item2);
		Avaliacao avaliacao9 = new Avaliacao(null, 1.5f, sdf.parse("05/02/2018 18:23"), usuario2, item3);
		Avaliacao avaliacao10 = new Avaliacao(null, 5.0f, sdf.parse("05/02/2018 18:23"), usuario2, item4);
		Avaliacao avaliacao11 = new Avaliacao(null, 3.0f, sdf.parse("05/02/2018 18:23"), usuario2, item5);
		Avaliacao avaliacao12 = new Avaliacao(null, 3.5f, sdf.parse("05/02/2018 18:23"), usuario2, item6);
		
		Avaliacao avaliacao13 = new Avaliacao(null, 2.5f, sdf.parse("05/02/2018 18:23"), usuario3, item1);
		Avaliacao avaliacao14 = new Avaliacao(null, 3.0f, sdf.parse("05/02/2018 18:23"), usuario3, item2);
		Avaliacao avaliacao15 = new Avaliacao(null, 3.5f, sdf.parse("05/02/2018 18:23"), usuario3, item4);
		Avaliacao avaliacao16 = new Avaliacao(null, 4.0f, sdf.parse("05/02/2018 18:23"), usuario3, item6);
		
		Avaliacao avaliacao17 = new Avaliacao(null, 3.5f, sdf.parse("05/02/2018 18:23"), usuario4, item2);
		Avaliacao avaliacao18 = new Avaliacao(null, 3.0f, sdf.parse("05/02/2018 18:23"), usuario4, item3);
		Avaliacao avaliacao19 = new Avaliacao(null, 4.0f, sdf.parse("05/02/2018 18:23"), usuario4, item4);
		Avaliacao avaliacao20 = new Avaliacao(null, 2.5f, sdf.parse("05/02/2018 18:23"), usuario4, item5);
		Avaliacao avaliacao21 = new Avaliacao(null, 4.5f, sdf.parse("05/02/2018 18:23"), usuario4, item6);
		
		Avaliacao avaliacao22 = new Avaliacao(null, 3.0f, sdf.parse("05/02/2018 18:23"), usuario5, item1);
		Avaliacao avaliacao23 = new Avaliacao(null, 4.0f, sdf.parse("05/02/2018 18:23"), usuario5, item2);
		Avaliacao avaliacao24 = new Avaliacao(null, 2.0f, sdf.parse("05/02/2018 18:23"), usuario5, item3);
		Avaliacao avaliacao25 = new Avaliacao(null, 3.0f, sdf.parse("05/02/2018 18:23"), usuario5, item4);
		Avaliacao avaliacao26 = new Avaliacao(null, 2.0f, sdf.parse("05/02/2018 18:23"), usuario5, item5);
		Avaliacao avaliacao27 = new Avaliacao(null, 3.0f, sdf.parse("05/02/2018 18:23"), usuario5, item6);
		
		Avaliacao avaliacao28 = new Avaliacao(null, 3.0f, sdf.parse("05/02/2018 18:23"), usuario6, item1);
		Avaliacao avaliacao29 = new Avaliacao(null, 4.0f, sdf.parse("05/02/2018 18:23"), usuario6, item2);
		Avaliacao avaliacao30 = new Avaliacao(null, 5.0f, sdf.parse("05/02/2018 18:23"), usuario6, item4);
		Avaliacao avaliacao31 = new Avaliacao(null, 3.5f, sdf.parse("05/02/2018 18:23"), usuario6, item5);
		Avaliacao avaliacao32 = new Avaliacao(null, 3.0f, sdf.parse("05/02/2018 18:23"), usuario6, item6);
		
		Avaliacao avaliacao33 = new Avaliacao(null, 4.5f, sdf.parse("05/02/2018 18:23"), usuario7, item2);
		Avaliacao avaliacao34 = new Avaliacao(null, 4.0f, sdf.parse("05/02/2018 18:23"), usuario7, item4);
		Avaliacao avaliacao35 = new Avaliacao(null, 1.0f, sdf.parse("05/02/2018 18:23"), usuario7, item5);
		
		gerenteRepository.save(Arrays.asList(gerente1));
		projetoRepository.save(Arrays.asList(projeto1));
		usuarioRepository.save(Arrays.asList(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6, usuario7));
		itemRepository.save(Arrays.asList(item1, item2, item3, item4, item5, item6));
		tagRepository.save(Arrays.asList(tag1, tag2,tag3,tag4,tag5,tag6,tag7,tag8,tag9,tag10, tag11, tag12, tag13));
		itemTagRepository.save(Arrays.asList(itemTag1, itemTag2, itemTag3, itemTag4, itemTag5, itemTag6, itemTag7, 
				itemTag8, itemTag9, itemTag10, itemTag11, itemTag12, itemTag13, itemTag14, itemTag15, itemTag16, itemTag17, itemTag18));
		avaliacaoRepository.save(Arrays.asList(avaliacao1, avaliacao2, avaliacao3, avaliacao4, avaliacao5, avaliacao6, avaliacao7, avaliacao8, avaliacao9, avaliacao10, 
				avaliacao11, avaliacao12, avaliacao13, avaliacao14, avaliacao15, avaliacao16, avaliacao17, avaliacao18, avaliacao19, avaliacao20, avaliacao21, avaliacao22, avaliacao23, 
				avaliacao24, avaliacao25, avaliacao26, avaliacao27, avaliacao28, avaliacao29, avaliacao30, avaliacao31, avaliacao32, avaliacao33, avaliacao34, avaliacao35));
		recomendacaoRepository.save(Arrays.asList());
		
		
		
		
		/*
		Avaliacao avaliacao2 = new Avaliacao(null, 1.0f, sdf.parse("05/04/2018 12:15"), usuario2, item1);
		Avaliacao avaliacao3 = new Avaliacao(null, 3.0f, sdf.parse("05/04/2018 12:10"), usuario2, item4);
		Avaliacao avaliacao4 = new Avaliacao(null, 4.0f, sdf.parse("05/04/2018 12:10"), usuario4, item5);
		Avaliacao avaliacao5 = new Avaliacao(null, 5.0f, sdf.parse("05/04/2018 12:10"), usuario4, item7);
		
		Recomendacao recomendacao1 = new Recomendacao(null, null, null, sdf.parse("05/04/2018 13:00"), usuario1, item1);
		//Recomendacao recomendacao2 = new Recomendacao(null, null, null, sdf.parse("05/04/2018 13:00"), usuario2, item1);
		//Recomendacao recomendacao3 = new Recomendacao(null, null, null, sdf.parse("05/04/2018 13:00"), usuario2, item4);
		//Recomendacao recomendacao4 = new Recomendacao(null, null, null, sdf.parse("10/05/2018 16:00"), usuario4, item5);
		//Recomendacao recomendacao5 = new Recomendacao(null, null, null, sdf.parse("10/05/2018 16:00"), usuario4, item7);
		
		gerenteRepository.save(Arrays.asList(gerente1, gerente2));
		projetoRepository.save(Arrays.asList(projeto1, projeto2, projeto3, projeto4));
		usuarioRepository.save(Arrays.asList(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6, usuario7, usuario8));
		itemRepository.save(Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12, item13, item14, item15, item16));
		avaliacaoRepository.save(Arrays.asList(avaliacao1, avaliacao2, avaliacao3, avaliacao4, avaliacao5));
		recomendacaoRepository.save(Arrays.asList(recomendacao1));
		
		

		// [INÍCIO] TESTES DE INTEGRIDADE DO BANCO DE
		// DADOS---------------------------------------------------------------------------
		// Inserindo um diretor vinculado ao mesmo filme, mais de uma vez (ainda não
		// resolvido)
		// filme1.setDiretores(Arrays.asList(diretor1, diretor1));

		// Inserindo uma participacao para um filme não existente (OK)

		// Deletando um filme (para saber se serão apagadas as participações) (OK)
		// filme3.setParticoes(Arrays.asList(participacao7, participacao8));
		// filmeRepository.delete(filme3); //o filme 3 não está associado com nenhuma
		// fita de item de empréstimo

		// Deletando um empréstimo com itens de empréstimo (para saber se serão apagados os itens de empréstimo) (ainda não resolvido)
		/*
		 * Emprestimo emprestimoApagar = new Emprestimo(null,
		 * sdf.parse("13/04/2018 08:00"), 15.00, true, cliente1); ItemDeEmprestimo
		 * itemDeEmprestimoApagar = new ItemDeEmprestimo(emprestimoApagar, fita1, 5.00,
		 * sdf.parse("14/04/2018 08:00"));
		 * emprestimoApagar.getItens().add(itemDeEmprestimoApagar);
		 * emprestimoRepository.save(emprestimoApagar);
		 * itemDeEmprestimoRepository.save(itemDeEmprestimoApagar);
		 * emprestimoRepository.delete(emprestimoApagar); //Deletar apenas o empréstimo
		 * (para, em cascata deletar os itens não está funcionando)
		 * itemDeEmprestimoRepository.delete(itemDeEmprestimoApagar); //Deletar item
		 * apenas funciona (item sem multa e devolução)
		 */
		// [TÉRMINO] TESTES DE INTEGRIDADE DO BANCO DE
		// DADOS---------------------------------------------------------------------------


	}
}
