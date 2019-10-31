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

		Usuario usuario1 = new Usuario(null, "Bárbara Santos Pinheiro", "", "", projeto1, null, null, null, null, null);
		Usuario usuario2 = new Usuario(null, "Diogo Leite", "", "", projeto1, null, null, null, null, null);
		Usuario usuario3 = new Usuario(null, "Ana Clara de Souza", "", "", projeto1, null, null, null, null, null);
		Usuario usuario4 = new Usuario(null, "Pedro Henrique", "", "", projeto1, null, null, null, null, null);
		Usuario usuario5 = new Usuario(null, "Raphaela", "", "", projeto1, null, null, null, null, null);
		Usuario usuario6 = new Usuario(null, "Lucas Teixeira", "", "", projeto1, null, null, null, null, null);
		Usuario usuario7 = new Usuario(null, "Michael", "", "", projeto1, null, null, null, null, null);
		Usuario usuario8 = new Usuario(null, "Lays", "", "", projeto1, null, null, null, null, null);
		Usuario usuario9 = new Usuario(null, "Marina Cardoso", "", "", projeto1, null, null, null, null, null);
		Usuario usuario10 = new Usuario(null, "Álertse Tavares", "", "", projeto1, null, null, null, null, null);
		Usuario usuario11 = new Usuario(null, "Noemmy", "", "", projeto1, null, null, null, null, null);
		Usuario usuario12 = new Usuario(null, "Guilherme Trombini", "", "", projeto1, null, null, null, null, null);
		Usuario usuario13 = new Usuario(null, "Micaelle Oliveira", "", "", projeto1, null, null, null, null, null);
		Usuario usuario14 = new Usuario(null, "Kevin", "", "", projeto1, null, null, null, null, null);
		Usuario usuario15 = new Usuario(null, "Daniele Rangel", "", "", projeto1, null, null, null, null, null);
		Usuario usuario16 = new Usuario(null, "Gabrielle Tuão", "", "", projeto1, null, null, null, null, null);
		Usuario usuario17 = new Usuario(null, "Karla Teixeira", "", "", projeto1, null, null, null, null, null);
		Usuario usuario18 = new Usuario(null, "Flávio Higor", "", "", projeto1, null, null, null, null, null);
		Usuario usuario19 = new Usuario(null, "Mirella Moreira Silva", "", "", projeto1, null, null, null, null, null);
		Usuario usuario20 = new Usuario(null, "Thainá", "", "", projeto1, null, null, null, null, null);
		
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

		
		Avaliacao avaliacao1 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario1, item1);
		Avaliacao avaliacao2 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario1, item2);
		Avaliacao avaliacao3 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario1, item5);
		Avaliacao avaliacao4 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario1, item7);
		Avaliacao avaliacao5 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario1, item9);
		Avaliacao avaliacao6 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario1, item10);
		Avaliacao avaliacao7 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario1, item20);
		Avaliacao avaliacao8 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario1, item21);
		Avaliacao avaliacao9 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario1, item22);
		Avaliacao avaliacao10 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario1, item25);
		Avaliacao avaliacao11 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario1, item29);
		
		Avaliacao avaliacao12 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario2, item1);
		Avaliacao avaliacao13 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario2, item2);
		Avaliacao avaliacao14 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario2, item6);
		Avaliacao avaliacao15 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario2, item7);
		Avaliacao avaliacao16 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario2, item8);
		Avaliacao avaliacao17 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario2, item9);
		Avaliacao avaliacao18 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario2, item11);
		Avaliacao avaliacao19 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario2, item13);
		Avaliacao avaliacao20 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario2, item22);
		Avaliacao avaliacao21 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario2, item23);
		Avaliacao avaliacao22 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario2, item25);
		Avaliacao avaliacao23 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario2, item26);
		Avaliacao avaliacao24 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario2, item27);
		Avaliacao avaliacao25 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario2, item28);
		Avaliacao avaliacao26 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario2, item30);
		
		Avaliacao avaliacao27 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario3, item8);
		Avaliacao avaliacao28 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item10);
		Avaliacao avaliacao29 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario3, item17);
		Avaliacao avaliacao30 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario3, item21);
		Avaliacao avaliacao31 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario3, item22);
		Avaliacao avaliacao32 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario3, item23);
		Avaliacao avaliacao33 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario3, item24);
		Avaliacao avaliacao34 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario3, item25);
		Avaliacao avaliacao35 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario3, item26);
		Avaliacao avaliacao36 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario3, item28);
		Avaliacao avaliacao37 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario3, item30);
		
		Avaliacao avaliacao38 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario4, item1);
		Avaliacao avaliacao39 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario4, item2);
		Avaliacao avaliacao40 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario4, item3);
		Avaliacao avaliacao41 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario4, item4);
		Avaliacao avaliacao42 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario4, item5);
		Avaliacao avaliacao43 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario4, item6);
		Avaliacao avaliacao44 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario4, item7);
		Avaliacao avaliacao45 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario4, item8);
		Avaliacao avaliacao46 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario4, item9);
		Avaliacao avaliacao47 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario4, item10);
		Avaliacao avaliacao48 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario4, item11);
		Avaliacao avaliacao49 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario4, item12);
		Avaliacao avaliacao50 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario4, item13);
		Avaliacao avaliacao51 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario4, item15);
		Avaliacao avaliacao52 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario4, item16);
		Avaliacao avaliacao53 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario4, item17);
		Avaliacao avaliacao54 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario4, item18);
		Avaliacao avaliacao55 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario4, item22);
		Avaliacao avaliacao56 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario4, item23);
		Avaliacao avaliacao57 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario4, item25);
		Avaliacao avaliacao58 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario4, item30);
	
		Avaliacao avaliacao59 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario5, item1);
		Avaliacao avaliacao60 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario5, item2);
		Avaliacao avaliacao61 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario5, item3);
		Avaliacao avaliacao62 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario5, item5);
		Avaliacao avaliacao63 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario5, item6);
		Avaliacao avaliacao64 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario5, item7);
		Avaliacao avaliacao65 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario5, item9);
		Avaliacao avaliacao66 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario5, item10);
		Avaliacao avaliacao67 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario5, item11);
		Avaliacao avaliacao68 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario5, item14);
		Avaliacao avaliacao69 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario5, item16);
		Avaliacao avaliacao70 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario5, item17);
		Avaliacao avaliacao71 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario5, item18);
		Avaliacao avaliacao72 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario5, item22);
		Avaliacao avaliacao73 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario5, item28);
		Avaliacao avaliacao74 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario5, item30);
		
		Avaliacao avaliacao75 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario6, item3);
		Avaliacao avaliacao76 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario6, item6);
		Avaliacao avaliacao77 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario6, item7);
		Avaliacao avaliacao78 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario6, item9);
		Avaliacao avaliacao79 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario6, item10);
		Avaliacao avaliacao80 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario6, item11);
		Avaliacao avaliacao81 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario6, item13);
		Avaliacao avaliacao82 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario6, item27);
		Avaliacao avaliacao83 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario6, item29);
		
		Avaliacao avaliacao84 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario7, item1);
		Avaliacao avaliacao85 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item2);
		Avaliacao avaliacao86 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item3);
		Avaliacao avaliacao87 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item6);
		Avaliacao avaliacao88 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item7);
		Avaliacao avaliacao89 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item8);
		Avaliacao avaliacao90 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item9);
		Avaliacao avaliacao91 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item10);
		Avaliacao avaliacao92 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario7, item11);
		Avaliacao avaliacao93 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item12);
		Avaliacao avaliacao94 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item13);
		Avaliacao avaliacao95 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item14);
		Avaliacao avaliacao96 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item15);
		Avaliacao avaliacao97 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item16);
		Avaliacao avaliacao98 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item17);
		Avaliacao avaliacao99 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario7, item19);
		Avaliacao avaliacao100 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item20);
		Avaliacao avaliacao101 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item21);
		Avaliacao avaliacao102 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item23);
		Avaliacao avaliacao103 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario7, item24);
		Avaliacao avaliacao104 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item25);
		Avaliacao avaliacao105 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item26);
		Avaliacao avaliacao106 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item27);
		Avaliacao avaliacao107 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item28);
		Avaliacao avaliacao108 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario7, item29);
		Avaliacao avaliacao109 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario7, item30);
		
		Avaliacao avaliacao110 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item1);
		Avaliacao avaliacao111 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario8, item2);
		Avaliacao avaliacao112 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item3);
		Avaliacao avaliacao113 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario8, item4);
		Avaliacao avaliacao114 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario8, item5);
		Avaliacao avaliacao115 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item7);
		Avaliacao avaliacao116 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item8);
		Avaliacao avaliacao117 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item9);
		Avaliacao avaliacao118 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item10);
		Avaliacao avaliacao119 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item11);
		Avaliacao avaliacao120 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item12);
		Avaliacao avaliacao121 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item14);
		Avaliacao avaliacao122 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario8, item16);
		Avaliacao avaliacao123 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item17);
		Avaliacao avaliacao124 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario8, item21);
		Avaliacao avaliacao125 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item22);
		Avaliacao avaliacao126 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item23);
		Avaliacao avaliacao127 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario8, item24);
		Avaliacao avaliacao128 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario8, item26);
		Avaliacao avaliacao129 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item27);
		Avaliacao avaliacao130 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario8, item28);
		Avaliacao avaliacao131 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario8, item30);
		
		Avaliacao avaliacao132 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario9, item2);
		Avaliacao avaliacao133 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario9, item6);
		Avaliacao avaliacao134 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario9, item8);
		Avaliacao avaliacao135 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario9, item20);
		Avaliacao avaliacao136 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario9, item21);
		Avaliacao avaliacao137 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario9, item23);
		Avaliacao avaliacao138 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario9, item24);
		Avaliacao avaliacao139 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario9, item25);
		Avaliacao avaliacao140 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario9, item27);
		Avaliacao avaliacao141 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario9, item30);
		
		Avaliacao avaliacao142 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario10, item1);
		Avaliacao avaliacao143 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario10, item3);
		Avaliacao avaliacao144 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario10, item4);
		Avaliacao avaliacao145 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario10, item5);
		Avaliacao avaliacao146 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario10, item6);
		Avaliacao avaliacao147 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario10, item8);
		Avaliacao avaliacao148 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario10, item9);
		Avaliacao avaliacao149 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario10, item10);
		Avaliacao avaliacao150 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario10, item11);
		Avaliacao avaliacao151 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario10, item12);
		Avaliacao avaliacao152 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario10, item14);
		Avaliacao avaliacao153 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario10, item15);
		Avaliacao avaliacao154 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario10, item18);
		Avaliacao avaliacao155 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario10, item19);
		Avaliacao avaliacao156 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario10, item22);
		Avaliacao avaliacao157 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario10, item23);
		Avaliacao avaliacao158 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario10, item27);
		Avaliacao avaliacao159 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario10, item28);
		Avaliacao avaliacao160 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario10, item30);
		
		Avaliacao avaliacao161 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario11, item1);
		Avaliacao avaliacao162 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario11, item3);
		Avaliacao avaliacao163 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario11, item5);
		Avaliacao avaliacao164 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario11, item8);
		Avaliacao avaliacao165 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario11, item9);
		Avaliacao avaliacao166 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario11, item10);
		Avaliacao avaliacao167 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario11, item11);
		Avaliacao avaliacao168 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario11, item12);
		Avaliacao avaliacao169 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario11, item13);
		Avaliacao avaliacao170 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario11, item14);
		Avaliacao avaliacao171 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario11, item16);
		Avaliacao avaliacao172 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario11, item18);
		Avaliacao avaliacao173 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario11, item22);
		Avaliacao avaliacao174 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario11, item23);
		Avaliacao avaliacao175 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario11, item24);
		Avaliacao avaliacao176 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario11, item25);
		Avaliacao avaliacao177 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario11, item26);
		Avaliacao avaliacao178 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario11, item27);
		Avaliacao avaliacao179 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario11, item28);
		Avaliacao avaliacao180 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario11, item29);
		Avaliacao avaliacao181 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario11, item30);
	
		Avaliacao avaliacao182 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item1);
		Avaliacao avaliacao183 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item2);
		Avaliacao avaliacao184 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario12, item3);
		Avaliacao avaliacao185 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario12, item4);
		Avaliacao avaliacao186 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario12, item5);
		Avaliacao avaliacao187 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario12, item6);
		Avaliacao avaliacao188 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario12, item7);
		Avaliacao avaliacao189 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item8);
		Avaliacao avaliacao190 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item9);
		Avaliacao avaliacao191 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario12, item10);
		Avaliacao avaliacao192 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario12, item11);
		Avaliacao avaliacao193 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item12);
		Avaliacao avaliacao194 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item13);
		Avaliacao avaliacao195 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario12, item14);
		Avaliacao avaliacao196 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario12, item15);
		Avaliacao avaliacao197 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item17);
		Avaliacao avaliacao198 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario12, item18);
		Avaliacao avaliacao199 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item19);
		Avaliacao avaliacao200 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item22);
		Avaliacao avaliacao201 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item23);
		Avaliacao avaliacao202 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario12, item26);
		Avaliacao avaliacao203 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item27);
		Avaliacao avaliacao204 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario12, item28);
		Avaliacao avaliacao205 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario12, item30);

		Avaliacao avaliacao206 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario13, item1);
		Avaliacao avaliacao207 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario13, item2);
		Avaliacao avaliacao208 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item6);
		Avaliacao avaliacao209 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item8);
		Avaliacao avaliacao210 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item9);
		Avaliacao avaliacao211 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item10);
		Avaliacao avaliacao212 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario13, item11);
		Avaliacao avaliacao213 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario13, item12);
		Avaliacao avaliacao214 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario13, item13);
		Avaliacao avaliacao215 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario13, item14);
		Avaliacao avaliacao216 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario13, item16);
		Avaliacao avaliacao217 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario13, item17);
		Avaliacao avaliacao218 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario13, item18);
		Avaliacao avaliacao219 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario13, item19);
		Avaliacao avaliacao220 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario13, item20);
		Avaliacao avaliacao221 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario13, item21);
		Avaliacao avaliacao222 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item22);
		Avaliacao avaliacao223 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario13, item23);
		Avaliacao avaliacao224 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario13, item24);
		Avaliacao avaliacao225 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario13, item25);
		Avaliacao avaliacao226 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario13, item26);
		Avaliacao avaliacao227 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario13, item27);
		Avaliacao avaliacao228 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario13, item28);
		Avaliacao avaliacao229 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario13, item29);
		Avaliacao avaliacao230 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario13, item30);
		
		Avaliacao avaliacao231 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario14, item1);		
		Avaliacao avaliacao232 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario14, item2);
		Avaliacao avaliacao233 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario14, item3);
		Avaliacao avaliacao234 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario14, item8);
		Avaliacao avaliacao235 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario14, item9);
		Avaliacao avaliacao236 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario14, item11);
		Avaliacao avaliacao237 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario14, item14);
		Avaliacao avaliacao238 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario14, item21);
		Avaliacao avaliacao239 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario14, item22);
		Avaliacao avaliacao240 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario14, item23);
		Avaliacao avaliacao241 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario14, item26);
		Avaliacao avaliacao242 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario14, item27);
		Avaliacao avaliacao243 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario14, item28);
		Avaliacao avaliacao244 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario14, item30);
	
		Avaliacao avaliacao245 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario15, item7);
		Avaliacao avaliacao246 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario15, item10);
		Avaliacao avaliacao247 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario15, item11);
		Avaliacao avaliacao248 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario15, item13);
		Avaliacao avaliacao249 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario15, item22);
		Avaliacao avaliacao250 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario15, item26);
		Avaliacao avaliacao251 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario15, item27);
		Avaliacao avaliacao252 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario15, item30);
		
		Avaliacao avaliacao253 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario16, item1);
		Avaliacao avaliacao254 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario16, item3);
		Avaliacao avaliacao255 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario16, item4);
		Avaliacao avaliacao256 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario16, item6);
		Avaliacao avaliacao257 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario16, item8);
		Avaliacao avaliacao258 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario16, item10);
		Avaliacao avaliacao259 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario16, item11);
		Avaliacao avaliacao260 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario16, item12);
		Avaliacao avaliacao261 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario16, item13);
		Avaliacao avaliacao262 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario16, item15);
		Avaliacao avaliacao263 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario16, item16);
		Avaliacao avaliacao264 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario16, item20);
		Avaliacao avaliacao265 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario16, item21);
		Avaliacao avaliacao266 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario16, item23);
		Avaliacao avaliacao267 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario16, item25);
		Avaliacao avaliacao268 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario16, item26);
		Avaliacao avaliacao269 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario16, item28);
		Avaliacao avaliacao270 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario16, item30);
	
		Avaliacao avaliacao271 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario17, item3);
		Avaliacao avaliacao272 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item9);
		Avaliacao avaliacao273 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item13);
		Avaliacao avaliacao274 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario17, item15);
		Avaliacao avaliacao275 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario17, item17);
		Avaliacao avaliacao276 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario17, item23);
		Avaliacao avaliacao277 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario17, item26);
		Avaliacao avaliacao278 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario17, item28);
		Avaliacao avaliacao279 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario17, item30);
	
		Avaliacao avaliacao280 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario18, item1);
		Avaliacao avaliacao281 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario18, item5);
		Avaliacao avaliacao282 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario18, item6);
		Avaliacao avaliacao283 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario18, item7);
		Avaliacao avaliacao284 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario18, item8);
		Avaliacao avaliacao285 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario18, item9);
		Avaliacao avaliacao286 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario18, item10);
		Avaliacao avaliacao287 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario18, item11);
		Avaliacao avaliacao288 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario18, item13);
		Avaliacao avaliacao289 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario18, item14);
		Avaliacao avaliacao290 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario18, item15);
		Avaliacao avaliacao291 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario18, item16);
		Avaliacao avaliacao292 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario18, item17);
		Avaliacao avaliacao293 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario18, item18);
		Avaliacao avaliacao294 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario18, item20);
		Avaliacao avaliacao295 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario18, item21);
		Avaliacao avaliacao296 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario18, item22);
		Avaliacao avaliacao297 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario18, item23);
		Avaliacao avaliacao298 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario18, item25);
		Avaliacao avaliacao299 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario18, item26);
		Avaliacao avaliacao300 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario18, item27);
		Avaliacao avaliacao301 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario18, item29);
		Avaliacao avaliacao302 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario18, item30);
		
		Avaliacao avaliacao303 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario19, item1);
		Avaliacao avaliacao304 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario19, item2);
		Avaliacao avaliacao305 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario19, item3);
		Avaliacao avaliacao306 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario19, item5);
		Avaliacao avaliacao307 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario19, item7);
		Avaliacao avaliacao308 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario19, item8);
		Avaliacao avaliacao309 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario19, item10);
		Avaliacao avaliacao310 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario19, item11);
		Avaliacao avaliacao311 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario19, item12);
		Avaliacao avaliacao312 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario19, item13);
		Avaliacao avaliacao313 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario19, item16);
		Avaliacao avaliacao314 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario19, item17);
		Avaliacao avaliacao315 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario19, item23);
		Avaliacao avaliacao316 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario19, item25);
		Avaliacao avaliacao317 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario19, item30);
		
		Avaliacao avaliacao318 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario20, item1);
		Avaliacao avaliacao319 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item8);
		Avaliacao avaliacao320 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item9);
		Avaliacao avaliacao321 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item10);
		Avaliacao avaliacao322 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario20, item11);
		Avaliacao avaliacao323 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item13);
		Avaliacao avaliacao324 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item14);
		Avaliacao avaliacao325 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario20, item18);
		Avaliacao avaliacao326 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario20, item23);
		
		Avaliacao avaliacao327 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario53, item32);
		Avaliacao avaliacao328 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario53, item38);
		Avaliacao avaliacao329 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario53, item31);
		Avaliacao avaliacao330 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario53, item35);
		Avaliacao avaliacao331 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario53, item37);	

		Avaliacao avaliacao332 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario54, item38);
		Avaliacao avaliacao333 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario54, item33);
		Avaliacao avaliacao334 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario54, item39);
		Avaliacao avaliacao335 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario54, item31);
		Avaliacao avaliacao336 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario54, item37);

		Avaliacao avaliacao337 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario55, item38);
		Avaliacao avaliacao338 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario55, item35);
		Avaliacao avaliacao339 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario55, item34);
		Avaliacao avaliacao340 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario55, item31);
		Avaliacao avaliacao341 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario55, item32);
		
		Avaliacao avaliacao342 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario56, item35);
		Avaliacao avaliacao343 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario56, item31);
		Avaliacao avaliacao344 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario56, item39);
		Avaliacao avaliacao345 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario56, item38);
		Avaliacao avaliacao346 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario56, item34);
		
		Avaliacao avaliacao347 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario57, item35);
		Avaliacao avaliacao348 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario57, item32);
		Avaliacao avaliacao349 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario57, item36);
		Avaliacao avaliacao350 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario57, item39);
		Avaliacao avaliacao351 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario57, item33);
		
		Avaliacao avaliacao352 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario58, item33);
		Avaliacao avaliacao353 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario58, item35);
		Avaliacao avaliacao354 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario58, item34);
		Avaliacao avaliacao355 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario58, item32);
		Avaliacao avaliacao356 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario58, item37);
		
		Avaliacao avaliacao357 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario59, item39);
		Avaliacao avaliacao358 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario59, item36);
		Avaliacao avaliacao359 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario59, item32);
		Avaliacao avaliacao360 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario59, item35);
		Avaliacao avaliacao361 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario59, item34);
		
		Avaliacao avaliacao362 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario60, item38);
		Avaliacao avaliacao363 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario60, item32);
		Avaliacao avaliacao364 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario60, item35);
		Avaliacao avaliacao365 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario60, item36);
		Avaliacao avaliacao366 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario60, item37);
		
		Avaliacao avaliacao367 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario61, item31);
		Avaliacao avaliacao368 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario61, item32);
		Avaliacao avaliacao369 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario61, item37);
		Avaliacao avaliacao370 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario61, item38);
		Avaliacao avaliacao371 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario61, item33);
		
		Avaliacao avaliacao372 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario62, item34);
		Avaliacao avaliacao373 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario62, item35);
		Avaliacao avaliacao374 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario62, item31);
		Avaliacao avaliacao375 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario62, item36);
		Avaliacao avaliacao376 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario62, item38);
		
		Avaliacao avaliacao377 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario63, item37);
		Avaliacao avaliacao378 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario63, item32);
		Avaliacao avaliacao379 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario63, item35);
		Avaliacao avaliacao380 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario63, item36);
		Avaliacao avaliacao381 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario63, item38);
		
		Avaliacao avaliacao382 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario64, item31);
		Avaliacao avaliacao383 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario64, item33);
		Avaliacao avaliacao384 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario64, item37);
		Avaliacao avaliacao385 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario64, item38);
		Avaliacao avaliacao386 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario64, item39);
		
		Avaliacao avaliacao387 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario65, item32);
		Avaliacao avaliacao388 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario65, item35);
		Avaliacao avaliacao389 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario65, item37);
		Avaliacao avaliacao390 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario65, item38);
		Avaliacao avaliacao391 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario65, item39);
	
		Avaliacao avaliacao392 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario66, item32);
		Avaliacao avaliacao393 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario66, item33);
		Avaliacao avaliacao394 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario66, item36);
		Avaliacao avaliacao395 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario66, item37);
		Avaliacao avaliacao396 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario66, item39);
		
		Avaliacao avaliacao397 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario67, item33);
		Avaliacao avaliacao398 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario67, item34);
		Avaliacao avaliacao399 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario67, item36);
		Avaliacao avaliacao400 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario67, item38);
		Avaliacao avaliacao401 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario67, item39);
		
		Avaliacao avaliacao402 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario68, item39);
		Avaliacao avaliacao403 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario68, item37);
		Avaliacao avaliacao404 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario68, item34);
		Avaliacao avaliacao405 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario68, item36);
		Avaliacao avaliacao406 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario68, item31);
		
		Avaliacao avaliacao407 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario69, item37);
		Avaliacao avaliacao408 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario69, item38);		
		Avaliacao avaliacao409 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario69, item36);
		Avaliacao avaliacao410 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario69, item33);
		Avaliacao avaliacao411 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario69, item31);
		
		Avaliacao avaliacao412 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario70, item31);
		Avaliacao avaliacao413 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario70, item32);
		Avaliacao avaliacao414 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario70, item33);
		Avaliacao avaliacao415 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario70, item34);
		Avaliacao avaliacao416 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario70, item35);
		
		Avaliacao avaliacao417 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario71, item32);
		Avaliacao avaliacao418 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario71, item38);
		Avaliacao avaliacao419 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario71, item36);
		Avaliacao avaliacao420 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario71, item37);
		Avaliacao avaliacao421 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario71, item39);	
		
		Avaliacao avaliacao422 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario72, item37);
		Avaliacao avaliacao423 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario72, item38);
		Avaliacao avaliacao424 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario72, item36);
		Avaliacao avaliacao425 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario72, item39);
		Avaliacao avaliacao426 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario72, item32);	
		
		Avaliacao avaliacao427 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario73, item32);
		Avaliacao avaliacao428 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario73, item38);
		Avaliacao avaliacao429 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario73, item37);
		Avaliacao avaliacao430 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario73, item33);
		Avaliacao avaliacao431 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario73, item36);	
		
		Avaliacao avaliacao432 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario74, item33);
		Avaliacao avaliacao433 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario74, item32);
		Avaliacao avaliacao434 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario74, item38);
		Avaliacao avaliacao435 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario74, item37);
		Avaliacao avaliacao436 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario74, item34);	
		
		Avaliacao avaliacao437 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario75, item36);
		Avaliacao avaliacao438 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario75, item37);
		Avaliacao avaliacao439 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario75, item39);
		Avaliacao avaliacao440 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario75, item35);
		Avaliacao avaliacao441 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario75, item34);	
	
		Avaliacao avaliacao442 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario76, item31);
		Avaliacao avaliacao443 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario76, item36);
		Avaliacao avaliacao444 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario76, item34);
		Avaliacao avaliacao445 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario76, item37);
		Avaliacao avaliacao446 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario76, item33);	
		
		Avaliacao avaliacao447 = new Avaliacao(null, 1.0f, sdf.parse("21/08/2019 10:00"), usuario77, item34);
		Avaliacao avaliacao448 = new Avaliacao(null, 2.0f, sdf.parse("21/08/2019 10:00"), usuario77, item37);
		Avaliacao avaliacao449 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario77, item38);
		Avaliacao avaliacao450 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario77, item33);
		Avaliacao avaliacao451 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario77, item35);	
		
		Avaliacao avaliacao452 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario78, item31);
		Avaliacao avaliacao453 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario78, item32);
		Avaliacao avaliacao454 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario78, item33);
		Avaliacao avaliacao455 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario78, item34);
		Avaliacao avaliacao456 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario78, item35);
		
		Avaliacao avaliacao457 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario79, item31);
		Avaliacao avaliacao458 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario79, item34);
		Avaliacao avaliacao459 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario79, item36);
		Avaliacao avaliacao460 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario79, item37);
		Avaliacao avaliacao461 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario79, item38);
		
		Avaliacao avaliacao462 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario80, item37);
		Avaliacao avaliacao463 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario80, item32);
		Avaliacao avaliacao464 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario80, item31);
		Avaliacao avaliacao465 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario80, item34);
		Avaliacao avaliacao466 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario80, item39);
	
		Avaliacao avaliacao467 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario81, item33);
		Avaliacao avaliacao468 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario81, item36);
		Avaliacao avaliacao469 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario81, item38);
		Avaliacao avaliacao470 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario81, item31);
		Avaliacao avaliacao471 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario81, item32);
		
		Avaliacao avaliacao472 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario82, item38);
		Avaliacao avaliacao473 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario82, item39);
		Avaliacao avaliacao474 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario82, item31);
		Avaliacao avaliacao475 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario82, item32);
		Avaliacao avaliacao476 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario82, item37);
		
		Avaliacao avaliacao477 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario83, item33);
		Avaliacao avaliacao478 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario83, item39);
		Avaliacao avaliacao479 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario83, item38);
		Avaliacao avaliacao480 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario83, item34);
		Avaliacao avaliacao481 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario83, item32);	

		Avaliacao avaliacao482 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario84, item31);
		Avaliacao avaliacao483 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario84, item35);
		Avaliacao avaliacao484 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario84, item36);
		Avaliacao avaliacao485 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario84, item37);
		Avaliacao avaliacao486 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario84, item38);	
		
		Avaliacao avaliacao487 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario85, item36);
		Avaliacao avaliacao488 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario85, item31);
		Avaliacao avaliacao489 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario85, item38);
		Avaliacao avaliacao490 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario85, item37);
		Avaliacao avaliacao491 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario85, item33);	
		
		Avaliacao avaliacao492 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario86, item34);
		Avaliacao avaliacao493 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario86, item32);
		Avaliacao avaliacao494 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario86, item39);
		Avaliacao avaliacao495 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario86, item33);
		Avaliacao avaliacao496 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario86, item38);	
		
		Avaliacao avaliacao497 = new Avaliacao(null, 4.0f, sdf.parse("21/08/2019 10:00"), usuario87, item32);
		Avaliacao avaliacao498 = new Avaliacao(null, 3.0f, sdf.parse("21/08/2019 10:00"), usuario87, item34);
		Avaliacao avaliacao499 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario87, item37);
		Avaliacao avaliacao500 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario87, item38);
		Avaliacao avaliacao501 = new Avaliacao(null, 5.0f, sdf.parse("21/08/2019 10:00"), usuario87, item39);	

			
		gerenteRepository.save(Arrays.asList(gerente1));

		projetoRepository.save(Arrays.asList(projeto1, projeto2));

		usuarioRepository.save(Arrays.asList(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6, usuario7, usuario8, usuario9, usuario10,
				usuario11, usuario12, usuario13, usuario14, usuario15, usuario16, usuario17, usuario18, usuario19, usuario20,
									  usuario53, usuario54, usuario55, usuario56, usuario57, usuario58, usuario59, usuario60,
				usuario61, usuario62, usuario63, usuario64, usuario65, usuario66, usuario67, usuario68, usuario69, usuario70,
				usuario71, usuario72, usuario73, usuario74, usuario75, usuario76, usuario77, usuario78, usuario79, usuario80,
				usuario81, usuario82, usuario83, usuario84, usuario85, usuario86, usuario87
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
				avaliacao501
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
