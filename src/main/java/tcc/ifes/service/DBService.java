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

		Projeto projeto1 = new Projeto(null, "Séries", sdf.parse("13/08/2019 09:24"), gerente1);

		Projeto projeto2 = new Projeto(null, "Questões", sdf.parse("22/08/2019 08:12"), gerente1);

		Usuario usuario1 = new Usuario(null, "Luisa", "", "", projeto1, null, null, null, null, null);
		Usuario usuario2 = new Usuario(null, "Hanna", "", "", projeto1, null, null, null, null, null);
		Usuario usuario3 = new Usuario(null, "Pietra", "", "", projeto1, null, null, null, null, null);
		Usuario usuario4 = new Usuario(null, "Bárbara Santos Pinheiro", "", "", projeto1, null, null, null, null, null);
		Usuario usuario5 = new Usuario(null, "Iury", "", "", projeto1, null, null, null, null, null);
		Usuario usuario6 = new Usuario(null, "Diogo Leite", "", "", projeto1, null, null, null, null, null);
		Usuario usuario7 = new Usuario(null, "Fernanda", "", "", projeto1, null, null, null, null, null);
		Usuario usuario8 = new Usuario(null, "Wallace Rodrigues", "", "", projeto1, null, null, null, null, null);
		Usuario usuario9 = new Usuario(null, "Carla Corrêa", "", "", projeto1, null, null, null, null, null);
		Usuario usuario10 = new Usuario(null, "Thais", "", "", projeto1, null, null, null, null, null);
		Usuario usuario11 = new Usuario(null, "Ana Clara de Souza", "", "", projeto1, null, null, null, null, null);
		Usuario usuario12 = new Usuario(null, "Pedro Henrique", "", "", projeto1, null, null, null, null, null);
		Usuario usuario13 = new Usuario(null, "Raphaela", "", "", projeto1, null, null, null, null, null);
		Usuario usuario14 = new Usuario(null, "Lucas Teixeira", "", "", projeto1, null, null, null, null, null);
		Usuario usuario15 = new Usuario(null, "Sidney Moraes", "", "", projeto1, null, null, null, null, null);
		Usuario usuario16 = new Usuario(null, "Michael", "", "", projeto1, null, null, null, null, null);
		Usuario usuario17 = new Usuario(null, "Lays", "", "", projeto1, null, null, null, null, null);
		Usuario usuario18 = new Usuario(null, "Marina Cardoso", "", "", projeto1, null, null, null, null, null);
		Usuario usuario19 = new Usuario(null, "Álertse Tavares", "", "", projeto1, null, null, null, null, null);
		Usuario usuario20 = new Usuario(null, "Andrey Muneroni", "", "", projeto1, null, null, null, null, null);
		Usuario usuario21 = new Usuario(null, "Noemmy", "", "", projeto1, null, null, null, null, null);
		Usuario usuario22 = new Usuario(null, "Paulo Dornas", "", "", projeto1, null, null, null, null, null);
		Usuario usuario23 = new Usuario(null, "Ranyelle", "", "", projeto1, null, null, null, null, null);
		Usuario usuario24 = new Usuario(null, "Letícia", "", "", projeto1, null, null, null, null, null);
		Usuario usuario25 = new Usuario(null, "Guilherme Trombini", "", "", projeto1, null, null, null, null, null);
		Usuario usuario26 = new Usuario(null, "Ana", "", "", projeto1, null, null, null, null, null);
		Usuario usuario27 = new Usuario(null, "Micaelle Oliveira", "", "", projeto1, null, null, null, null, null);
		Usuario usuario28 = new Usuario(null, "Flavia de Oliveira", "", "", projeto1, null, null, null, null, null);
		Usuario usuario29 = new Usuario(null, "Isabel", "", "", projeto1, null, null, null, null, null);
		Usuario usuario30 = new Usuario(null, "Sinara", "", "", projeto1, null, null, null, null, null);
		Usuario usuario31 = new Usuario(null, "Laura Brandão", "", "", projeto1, null, null, null, null, null);
		Usuario usuario32 = new Usuario(null, "Antonio Leonardo de Souza", "", "", projeto1, null, null, null, null, null);
		Usuario usuario33 = new Usuario(null, "Michele", "", "", projeto1, null, null, null, null, null);
		Usuario usuario34 = new Usuario(null, "Gabi", "", "", projeto1, null, null, null, null, null);
		Usuario usuario35 = new Usuario(null, "Elian Lima Batista", "", "", projeto1, null, null, null, null, null);
		Usuario usuario36 = new Usuario(null, "Leandro Ferreira de Oliveira", "", "", projeto1, null, null, null, null, null);
		Usuario usuario37 = new Usuario(null, "Letícia Navarro", "", "", projeto1, null, null, null, null, null);
		Usuario usuario38 = new Usuario(null, "Joluan", "", "", projeto1, null, null, null, null, null);
		Usuario usuario39 = new Usuario(null, "Edgard da CUnha Pontes", "", "", projeto1, null, null, null, null, null);
		Usuario usuario40 = new Usuario(null, "Arthur Leite", "", "", projeto1, null, null, null, null, null);
		Usuario usuario41 = new Usuario(null, "Gustavo Cescon", "", "", projeto1, null, null, null, null, null);
		Usuario usuario42 = new Usuario(null, "Kevin", "", "", projeto1, null, null, null, null, null);
		Usuario usuario43 = new Usuario(null, "Felipe Gueller", "", "", projeto1, null, null, null, null, null);
		Usuario usuario44 = new Usuario(null, "Silvio Cesar Silva", "", "", projeto1, null, null, null, null, null);
		Usuario usuario45 = new Usuario(null, "Eduardo Vasconcelos", "", "", projeto1, null, null, null, null, null);
		Usuario usuario46 = new Usuario(null, "Daniele Rangel", "", "", projeto1, null, null, null, null, null);
		Usuario usuario47 = new Usuario(null, "Gabrielle Tuão", "", "", projeto1, null, null, null, null, null);
		Usuario usuario48 = new Usuario(null, "Emanoel Martins", "", "", projeto1, null, null, null, null, null);
		Usuario usuario49 = new Usuario(null, "Wander Vilhalva Domingos", "", "", projeto1, null, null, null, null, null);
		Usuario usuario50 = new Usuario(null, "Saulo", "", "", projeto1, null, null, null, null, null);
		Usuario usuario51 = new Usuario(null, "TMG", "", "", projeto1, null, null, null, null, null);
		Usuario usuario52 = new Usuario(null, "Raphael Macedo Bernardino", "", "", projeto1, null, null, null, null, null);
		
		
		Usuario usuario53 = new Usuario(null, "Alda", "", "", projeto2, null, null, null, null, null);
		Usuario usuario54 = new Usuario(null, "Alexandre", "", "", projeto2, null, null, null, null, null);
		Usuario usuario55 = new Usuario(null, "Ana Clara", "", "", projeto2, null, null, null, null, null);
		Usuario usuario56 = new Usuario(null, "Cleber", "", "", projeto2, null, null, null, null, null);
		Usuario usuario57 = new Usuario(null, "Emerson", "", "", projeto2, null, null, null, null, null);
		Usuario usuario58 = new Usuario(null, "Fernanda", "", "", projeto2, null, null, null, null, null);
		Usuario usuario59 = new Usuario(null, "Gabriel Costa", "", "", projeto2, null, null, null, null, null);
		Usuario usuario60 = new Usuario(null, "Ana Luiza", "", "", projeto2, null, null, null, null, null);
		Usuario usuario61 = new Usuario(null, "Giovanna", "", "", projeto2, null, null, null, null, null);
		Usuario usuario62 = new Usuario(null, "Guilherme Emmanuel", "", "", projeto2, null, null, null, null, null);
		Usuario usuario63 = new Usuario(null, "Henzo", "", "", projeto2, null, null, null, null, null);
		Usuario usuario64 = new Usuario(null, "Jhean", "", "", projeto2, null, null, null, null, null);
		Usuario usuario65 = new Usuario(null, "Júlia", "", "", projeto2, null, null, null, null, null);
		Usuario usuario66 = new Usuario(null, "Leticia Maciel", "", "", projeto2, null, null, null, null, null);
		Usuario usuario67 = new Usuario(null, "Leticia dos Anjos", "", "", projeto2, null, null, null, null, null);
		Usuario usuario68 = new Usuario(null, "Lívia", "", "", projeto2, null, null, null, null, null);
		Usuario usuario69 = new Usuario(null, "Maísa", "", "", projeto2, null, null, null, null, null);
		Usuario usuario70 = new Usuario(null, "Marcelo", "", "", projeto2, null, null, null, null, null);
		Usuario usuario71 = new Usuario(null, "Marllon", "", "", projeto2, null, null, null, null, null);
		Usuario usuario72 = new Usuario(null, "Débora", "", "", projeto2, null, null, null, null, null);
		Usuario usuario73 = new Usuario(null, "Pablo Henrique", "", "", projeto2, null, null, null, null, null);
		Usuario usuario74 = new Usuario(null, "Pedro Henrique", "", "", projeto2, null, null, null, null, null);
		Usuario usuario75 = new Usuario(null, "Phabiano", "", "", projeto2, null, null, null, null, null);
		Usuario usuario76 = new Usuario(null, "Rafael", "", "", projeto2, null, null, null, null, null);
		Usuario usuario77 = new Usuario(null, "Raquel", "", "", projeto2, null, null, null, null, null);
		Usuario usuario78 = new Usuario(null, "Ryan", "", "", projeto2, null, null, null, null, null);
		Usuario usuario79 = new Usuario(null, "Stefhany", "", "", projeto2, null, null, null, null, null);
		Usuario usuario80 = new Usuario(null, "Thatiane", "", "", projeto2, null, null, null, null, null);
		Usuario usuario81 = new Usuario(null, "Victor", "", "", projeto2, null, null, null, null, null);
		Usuario usuario82 = new Usuario(null, "Yan", "", "", projeto2, null, null, null, null, null);
		Usuario usuario83 = new Usuario(null, "Yara", "", "", projeto2, null, null, null, null, null);
		Usuario usuario84 = new Usuario(null, "Guilherme Sant'Anna", "", "", projeto2, null, null, null, null, null);
		Usuario usuario85 = new Usuario(null, "Pedro Cypriano", "", "", projeto2, null, null, null, null, null);
		Usuario usuario86 = new Usuario(null, "Matheus Capovilla", "", "", projeto2, null, null, null, null, null);
		Usuario usuario87 = new Usuario(null, "Matheus de Oliveira", "", "", projeto2, null, null, null, null, null);

		Usuario usuario88 = new Usuario(null, "Karla Teixeira", "", "", projeto1, null, null, null, null, null);
		Usuario usuario89 = new Usuario(null, "Larissa Lanes", "", "", projeto1, null, null, null, null, null);
		Usuario usuario90 = new Usuario(null, "Flávio Higor", "", "", projeto1, null, null, null, null, null);
		Usuario usuario91 = new Usuario(null, "Mirella Moreira Silva", "", "", projeto1, null, null, null, null, null);
		Usuario usuario92 = new Usuario(null, "Joicy", "", "", projeto1, null, null, null, null, null);
		Usuario usuario93 = new Usuario(null, "Larissa", "", "", projeto1, null, null, null, null, null);
		Usuario usuario94 = new Usuario(null, "Luana Nascimento", "", "", projeto1, null, null, null, null, null);
		Usuario usuario95 = new Usuario(null, "Juliana Bonelli", "", "", projeto1, null, null, null, null, null);
		Usuario usuario96 = new Usuario(null, "Thainá", "", "", projeto1, null, null, null, null, null);
		Usuario usuario97 = new Usuario(null, "Beatryz", "", "", projeto1, null, null, null, null, null);
		
		Item item1 = new Item(null, "Game of Thrones", "", projeto1, null, null, null, null, null);
		Item item2 = new Item(null, "Chernobyl", "", projeto1, null, null, null, null, null);
		Item item3 = new Item(null, "Breaking Bad", "", projeto1, null, null, null, null, null);
		Item item4 = new Item(null, "Better Call Saul", "", projeto1, null, null, null, null, null);
		Item item5 = new Item(null, "Sherlock", "", projeto1, null, null, null, null, null);
		Item item6 = new Item(null, "Doctor Who", "", projeto1, null, null, null, null, null);
		Item item7 = new Item(null, "Euphoria", "", projeto1, null, null, null, null, null);
		Item item8 = new Item(null, "Supernatural", "", projeto1, null, null, null, null, null);
		Item item9 = new Item(null, "Grey's Anatomy", "", projeto1, null, null, null, null, null);
		Item item10 = new Item(null, "Friends", "", projeto1, null, null, null, null, null);
		Item item11 = new Item(null, "Stranger Things", "", projeto1, null, null, null, null, null);
		Item item12 = new Item(null, "Vikings", "", projeto1, null, null, null, null, null);
		Item item13 = new Item(null, "How To Get Away With Murder", "", projeto1, null, null, null, null, null);
		Item item14 = new Item(null, "Prison Break", "", projeto1, null, null, null, null, null);
		Item item15 = new Item(null, "Demolidor", "", projeto1, null, null, null, null, null);
		Item item16 = new Item(null, "How I Met Your Mother", "", projeto1, null, null, null, null, null);
		Item item17 = new Item(null, "House of Cards", "", projeto1, null, null, null, null, null);
		Item item18 = new Item(null, "House", "", projeto1, null, null, null, null, null);
		Item item19 = new Item(null, "Sons of Anarchy", "", projeto1, null, null, null, null, null);
		Item item20 = new Item(null, "The Originals", "", projeto1, null, null, null, null, null);
		Item item21 = new Item(null, "The Vampire Diaries", "", projeto1, null, null, null, null, null);
		Item item22 = new Item(null, "The Walking Dead", "", projeto1, null, null, null, null, null);
		Item item23 = new Item(null, "La Casa de Papel", "", projeto1, null, null, null, null, null);
		Item item24 = new Item(null, "Vis a Vis", "", projeto1, null, null, null, null, null);
		Item item25 = new Item(null, "Skins", "", projeto1, null, null, null, null, null);
		Item item26 = new Item(null, "Riverdale", "", projeto1, null, null, null, null, null);
		Item item27 = new Item(null, "The 100", "", projeto1, null, null, null, null, null);
		Item item28 = new Item(null, "Lucifer", "", projeto1, null, null, null, null, null);
		Item item29 = new Item(null, "Blindspot", "", projeto1, null, null, null, null, null);
		Item item30 = new Item(null, "Orange Is The New Black", "", projeto1, null, null, null, null, null);
		
		Item item31 = new Item(null, "Questão 1", "Implemente um programa que receba dez números do usuário e imprima o cubo de cada número.", projeto2, null, null, null, null, null);
		Item item32 = new Item(null, "Questão 2", "Elabore um programa em C que leia vários números e encerre a leitura com 0 e imprima o maior, o menor e a média\r\n" + 
									    "aritmética dos números. O número 0 (zero) não faz parte da sequência.\r\n" + 
										"", projeto2, null, null, null, null, null);
		Item item33 = new Item(null, "Questão 3", "Desenvolva um programa que receba vários números inteiros e positivos e imprima a média dos números múltiplos de 3.\r\n" + 
										"A execução deve encerrar quando um número não positivo for lido.\r\n" + 
										"", projeto2, null, null, null, null, null);
		Item item34 = new Item(null, "Questão 4", "Desenvolva um programa que leia um número (NUM). Depois, leia NUM números inteiros e imprima o menor deles.\r\n" + 
										"Suponha que todos os números lidos serão positivos.\r\n" + 
										"", projeto2, null, null, null, null, null);
		Item item35 = new Item(null, "Questão 5", "Criar um programa que leia 5 números inteiros e imprima o maior e o segundo maior número. Suponha que todos os\r\n" + 
										"números lidos serão positivos.", projeto2, null, null, null, null, null);
		Item item36 = new Item(null, "Questão 6", "Escreva um programa que realize o produto de A (número real) por B (número inteiro), ou seja, A * B, através de adições\r\n" + 
										"(somas). Os dois valores são passados pelo usuário através do teclado.", projeto2, null, null, null, null, null);
		Item item37 = new Item(null, "Questão 7", "Implemente um programa para calcular o fatorial do número N, cujo valor é obtido através do usuário pelo teclado.", projeto2, null, null, null, null, null);
		Item item38 = new Item(null, "Questão 8", "A série de Fibonacci é formada pela sequencia: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, … Escreva um programa que gere a série\r\n" + 
										"de FIBONACCI até o N-ésimo (último) termo.", projeto2, null, null, null, null, null);
		Item item39 = new Item(null, "Questão 9", "Seja a seguinte série: 1, 4, 9, 16, 25, 36, ... Implemente um programa em C que gere esta série até o N-ésimo (último)\r\n" + 
				"termo. Este N-ésimo termo é digitado pelo usuário.", projeto2, null, null, null, null, null);

		Tag tag1 = new Tag(null, "1991-1995", projeto1);
		Tag tag2 = new Tag(null, "1996-2000", projeto1);
		Tag tag3 = new Tag(null, "2001-2005", projeto1);
		Tag tag4 = new Tag(null, "2006-2010", projeto1);
		Tag tag5 = new Tag(null, "2011-2015", projeto1);
		Tag tag6 = new Tag(null, "2016-2020", projeto1);
		Tag tag7 = new Tag(null, "Drama", projeto1);
		Tag tag8 = new Tag(null, "Fantasia", projeto1);
		Tag tag9 = new Tag(null, "Comédia", projeto1);
		Tag tag10 = new Tag(null, "Aventura", projeto1);
		Tag tag11 = new Tag(null, "Policial", projeto1);
		Tag tag12 = new Tag(null, "Sci-fi", projeto1);
		Tag tag13 = new Tag(null, "Crime", projeto1);
		Tag tag14 = new Tag(null, "Terror", projeto1);
		Tag tag15 = new Tag(null, "Suspense", projeto1);
		Tag tag16 = new Tag(null, "Histórico", projeto1);
		Tag tag17 = new Tag(null, "Ação", projeto1);
		Tag tag18 = new Tag(null, "Médico", projeto1);
		Tag tag19 = new Tag(null, "Romance", projeto1);
		
		Tag tag20 = new Tag(null, "Amigos", projeto1);
		Tag tag21 = new Tag(null, "Sobrenatural", projeto1);
		Tag tag22 = new Tag(null, "Mistério", projeto1);
		Tag tag23 = new Tag(null, "Prisão", projeto1);
		Tag tag24 = new Tag(null, "Drogas", projeto1);
		Tag tag25 = new Tag(null, "Radiação", projeto1);
		Tag tag26 = new Tag(null, "Familia", projeto1);
		Tag tag27 = new Tag(null, "Herói", projeto1);
		Tag tag28 = new Tag(null, "TV-PG", projeto1);
		Tag tag29 = new Tag(null, "TV-14", projeto1);
		Tag tag30 = new Tag(null, "TV-MA", projeto1);
		
		Tag tag68 = new Tag(null, "15-34 min", projeto1);
		Tag tag69 = new Tag(null, "35-60 min", projeto1);
		Tag tag70 = new Tag(null, "61+ min", projeto1);
		
		Tag tag76 = new Tag(null, "Facil", projeto2);
		Tag tag77 = new Tag(null, "Média", projeto2);
		Tag tag78 = new Tag(null, "Dificil", projeto2);
		Tag tag79 = new Tag(null, "While", projeto2);
		Tag tag80 = new Tag(null, "If", projeto2);
		Tag tag81 = new Tag(null, "For", projeto2);
		Tag tag82 = new Tag(null, "Pequeno", projeto2);
		Tag tag83 = new Tag(null, "Médio", projeto2);

		ItemTag itemTag1 = new ItemTag(item1, tag5);
		ItemTag itemTag2 = new ItemTag(item1, tag6);
		ItemTag itemTag3 = new ItemTag(item1, tag7);
		ItemTag itemTag4 = new ItemTag(item1, tag8);
		ItemTag itemTag5 = new ItemTag(item1, tag17);
		ItemTag itemTag6 = new ItemTag(item1, tag10);
		ItemTag itemTag7 = new ItemTag(item1, tag69);
		ItemTag itemTag8 = new ItemTag(item1, tag30);
		
		ItemTag itemTag9 = new ItemTag(item2, tag6);
		ItemTag itemTag10 = new ItemTag(item2, tag7);
		ItemTag itemTag11 = new ItemTag(item2, tag16);
		ItemTag itemTag12 = new ItemTag(item2, tag69);
		ItemTag itemTag13 = new ItemTag(item2, tag15);
		ItemTag itemTag14 = new ItemTag(item2, tag25);
		ItemTag itemTag15 = new ItemTag(item2, tag30);
		
		ItemTag itemTag16 = new ItemTag(item3, tag4);
		ItemTag itemTag17 = new ItemTag(item3, tag5);
		ItemTag itemTag18 = new ItemTag(item3, tag7);
		ItemTag itemTag19 = new ItemTag(item3, tag13);
		ItemTag itemTag20 = new ItemTag(item3, tag69);
		ItemTag itemTag287 = new ItemTag(item3, tag15);
		ItemTag itemTag288 = new ItemTag(item3, tag24);
		ItemTag itemTag289 = new ItemTag(item3, tag30);
		
		ItemTag itemTag22 = new ItemTag(item4, tag5);
		ItemTag itemTag23 = new ItemTag(item4, tag6);
		ItemTag itemTag24 = new ItemTag(item4, tag9);
		ItemTag itemTag25 = new ItemTag(item4, tag7);
		ItemTag itemTag26 = new ItemTag(item4, tag13);
		ItemTag itemTag27 = new ItemTag(item4, tag30);
		ItemTag itemTag28 = new ItemTag(item4, tag69);
		
		ItemTag itemTag30 = new ItemTag(item5, tag4);
		ItemTag itemTag31 = new ItemTag(item5, tag5);
		ItemTag itemTag32 = new ItemTag(item5, tag6);
		ItemTag itemTag33 = new ItemTag(item5, tag10);
		ItemTag itemTag34 = new ItemTag(item5, tag7);
		ItemTag itemTag35 = new ItemTag(item5, tag11);
		ItemTag itemTag36 = new ItemTag(item5, tag13);
		ItemTag itemTag37 = new ItemTag(item5, tag22);
		ItemTag itemTag38 = new ItemTag(item5, tag70);
		ItemTag itemTag290 = new ItemTag(item5, tag29);
		

		ItemTag itemTag40 = new ItemTag(item6, tag3);
		ItemTag itemTag41 = new ItemTag(item6, tag4);
		ItemTag itemTag42 = new ItemTag(item6, tag5);
		ItemTag itemTag43 = new ItemTag(item6, tag6);
		ItemTag itemTag44 = new ItemTag(item6, tag10);
		ItemTag itemTag45 = new ItemTag(item6, tag12);
		ItemTag itemTag46 = new ItemTag(item6, tag7);
		ItemTag itemTag47 = new ItemTag(item6, tag26);
		ItemTag itemTag48 = new ItemTag(item6, tag28);
		ItemTag itemTag49 = new ItemTag(item6, tag69);
		
		ItemTag itemTag51 = new ItemTag(item7, tag6);
		ItemTag itemTag52 = new ItemTag(item7, tag7);
		ItemTag itemTag53 = new ItemTag(item7, tag24);
		ItemTag itemTag54 = new ItemTag(item7, tag69);
		ItemTag itemTag291 = new ItemTag(item7, tag30);
		ItemTag itemTag292 = new ItemTag(item7, tag20);
		
		ItemTag itemTag56 = new ItemTag(item8, tag3);
		ItemTag itemTag57 = new ItemTag(item8, tag4);
		ItemTag itemTag58 = new ItemTag(item8, tag5);
		ItemTag itemTag59 = new ItemTag(item8, tag6);
		ItemTag itemTag60 = new ItemTag(item8, tag7);
		ItemTag itemTag61 = new ItemTag(item8, tag14);
		ItemTag itemTag62 = new ItemTag(item8, tag8);
		ItemTag itemTag63 = new ItemTag(item8, tag21);
		ItemTag itemTag64 = new ItemTag(item8, tag29);
		ItemTag itemTag66 = new ItemTag(item8, tag69);
		
		ItemTag itemTag65 = new ItemTag(item9, tag19);
		ItemTag itemTag68 = new ItemTag(item9, tag3);
		ItemTag itemTag69 = new ItemTag(item9, tag4);
		ItemTag itemTag70 = new ItemTag(item9, tag5);
		ItemTag itemTag71 = new ItemTag(item9, tag6);
		ItemTag itemTag72 = new ItemTag(item9, tag7);
		ItemTag itemTag73 = new ItemTag(item9, tag18);
		ItemTag itemTag74 = new ItemTag(item9, tag29);
		ItemTag itemTag77 = new ItemTag(item9, tag69);
		

		ItemTag itemTag75 = new ItemTag(item10, tag19);
		ItemTag itemTag76 = new ItemTag(item10, tag20);
		ItemTag itemTag79 = new ItemTag(item10, tag1);
		ItemTag itemTag80 = new ItemTag(item10, tag2);
		ItemTag itemTag81 = new ItemTag(item10, tag3);
		ItemTag itemTag82 = new ItemTag(item10, tag9);
		ItemTag itemTag83 = new ItemTag(item10, tag29);
		ItemTag itemTag85 = new ItemTag(item10, tag68);

		ItemTag itemTag84 = new ItemTag(item11, tag14);
		ItemTag itemTag87 = new ItemTag(item11, tag6);
		ItemTag itemTag88 = new ItemTag(item11, tag7);
		ItemTag itemTag89 = new ItemTag(item11, tag8);
		ItemTag itemTag90 = new ItemTag(item11, tag15);
		ItemTag itemTag91 = new ItemTag(item11, tag20);
		ItemTag itemTag92 = new ItemTag(item11, tag21);
		ItemTag itemTag93 = new ItemTag(item11, tag69);
		ItemTag itemTag293 = new ItemTag(item11, tag29);
		
		ItemTag itemTag95 = new ItemTag(item12, tag5);
		ItemTag itemTag96 = new ItemTag(item12, tag6);
		ItemTag itemTag97 = new ItemTag(item12, tag10);
		ItemTag itemTag98 = new ItemTag(item12, tag7);
		ItemTag itemTag99 = new ItemTag(item12, tag16);
		ItemTag itemTag100 = new ItemTag(item12, tag17);
		ItemTag itemTag101 = new ItemTag(item12, tag69);
		ItemTag itemTag294 = new ItemTag(item12, tag30);
		
		ItemTag itemTag105 = new ItemTag(item13, tag5);		
		ItemTag itemTag106 = new ItemTag(item13, tag6);
		ItemTag itemTag107 = new ItemTag(item13, tag7);
		ItemTag itemTag108 = new ItemTag(item13, tag15);
		ItemTag itemTag109 = new ItemTag(item13, tag13);
		ItemTag itemTag110 = new ItemTag(item13, tag22);
		ItemTag itemTag111 = new ItemTag(item13, tag69);
		ItemTag itemTag295 = new ItemTag(item13, tag20);
		ItemTag itemTag296 = new ItemTag(item13, tag29);
		
		ItemTag itemTag113 = new ItemTag(item14, tag3);
		ItemTag itemTag114 = new ItemTag(item14, tag4);
		ItemTag itemTag115 = new ItemTag(item14, tag5);
		ItemTag itemTag116 = new ItemTag(item14, tag6);
		ItemTag itemTag117 = new ItemTag(item14, tag7);
		ItemTag itemTag118 = new ItemTag(item14, tag15);
		ItemTag itemTag119 = new ItemTag(item14, tag17);
		ItemTag itemTag120 = new ItemTag(item14, tag69);
		ItemTag itemTag297 = new ItemTag(item14, tag13);
		ItemTag itemTag298 = new ItemTag(item14, tag23);
		ItemTag itemTag299 = new ItemTag(item14, tag29);
		
		ItemTag itemTag122 = new ItemTag(item15, tag5);
		ItemTag itemTag123 = new ItemTag(item15, tag6);
		ItemTag itemTag124 = new ItemTag(item15, tag7);
		ItemTag itemTag125 = new ItemTag(item15, tag8);
		ItemTag itemTag126 = new ItemTag(item15, tag17);
		ItemTag itemTag127 = new ItemTag(item15, tag13);
		ItemTag itemTag128 = new ItemTag(item15, tag27);
		ItemTag itemTag129 = new ItemTag(item15, tag69);
		ItemTag itemTag300 = new ItemTag(item15, tag30);
		
		ItemTag itemTag131 = new ItemTag(item16, tag3);
		ItemTag itemTag132 = new ItemTag(item16, tag4);
		ItemTag itemTag133 = new ItemTag(item16, tag5);
		ItemTag itemTag134 = new ItemTag(item16, tag9);
		ItemTag itemTag135 = new ItemTag(item16, tag19);
		ItemTag itemTag136 = new ItemTag(item16, tag20);
		ItemTag itemTag137 = new ItemTag(item16, tag68);
		ItemTag itemTag301 = new ItemTag(item16, tag29);

		ItemTag itemTag139 = new ItemTag(item17, tag5);
		ItemTag itemTag140 = new ItemTag(item17, tag6);
		ItemTag itemTag141 = new ItemTag(item17, tag7);
		ItemTag itemTag142 = new ItemTag(item17, tag15);
		ItemTag itemTag143 = new ItemTag(item17, tag30);
		ItemTag itemTag146 = new ItemTag(item17, tag69);

		ItemTag itemTag144 = new ItemTag(item18, tag22);
		ItemTag itemTag145 = new ItemTag(item18, tag29);
		ItemTag itemTag148 = new ItemTag(item18, tag3);
		ItemTag itemTag149 = new ItemTag(item18, tag4);
		ItemTag itemTag150 = new ItemTag(item18, tag5);
		ItemTag itemTag151 = new ItemTag(item18, tag9);
		ItemTag itemTag152 = new ItemTag(item18, tag7);
		ItemTag itemTag153 = new ItemTag(item18, tag18);
		ItemTag itemTag155 = new ItemTag(item18, tag69);

		ItemTag itemTag154 = new ItemTag(item19, tag13);
		ItemTag itemTag157 = new ItemTag(item19, tag4);
		ItemTag itemTag158 = new ItemTag(item19, tag5);
		ItemTag itemTag159 = new ItemTag(item19, tag7);
		ItemTag itemTag160 = new ItemTag(item19, tag11);
		ItemTag itemTag161 = new ItemTag(item19, tag15);
		ItemTag itemTag162 = new ItemTag(item19, tag20);
		ItemTag itemTag163 = new ItemTag(item19, tag69);
		ItemTag itemTag302 = new ItemTag(item19, tag30);
	
		ItemTag itemTag165 = new ItemTag(item20, tag5);
		ItemTag itemTag166 = new ItemTag(item20, tag6);
		ItemTag itemTag167 = new ItemTag(item20, tag7);
		ItemTag itemTag168 = new ItemTag(item20, tag14);
		ItemTag itemTag169 = new ItemTag(item20, tag8);
		ItemTag itemTag170 = new ItemTag(item20, tag21);
		ItemTag itemTag171 = new ItemTag(item20, tag69);
		ItemTag itemTag303 = new ItemTag(item20, tag29);
	
		ItemTag itemTag173 = new ItemTag(item21, tag4);
		ItemTag itemTag174 = new ItemTag(item21, tag5);
		ItemTag itemTag175 = new ItemTag(item21, tag6);
		ItemTag itemTag176 = new ItemTag(item21, tag7);
		ItemTag itemTag177 = new ItemTag(item21, tag8);
		ItemTag itemTag178 = new ItemTag(item21, tag19);
		ItemTag itemTag179 = new ItemTag(item21, tag14);
		ItemTag itemTag180 = new ItemTag(item21, tag21);
		ItemTag itemTag181 = new ItemTag(item21, tag69);
		ItemTag itemTag304 = new ItemTag(item21, tag29);
		
		ItemTag itemTag183 = new ItemTag(item22, tag4);
		ItemTag itemTag184 = new ItemTag(item22, tag5);
		ItemTag itemTag185 = new ItemTag(item22, tag6);
		ItemTag itemTag186 = new ItemTag(item22, tag7);
		ItemTag itemTag187 = new ItemTag(item22, tag14);
		ItemTag itemTag188 = new ItemTag(item22, tag15);
		ItemTag itemTag189 = new ItemTag(item22, tag21);
		ItemTag itemTag190 = new ItemTag(item22, tag30);
		ItemTag itemTag191 = new ItemTag(item22, tag69);
		
		ItemTag itemTag193 = new ItemTag(item23, tag6);
		ItemTag itemTag194 = new ItemTag(item23, tag7);
		ItemTag itemTag195 = new ItemTag(item23, tag15);
		ItemTag itemTag196 = new ItemTag(item23, tag17);  
		ItemTag itemTag197 = new ItemTag(item23, tag69);
		ItemTag itemTag305 = new ItemTag(item23, tag13);
		ItemTag itemTag306 = new ItemTag(item23, tag22);
		ItemTag itemTag307 = new ItemTag(item23, tag30);
		
		ItemTag itemTag199 = new ItemTag(item24, tag5);  
		ItemTag itemTag200 = new ItemTag(item24, tag6);
		ItemTag itemTag201 = new ItemTag(item24, tag7);
		ItemTag itemTag202 = new ItemTag(item24, tag15);
		ItemTag itemTag203 = new ItemTag(item24, tag23);
		ItemTag itemTag204 = new ItemTag(item24, tag30);
		ItemTag itemTag206 = new ItemTag(item24, tag70);
		ItemTag itemTag283 = new ItemTag(item24, tag13);
		ItemTag itemTag284 = new ItemTag(item24, tag17);

		ItemTag itemTag205 = new ItemTag(item25, tag24);
		ItemTag itemTag208 = new ItemTag(item25, tag4);
		ItemTag itemTag209 = new ItemTag(item25, tag5);
		ItemTag itemTag210 = new ItemTag(item25, tag7);
		ItemTag itemTag211 = new ItemTag(item25, tag20);
		ItemTag itemTag212 = new ItemTag(item25, tag30);
		ItemTag itemTag213 = new ItemTag(item25, tag69);
		
		ItemTag itemTag215 = new ItemTag(item26, tag6);
		ItemTag itemTag216 = new ItemTag(item26, tag7);
		ItemTag itemTag217 = new ItemTag(item26, tag15);
		ItemTag itemTag218 = new ItemTag(item26, tag13);
		ItemTag itemTag219 = new ItemTag(item26, tag69);
		ItemTag itemTag308 = new ItemTag(item26, tag22);
		ItemTag itemTag309 = new ItemTag(item26, tag29);
		
		ItemTag itemTag221 = new ItemTag(item27, tag5);
		ItemTag itemTag222 = new ItemTag(item27, tag6);
		ItemTag itemTag223 = new ItemTag(item27, tag10);
		ItemTag itemTag224 = new ItemTag(item27, tag7);
		ItemTag itemTag225 = new ItemTag(item27, tag12);
		ItemTag itemTag226 = new ItemTag(item27, tag22);
		ItemTag itemTag227 = new ItemTag(item27, tag69);
		ItemTag itemTag310 = new ItemTag(item27, tag25);
		ItemTag itemTag311 = new ItemTag(item27, tag20);
		ItemTag itemTag312 = new ItemTag(item27, tag29);
		
		ItemTag itemTag229 = new ItemTag(item28, tag6);
		ItemTag itemTag230 = new ItemTag(item28, tag7);
		ItemTag itemTag231 = new ItemTag(item28, tag8);
		ItemTag itemTag232 = new ItemTag(item28, tag11);
		ItemTag itemTag233 = new ItemTag(item28, tag13);
		ItemTag itemTag234 = new ItemTag(item28, tag29);
		ItemTag itemTag235 = new ItemTag(item28, tag69);
		
		ItemTag itemTag237 = new ItemTag(item29, tag5);
		ItemTag itemTag238 = new ItemTag(item29, tag6);
		ItemTag itemTag239 = new ItemTag(item29, tag7);
		ItemTag itemTag240 = new ItemTag(item29, tag15);
		ItemTag itemTag241 = new ItemTag(item29, tag17);
		ItemTag itemTag242 = new ItemTag(item29, tag13);
		ItemTag itemTag243 = new ItemTag(item29, tag69);
		ItemTag itemTag313 = new ItemTag(item29, tag29);
		
		ItemTag itemTag245 = new ItemTag(item30, tag5);
		ItemTag itemTag246 = new ItemTag(item30, tag6);
		ItemTag itemTag247 = new ItemTag(item30, tag9);
		ItemTag itemTag248 = new ItemTag(item30, tag7);
		ItemTag itemTag249 = new ItemTag(item30, tag13);
		ItemTag itemTag250 = new ItemTag(item30, tag69);
		ItemTag itemTag314 = new ItemTag(item30, tag23);
		ItemTag itemTag315 = new ItemTag(item30, tag24);
		ItemTag itemTag316 = new ItemTag(item30, tag30);
		
		ItemTag itemTag252 = new ItemTag(item31, tag76);
		ItemTag itemTag253 = new ItemTag(item31, tag81);
		ItemTag itemTag254 = new ItemTag(item31, tag82);
		
		ItemTag itemTag255 = new ItemTag(item32, tag76);		
		ItemTag itemTag256 = new ItemTag(item32, tag79);
		ItemTag itemTag257 = new ItemTag(item32, tag80);
		ItemTag itemTag258 = new ItemTag(item32, tag83);
		
		ItemTag itemTag259 = new ItemTag(item33, tag76);
		ItemTag itemTag260 = new ItemTag(item33, tag79);
		ItemTag itemTag261 = new ItemTag(item33, tag80);
		ItemTag itemTag262 = new ItemTag(item33, tag83);
		
		ItemTag itemTag263 = new ItemTag(item34, tag77);
		ItemTag itemTag264 = new ItemTag(item34, tag81);
		ItemTag itemTag265 = new ItemTag(item34, tag80);
		ItemTag itemTag266 = new ItemTag(item34, tag83);
		
		ItemTag itemTag267 = new ItemTag(item35, tag78);
		ItemTag itemTag268 = new ItemTag(item35, tag81);
		ItemTag itemTag269 = new ItemTag(item35, tag80);
		ItemTag itemTag270 = new ItemTag(item35, tag83);
		
		ItemTag itemTag271 = new ItemTag(item36, tag77);	
		ItemTag itemTag272 = new ItemTag(item36, tag81);
		ItemTag itemTag273 = new ItemTag(item36, tag83);
		
		ItemTag itemTag274 = new ItemTag(item37, tag78);
		ItemTag itemTag275 = new ItemTag(item37, tag81);
		ItemTag itemTag276 = new ItemTag(item37, tag82);
		
		ItemTag itemTag277 = new ItemTag(item38, tag78);
		ItemTag itemTag278 = new ItemTag(item38, tag81);
		ItemTag itemTag279 = new ItemTag(item38, tag83);
		
		ItemTag itemTag280 = new ItemTag(item39, tag78);
		ItemTag itemTag281 = new ItemTag(item39, tag81);		
		ItemTag itemTag282 = new ItemTag(item39, tag82);
		
		item1.setItens(Arrays.asList(itemTag1, itemTag2, itemTag3, itemTag4, itemTag5, itemTag6, itemTag7, itemTag8));
		item2.setItens(Arrays.asList(itemTag9, itemTag10, itemTag11, itemTag12, itemTag13, itemTag14, itemTag15));
		item3.setItens(Arrays.asList(itemTag16, itemTag17, itemTag18, itemTag19, itemTag20));
		item4.setItens(Arrays.asList(itemTag22, itemTag23, itemTag24, itemTag25, itemTag26, itemTag27, itemTag28));
		item5.setItens(Arrays.asList(itemTag30, itemTag31, itemTag32, itemTag33, itemTag34, itemTag35, itemTag36, itemTag37, itemTag38));
		item6.setItens(Arrays.asList(itemTag40, itemTag41, itemTag42, itemTag43, itemTag44, itemTag45, itemTag46, itemTag47, itemTag48, itemTag49));
		item7.setItens(Arrays.asList(itemTag51, itemTag52, itemTag53, itemTag54));
		item8.setItens(Arrays.asList(itemTag56, itemTag57, itemTag58, itemTag59, itemTag60, itemTag61, itemTag62, itemTag63, itemTag64, itemTag65, itemTag66));
		item9.setItens(Arrays.asList(itemTag68, itemTag69, itemTag70, itemTag71, itemTag72, itemTag73, itemTag74, itemTag75, itemTag76, itemTag77));
		item10.setItens(Arrays.asList(itemTag79, itemTag80, itemTag81, itemTag82, itemTag83, itemTag84, itemTag85));
		item11.setItens(Arrays.asList(itemTag87, itemTag88, itemTag89, itemTag90, itemTag91, itemTag92, itemTag93));
		item12.setItens(Arrays.asList(itemTag95, itemTag96, itemTag97, itemTag98, itemTag99, itemTag100, itemTag101));
		item13.setItens(Arrays.asList(itemTag105, itemTag106, itemTag107, itemTag108, itemTag109, itemTag110, itemTag111));
		item14.setItens(Arrays.asList(itemTag113, itemTag114, itemTag115, itemTag116, itemTag117, itemTag118, itemTag119, itemTag120));
		item15.setItens(Arrays.asList(itemTag122, itemTag123, itemTag124, itemTag125, itemTag126, itemTag127, itemTag128, itemTag129));
		item16.setItens(Arrays.asList(itemTag131, itemTag132, itemTag133, itemTag134, itemTag135, itemTag136, itemTag137));
		item17.setItens(Arrays.asList(itemTag139, itemTag140, itemTag141, itemTag142, itemTag143, itemTag144, itemTag145, itemTag146));
		item18.setItens(Arrays.asList(itemTag148, itemTag149, itemTag150, itemTag151, itemTag152, itemTag153, itemTag154, itemTag155));
		item19.setItens(Arrays.asList(itemTag157, itemTag158, itemTag159, itemTag160, itemTag161, itemTag162, itemTag163));
		item20.setItens(Arrays.asList(itemTag165, itemTag166, itemTag167, itemTag168, itemTag169, itemTag170, itemTag171));
		item21.setItens(Arrays.asList(itemTag173, itemTag174, itemTag175, itemTag176, itemTag177, itemTag178, itemTag179, itemTag180, itemTag181));
		item22.setItens(Arrays.asList(itemTag183, itemTag184, itemTag185, itemTag186, itemTag187, itemTag188, itemTag189, itemTag190, itemTag191));
		item23.setItens(Arrays.asList(itemTag193, itemTag194, itemTag195, itemTag196, itemTag197));
		item24.setItens(Arrays.asList(itemTag199, itemTag200, itemTag201, itemTag202, itemTag203, itemTag204, itemTag205, itemTag206, itemTag283, itemTag284));
		item25.setItens(Arrays.asList(itemTag208, itemTag209, itemTag210, itemTag211, itemTag212, itemTag213));
		item26.setItens(Arrays.asList(itemTag215, itemTag216, itemTag217, itemTag218, itemTag219));
		item27.setItens(Arrays.asList(itemTag221, itemTag222, itemTag223, itemTag224, itemTag225, itemTag226, itemTag227));
		item28.setItens(Arrays.asList(itemTag229, itemTag230, itemTag231, itemTag232, itemTag233, itemTag234, itemTag235));
		item29.setItens(Arrays.asList(itemTag237, itemTag238, itemTag239, itemTag240, itemTag241, itemTag242, itemTag243));
		item30.setItens(Arrays.asList(itemTag245, itemTag246, itemTag247, itemTag248, itemTag249, itemTag250));
		
		item31.setItens(Arrays.asList(itemTag252, itemTag253, itemTag254));
		item32.setItens(Arrays.asList(itemTag255, itemTag256, itemTag257, itemTag258));
		item33.setItens(Arrays.asList(itemTag259, itemTag260, itemTag261, itemTag262));
		item34.setItens(Arrays.asList(itemTag263, itemTag264, itemTag265, itemTag266));
		item35.setItens(Arrays.asList(itemTag267, itemTag268, itemTag269, itemTag270));
		item36.setItens(Arrays.asList(itemTag271, itemTag272, itemTag273));
		item37.setItens(Arrays.asList(itemTag274, itemTag275, itemTag276));
		item38.setItens(Arrays.asList(itemTag277, itemTag278, itemTag279));
		item39.setItens(Arrays.asList(itemTag280, itemTag281, itemTag282));

		
		Avaliacao avaliacao1 = new Avaliacao(null, 5.0f, sdf.parse("15/08/2019 10:00"), usuario1, item2);
		Avaliacao avaliacao2 = new Avaliacao(null, 4.0f, sdf.parse("15/08/2019 10:00"), usuario1, item3);
		Avaliacao avaliacao3 = new Avaliacao(null, 4.0f, sdf.parse("15/08/2019 10:00"), usuario1, item6);
		Avaliacao avaliacao4 = new Avaliacao(null, 3.0f, sdf.parse("15/08/2019 10:00"), usuario1, item10);
		Avaliacao avaliacao5 = new Avaliacao(null, 3.0f, sdf.parse("15/08/2019 10:00"), usuario1, item13);
		Avaliacao avaliacao6 = new Avaliacao(null, 5.0f, sdf.parse("15/08/2019 10:00"), usuario1, item16);
		Avaliacao avaliacao7 = new Avaliacao(null, 3.0f, sdf.parse("15/08/2019 10:00"), usuario1, item20);
		Avaliacao avaliacao8 = new Avaliacao(null, 4.0f, sdf.parse("15/08/2019 10:00"), usuario1, item21);
		Avaliacao avaliacao9 = new Avaliacao(null, 4.0f, sdf.parse("15/08/2019 10:00"), usuario1, item23);
		Avaliacao avaliacao10 = new Avaliacao(null, 5.0f, sdf.parse("15/08/2019 10:00"), usuario1, item25);
		Avaliacao avaliacao11 = new Avaliacao(null, 4.0f, sdf.parse("15/08/2019 10:00"), usuario1, item27);
		Avaliacao avaliacao12 = new Avaliacao(null, 4.0f, sdf.parse("15/08/2019 10:00"), usuario1, item30);
		
		Avaliacao avaliacao13 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario2, item1);
		Avaliacao avaliacao14 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario2, item2);
		Avaliacao avaliacao15 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario2, item5);
		Avaliacao avaliacao16 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario2, item7);
		Avaliacao avaliacao17 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario2, item9);
		Avaliacao avaliacao18 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario2, item10);
		Avaliacao avaliacao19 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario2, item11);
		Avaliacao avaliacao20 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario2, item12);
		Avaliacao avaliacao21 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario2, item13);
		Avaliacao avaliacao22 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario2, item18);
		Avaliacao avaliacao23 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario2, item23);
		Avaliacao avaliacao24 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario2, item25);
		Avaliacao avaliacao25 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario2, item26);
		Avaliacao avaliacao26 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario2, item28);
		Avaliacao avaliacao27 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario2, item29);
		Avaliacao avaliacao28 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario2, item30);
		
		Avaliacao avaliacao29 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item3);
		Avaliacao avaliacao30 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item5);
		Avaliacao avaliacao31 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item7);
		Avaliacao avaliacao32 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item9);
		Avaliacao avaliacao33 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item10);
		Avaliacao avaliacao34 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item11);
		Avaliacao avaliacao35 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item12);
		Avaliacao avaliacao36 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item13);
		Avaliacao avaliacao37 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item14);
		Avaliacao avaliacao38 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item16);
		Avaliacao avaliacao39 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item17);
		Avaliacao avaliacao40 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario3, item21);
		Avaliacao avaliacao41 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario3, item23);
		Avaliacao avaliacao42 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item24);
		Avaliacao avaliacao43 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item25);
		Avaliacao avaliacao44 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item27);
		Avaliacao avaliacao45 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item28);
		Avaliacao avaliacao46 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario3, item29);
		Avaliacao avaliacao47 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item30);
		
		
		Avaliacao avaliacao48 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario4, item1);
		Avaliacao avaliacao49 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario4, item2);
		Avaliacao avaliacao50 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario4, item5);
		Avaliacao avaliacao51 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario4, item7);
		Avaliacao avaliacao52 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario4, item9);
		Avaliacao avaliacao53 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario4, item10);
		Avaliacao avaliacao54 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario4, item20);
		Avaliacao avaliacao55 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario4, item21);
		Avaliacao avaliacao56 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario4, item22);
		Avaliacao avaliacao57 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario4, item25);
		Avaliacao avaliacao58 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario4, item29);
		
		Avaliacao avaliacao59 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario5, item1);
		Avaliacao avaliacao60 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario5, item3);
		Avaliacao avaliacao61 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario5, item6);
		Avaliacao avaliacao62 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario5, item10);
		Avaliacao avaliacao63 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario5, item11);
		Avaliacao avaliacao64 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario5, item12);
		Avaliacao avaliacao65 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario5, item14);
		Avaliacao avaliacao66 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario5, item16);
		Avaliacao avaliacao67 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario5, item23);
		Avaliacao avaliacao68 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario5, item25);
		Avaliacao avaliacao69 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario5, item28);
		
		Avaliacao avaliacao70 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario6, item1);
		Avaliacao avaliacao71 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario6, item2);
		Avaliacao avaliacao72 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario6, item6);
		Avaliacao avaliacao73 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario6, item7);
		Avaliacao avaliacao74 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario6, item8);
		Avaliacao avaliacao75 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario6, item9);
		Avaliacao avaliacao76 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario6, item11);
		Avaliacao avaliacao77 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario6, item13);
		Avaliacao avaliacao78 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario6, item22);
		Avaliacao avaliacao79 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario6, item23);
		Avaliacao avaliacao80 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario6, item25);
		Avaliacao avaliacao81 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario6, item26);
		Avaliacao avaliacao82 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario6, item27);
		Avaliacao avaliacao83 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario6, item28);
		Avaliacao avaliacao84 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario6, item30);
		
		Avaliacao avaliacao85 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item1);
		Avaliacao avaliacao86 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item2);
		Avaliacao avaliacao87 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item3);
		Avaliacao avaliacao88 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario7, item4);
		Avaliacao avaliacao89 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item5);
		Avaliacao avaliacao90 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario7, item6);
		Avaliacao avaliacao91 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario7, item7);
		Avaliacao avaliacao92 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item8);
		Avaliacao avaliacao93 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item9);
		Avaliacao avaliacao94 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item10);
		Avaliacao avaliacao95 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item11);
		Avaliacao avaliacao96 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario7, item12);
		Avaliacao avaliacao97 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item13);
		Avaliacao avaliacao98 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario7, item14);
		Avaliacao avaliacao99 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario7, item15);
		Avaliacao avaliacao100 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item16);
		Avaliacao avaliacao101 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item17);
		Avaliacao avaliacao102 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item18);
		Avaliacao avaliacao103 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item19);
		Avaliacao avaliacao104 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario7, item20);
		Avaliacao avaliacao105 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario7, item21);
		Avaliacao avaliacao106 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario7, item22);
		Avaliacao avaliacao107 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item23);
		Avaliacao avaliacao108 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item24);
		Avaliacao avaliacao109 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item25);
		Avaliacao avaliacao110 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario7, item26);
		Avaliacao avaliacao111 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario7, item27);
		Avaliacao avaliacao112 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario7, item28);
		Avaliacao avaliacao113 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item29);
		Avaliacao avaliacao114 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item30);
	
		Avaliacao avaliacao115 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item1);
		Avaliacao avaliacao116 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item3);
		Avaliacao avaliacao117 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item7);
		Avaliacao avaliacao118 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario8, item8);
		Avaliacao avaliacao119 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario8, item9);
		Avaliacao avaliacao120 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item10);
		Avaliacao avaliacao121 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item12);
		Avaliacao avaliacao122 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item13);
		Avaliacao avaliacao123 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario8, item14);
		Avaliacao avaliacao124 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario8, item15);
		Avaliacao avaliacao125 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario8, item16);
		Avaliacao avaliacao126 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario8, item22);
		Avaliacao avaliacao127 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario8, item23);
		Avaliacao avaliacao128 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario8, item27);
		Avaliacao avaliacao129 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario8, item28);
		
		Avaliacao avaliacao130 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario9, item1);
		Avaliacao avaliacao131 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario9, item3);
		Avaliacao avaliacao132 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario9, item6);
		Avaliacao avaliacao133 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario9, item7);
		Avaliacao avaliacao134 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario9, item9);
		Avaliacao avaliacao135 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario9, item10);
		Avaliacao avaliacao136 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario9, item11);
		Avaliacao avaliacao137 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario9, item12);
		Avaliacao avaliacao138 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario9, item13);
		Avaliacao avaliacao139 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario9, item14);
		Avaliacao avaliacao140 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario9, item16);
		Avaliacao avaliacao141 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario9, item22);
		Avaliacao avaliacao142 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario9, item23);
		Avaliacao avaliacao143 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario9, item26);
		Avaliacao avaliacao144 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario9, item27);
		Avaliacao avaliacao145 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario9, item28);
		Avaliacao avaliacao146 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario9, item30);
		
		Avaliacao avaliacao147 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario10, item1);
		Avaliacao avaliacao148 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario10, item7);
		Avaliacao avaliacao149 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario10, item9);
		Avaliacao avaliacao150 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario10, item10);
		Avaliacao avaliacao151 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario10, item12);
		Avaliacao avaliacao152 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario10, item13);
		Avaliacao avaliacao153 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario10, item16);
		Avaliacao avaliacao154 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario10, item23);
		Avaliacao avaliacao155 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario10, item27);
		Avaliacao avaliacao156 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario10, item28);
		
		Avaliacao avaliacao157 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario11, item8);
		Avaliacao avaliacao158 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario11, item10);
		Avaliacao avaliacao159 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario11, item17);
		Avaliacao avaliacao160 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario11, item21);
		Avaliacao avaliacao161 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario11, item22);
		Avaliacao avaliacao162 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario11, item23);
		Avaliacao avaliacao163 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario11, item24);
		Avaliacao avaliacao164 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario11, item25);
		Avaliacao avaliacao165 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario11, item26);
		Avaliacao avaliacao166 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario11, item28);
		Avaliacao avaliacao167 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario11, item30);
		
		Avaliacao avaliacao168 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario12, item1);
		Avaliacao avaliacao169 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario12, item2);
		Avaliacao avaliacao170 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item3);
		Avaliacao avaliacao171 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario12, item4);
		Avaliacao avaliacao172 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item5);
		Avaliacao avaliacao173 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item6);
		Avaliacao avaliacao174 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item7);
		Avaliacao avaliacao175 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item8);
		Avaliacao avaliacao176 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario12, item9);
		Avaliacao avaliacao177 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item10);
		Avaliacao avaliacao178 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item11);
		Avaliacao avaliacao179 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item12);
		Avaliacao avaliacao180 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item13);
		Avaliacao avaliacao181 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item15);
		Avaliacao avaliacao182 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item16);
		Avaliacao avaliacao183 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario12, item17);
		Avaliacao avaliacao184 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item18);
		Avaliacao avaliacao185 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item22);
		Avaliacao avaliacao186 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario12, item23);
		Avaliacao avaliacao187 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item25);
		Avaliacao avaliacao188 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario12, item30);
		
		Avaliacao avaliacao189 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario13, item1);
		Avaliacao avaliacao190 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario13, item2);
		Avaliacao avaliacao191 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item3);
		Avaliacao avaliacao192 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item5);
		Avaliacao avaliacao193 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item6);
		Avaliacao avaliacao194 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item7);
		Avaliacao avaliacao195 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario13, item9);
		Avaliacao avaliacao196 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item10);
		Avaliacao avaliacao197 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario13, item11);
		Avaliacao avaliacao198 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario13, item14);
		Avaliacao avaliacao199 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item16);
		Avaliacao avaliacao200 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario13, item17);
		Avaliacao avaliacao201 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario13, item18);
		Avaliacao avaliacao202 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario13, item22);
		Avaliacao avaliacao203 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item28);
		Avaliacao avaliacao204 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario13, item30);
		
		Avaliacao avaliacao205 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario14, item3);
		Avaliacao avaliacao206 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario14, item6);
		Avaliacao avaliacao207 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario14, item7);
		Avaliacao avaliacao208 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario14, item9);
		Avaliacao avaliacao209 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario14, item10);
		Avaliacao avaliacao210 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario14, item11);
		Avaliacao avaliacao211 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario14, item13);
		Avaliacao avaliacao212 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario14, item27);
		Avaliacao avaliacao213 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario14, item29);
		
		Avaliacao avaliacao214 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario15, item3);
		Avaliacao avaliacao215 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario15, item4);
		Avaliacao avaliacao216 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario15, item5);
		Avaliacao avaliacao217 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario15, item8);
		Avaliacao avaliacao218 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario15, item11);
		Avaliacao avaliacao219 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario15, item12);
		Avaliacao avaliacao220 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario15, item15);
		Avaliacao avaliacao221 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario15, item18);
		Avaliacao avaliacao222 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario15, item19);
		Avaliacao avaliacao223 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario15, item22);
		Avaliacao avaliacao224 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario15, item23);
		Avaliacao avaliacao225 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario15, item28);
		
		Avaliacao avaliacao226 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario16, item1);
		Avaliacao avaliacao227 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item2);
		Avaliacao avaliacao228 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item3);
		Avaliacao avaliacao229 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item6);
		Avaliacao avaliacao230 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item7);
		Avaliacao avaliacao231 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item8);
		Avaliacao avaliacao232 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item9);
		Avaliacao avaliacao233 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario16, item10);
		Avaliacao avaliacao234 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario16, item11);
		Avaliacao avaliacao235 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item12);
		Avaliacao avaliacao236 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario16, item13);
		Avaliacao avaliacao237 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item14);
		Avaliacao avaliacao238 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario16, item15);
		Avaliacao avaliacao239 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario16, item16);
		Avaliacao avaliacao240 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario16, item17);
		Avaliacao avaliacao241 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario16, item19);
		Avaliacao avaliacao242 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item20);
		Avaliacao avaliacao243 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item21);
		Avaliacao avaliacao244 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item23);
		Avaliacao avaliacao245 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario16, item24);
		Avaliacao avaliacao246 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item25);
		Avaliacao avaliacao247 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item26);
		Avaliacao avaliacao248 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item27);
		Avaliacao avaliacao249 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item28);
		Avaliacao avaliacao250 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario16, item29);
		Avaliacao avaliacao251 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item30);
		
		Avaliacao avaliacao252 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item1);
		Avaliacao avaliacao253 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario17, item2);
		Avaliacao avaliacao254 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item3);
		Avaliacao avaliacao255 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario17, item4);
		Avaliacao avaliacao256 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario17, item5);
		Avaliacao avaliacao257 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item7);
		Avaliacao avaliacao258 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item8);
		Avaliacao avaliacao259 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item9);
		Avaliacao avaliacao260 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item10);
		Avaliacao avaliacao261 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item11);
		Avaliacao avaliacao262 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item12);
		Avaliacao avaliacao263 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item14);
		Avaliacao avaliacao264 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario17, item16);
		Avaliacao avaliacao265 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item17);
		Avaliacao avaliacao266 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario17, item21);
		Avaliacao avaliacao267 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item22);
		Avaliacao avaliacao268 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item23);
		Avaliacao avaliacao269 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario17, item24);
		Avaliacao avaliacao270 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario17, item26);
		Avaliacao avaliacao271 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item27);
		Avaliacao avaliacao272 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario17, item28);
		Avaliacao avaliacao273 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item30);
		
		Avaliacao avaliacao274 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario18, item2);
		Avaliacao avaliacao275 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario18, item6);
		Avaliacao avaliacao276 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario18, item8);
		Avaliacao avaliacao277 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario18, item20);
		Avaliacao avaliacao278 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario18, item21);
		Avaliacao avaliacao279 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario18, item23);
		Avaliacao avaliacao280 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario18, item24);
		Avaliacao avaliacao281 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario18, item25);
		Avaliacao avaliacao282 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario18, item27);
		Avaliacao avaliacao283 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario18, item30);
		
		Avaliacao avaliacao284 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario19, item1);
		Avaliacao avaliacao285 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario19, item3);
		Avaliacao avaliacao286 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario19, item4);
		Avaliacao avaliacao287 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario19, item5);
		Avaliacao avaliacao288 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario19, item6);
		Avaliacao avaliacao289 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario19, item8);
		Avaliacao avaliacao290 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario19, item9);
		Avaliacao avaliacao291 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario19, item10);
		Avaliacao avaliacao292 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario19, item11);
		Avaliacao avaliacao293 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario19, item12);
		Avaliacao avaliacao294 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario19, item14);
		Avaliacao avaliacao295 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario19, item15);
		Avaliacao avaliacao296 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario19, item18);
		Avaliacao avaliacao297 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario19, item19);
		Avaliacao avaliacao298 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario19, item22);
		Avaliacao avaliacao299 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario19, item23);
		Avaliacao avaliacao300 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario19, item27);
		Avaliacao avaliacao301 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario19, item28);
		Avaliacao avaliacao302 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario19, item30);
		
		Avaliacao avaliacao303 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario20, item1);
		Avaliacao avaliacao304 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario20, item2);
		Avaliacao avaliacao305 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario20, item3);
		Avaliacao avaliacao306 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario20, item4);
		Avaliacao avaliacao307 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item5);
		Avaliacao avaliacao308 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario20, item6);
		Avaliacao avaliacao309 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario20, item7);
		Avaliacao avaliacao310 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item8);
		Avaliacao avaliacao311 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario20, item9);
		Avaliacao avaliacao312 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item10);
		Avaliacao avaliacao313 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item11);
		Avaliacao avaliacao314 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item12);
		Avaliacao avaliacao315 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario20, item13);
		Avaliacao avaliacao316 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item14);
		Avaliacao avaliacao317 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item15);
		Avaliacao avaliacao318 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item16);
		Avaliacao avaliacao319 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item17);
		Avaliacao avaliacao320 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario20, item18);
		Avaliacao avaliacao321 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario20, item19);
		Avaliacao avaliacao322 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario20, item20);
		Avaliacao avaliacao323 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario20, item21);
		Avaliacao avaliacao324 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario20, item22);
		Avaliacao avaliacao325 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item23);
		Avaliacao avaliacao326 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario20, item24);
		Avaliacao avaliacao327 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario20, item25);
		Avaliacao avaliacao328 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario20, item26);
		Avaliacao avaliacao329 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item27);
		Avaliacao avaliacao330 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item28);
		Avaliacao avaliacao331 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario20, item29);
		Avaliacao avaliacao332 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario20, item30);
		
		Avaliacao avaliacao333 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario21, item1);
		Avaliacao avaliacao334 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario21, item3);
		Avaliacao avaliacao335 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario21, item5);
		Avaliacao avaliacao336 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario21, item8);
		Avaliacao avaliacao337 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario21, item9);
		Avaliacao avaliacao338 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario21, item10);
		Avaliacao avaliacao339 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario21, item11);
		Avaliacao avaliacao340 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario21, item12);
		Avaliacao avaliacao341 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario21, item13);
		Avaliacao avaliacao342 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario21, item14);
		Avaliacao avaliacao343 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario21, item16);
		Avaliacao avaliacao344 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario21, item18);
		Avaliacao avaliacao345 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario21, item22);
		Avaliacao avaliacao346 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario21, item23);
		Avaliacao avaliacao347 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario21, item24);
		Avaliacao avaliacao348 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario21, item25);
		Avaliacao avaliacao349 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario21, item26);
		Avaliacao avaliacao350 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario21, item27);
		Avaliacao avaliacao351 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario21, item28);
		Avaliacao avaliacao352 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario21, item29);
		Avaliacao avaliacao353 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario21, item30);
		
		Avaliacao avaliacao354 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario22, item1);
		Avaliacao avaliacao355 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario22, item2);
		Avaliacao avaliacao356 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario22, item3);
		Avaliacao avaliacao357 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario22, item4);
		Avaliacao avaliacao358 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario22, item5);
		Avaliacao avaliacao359 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario22, item6);
		Avaliacao avaliacao360 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario22, item7);
		Avaliacao avaliacao361 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario22, item8);
		Avaliacao avaliacao362 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario22, item10);
		Avaliacao avaliacao363 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario22, item11);
		Avaliacao avaliacao364 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario22, item12);
		Avaliacao avaliacao365 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario22, item13);
		Avaliacao avaliacao366 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario22, item14);
		Avaliacao avaliacao367 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario22, item15);
		Avaliacao avaliacao368 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario22, item17);
		Avaliacao avaliacao369 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario22, item18);
		Avaliacao avaliacao370 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario22, item19);
		Avaliacao avaliacao371 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario22, item23);
		Avaliacao avaliacao372 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario22, item24);
		Avaliacao avaliacao373 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario22, item25);
		Avaliacao avaliacao374 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario22, item26);
		Avaliacao avaliacao375 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario22, item27);
		Avaliacao avaliacao376 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario22, item28);
		Avaliacao avaliacao377 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario22, item29);
		Avaliacao avaliacao378 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario22, item30);
		
		Avaliacao avaliacao379 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario23, item1);
		Avaliacao avaliacao380 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario23, item5);
		Avaliacao avaliacao381 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario23, item8);
		Avaliacao avaliacao382 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario23, item9);
		Avaliacao avaliacao383 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario23, item10);
		Avaliacao avaliacao384 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario23, item11);
		Avaliacao avaliacao385 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario23, item12);
		Avaliacao avaliacao386 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario23, item20);
		Avaliacao avaliacao387 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario23, item21);
		Avaliacao avaliacao388 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario23, item22);
		Avaliacao avaliacao389 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario23, item23);
		Avaliacao avaliacao390 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario23, item24);
		Avaliacao avaliacao391 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario23, item26);
		Avaliacao avaliacao392 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario23, item27);
		Avaliacao avaliacao393 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario23, item28);
		
		Avaliacao avaliacao394 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario24, item2);
		Avaliacao avaliacao395 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario24, item8);
		Avaliacao avaliacao396 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario24, item9);
		Avaliacao avaliacao397 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario24, item21);
		Avaliacao avaliacao398 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario24, item22);
		Avaliacao avaliacao399 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario24, item25);
		Avaliacao avaliacao400 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario24, item28);
		
		Avaliacao avaliacao401 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario25, item1);
		Avaliacao avaliacao402 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario25, item2);
		Avaliacao avaliacao403 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario25, item3);
		Avaliacao avaliacao404 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario25, item4);
		Avaliacao avaliacao405 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario25, item5);
		Avaliacao avaliacao406 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario25, item6);
		Avaliacao avaliacao407 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario25, item7);
		Avaliacao avaliacao408 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario25, item8);
		Avaliacao avaliacao409 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario25, item9);
		Avaliacao avaliacao410 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario25, item10);
		Avaliacao avaliacao411 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario25, item11);
		Avaliacao avaliacao412 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario25, item12);
		Avaliacao avaliacao413 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario25, item13);
		Avaliacao avaliacao414 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario25, item14);
		Avaliacao avaliacao415 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario25, item15);
		Avaliacao avaliacao416 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario25, item17);
		Avaliacao avaliacao417 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario25, item18);
		Avaliacao avaliacao418 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario25, item19);
		Avaliacao avaliacao419 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario25, item22);
		Avaliacao avaliacao420 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario25, item23);
		Avaliacao avaliacao421 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario25, item26);
		Avaliacao avaliacao422 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario25, item27);
		Avaliacao avaliacao423 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario25, item28);
		Avaliacao avaliacao424 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario25, item30);
		
		Avaliacao avaliacao425 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario26, item1);
		Avaliacao avaliacao426 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario26, item2);
		Avaliacao avaliacao427 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario26, item3);
		Avaliacao avaliacao428 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item4);
		Avaliacao avaliacao429 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item5);
		Avaliacao avaliacao430 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item6);
		Avaliacao avaliacao431 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item7);
		Avaliacao avaliacao432 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario26, item8);
		Avaliacao avaliacao433 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item9);
		Avaliacao avaliacao434 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario26, item10);
		Avaliacao avaliacao435 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item11);
		Avaliacao avaliacao436 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario26, item12);
		Avaliacao avaliacao437 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item13);
		Avaliacao avaliacao438 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item14);
		Avaliacao avaliacao439 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario26, item15);
		Avaliacao avaliacao440 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item16);
		Avaliacao avaliacao441 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item17);
		Avaliacao avaliacao442 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario26, item18);
		Avaliacao avaliacao443 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item19);
		Avaliacao avaliacao444 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item20);
		Avaliacao avaliacao445 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item21);
		Avaliacao avaliacao446 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario26, item22);
		Avaliacao avaliacao447 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario26, item23);
		Avaliacao avaliacao448 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item24);
		Avaliacao avaliacao449 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item25);
		Avaliacao avaliacao450 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario26, item26);
		Avaliacao avaliacao451 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item27);
		Avaliacao avaliacao452 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario26, item28);
		Avaliacao avaliacao453 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item29);
		Avaliacao avaliacao454 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario26, item30);
		
		Avaliacao avaliacao455 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario27, item1);
		Avaliacao avaliacao456 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario27, item2);
		Avaliacao avaliacao457 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario27, item6);
		Avaliacao avaliacao458 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario27, item8);
		Avaliacao avaliacao459 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario27, item9);
		Avaliacao avaliacao460 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario27, item10);
		Avaliacao avaliacao461 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario27, item11);
		Avaliacao avaliacao462 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario27, item12);
		Avaliacao avaliacao463 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario27, item13);
		Avaliacao avaliacao464 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario27, item14);
		Avaliacao avaliacao465 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario27, item16);
		Avaliacao avaliacao466 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario27, item17);
		Avaliacao avaliacao467 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario27, item18);
		Avaliacao avaliacao468 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario27, item19);
		Avaliacao avaliacao469 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario27, item20);
		Avaliacao avaliacao470 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario27, item21);
		Avaliacao avaliacao471 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario27, item22);
		Avaliacao avaliacao472 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario27, item23);
		Avaliacao avaliacao473 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario27, item24);
		Avaliacao avaliacao474 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario27, item25);
		Avaliacao avaliacao475 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario27, item26);
		Avaliacao avaliacao476 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario27, item27);
		Avaliacao avaliacao477 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario27, item28);
		Avaliacao avaliacao478 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario27, item29);
		Avaliacao avaliacao479 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario27, item30);

		Avaliacao avaliacao480 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario28, item1);
		Avaliacao avaliacao481 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario28, item2);
		Avaliacao avaliacao482 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario28, item3);
		Avaliacao avaliacao483 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario28, item4);
		Avaliacao avaliacao484 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario28, item5);
		Avaliacao avaliacao485 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario28, item6);
		Avaliacao avaliacao486 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario28, item7);
		Avaliacao avaliacao487 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario28, item8);
		Avaliacao avaliacao488 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario28, item9);
		Avaliacao avaliacao489 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario28, item10);		
		Avaliacao avaliacao490 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario28, item11);
		Avaliacao avaliacao491 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario28, item12);
		Avaliacao avaliacao492 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario28, item13);
		Avaliacao avaliacao493 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario28, item14);
		Avaliacao avaliacao494 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario28, item15);
		Avaliacao avaliacao495 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario28, item16);
		Avaliacao avaliacao496 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario28, item17);
		Avaliacao avaliacao497 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario28, item18);
		Avaliacao avaliacao498 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario28, item19);
		Avaliacao avaliacao499 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario28, item20);
		Avaliacao avaliacao500 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario28, item21);
		Avaliacao avaliacao501 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario28, item22);
		Avaliacao avaliacao502 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario28, item23);
		Avaliacao avaliacao503 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario28, item24);
		Avaliacao avaliacao504 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario28, item25);
		Avaliacao avaliacao505 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario28, item26);
		Avaliacao avaliacao506 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario28, item27);
		Avaliacao avaliacao507 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario28, item28);
		Avaliacao avaliacao508 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario28, item29);
		Avaliacao avaliacao509 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario28, item30);
		
		Avaliacao avaliacao510 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario29, item1);
		Avaliacao avaliacao511 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario29, item2);
		Avaliacao avaliacao512 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario29, item3);
		Avaliacao avaliacao513 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario29, item4);
		Avaliacao avaliacao514 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario29, item5);
		Avaliacao avaliacao515 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario29, item6);
		Avaliacao avaliacao516 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario29, item7);
		Avaliacao avaliacao517 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario29, item8);
		Avaliacao avaliacao518 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario29, item11);
		Avaliacao avaliacao519 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario29, item12);
		Avaliacao avaliacao520 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario29, item13);
		Avaliacao avaliacao521 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario29, item14);
		Avaliacao avaliacao522 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario29, item15);
		Avaliacao avaliacao523 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario29, item16);
		Avaliacao avaliacao524 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario29, item17);
		Avaliacao avaliacao525 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario29, item18);
		Avaliacao avaliacao526 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario29, item19);
		Avaliacao avaliacao527 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario29, item20);
		Avaliacao avaliacao528 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario29, item22);
		Avaliacao avaliacao529 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario29, item23);
		Avaliacao avaliacao530 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario29, item24);
		Avaliacao avaliacao531 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario29, item25);
		Avaliacao avaliacao532 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario29, item26);
		Avaliacao avaliacao533 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario29, item27);
		Avaliacao avaliacao534 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario29, item28);
		Avaliacao avaliacao535 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario29, item29);
		Avaliacao avaliacao536 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario29, item30);
		
		Avaliacao avaliacao537 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario30, item1);
		Avaliacao avaliacao538 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario30, item2);
		Avaliacao avaliacao539 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario30, item3);
		Avaliacao avaliacao540 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario30, item4);
		Avaliacao avaliacao541 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario30, item11);
		Avaliacao avaliacao542 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario30, item12);
		Avaliacao avaliacao543 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario30, item15);
		Avaliacao avaliacao544 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario30, item19);
		Avaliacao avaliacao545 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario30, item23);
		Avaliacao avaliacao546 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario30, item25);
		Avaliacao avaliacao547 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario30, item26);
		Avaliacao avaliacao548 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario30, item29);
		
		Avaliacao avaliacao549 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario31, item3);
		Avaliacao avaliacao550 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario31, item9);
		Avaliacao avaliacao551 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario31, item10);
		Avaliacao avaliacao552 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario31, item11);
		Avaliacao avaliacao553 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario31, item13);
		Avaliacao avaliacao554 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario31, item16);
		Avaliacao avaliacao555 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario31, item18);
		Avaliacao avaliacao556 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario31, item23);
		Avaliacao avaliacao557 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario31, item25);
		Avaliacao avaliacao558 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario31, item28);
		Avaliacao avaliacao559 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario31, item30);
		
		Avaliacao avaliacao560 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario32, item1);
		Avaliacao avaliacao561 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario32, item2);
		Avaliacao avaliacao562 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario32, item3);
		Avaliacao avaliacao563 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario32, item8);
		Avaliacao avaliacao564 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario32, item9);
		Avaliacao avaliacao565 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario32, item10);
		Avaliacao avaliacao566 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario32, item11);
		Avaliacao avaliacao567 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario32, item13);
		Avaliacao avaliacao568 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario32, item17);
		Avaliacao avaliacao569 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario32, item18);
		Avaliacao avaliacao570 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario32, item22);
		Avaliacao avaliacao571 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario32, item23);
		Avaliacao avaliacao572 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario32, item27);
		Avaliacao avaliacao573 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario32, item28);
		
		Avaliacao avaliacao574 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario33, item1);
		Avaliacao avaliacao575 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario33, item2);
		Avaliacao avaliacao576 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario33, item3);
		Avaliacao avaliacao577 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item4);
		Avaliacao avaliacao578 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item5);
		Avaliacao avaliacao579 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item6);
		Avaliacao avaliacao580 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item7);
		Avaliacao avaliacao581 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario33, item8);
		Avaliacao avaliacao582 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario33, item9);
		Avaliacao avaliacao583 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item10);
		Avaliacao avaliacao584 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario33, item11);
		Avaliacao avaliacao585 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario33, item12);
		Avaliacao avaliacao586 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item13);
		Avaliacao avaliacao587 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario33, item14);
		Avaliacao avaliacao588 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario33, item15);
		Avaliacao avaliacao589 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item16);
		Avaliacao avaliacao590 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item17);
		Avaliacao avaliacao591 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario33, item18);
		Avaliacao avaliacao592 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item19);
		Avaliacao avaliacao593 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario33, item20);
		Avaliacao avaliacao594 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario33, item21);
		Avaliacao avaliacao595 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario33, item22);
		Avaliacao avaliacao596 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario33, item23);
		Avaliacao avaliacao597 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item24);
		Avaliacao avaliacao598 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item25);
		Avaliacao avaliacao599 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario33, item26);
		Avaliacao avaliacao600 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item27);
		Avaliacao avaliacao601 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario33, item28);
		Avaliacao avaliacao602 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item29);
		Avaliacao avaliacao603 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario33, item30);
		
		Avaliacao avaliacao604 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item1);
		Avaliacao avaliacao605 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item2);
		Avaliacao avaliacao606 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario34, item3);
		Avaliacao avaliacao607 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario34, item4);
		Avaliacao avaliacao608 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item5);
		Avaliacao avaliacao609 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item6);
		Avaliacao avaliacao610 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item7);
		Avaliacao avaliacao611 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario34, item8);
		Avaliacao avaliacao612 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario34, item9);
		Avaliacao avaliacao613 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item10);
		Avaliacao avaliacao614 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item11);
		Avaliacao avaliacao615 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario34, item12);
		Avaliacao avaliacao616 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario34, item13);
		Avaliacao avaliacao617 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario34, item14);
		Avaliacao avaliacao618 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario34, item15);
		Avaliacao avaliacao619 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item16);
		Avaliacao avaliacao620 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario34, item17);
		Avaliacao avaliacao621 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item18);
		Avaliacao avaliacao622 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario34, item19);
		Avaliacao avaliacao623 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item20);
		Avaliacao avaliacao624 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item21);
		Avaliacao avaliacao625 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario34, item22);
		Avaliacao avaliacao626 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario34, item23);
		Avaliacao avaliacao627 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item24);
		Avaliacao avaliacao628 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario34, item25);
		Avaliacao avaliacao629 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario34, item26);
		Avaliacao avaliacao630 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario34, item27);
		Avaliacao avaliacao631 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario34, item28);
		Avaliacao avaliacao632 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario34, item29);
		Avaliacao avaliacao633 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario34, item30);
		
		Avaliacao avaliacao634 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario35, item2);
		Avaliacao avaliacao635 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario35, item3);
		Avaliacao avaliacao636 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario35, item5);
		Avaliacao avaliacao637 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario35, item9);
		Avaliacao avaliacao638 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario35, item11);
		Avaliacao avaliacao639 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario35, item12);
		Avaliacao avaliacao640 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario35, item13);
		Avaliacao avaliacao641 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario35, item14);
		Avaliacao avaliacao642 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario35, item15);
		Avaliacao avaliacao643 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario35, item19);
		Avaliacao avaliacao644 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario35, item20);
		Avaliacao avaliacao645 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario35, item21);
		Avaliacao avaliacao646 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario35, item22);
		Avaliacao avaliacao647 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario35, item23);
		Avaliacao avaliacao648 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario35, item28);
		
		Avaliacao avaliacao649 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item1);
		Avaliacao avaliacao650 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item2);
		Avaliacao avaliacao651 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item3);
		Avaliacao avaliacao652 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario36, item4);
		Avaliacao avaliacao653 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item5);
		Avaliacao avaliacao654 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item6);
		Avaliacao avaliacao655 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario36, item7);
		Avaliacao avaliacao656 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item8);
		Avaliacao avaliacao657 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario36, item9);
		Avaliacao avaliacao658 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item10);
		Avaliacao avaliacao659 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario36, item11);
		Avaliacao avaliacao660 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario36, item12);
		Avaliacao avaliacao661 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario36, item13);
		Avaliacao avaliacao662 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item14);
		Avaliacao avaliacao663 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item15);
		Avaliacao avaliacao664 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item16);
		Avaliacao avaliacao665 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario36, item17);
		Avaliacao avaliacao666 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item18);
		Avaliacao avaliacao667 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario36, item19);
		Avaliacao avaliacao668 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario36, item20);
		Avaliacao avaliacao669 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario36, item21);
		Avaliacao avaliacao670 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario36, item22);
		Avaliacao avaliacao671 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario36, item23);
		Avaliacao avaliacao672 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario36, item24);
		Avaliacao avaliacao673 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario36, item25);
		Avaliacao avaliacao674 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario36, item26);
		Avaliacao avaliacao675 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario36, item27);
		Avaliacao avaliacao676 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item28);
		Avaliacao avaliacao677 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario36, item29);
		Avaliacao avaliacao678 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario36, item30);
		
		Avaliacao avaliacao679 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item1);
		Avaliacao avaliacao680 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item2);
		Avaliacao avaliacao681 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item3);
		Avaliacao avaliacao682 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item4);
		Avaliacao avaliacao683 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario37, item5);
		Avaliacao avaliacao684 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario37, item6);
		Avaliacao avaliacao685 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item7);
		Avaliacao avaliacao686 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario37, item8);
		Avaliacao avaliacao687 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario37, item9);
		Avaliacao avaliacao688 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario37, item10);
		Avaliacao avaliacao689 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario37, item11);
		Avaliacao avaliacao690 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario37, item12);
		Avaliacao avaliacao691 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario37, item13);
		Avaliacao avaliacao692 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario37, item14);
		Avaliacao avaliacao693 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item15);
		Avaliacao avaliacao694 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario37, item16);
		Avaliacao avaliacao695 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario37, item17);
		Avaliacao avaliacao696 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item18);
		Avaliacao avaliacao697 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item19);
		Avaliacao avaliacao698 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item20);
		Avaliacao avaliacao699 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario37, item21);
		Avaliacao avaliacao700 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item22);
		Avaliacao avaliacao701 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario37, item23);
		Avaliacao avaliacao702 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item24);
		Avaliacao avaliacao703 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario37, item25);
		Avaliacao avaliacao704 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item26);
		Avaliacao avaliacao705 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario37, item27);
		Avaliacao avaliacao706 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item28);
		Avaliacao avaliacao707 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario37, item29);
		Avaliacao avaliacao708 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario37, item30);
		
		Avaliacao avaliacao709 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario38, item1);
		Avaliacao avaliacao710 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario38, item5);
		Avaliacao avaliacao711 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario38, item6);
		Avaliacao avaliacao712 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario38, item8);
		Avaliacao avaliacao713 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario38, item11);
		Avaliacao avaliacao714 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario38, item14);
		Avaliacao avaliacao715 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario38, item15);
		Avaliacao avaliacao716 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario38, item23);
		Avaliacao avaliacao717 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario38, item28);
		Avaliacao avaliacao718 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario38, item29);
		
		Avaliacao avaliacao719 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario39, item1);
		Avaliacao avaliacao720 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario39, item2);
		Avaliacao avaliacao721 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario39, item3);
		Avaliacao avaliacao722 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario39, item4);
		Avaliacao avaliacao723 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario39, item5);
		Avaliacao avaliacao724 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario39, item6);
		Avaliacao avaliacao725 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario39, item7);
		Avaliacao avaliacao726 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario39, item8);
		Avaliacao avaliacao727 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario39, item9);
		Avaliacao avaliacao728 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario39, item10);
		Avaliacao avaliacao729 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario39, item11);
		Avaliacao avaliacao730 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario39, item12);
		Avaliacao avaliacao731 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario39, item13);
		Avaliacao avaliacao732 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario39, item14);
		Avaliacao avaliacao733 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario39, item15);
		Avaliacao avaliacao734 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario39, item16);
		Avaliacao avaliacao735 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario39, item17);
		Avaliacao avaliacao736 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario39, item18);
		Avaliacao avaliacao737 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario39, item19);
		Avaliacao avaliacao738 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario39, item20);
		Avaliacao avaliacao739 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario39, item21);
		Avaliacao avaliacao740 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario39, item22);
		Avaliacao avaliacao741 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario39, item23);
		Avaliacao avaliacao742 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario39, item24);
		Avaliacao avaliacao743 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario39, item25);
		Avaliacao avaliacao744 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario39, item26);
		Avaliacao avaliacao745 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario39, item27);
		Avaliacao avaliacao746 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario39, item28);
		Avaliacao avaliacao747 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario39, item29);
		Avaliacao avaliacao748 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario39, item30);
		
		Avaliacao avaliacao749 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario40, item1);
		Avaliacao avaliacao750 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario40, item2);
		Avaliacao avaliacao751 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item3);
		Avaliacao avaliacao752 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item4);
		Avaliacao avaliacao753 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario40, item5);
		Avaliacao avaliacao754 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario40, item6);
		Avaliacao avaliacao755 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item7);
		Avaliacao avaliacao756 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario40, item8);
		Avaliacao avaliacao757 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item9);
		Avaliacao avaliacao758 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario40, item10);
		Avaliacao avaliacao759 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item11);
		Avaliacao avaliacao760 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario40, item12);
		Avaliacao avaliacao761 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item13);
		Avaliacao avaliacao762 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario40, item14);
		Avaliacao avaliacao763 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario40, item15);
		Avaliacao avaliacao764 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item16);
		Avaliacao avaliacao765 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario40, item17);
		Avaliacao avaliacao766 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item18);
		Avaliacao avaliacao767 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item19);
		Avaliacao avaliacao768 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item20);
		Avaliacao avaliacao769 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario40, item21);
		Avaliacao avaliacao770 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario40, item22);
		Avaliacao avaliacao771 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario40, item23);
		Avaliacao avaliacao772 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item24);
		Avaliacao avaliacao773 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario40, item25);
		Avaliacao avaliacao774 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item26);
		Avaliacao avaliacao775 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario40, item27);
		Avaliacao avaliacao776 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario40, item28);
		Avaliacao avaliacao777 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item29);
		Avaliacao avaliacao778 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario40, item30);
		
		Avaliacao avaliacao779 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario41, item1);
		Avaliacao avaliacao780 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item2);
		Avaliacao avaliacao781 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario41, item3);
		Avaliacao avaliacao782 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item4);
		Avaliacao avaliacao783 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item5);
		Avaliacao avaliacao784 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item6);
		Avaliacao avaliacao785 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item7);
		Avaliacao avaliacao786 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario41, item8);
		Avaliacao avaliacao787 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario41, item9);
		Avaliacao avaliacao788 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item10);
		Avaliacao avaliacao789 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item11);
		Avaliacao avaliacao790 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario41, item12);
		Avaliacao avaliacao791 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item13);
		Avaliacao avaliacao792 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario41, item14);
		Avaliacao avaliacao793 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item15);
		Avaliacao avaliacao794 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item16);
		Avaliacao avaliacao795 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item17);
		Avaliacao avaliacao796 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item18);
		Avaliacao avaliacao797 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item19);
		Avaliacao avaliacao798 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item20);
		Avaliacao avaliacao799 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item21);
		Avaliacao avaliacao800 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario41, item22);
		Avaliacao avaliacao801 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario41, item23);
		Avaliacao avaliacao802 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item24);
		Avaliacao avaliacao803 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item25);
		Avaliacao avaliacao804 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item26);
		Avaliacao avaliacao805 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item27);
		Avaliacao avaliacao806 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item28);
		Avaliacao avaliacao807 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item29);
		Avaliacao avaliacao808 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario41, item30);
		
		Avaliacao avaliacao809 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario42, item1);		
		Avaliacao avaliacao810 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario42, item2);
		Avaliacao avaliacao811 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario42, item3);
		Avaliacao avaliacao812 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario42, item8);
		Avaliacao avaliacao813 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario42, item9);
		Avaliacao avaliacao814 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario42, item11);
		Avaliacao avaliacao815 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario42, item14);
		Avaliacao avaliacao816 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario42, item21);
		Avaliacao avaliacao817 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario42, item22);
		Avaliacao avaliacao818 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario42, item23);
		Avaliacao avaliacao819 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario42, item26);
		Avaliacao avaliacao820 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario42, item27);
		Avaliacao avaliacao821 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario42, item28);
		Avaliacao avaliacao822 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario42, item30);
		
		Avaliacao avaliacao823 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario43, item8);
		Avaliacao avaliacao824 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario43, item9);
		Avaliacao avaliacao825 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario43, item11);
		Avaliacao avaliacao826 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario43, item12);
		Avaliacao avaliacao827 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario43, item13);
		Avaliacao avaliacao828 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario43, item16);
		Avaliacao avaliacao829 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario43, item22);
		Avaliacao avaliacao830 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario43, item30);
		
		Avaliacao avaliacao831 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario44, item1);
		Avaliacao avaliacao832 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario44, item2);
		Avaliacao avaliacao833 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario44, item3);
		Avaliacao avaliacao834 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario44, item5);
		Avaliacao avaliacao835 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario44, item8);
		Avaliacao avaliacao836 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario44, item9);
		Avaliacao avaliacao837 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario44, item11);
		Avaliacao avaliacao838 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario44, item12);
		Avaliacao avaliacao839 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario44, item15);
		Avaliacao avaliacao840 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario44, item19);
		Avaliacao avaliacao841 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario44, item20);
		Avaliacao avaliacao842 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario44, item21);
		Avaliacao avaliacao843 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario44, item22);
		Avaliacao avaliacao844 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario44, item23);
		Avaliacao avaliacao845 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario44, item28);
		Avaliacao avaliacao846 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario44, item29);
		Avaliacao avaliacao847 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario44, item30);
		
		Avaliacao avaliacao848 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario45, item1);
		Avaliacao avaliacao849 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario45, item2);
		Avaliacao avaliacao850 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario45, item3);
		Avaliacao avaliacao851 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario45, item4);
		Avaliacao avaliacao852 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario45, item5);
		Avaliacao avaliacao853 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario45, item6);
		Avaliacao avaliacao854 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario45, item7);
		Avaliacao avaliacao855 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario45, item8);
		Avaliacao avaliacao856 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario45, item9);
		Avaliacao avaliacao857 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario45, item10);
		Avaliacao avaliacao858 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario45, item11);
		Avaliacao avaliacao859 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario45, item12);
		Avaliacao avaliacao860 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario45, item13);
		Avaliacao avaliacao861 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario45, item14);
		Avaliacao avaliacao862 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario45, item15);
		Avaliacao avaliacao863 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario45, item16);
		Avaliacao avaliacao864 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario45, item17);
		Avaliacao avaliacao865 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario45, item18);
		Avaliacao avaliacao866 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario45, item19);
		Avaliacao avaliacao867 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario45, item20);
		Avaliacao avaliacao868 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario45, item21);
		Avaliacao avaliacao869 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario45, item22);
		Avaliacao avaliacao870 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario45, item23);
		Avaliacao avaliacao871 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario45, item24);
		Avaliacao avaliacao872 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario45, item25);
		Avaliacao avaliacao873 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario45, item26);
		Avaliacao avaliacao874 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario45, item27);
		Avaliacao avaliacao875 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario45, item28);
		Avaliacao avaliacao876 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario45, item29);
		Avaliacao avaliacao877 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario45, item30);
		
		Avaliacao avaliacao878 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario46, item7);
		Avaliacao avaliacao879 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario46, item10);
		Avaliacao avaliacao880 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario46, item11);
		Avaliacao avaliacao881 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario46, item13);
		Avaliacao avaliacao882 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario46, item22);
		Avaliacao avaliacao883 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario46, item26);
		Avaliacao avaliacao884 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario46, item27);
		Avaliacao avaliacao885 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario46, item30);
		
		Avaliacao avaliacao886 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario47, item1);
		Avaliacao avaliacao887 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario47, item3);
		Avaliacao avaliacao888 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario47, item4);
		Avaliacao avaliacao889 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario47, item6);
		Avaliacao avaliacao890 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario47, item8);
		Avaliacao avaliacao891 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario47, item10);
		Avaliacao avaliacao892 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario47, item11);
		Avaliacao avaliacao893 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario47, item12);
		Avaliacao avaliacao894 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario47, item13);
		Avaliacao avaliacao895 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario47, item15);
		Avaliacao avaliacao896 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario47, item16);
		Avaliacao avaliacao897 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario47, item20);
		Avaliacao avaliacao898 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario47, item21);
		Avaliacao avaliacao899 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario47, item23);
		Avaliacao avaliacao900 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario47, item25);
		Avaliacao avaliacao901 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario47, item26);
		Avaliacao avaliacao902 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario47, item28);
		Avaliacao avaliacao903 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario47, item30);
		
		Avaliacao avaliacao904 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario48, item1);
		Avaliacao avaliacao905 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario48, item2);
		Avaliacao avaliacao906 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario48, item3);
		Avaliacao avaliacao907 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario48, item11);
		Avaliacao avaliacao908 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario48, item12);
		Avaliacao avaliacao909 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario48, item14);
		Avaliacao avaliacao910 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario48, item23);
		Avaliacao avaliacao911 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario48, item27);
		
		Avaliacao avaliacao912 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item1);
		Avaliacao avaliacao913 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item2);
		Avaliacao avaliacao914 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item3);
		Avaliacao avaliacao915 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item4);
		Avaliacao avaliacao916 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item5);
		Avaliacao avaliacao917 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item6);
		Avaliacao avaliacao918 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item7);
		Avaliacao avaliacao919 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item8);
		Avaliacao avaliacao920 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item9);
		Avaliacao avaliacao921 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item10);
		Avaliacao avaliacao922 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item11);
		Avaliacao avaliacao923 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item12);
		Avaliacao avaliacao924 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item13);
		Avaliacao avaliacao925 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item14);
		Avaliacao avaliacao926 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item15);
		Avaliacao avaliacao927 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item16);
		Avaliacao avaliacao928 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item17);
		Avaliacao avaliacao929 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item18);
		Avaliacao avaliacao930 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item19);
		Avaliacao avaliacao931 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item20);
		Avaliacao avaliacao932 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item21);
		Avaliacao avaliacao933 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item22);
		Avaliacao avaliacao934 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item23);
		Avaliacao avaliacao935 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item24);
		Avaliacao avaliacao936 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item25);
		Avaliacao avaliacao937 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item26);
		Avaliacao avaliacao938 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario49, item27);
		Avaliacao avaliacao939 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item28);
		Avaliacao avaliacao940 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item29);
		Avaliacao avaliacao941 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario49, item30);
		
		Avaliacao avaliacao942 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item1);
		Avaliacao avaliacao943 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item2);
		Avaliacao avaliacao944 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario50, item3);
		Avaliacao avaliacao945 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item4);
		Avaliacao avaliacao946 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item5);
		Avaliacao avaliacao947 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item6);
		Avaliacao avaliacao948 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item7);
		Avaliacao avaliacao949 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item8);
		Avaliacao avaliacao950 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item9);
		Avaliacao avaliacao951 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item10);
		Avaliacao avaliacao952 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario50, item11);
		Avaliacao avaliacao953 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario50, item12);
		Avaliacao avaliacao954 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item13);
		Avaliacao avaliacao955 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item14);
		Avaliacao avaliacao956 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item15);
		Avaliacao avaliacao957 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item16);
		Avaliacao avaliacao958 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item17);
		Avaliacao avaliacao959 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item18);
		Avaliacao avaliacao960 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item19);
		Avaliacao avaliacao961 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item20);
		Avaliacao avaliacao962 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item21);
		Avaliacao avaliacao963 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item22);
		Avaliacao avaliacao964 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item23);
		Avaliacao avaliacao965 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario50, item24);
		Avaliacao avaliacao966 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item25);
		Avaliacao avaliacao967 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item26);
		Avaliacao avaliacao968 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario50, item27);
		Avaliacao avaliacao969 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item28);
		Avaliacao avaliacao970 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item29);
		Avaliacao avaliacao971 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario50, item30);
		
		Avaliacao avaliacao972 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario51, item1);
		Avaliacao avaliacao973 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario51, item2);
		Avaliacao avaliacao974 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario51, item3);
		Avaliacao avaliacao975 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario51, item4);
		Avaliacao avaliacao976 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario51, item5);
		Avaliacao avaliacao977 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario51, item6);
		Avaliacao avaliacao978 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario51, item7);
		Avaliacao avaliacao979 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario51, item11);
		Avaliacao avaliacao980 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario51, item12);
		Avaliacao avaliacao981 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario51, item13);
		Avaliacao avaliacao982 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario51, item14);
		Avaliacao avaliacao983 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario51, item15);
		Avaliacao avaliacao984 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario51, item16);
		Avaliacao avaliacao985 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario51, item17);
		Avaliacao avaliacao986 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario51, item18);
		Avaliacao avaliacao987 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario51, item19);
		Avaliacao avaliacao988 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario51, item22);
		Avaliacao avaliacao989 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario51, item23);
		Avaliacao avaliacao990 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario51, item24);
		Avaliacao avaliacao991 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario51, item25);
		Avaliacao avaliacao992 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario51, item27);
		Avaliacao avaliacao993 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario51, item28);
		Avaliacao avaliacao994 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario51, item30);
		
		Avaliacao avaliacao995 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario52, item1);
		Avaliacao avaliacao996 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario52, item3);
		Avaliacao avaliacao997 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario52, item5);
		Avaliacao avaliacao998 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario52, item9);
		Avaliacao avaliacao999 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario52, item11);
		Avaliacao avaliacao1000 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario52, item12);
		Avaliacao avaliacao1001 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario52, item15);
		Avaliacao avaliacao1002 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario52, item17);
		Avaliacao avaliacao1003 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario52, item18);
		Avaliacao avaliacao1004 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario52, item22);
		Avaliacao avaliacao1005 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario52, item23);
		Avaliacao avaliacao1006 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario52, item28);
		Avaliacao avaliacao1007 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario52, item30);
		
		Avaliacao avaliacao1008 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario53, item32);
		Avaliacao avaliacao1009 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario53, item38);
		Avaliacao avaliacao1010 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario53, item31);
		Avaliacao avaliacao1011 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario53, item35);
		Avaliacao avaliacao1012 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario53, item37);	
		
		Avaliacao avaliacao1013 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario54, item38);
		Avaliacao avaliacao1014 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario54, item33);
		Avaliacao avaliacao1015 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario54, item39);
		Avaliacao avaliacao1016 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario54, item31);
		Avaliacao avaliacao1017 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario54, item37);
		
		Avaliacao avaliacao1018 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario55, item38);
		Avaliacao avaliacao1019 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario55, item35);
		Avaliacao avaliacao1020 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario55, item34);
		Avaliacao avaliacao1021 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario55, item31);
		Avaliacao avaliacao1022 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario55, item32);
		
		Avaliacao avaliacao1023 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario56, item35);
		Avaliacao avaliacao1024 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario56, item31);
		Avaliacao avaliacao1025 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario56, item39);
		Avaliacao avaliacao1026 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario56, item38);
		Avaliacao avaliacao1027 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario56, item34);
		
		Avaliacao avaliacao1028 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario57, item35);
		Avaliacao avaliacao1029 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario57, item32);
		Avaliacao avaliacao1030 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario57, item36);
		Avaliacao avaliacao1031 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario57, item39);
		Avaliacao avaliacao1032 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario57, item33);
		
		Avaliacao avaliacao1033 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario58, item33);
		Avaliacao avaliacao1034 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario58, item35);
		Avaliacao avaliacao1035 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario58, item34);
		Avaliacao avaliacao1036 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario58, item32);
		Avaliacao avaliacao1037 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario58, item37);
		
		Avaliacao avaliacao1038 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario59, item39);
		Avaliacao avaliacao1039 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario59, item36);
		Avaliacao avaliacao1040 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario59, item32);
		Avaliacao avaliacao1041 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario59, item35);
		Avaliacao avaliacao1042 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario59, item34);
		
		Avaliacao avaliacao1043 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario60, item38);
		Avaliacao avaliacao1044 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario60, item32);
		Avaliacao avaliacao1045 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario60, item35);
		Avaliacao avaliacao1046 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario60, item36);
		Avaliacao avaliacao1047 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario60, item37);
		
		Avaliacao avaliacao1048 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario61, item31);
		Avaliacao avaliacao1049 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario61, item32);
		Avaliacao avaliacao1050 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario61, item37);
		Avaliacao avaliacao1051 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario61, item38);
		Avaliacao avaliacao1052 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario61, item33);
		
		Avaliacao avaliacao1053 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario62, item34);
		Avaliacao avaliacao1054 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario62, item35);
		Avaliacao avaliacao1055 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario62, item31);
		Avaliacao avaliacao1056 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario62, item36);
		Avaliacao avaliacao1057 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario62, item38);
		
		Avaliacao avaliacao1058 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario63, item37);
		Avaliacao avaliacao1059 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario63, item32);
		Avaliacao avaliacao1060 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario63, item35);
		Avaliacao avaliacao1061 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario63, item36);
		Avaliacao avaliacao1062 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario63, item38);
		
		Avaliacao avaliacao1063 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario64, item31);
		Avaliacao avaliacao1064 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario64, item33);
		Avaliacao avaliacao1065 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario64, item37);
		Avaliacao avaliacao1066 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario64, item38);
		Avaliacao avaliacao1067 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario64, item39);
		
		Avaliacao avaliacao1068 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario65, item32);
		Avaliacao avaliacao1069 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario65, item35);
		Avaliacao avaliacao1070 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario65, item37);
		Avaliacao avaliacao1071 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario65, item38);
		Avaliacao avaliacao1072 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario65, item39);
		
		Avaliacao avaliacao1073 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario66, item32);
		Avaliacao avaliacao1074 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario66, item33);
		Avaliacao avaliacao1075 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario66, item36);
		Avaliacao avaliacao1076 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario66, item37);
		Avaliacao avaliacao1077 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario66, item39);
		
		Avaliacao avaliacao1078 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario67, item33);
		Avaliacao avaliacao1079 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario67, item34);
		Avaliacao avaliacao1080 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario67, item36);
		Avaliacao avaliacao1081 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario67, item38);
		Avaliacao avaliacao1082 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario67, item39);
		
		Avaliacao avaliacao1083 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario68, item39);
		Avaliacao avaliacao1084 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario68, item37);
		Avaliacao avaliacao1085 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario68, item34);
		Avaliacao avaliacao1086 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario68, item36);
		Avaliacao avaliacao1087 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario68, item31);
		
		Avaliacao avaliacao1088 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario69, item37);
		Avaliacao avaliacao1089 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario69, item38);		
		Avaliacao avaliacao1090 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario69, item36);
		Avaliacao avaliacao1091 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario69, item33);
		Avaliacao avaliacao1092 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario69, item31);
		
		Avaliacao avaliacao1093 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario70, item31);
		Avaliacao avaliacao1094 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario70, item32);
		Avaliacao avaliacao1095 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario70, item33);
		Avaliacao avaliacao1096 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario70, item34);
		Avaliacao avaliacao1097 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario70, item35);
		
		Avaliacao avaliacao1098 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario71, item32);
		Avaliacao avaliacao1099 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario71, item38);
		Avaliacao avaliacao1100 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario71, item36);
		Avaliacao avaliacao1101 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario71, item37);
		Avaliacao avaliacao1102 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario71, item39);	
		
		Avaliacao avaliacao1103 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario72, item37);
		Avaliacao avaliacao1104 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario72, item38);
		Avaliacao avaliacao1105 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario72, item36);
		Avaliacao avaliacao1106 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario72, item39);
		Avaliacao avaliacao1107 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario72, item32);	
		
		Avaliacao avaliacao1108 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario73, item32);
		Avaliacao avaliacao1109 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario73, item38);
		Avaliacao avaliacao1110 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario73, item37);
		Avaliacao avaliacao1111 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario73, item33);
		Avaliacao avaliacao1112 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario73, item36);	
		
		Avaliacao avaliacao1113 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario74, item33);
		Avaliacao avaliacao1114 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario74, item32);
		Avaliacao avaliacao1115 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario74, item38);
		Avaliacao avaliacao1116 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario74, item37);
		Avaliacao avaliacao1117 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario74, item34);	
		
		Avaliacao avaliacao1118 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario75, item36);
		Avaliacao avaliacao1119 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario75, item37);
		Avaliacao avaliacao1120 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario75, item39);
		Avaliacao avaliacao1121 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario75, item35);
		Avaliacao avaliacao1122 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario75, item34);	
		
		Avaliacao avaliacao1123 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario76, item31);
		Avaliacao avaliacao1124 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario76, item36);
		Avaliacao avaliacao1125 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario76, item34);
		Avaliacao avaliacao1126 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario76, item37);
		Avaliacao avaliacao1127 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario76, item33);	
		
		Avaliacao avaliacao1128 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario77, item34);
		Avaliacao avaliacao1129 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario77, item37);
		Avaliacao avaliacao1130 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario77, item38);
		Avaliacao avaliacao1131 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario77, item33);
		Avaliacao avaliacao1132 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario77, item35);	
		
		Avaliacao avaliacao1133 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario78, item31);
		Avaliacao avaliacao1134 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario78, item32);
		Avaliacao avaliacao1135 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario78, item33);
		Avaliacao avaliacao1136 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario78, item34);
		Avaliacao avaliacao1137 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario78, item35);
		
		Avaliacao avaliacao1138 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario79, item31);
		Avaliacao avaliacao1139 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario79, item34);
		Avaliacao avaliacao1140 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario79, item36);
		Avaliacao avaliacao1141 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario79, item37);
		Avaliacao avaliacao1142 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario79, item38);
		
		Avaliacao avaliacao1143 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario80, item37);
		Avaliacao avaliacao1144 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario80, item32);
		Avaliacao avaliacao1145 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario80, item31);
		Avaliacao avaliacao1146 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario80, item34);
		Avaliacao avaliacao1147 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario80, item39);
		
		Avaliacao avaliacao1148 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario81, item33);
		Avaliacao avaliacao1149 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario81, item36);
		Avaliacao avaliacao1150 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario81, item38);
		Avaliacao avaliacao1151 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario81, item31);
		Avaliacao avaliacao1152 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario81, item32);
		
		Avaliacao avaliacao1153 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario82, item38);
		Avaliacao avaliacao1154 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario82, item39);
		Avaliacao avaliacao1155 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario82, item31);
		Avaliacao avaliacao1156 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario82, item32);
		Avaliacao avaliacao1157 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario82, item37);
		
		Avaliacao avaliacao1158 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario83, item33);
		Avaliacao avaliacao1159 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario83, item39);
		Avaliacao avaliacao1160 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario83, item38);
		Avaliacao avaliacao1161 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario83, item34);
		Avaliacao avaliacao1162 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario83, item32);	

		Avaliacao avaliacao1163 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario84, item31);
		Avaliacao avaliacao1164 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario84, item35);
		Avaliacao avaliacao1165 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario84, item36);
		Avaliacao avaliacao1166 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario84, item37);
		Avaliacao avaliacao1167 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario84, item38);	
		
		Avaliacao avaliacao1168 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario85, item36);
		Avaliacao avaliacao1169 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario85, item31);
		Avaliacao avaliacao1170 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario85, item38);
		Avaliacao avaliacao1171 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario85, item37);
		Avaliacao avaliacao1172 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario85, item33);	
		
		Avaliacao avaliacao1173 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario86, item34);
		Avaliacao avaliacao1174 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario86, item32);
		Avaliacao avaliacao1175 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario86, item39);
		Avaliacao avaliacao1176 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario86, item33);
		Avaliacao avaliacao1177 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario86, item38);	
		
		Avaliacao avaliacao1178 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario87, item32);
		Avaliacao avaliacao1179 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario87, item34);
		Avaliacao avaliacao1180 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario87, item37);
		Avaliacao avaliacao1181 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario87, item38);
		Avaliacao avaliacao1182 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario87, item39);	
		
		Avaliacao avaliacao1183 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario88, item1);
		Avaliacao avaliacao1184 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario88, item9);
		Avaliacao avaliacao1185 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario88, item13);
		Avaliacao avaliacao1186 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario88, item15);
		Avaliacao avaliacao1187 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario88, item17);
		Avaliacao avaliacao1188 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario88, item23);
		Avaliacao avaliacao1189 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario88, item26);
		Avaliacao avaliacao1190 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario88, item28);
		Avaliacao avaliacao1191 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario88, item30);
		
		Avaliacao avaliacao1192 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario89, item1);
		Avaliacao avaliacao1193 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario89, item9);
		Avaliacao avaliacao1194 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario89, item11);
		Avaliacao avaliacao1195 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario89, item12);
		Avaliacao avaliacao1196 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario89, item14);
		Avaliacao avaliacao1197 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario89, item18);
		Avaliacao avaliacao1198 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario89, item22);
		Avaliacao avaliacao1199 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario89, item23);
		Avaliacao avaliacao1200 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario89, item28);
		Avaliacao avaliacao1201 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario89, item30);
		
		Avaliacao avaliacao1202 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario90, item1);
		Avaliacao avaliacao1203 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario90, item5);
		Avaliacao avaliacao1204 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario90, item6);
		Avaliacao avaliacao1205 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario90, item7);
		Avaliacao avaliacao1206 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario90, item8);
		Avaliacao avaliacao1207 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario90, item9);
		Avaliacao avaliacao1208 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario90, item10);
		Avaliacao avaliacao1209 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario90, item11);
		Avaliacao avaliacao1210 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario90, item13);
		Avaliacao avaliacao1211 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario90, item14);
		Avaliacao avaliacao1212 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario90, item15);
		Avaliacao avaliacao1213 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario90, item16);
		Avaliacao avaliacao1214 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario90, item17);
		Avaliacao avaliacao1215 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario90, item18);
		Avaliacao avaliacao1216 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario90, item20);
		Avaliacao avaliacao1217 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario90, item21);
		Avaliacao avaliacao1218 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario90, item22);
		Avaliacao avaliacao1219 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario90, item23);
		Avaliacao avaliacao1220 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario90, item25);
		Avaliacao avaliacao1221 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario90, item26);
		Avaliacao avaliacao1222 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario90, item27);
		Avaliacao avaliacao1223 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario90, item29);
		Avaliacao avaliacao1224 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario90, item30);
		
		Avaliacao avaliacao1225 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario91, item1);
		Avaliacao avaliacao1226 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario91, item2);
		Avaliacao avaliacao1227 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario91, item3);
		Avaliacao avaliacao1228 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario91, item5);
		Avaliacao avaliacao1229 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario91, item7);
		Avaliacao avaliacao1230 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario91, item8);
		Avaliacao avaliacao1231 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario91, item10);
		Avaliacao avaliacao1232 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario91, item11);
		Avaliacao avaliacao1233 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario91, item12);
		Avaliacao avaliacao1234 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario91, item13);
		Avaliacao avaliacao1235 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario91, item16);
		Avaliacao avaliacao1236 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario91, item17);
		Avaliacao avaliacao1237 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario91, item23);
		Avaliacao avaliacao1238 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario91, item25);
		Avaliacao avaliacao1239 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario91, item30);
		
		Avaliacao avaliacao1240 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario92, item1);
		Avaliacao avaliacao1241 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario92, item2);
		Avaliacao avaliacao1242 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario92, item5);
		Avaliacao avaliacao1243 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario92, item6);
		Avaliacao avaliacao1244 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario92, item7);
		Avaliacao avaliacao1245 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario92, item9);
		Avaliacao avaliacao1246 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario92, item10);
		Avaliacao avaliacao1247 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario92, item11);
		Avaliacao avaliacao1248 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario92, item12);
		Avaliacao avaliacao1249 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario92, item15);
		Avaliacao avaliacao1250 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario92, item20);
		Avaliacao avaliacao1251 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario92, item21);
		Avaliacao avaliacao1252 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario92, item22);
		Avaliacao avaliacao1253 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario92, item23);
		Avaliacao avaliacao1254 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario92, item25);
		Avaliacao avaliacao1255 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario92, item26);
		Avaliacao avaliacao1256 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario92, item27);
		Avaliacao avaliacao1257 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario92, item28);
		Avaliacao avaliacao1258 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario92, item29);
		Avaliacao avaliacao1259 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario92, item30);
		
		Avaliacao avaliacao1260 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario93, item9);
		Avaliacao avaliacao1261 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario93, item10);
		Avaliacao avaliacao1262 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario93, item11);
		Avaliacao avaliacao1263 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario93, item14);
		Avaliacao avaliacao1264 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario93, item23);
		Avaliacao avaliacao1265 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario93, item24);
		Avaliacao avaliacao1266 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario93, item26);
		Avaliacao avaliacao1267 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario93, item27);
		Avaliacao avaliacao1268 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario93, item30);
		
		Avaliacao avaliacao1269 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario94, item1);
		Avaliacao avaliacao1270 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario94, item3);
		Avaliacao avaliacao1271 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario94, item5);
		Avaliacao avaliacao1272 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario94, item6);
		Avaliacao avaliacao1273 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario94, item8);
		Avaliacao avaliacao1274 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario94, item10);
		Avaliacao avaliacao1275 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario94, item11);
		Avaliacao avaliacao1276 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario94, item12);
		Avaliacao avaliacao1277 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario94, item13);
		Avaliacao avaliacao1278 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario94, item16);
		Avaliacao avaliacao1279 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario94, item17);
		Avaliacao avaliacao1280 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario94, item20);
		Avaliacao avaliacao1281 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario94, item21);
		Avaliacao avaliacao1282 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario94, item22);
		Avaliacao avaliacao1283 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario94, item23);
		Avaliacao avaliacao1284 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario94, item24);
		Avaliacao avaliacao1285 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario94, item28);
		Avaliacao avaliacao1286 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario94, item30);
		
		Avaliacao avaliacao1287 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario95, item21);
		Avaliacao avaliacao1288 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario95, item22);
		Avaliacao avaliacao1289 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario95, item23);
		Avaliacao avaliacao1290 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario95, item25);
		Avaliacao avaliacao1291 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario95, item26);
		Avaliacao avaliacao1292 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario95, item27);
		Avaliacao avaliacao1293 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario95, item29);
		Avaliacao avaliacao1294 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario95, item30);
		Avaliacao avaliacao1295 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario95, item18);
		Avaliacao avaliacao1296 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario95, item20);
		Avaliacao avaliacao1297 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario95, item21);
		Avaliacao avaliacao1298 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario95, item22);
		
		Avaliacao avaliacao1299 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario96, item1);
		Avaliacao avaliacao1300 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario96, item8);
		Avaliacao avaliacao1301 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario96, item9);
		Avaliacao avaliacao1302 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario96, item10);
		Avaliacao avaliacao1303 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario96, item11);
		Avaliacao avaliacao1304 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario96, item13);
		Avaliacao avaliacao1305 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario96, item14);
		Avaliacao avaliacao1306 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario96, item18);
		Avaliacao avaliacao1307 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario96, item23);
		
		Avaliacao avaliacao1308 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario97, item1);
		Avaliacao avaliacao1309 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario97, item3);
		Avaliacao avaliacao1310 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario97, item4);
		Avaliacao avaliacao1311 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario97, item8);
		Avaliacao avaliacao1312 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario97, item9);
		Avaliacao avaliacao1313 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario97, item10);
		Avaliacao avaliacao1314 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario97, item11);
		Avaliacao avaliacao1315 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario97, item14);
		Avaliacao avaliacao1316 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario97, item16);
		Avaliacao avaliacao1317 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario97, item21);
		Avaliacao avaliacao1318 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario97, item22);
		Avaliacao avaliacao1319 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario97, item23);
		Avaliacao avaliacao1320 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario97, item24);
		Avaliacao avaliacao1321 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario97, item26);
		Avaliacao avaliacao1322 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario97, item27);
		Avaliacao avaliacao1323 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario97, item28);
		Avaliacao avaliacao1324 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario97, item30);
		
		
		
			
		gerenteRepository.save(Arrays.asList(gerente1));

		projetoRepository.save(Arrays.asList(projeto1, projeto2));

		usuarioRepository.save(Arrays.asList(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6, usuario7, usuario8, usuario9, usuario10,
				usuario11, usuario12, usuario13, usuario14, usuario15, usuario16, usuario17, usuario18, usuario19, usuario20,
				usuario21, usuario22, usuario23, usuario24, usuario25, usuario26, usuario27, usuario28, usuario29, usuario30,
				usuario31, usuario32, usuario33, usuario34, usuario35, usuario36, usuario37, usuario38, usuario39, usuario40,
				usuario41, usuario42, usuario43, usuario44, usuario45, usuario46, usuario47, usuario48, usuario49, usuario50,
				usuario51, usuario52, usuario53, usuario54, usuario55, usuario56, usuario57, usuario58, usuario59, usuario60,
				usuario61, usuario62, usuario63, usuario64, usuario65, usuario66, usuario67, usuario68, usuario69, usuario70,
				usuario71, usuario72, usuario73, usuario74, usuario75, usuario76, usuario77, usuario78, usuario79, usuario80,
				usuario81, usuario82, usuario83, usuario84, usuario85, usuario86, usuario87, usuario88, usuario89, usuario90,
				usuario91, usuario92, usuario93, usuario94, usuario95, usuario96, usuario97
				));

		itemRepository.save(Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8, item9, item10,
				item11, item12, item13, item14, item15, item16, item17, item18, item19, item20,
				item21, item22, item23, item24, item25, item26, item27, item28, item29, item30,
				item31, item32, item33, item34, item35, item36, item37, item38, item39));

		tagRepository.save(Arrays.asList(tag1, tag2, tag3, tag4, tag5, tag6, tag7, tag8, tag9, tag10,
				tag11, tag12, tag13, tag14, tag15, tag16, tag17, tag18, tag19, tag20,
				tag21, tag22, tag23, tag24, tag25, tag26, tag27, tag28, tag29, tag30,
															     tag68, tag69, tag70, 
												   tag76, tag77, tag78, tag79, tag80, 
				tag81, tag82, tag83));

		itemTagRepository.save(Arrays.asList(
				itemTag1, itemTag2, itemTag3, itemTag4, itemTag5, itemTag6, itemTag7, itemTag8, itemTag9, itemTag10,
				itemTag11, itemTag12, itemTag13, itemTag14, itemTag15, itemTag16, itemTag17, itemTag18, itemTag19, itemTag20,
						   itemTag22, itemTag23, itemTag24, itemTag25, itemTag26, itemTag27, itemTag28, 		   itemTag30,
				itemTag31, itemTag32, itemTag33, itemTag34, itemTag35, itemTag36, itemTag37, itemTag38, 		   itemTag40,
				itemTag41, itemTag42, itemTag43, itemTag44, itemTag45, itemTag46, itemTag47, itemTag48, itemTag49,
				itemTag51, itemTag52, itemTag53, itemTag54, 		   itemTag56, itemTag57, itemTag58, itemTag59, itemTag60,
				itemTag61, itemTag62, itemTag63, itemTag64, itemTag65, itemTag66, 			 itemTag68, itemTag69, itemTag70,
				itemTag71, itemTag72, itemTag73, itemTag74, itemTag75, itemTag76, itemTag77, 			itemTag79, itemTag80,
				itemTag81, itemTag82, itemTag83, itemTag84, itemTag85,			  itemTag87, itemTag88, itemTag89, itemTag90,
				itemTag91, itemTag92, itemTag93, 			itemTag95, itemTag96, itemTag97, itemTag98, itemTag99, itemTag100,
				itemTag101,										itemTag105, itemTag106, itemTag107, itemTag108, itemTag109, itemTag110,
				itemTag111, 			itemTag113, itemTag114, itemTag115, itemTag116, itemTag117, itemTag118, itemTag119, itemTag120,
							itemTag122, itemTag123, itemTag124, itemTag125, itemTag126, itemTag127, itemTag128, itemTag129, 
				itemTag131, itemTag132, itemTag133, itemTag134, itemTag135, itemTag136, itemTag137, 			itemTag139, itemTag140,
				itemTag141, itemTag142, itemTag143, itemTag144, itemTag145, itemTag146, 			itemTag148, itemTag149, itemTag150,
				itemTag151, itemTag152, itemTag153, itemTag154, itemTag155, 			itemTag157, itemTag158, itemTag159, itemTag160,
				itemTag161, itemTag162, itemTag163, 			itemTag165, itemTag166, itemTag167, itemTag168, itemTag169, itemTag170,
				itemTag171, 			itemTag173, itemTag174, itemTag175, itemTag176, itemTag177, itemTag178, itemTag179, itemTag180,
				itemTag181, 			itemTag183, itemTag184, itemTag185, itemTag186, itemTag187, itemTag188, itemTag189, itemTag190,
				itemTag191, 			itemTag193, itemTag194, itemTag195, itemTag196, itemTag197, 			itemTag199, itemTag200,
				itemTag201, itemTag202, itemTag203, itemTag204, itemTag205, itemTag206, 			itemTag208, itemTag209, itemTag210,
				itemTag211, itemTag212, itemTag213, 			itemTag215, itemTag216, itemTag217, itemTag218, itemTag219, 
				itemTag221, itemTag222, itemTag223, itemTag224, itemTag225, itemTag226, itemTag227, 			itemTag229, itemTag230,
				itemTag231, itemTag232, itemTag233, itemTag234, itemTag235, 			itemTag237, itemTag238, itemTag239, itemTag240,
				itemTag241, itemTag242, itemTag243, 			itemTag245, itemTag246, itemTag247, itemTag248, itemTag249, itemTag250,
							itemTag252, itemTag253, itemTag254, itemTag255, itemTag256, itemTag257, itemTag258, itemTag259, itemTag260,
				itemTag261, itemTag262, itemTag263, itemTag264, itemTag265, itemTag266, itemTag267, itemTag268, itemTag269, itemTag270,
				itemTag271, itemTag272, itemTag273, itemTag274, itemTag275, itemTag276, itemTag277, itemTag278, itemTag279, itemTag280,
				itemTag281, itemTag282, itemTag283, itemTag284,							itemTag287, itemTag288, itemTag289, itemTag290,
				itemTag291, itemTag292, itemTag293, itemTag294, itemTag295, itemTag296, itemTag297, itemTag298, itemTag299, itemTag300,
				itemTag301, itemTag302, itemTag303, itemTag304, itemTag305, itemTag306, itemTag307, itemTag308, itemTag309, itemTag310,
				itemTag311, itemTag312, itemTag313, itemTag314, itemTag315, itemTag316));

		avaliacaoRepository.save(Arrays.asList(avaliacao1, avaliacao2, avaliacao3, avaliacao4, avaliacao5, avaliacao6, avaliacao7, avaliacao8, avaliacao9, avaliacao10,
				avaliacao11, avaliacao12, avaliacao13, avaliacao14, avaliacao15, avaliacao16, avaliacao17, avaliacao18, avaliacao19, avaliacao20,
				avaliacao21, avaliacao22, avaliacao23, avaliacao24, avaliacao25, avaliacao26, avaliacao27, avaliacao28, avaliacao29, avaliacao30,
				avaliacao31, avaliacao32, avaliacao33, avaliacao34, avaliacao35, avaliacao36, avaliacao37, avaliacao38, avaliacao39, avaliacao40,
				avaliacao41, avaliacao42, avaliacao43, avaliacao44, avaliacao45, avaliacao46, avaliacao47, avaliacao48, avaliacao49, avaliacao50,
				avaliacao51, avaliacao52, avaliacao53, avaliacao54, avaliacao55, avaliacao56, avaliacao57, avaliacao58, avaliacao59, avaliacao60,
				avaliacao61, avaliacao62, avaliacao63, avaliacao64, avaliacao65, avaliacao66, avaliacao67, avaliacao68, avaliacao69, avaliacao70,
				avaliacao71, avaliacao72, avaliacao73, avaliacao74, avaliacao75, avaliacao76, avaliacao77, avaliacao78, avaliacao79, avaliacao80,
				avaliacao81, avaliacao82, avaliacao83, avaliacao84, avaliacao85, avaliacao86, avaliacao87, avaliacao88, avaliacao89, avaliacao90,
				avaliacao91, avaliacao92, avaliacao93, avaliacao94, avaliacao95, avaliacao96, avaliacao97, avaliacao98, avaliacao99, avaliacao100,
				avaliacao101, avaliacao102, avaliacao103, avaliacao104, avaliacao105, avaliacao106, avaliacao107, avaliacao108, avaliacao109, avaliacao110,
				avaliacao111, avaliacao112, avaliacao113, avaliacao114, avaliacao115, avaliacao116, avaliacao117, avaliacao118, avaliacao119, avaliacao120,
				avaliacao121, avaliacao122, avaliacao123, avaliacao124, avaliacao125, avaliacao126, avaliacao127, avaliacao128, avaliacao129, avaliacao130,
				avaliacao131, avaliacao132, avaliacao133, avaliacao134, avaliacao135, avaliacao136, avaliacao137, avaliacao138, avaliacao139, avaliacao140,
				avaliacao141, avaliacao142, avaliacao143, avaliacao144, avaliacao145, avaliacao146, avaliacao147, avaliacao148, avaliacao149, avaliacao150,
				avaliacao151, avaliacao152, avaliacao153, avaliacao154, avaliacao155, avaliacao156, avaliacao157, avaliacao158, avaliacao159, avaliacao160,
				avaliacao161, avaliacao162, avaliacao163, avaliacao164, avaliacao165, avaliacao166, avaliacao167, avaliacao168, avaliacao169, avaliacao170,
				avaliacao171, avaliacao172, avaliacao173, avaliacao174, avaliacao175, avaliacao176, avaliacao177, avaliacao178, avaliacao179, avaliacao180,
				avaliacao181, avaliacao182, avaliacao183, avaliacao184, avaliacao185, avaliacao186, avaliacao187, avaliacao188, avaliacao189, avaliacao190,
				avaliacao191, avaliacao192, avaliacao193, avaliacao194, avaliacao195, avaliacao196, avaliacao197, avaliacao198, avaliacao199, avaliacao200,
				avaliacao201, avaliacao202, avaliacao203, avaliacao204, avaliacao205, avaliacao206, avaliacao207, avaliacao208, avaliacao209, avaliacao210,
				avaliacao211, avaliacao212, avaliacao213, avaliacao214, avaliacao215, avaliacao216, avaliacao217, avaliacao218, avaliacao219, avaliacao220,
				avaliacao221, avaliacao222, avaliacao223, avaliacao224, avaliacao225, avaliacao226, avaliacao227, avaliacao228, avaliacao229, avaliacao230,
				avaliacao231, avaliacao232, avaliacao233, avaliacao234, avaliacao235, avaliacao236, avaliacao237, avaliacao238, avaliacao239, avaliacao240,
				avaliacao241, avaliacao242, avaliacao243, avaliacao244, avaliacao245, avaliacao246, avaliacao247, avaliacao248, avaliacao249, avaliacao250,
				avaliacao251, avaliacao252, avaliacao253, avaliacao254, avaliacao255, avaliacao256, avaliacao257, avaliacao258, avaliacao259, avaliacao260,
				avaliacao261, avaliacao262, avaliacao263, avaliacao264, avaliacao265, avaliacao266, avaliacao267, avaliacao268, avaliacao269, avaliacao270,
				avaliacao271, avaliacao272, avaliacao273, avaliacao274, avaliacao275, avaliacao276, avaliacao277, avaliacao278, avaliacao279, avaliacao280,
				avaliacao281, avaliacao282, avaliacao283, avaliacao284, avaliacao285, avaliacao286, avaliacao287, avaliacao288, avaliacao289, avaliacao290,
				avaliacao291, avaliacao292, avaliacao293, avaliacao294, avaliacao295, avaliacao296, avaliacao297, avaliacao298, avaliacao299, avaliacao300,
				avaliacao301, avaliacao302, avaliacao303, avaliacao304, avaliacao305, avaliacao306, avaliacao307, avaliacao308, avaliacao309, avaliacao310,
				avaliacao311, avaliacao312, avaliacao313, avaliacao314, avaliacao315, avaliacao316, avaliacao317, avaliacao318, avaliacao319, avaliacao320,
				avaliacao321, avaliacao322, avaliacao323, avaliacao324, avaliacao325, avaliacao326, avaliacao327, avaliacao328, avaliacao329, avaliacao330,
				avaliacao331, avaliacao332, avaliacao333, avaliacao334, avaliacao335, avaliacao336, avaliacao337, avaliacao338, avaliacao339, avaliacao340,
				avaliacao341, avaliacao342, avaliacao343, avaliacao344, avaliacao345, avaliacao346, avaliacao347, avaliacao348, avaliacao349, avaliacao350,
				avaliacao351, avaliacao352, avaliacao353, avaliacao354, avaliacao355, avaliacao356, avaliacao357, avaliacao358, avaliacao359, avaliacao360,
				avaliacao361, avaliacao362, avaliacao363, avaliacao364, avaliacao365, avaliacao366, avaliacao367, avaliacao368, avaliacao369, avaliacao370,
				avaliacao371, avaliacao372, avaliacao373, avaliacao374, avaliacao375, avaliacao376, avaliacao377, avaliacao378, avaliacao379, avaliacao380,
				avaliacao381, avaliacao382, avaliacao383, avaliacao384, avaliacao385, avaliacao386, avaliacao387, avaliacao388, avaliacao389, avaliacao390,
				avaliacao391, avaliacao392, avaliacao393, avaliacao394, avaliacao395, avaliacao396, avaliacao397, avaliacao398, avaliacao399, avaliacao400,
				avaliacao401, avaliacao402, avaliacao403, avaliacao404, avaliacao405, avaliacao406, avaliacao407, avaliacao408, avaliacao409, avaliacao410,
				avaliacao411, avaliacao412, avaliacao413, avaliacao414, avaliacao415, avaliacao416, avaliacao417, avaliacao418, avaliacao419, avaliacao420,
				avaliacao421, avaliacao422, avaliacao423, avaliacao424, avaliacao425, avaliacao426, avaliacao427, avaliacao428, avaliacao429, avaliacao430,
				avaliacao431, avaliacao432, avaliacao433, avaliacao434, avaliacao435, avaliacao436, avaliacao437, avaliacao438, avaliacao439, avaliacao440,
				avaliacao441, avaliacao442, avaliacao443, avaliacao444, avaliacao445, avaliacao446, avaliacao447, avaliacao448, avaliacao449, avaliacao450,
				avaliacao451, avaliacao452, avaliacao453, avaliacao454, avaliacao455, avaliacao456, avaliacao457, avaliacao458, avaliacao459, avaliacao460,
				avaliacao461, avaliacao462, avaliacao463, avaliacao464, avaliacao465, avaliacao466, avaliacao467, avaliacao468, avaliacao469, avaliacao470,
				avaliacao471, avaliacao472, avaliacao473, avaliacao474, avaliacao475, avaliacao476, avaliacao477, avaliacao478, avaliacao479, avaliacao480,
				avaliacao481, avaliacao482, avaliacao483, avaliacao484, avaliacao485, avaliacao486, avaliacao487, avaliacao488, avaliacao489, avaliacao490,
				avaliacao491, avaliacao492, avaliacao493, avaliacao494, avaliacao495, avaliacao496, avaliacao497, avaliacao498, avaliacao499, avaliacao500,
				avaliacao501, avaliacao502, avaliacao503, avaliacao504, avaliacao505, avaliacao506, avaliacao507, avaliacao508, avaliacao509, avaliacao510,
				avaliacao511, avaliacao512, avaliacao513, avaliacao514, avaliacao515, avaliacao516, avaliacao517, avaliacao518, avaliacao519, avaliacao520,
				avaliacao521, avaliacao522, avaliacao523, avaliacao524, avaliacao525, avaliacao526, avaliacao527, avaliacao528, avaliacao529, avaliacao530,
				avaliacao531, avaliacao532, avaliacao533, avaliacao534, avaliacao535, avaliacao536, avaliacao537, avaliacao538, avaliacao539, avaliacao540,
				avaliacao541, avaliacao542, avaliacao543, avaliacao544, avaliacao545, avaliacao546, avaliacao547, avaliacao548, avaliacao549, avaliacao550,
				avaliacao551, avaliacao552, avaliacao553, avaliacao554, avaliacao555, avaliacao556, avaliacao557, avaliacao558, avaliacao559, avaliacao560,
				avaliacao561, avaliacao562, avaliacao563, avaliacao564, avaliacao565, avaliacao566, avaliacao567, avaliacao568, avaliacao569, avaliacao570,
				avaliacao571, avaliacao572, avaliacao573, avaliacao574, avaliacao575, avaliacao576, avaliacao577, avaliacao578, avaliacao579, avaliacao580,
				avaliacao581, avaliacao582, avaliacao583, avaliacao584, avaliacao585, avaliacao586, avaliacao587, avaliacao588, avaliacao589, avaliacao590,
				avaliacao591, avaliacao592, avaliacao593, avaliacao594, avaliacao595, avaliacao596, avaliacao597, avaliacao598, avaliacao599, avaliacao600,
				avaliacao601, avaliacao602, avaliacao603, avaliacao604, avaliacao605, avaliacao606, avaliacao607, avaliacao608, avaliacao609, avaliacao610,
				avaliacao611, avaliacao612, avaliacao613, avaliacao614, avaliacao615, avaliacao616, avaliacao617, avaliacao618, avaliacao619, avaliacao620,
				avaliacao621, avaliacao622, avaliacao623, avaliacao624, avaliacao625, avaliacao626, avaliacao627, avaliacao628, avaliacao629, avaliacao630,
				avaliacao631, avaliacao632, avaliacao633, avaliacao634, avaliacao635, avaliacao636, avaliacao637, avaliacao638, avaliacao639, avaliacao640,
				avaliacao641, avaliacao642, avaliacao643, avaliacao644, avaliacao645, avaliacao646, avaliacao647, avaliacao648, avaliacao649, avaliacao650,
				avaliacao651, avaliacao652, avaliacao653, avaliacao654, avaliacao655, avaliacao656, avaliacao657, avaliacao658, avaliacao659, avaliacao660,
				avaliacao661, avaliacao662, avaliacao663, avaliacao664, avaliacao665, avaliacao666, avaliacao667, avaliacao668, avaliacao669, avaliacao670,
				avaliacao671, avaliacao672, avaliacao673, avaliacao674, avaliacao675, avaliacao676, avaliacao677, avaliacao678, avaliacao679, avaliacao680,
				avaliacao681, avaliacao682, avaliacao683, avaliacao684, avaliacao685, avaliacao686, avaliacao687, avaliacao688, avaliacao689, avaliacao690,
				avaliacao691, avaliacao692, avaliacao693, avaliacao694, avaliacao695, avaliacao696, avaliacao697, avaliacao698, avaliacao699, avaliacao700,
				avaliacao701, avaliacao702, avaliacao703, avaliacao704, avaliacao705, avaliacao706, avaliacao707, avaliacao708, avaliacao709, avaliacao710,
				avaliacao711, avaliacao712, avaliacao713, avaliacao714, avaliacao715, avaliacao716, avaliacao717, avaliacao718, avaliacao719, avaliacao720,
				avaliacao721, avaliacao722, avaliacao723, avaliacao724, avaliacao725, avaliacao726, avaliacao727, avaliacao728, avaliacao729, avaliacao730,
				avaliacao731, avaliacao732, avaliacao733, avaliacao734, avaliacao735, avaliacao736, avaliacao737, avaliacao738, avaliacao739, avaliacao740,
				avaliacao741, avaliacao742, avaliacao743, avaliacao744, avaliacao745, avaliacao746, avaliacao747, avaliacao748, avaliacao749, avaliacao750,
				avaliacao751, avaliacao752, avaliacao753, avaliacao754, avaliacao755, avaliacao756, avaliacao757, avaliacao758, avaliacao759, avaliacao760,
				avaliacao761, avaliacao762, avaliacao763, avaliacao764, avaliacao765, avaliacao766, avaliacao767, avaliacao768, avaliacao769, avaliacao770,
				avaliacao771, avaliacao772, avaliacao773, avaliacao774, avaliacao775, avaliacao776, avaliacao777, avaliacao778, avaliacao779, avaliacao780,
				avaliacao781, avaliacao782, avaliacao783, avaliacao784, avaliacao785, avaliacao786, avaliacao787, avaliacao788, avaliacao789, avaliacao790,
				avaliacao791, avaliacao792, avaliacao793, avaliacao794, avaliacao795, avaliacao796, avaliacao797, avaliacao798, avaliacao799, avaliacao800,
				avaliacao801, avaliacao802, avaliacao803, avaliacao804, avaliacao805, avaliacao806, avaliacao807, avaliacao808, avaliacao809, avaliacao810,
				avaliacao811, avaliacao812, avaliacao813, avaliacao814, avaliacao815, avaliacao816, avaliacao817, avaliacao818, avaliacao819, avaliacao820,
				avaliacao821, avaliacao822, avaliacao823, avaliacao824, avaliacao825, avaliacao826, avaliacao827, avaliacao828, avaliacao829, avaliacao830,
				avaliacao831, avaliacao832, avaliacao833, avaliacao834, avaliacao835, avaliacao836, avaliacao837, avaliacao838, avaliacao839, avaliacao840,
				avaliacao841, avaliacao842, avaliacao843, avaliacao844, avaliacao845, avaliacao846, avaliacao847, avaliacao848, avaliacao849, avaliacao850,
				avaliacao851, avaliacao852, avaliacao853, avaliacao854, avaliacao855, avaliacao856, avaliacao857, avaliacao858, avaliacao859, avaliacao860,
				avaliacao861, avaliacao862, avaliacao863, avaliacao864, avaliacao865, avaliacao866, avaliacao867, avaliacao868, avaliacao869, avaliacao870,
				avaliacao871, avaliacao872, avaliacao873, avaliacao874, avaliacao875, avaliacao876, avaliacao877, avaliacao878, avaliacao879, avaliacao880,
				avaliacao881, avaliacao882, avaliacao883, avaliacao884, avaliacao885, avaliacao886, avaliacao887, avaliacao888, avaliacao889, avaliacao890,
				avaliacao891, avaliacao892, avaliacao893, avaliacao894, avaliacao895, avaliacao896, avaliacao897, avaliacao898, avaliacao899, avaliacao900,
				avaliacao901, avaliacao902, avaliacao903, avaliacao904, avaliacao905, avaliacao906, avaliacao907, avaliacao908, avaliacao909, avaliacao910,
				avaliacao911, avaliacao912, avaliacao913, avaliacao914, avaliacao915, avaliacao916, avaliacao917, avaliacao918, avaliacao919, avaliacao920,
				avaliacao921, avaliacao922, avaliacao923, avaliacao924, avaliacao925, avaliacao926, avaliacao927, avaliacao928, avaliacao929, avaliacao930,
				avaliacao931, avaliacao932, avaliacao933, avaliacao934, avaliacao935, avaliacao936, avaliacao937, avaliacao938, avaliacao939, avaliacao940,
				avaliacao941, avaliacao942, avaliacao943, avaliacao944, avaliacao945, avaliacao946, avaliacao947, avaliacao948, avaliacao949, avaliacao950,
				avaliacao951, avaliacao952, avaliacao953, avaliacao954, avaliacao955, avaliacao956, avaliacao957, avaliacao958, avaliacao959, avaliacao960,
				avaliacao961, avaliacao962, avaliacao963, avaliacao964, avaliacao965, avaliacao966, avaliacao967, avaliacao968, avaliacao969, avaliacao970,
				avaliacao971, avaliacao972, avaliacao973, avaliacao974, avaliacao975, avaliacao976, avaliacao977, avaliacao978, avaliacao979, avaliacao980,
				avaliacao981, avaliacao982, avaliacao983, avaliacao984, avaliacao985, avaliacao986, avaliacao987, avaliacao988, avaliacao989, avaliacao990,
				avaliacao991, avaliacao992, avaliacao993, avaliacao994, avaliacao995, avaliacao996, avaliacao997, avaliacao998, avaliacao999, avaliacao1000,
				avaliacao1001, avaliacao1002, avaliacao1003, avaliacao1004, avaliacao1005, avaliacao1006, avaliacao1007, avaliacao1008, avaliacao1009, avaliacao1010,
				avaliacao1011, avaliacao1012, avaliacao1013, avaliacao1014, avaliacao1015, avaliacao1016, avaliacao1017, avaliacao1018, avaliacao1019, avaliacao1020,
				avaliacao1021, avaliacao1022, avaliacao1023, avaliacao1024, avaliacao1025, avaliacao1026, avaliacao1027, avaliacao1028, avaliacao1029, avaliacao1030,
				avaliacao1031, avaliacao1032, avaliacao1033, avaliacao1034, avaliacao1035, avaliacao1036, avaliacao1037, avaliacao1038, avaliacao1039, avaliacao1040,
				avaliacao1041, avaliacao1042, avaliacao1043, avaliacao1044, avaliacao1045, avaliacao1046, avaliacao1047, avaliacao1048, avaliacao1049, avaliacao1050,
				avaliacao1051, avaliacao1052, avaliacao1053, avaliacao1054, avaliacao1055, avaliacao1056, avaliacao1057, avaliacao1058, avaliacao1059, avaliacao1060,
				avaliacao1061, avaliacao1062, avaliacao1063, avaliacao1064, avaliacao1065, avaliacao1066, avaliacao1067, avaliacao1068, avaliacao1069, avaliacao1070,
				avaliacao1071, avaliacao1072, avaliacao1073, avaliacao1074, avaliacao1075, avaliacao1076, avaliacao1077, avaliacao1078, avaliacao1079, avaliacao1080,
				avaliacao1081, avaliacao1082, avaliacao1083, avaliacao1084, avaliacao1085, avaliacao1086, avaliacao1087, avaliacao1088, avaliacao1089, avaliacao1090,
				avaliacao1091, avaliacao1092, avaliacao1093, avaliacao1094, avaliacao1095, avaliacao1096, avaliacao1097, avaliacao1098, avaliacao1099, avaliacao1100,
				avaliacao1101, avaliacao1102, avaliacao1103, avaliacao1104, avaliacao1105, avaliacao1106, avaliacao1107, avaliacao1108, avaliacao1109, avaliacao1110,
				avaliacao1111, avaliacao1112, avaliacao1113, avaliacao1114, avaliacao1115, avaliacao1116, avaliacao1117, avaliacao1118, avaliacao1119, avaliacao1120,
				avaliacao1121, avaliacao1122, avaliacao1123, avaliacao1124, avaliacao1125, avaliacao1126, avaliacao1127, avaliacao1128, avaliacao1129, avaliacao1130,
				avaliacao1131, avaliacao1132, avaliacao1133, avaliacao1134, avaliacao1135, avaliacao1136, avaliacao1137, avaliacao1138, avaliacao1139, avaliacao1140,
				avaliacao1141, avaliacao1142, avaliacao1143, avaliacao1144, avaliacao1145, avaliacao1146, avaliacao1147, avaliacao1148, avaliacao1149, avaliacao1150,
				avaliacao1151, avaliacao1152, avaliacao1153, avaliacao1154, avaliacao1155, avaliacao1156, avaliacao1157, avaliacao1158, avaliacao1159, avaliacao1160,
				avaliacao1161, avaliacao1162, avaliacao1163, avaliacao1164, avaliacao1165, avaliacao1166, avaliacao1167, avaliacao1168, avaliacao1169, avaliacao1170,
				avaliacao1171, avaliacao1172, avaliacao1173, avaliacao1174, avaliacao1175, avaliacao1176, avaliacao1177, avaliacao1178, avaliacao1179, avaliacao1180,
				avaliacao1181, avaliacao1182, avaliacao1183, avaliacao1184, avaliacao1185, avaliacao1186, avaliacao1187, avaliacao1188, avaliacao1189, avaliacao1190,
				avaliacao1191, avaliacao1192, avaliacao1193, avaliacao1194, avaliacao1195, avaliacao1196, avaliacao1197, avaliacao1198, avaliacao1199, avaliacao1200,
				avaliacao1201, avaliacao1202, avaliacao1203, avaliacao1204, avaliacao1205, avaliacao1206, avaliacao1207, avaliacao1208, avaliacao1209, avaliacao1210,
				avaliacao1211, avaliacao1212, avaliacao1213, avaliacao1214, avaliacao1215, avaliacao1216, avaliacao1217, avaliacao1218, avaliacao1219, avaliacao1220,
				avaliacao1221, avaliacao1222, avaliacao1223, avaliacao1224, avaliacao1225, avaliacao1226, avaliacao1227, avaliacao1228, avaliacao1229, avaliacao1230,
				avaliacao1231, avaliacao1232, avaliacao1233, avaliacao1234, avaliacao1235, avaliacao1236, avaliacao1237, avaliacao1238, avaliacao1239, avaliacao1240,
				avaliacao1241, avaliacao1242, avaliacao1243, avaliacao1244, avaliacao1245, avaliacao1246, avaliacao1247, avaliacao1248, avaliacao1249, avaliacao1250,
				avaliacao1251, avaliacao1252, avaliacao1253, avaliacao1254, avaliacao1255, avaliacao1256, avaliacao1257, avaliacao1258, avaliacao1259, avaliacao1260,
				avaliacao1261, avaliacao1262, avaliacao1263, avaliacao1264, avaliacao1265, avaliacao1266, avaliacao1267, avaliacao1268, avaliacao1269, avaliacao1270,
				avaliacao1271, avaliacao1272, avaliacao1273, avaliacao1274, avaliacao1275, avaliacao1276, avaliacao1277, avaliacao1278, avaliacao1279, avaliacao1280,
				avaliacao1281, avaliacao1282, avaliacao1283, avaliacao1284, avaliacao1285, avaliacao1286, avaliacao1287, avaliacao1288, avaliacao1289, avaliacao1290,
				avaliacao1291, avaliacao1292, avaliacao1293, avaliacao1294, avaliacao1295, avaliacao1296, avaliacao1297, avaliacao1298, avaliacao1299, avaliacao1300,
				avaliacao1301, avaliacao1302, avaliacao1303, avaliacao1304, avaliacao1305, avaliacao1306, avaliacao1307, avaliacao1308, avaliacao1309, avaliacao1310,
				avaliacao1311, avaliacao1312, avaliacao1313, avaliacao1314, avaliacao1315, avaliacao1316, avaliacao1317, avaliacao1318, avaliacao1319, avaliacao1320,
				avaliacao1321, avaliacao1322, avaliacao1323, avaliacao1324
				));
		
		recomendacaoRepository.save(Arrays.asList());

		/*
		 * Avaliacao avaliacao2 = new Avaliacao(null, 1.0f,
		 * sdf.parse("05/04/2018 12:15"), usuario2, item1); Avaliacao avaliacao3 = new
		 * Avaliacao(null, 3.0f, sdf.parse("05/04/2018 12:10"), usuario2, item4);
		 * Avaliacao avaliacao4 = new Avaliacao(null, 4.0f,
		 * sdf.parse("05/04/2018 12:10"), usuario4, item5); Avaliacao avaliacao5 = new
		 * Avaliacao(null, 5.0f, sdf.parse("05/04/2018 12:10"), usuario4, item7);
		 * 
		 * Recomendacao recomendacao1 = new Recomendacao(null, null, null,
		 * sdf.parse("05/04/2018 13:00"), usuario1, item1); //Recomendacao recomendacao2
		 * = new Recomendacao(null, null, null, sdf.parse("05/04/2018 13:00"), usuario2,
		 * item1); //Recomendacao recomendacao3 = new Recomendacao(null, null, null,
		 * sdf.parse("05/04/2018 13:00"), usuario2, item4); //Recomendacao recomendacao4
		 * = new Recomendacao(null, null, null, sdf.parse("10/05/2018 16:00"), usuario4,
		 * item5); //Recomendacao recomendacao5 = new Recomendacao(null, null, null,
		 * sdf.parse("10/05/2018 16:00"), usuario4, item7);
		 * 
		 * gerenteRepository.save(Arrays.asList(gerente1, gerente2));
		 * projetoRepository.save(Arrays.asList(projeto1, projeto2, projeto3,
		 * projeto4)); usuarioRepository.save(Arrays.asList(usuario1, usuario2,
		 * usuario3, usuario4, usuario5, usuario6, usuario7, usuario8));
		 * itemRepository.save(Arrays.asList(item1, item2, item3, item4, item5, item6,
		 * item7, item8, item9, item10, item11, item12, item13, item14, item15,
		 * item16)); avaliacaoRepository.save(Arrays.asList(avaliacao1, avaliacao2,
		 * avaliacao3, avaliacao4, avaliacao5));
		 * recomendacaoRepository.save(Arrays.asList(recomendacao1));
		 * 
		 * 
		 * 
		 * // [INÍCIO] TESTES DE INTEGRIDADE DO BANCO DE //
		 * DADOS------------------------------------------------------------------------
		 * --- // Inserindo um diretor vinculado ao mesmo filme, mais de uma vez (ainda
		 * não // resolvido) // filme1.setDiretores(Arrays.asList(diretor1, diretor1));
		 * 
		 * // Inserindo uma participacao para um filme não existente (OK)
		 * 
		 * // Deletando um filme (para saber se serão apagadas as participações) (OK) //
		 * filme3.setParticoes(Arrays.asList(participacao7, participacao8)); //
		 * filmeRepository.delete(filme3); //o filme 3 não está associado com nenhuma //
		 * fita de item de empréstimo
		 * 
		 * // Deletando um empréstimo com itens de empréstimo (para saber se serão
		 * apagados os itens de empréstimo) (ainda não resolvido) /* Emprestimo
		 * emprestimoApagar = new Emprestimo(null, sdf.parse("13/04/2018 08:00"), 15.00,
		 * true, cliente1); ItemDeEmprestimo itemDeEmprestimoApagar = new
		 * ItemDeEmprestimo(emprestimoApagar, fita1, 5.00,
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
