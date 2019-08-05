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
		
		Projeto projeto1 = new Projeto(null, "Filmes", sdf.parse("05/02/2019 18:15"), gerente1);
		
		Projeto projeto2 = new Projeto(null, "Jogos", sdf.parse("19/03/2019 15:11"), gerente1);
		
		Projeto projeto3 = new Projeto(null, "Séries", sdf.parse("13/06/2019 22:50"), gerente1);
		
		Usuario usuario1 = new Usuario(null, "Ana", "ana", "abc123", projeto1, null, null, null, null, null);
		Usuario usuario2 = new Usuario(null, "Marcos", "marcos", "abc123", projeto1, null, null, null, null, null);
		Usuario usuario3 = new Usuario(null, "Pedro", "pedro", "abc123", projeto1, null, null, null, null, null);
		Usuario usuario4 = new Usuario(null, "Claudia", "claudia", "abc123", projeto1, null, null, null, null, null);
		Usuario usuario5 = new Usuario(null, "Adriano", "adriano", "abc123", projeto1, null, null, null, null, null);
		Usuario usuario6 = new Usuario(null, "Janaina", "janaina", "abc123", projeto1, null, null, null, null, null);
		Usuario usuario7 = new Usuario(null, "Leonardo", "leonardo", "abc123", projeto1, null, null, null, null, null);
		
		Usuario usuario8 = new Usuario(null, "Ana", "ana", "abc123", projeto2, null, null, null, null, null);
		Usuario usuario9 = new Usuario(null, "Marcos", "marcos", "abc123", projeto2, null, null, null, null, null);
		Usuario usuario10 = new Usuario(null, "Pedro", "pedro", "abc123", projeto2, null, null, null, null, null);
		Usuario usuario11 = new Usuario(null, "Claudia", "claudia", "abc123", projeto2, null, null, null, null, null);
		Usuario usuario12 = new Usuario(null, "Adriano", "adriano", "abc123", projeto2, null, null, null, null, null);
		Usuario usuario13 = new Usuario(null, "Janaina", "janaina", "abc123", projeto2, null, null, null, null, null);
		Usuario usuario14 = new Usuario(null, "Leonardo", "leonardo", "abc123", projeto2, null, null, null, null, null);
		
		Usuario usuario15 = new Usuario(null, "Luisa", "login", "abc123", projeto3, null, null, null, null, null);
		Usuario usuario16 = new Usuario(null, "Marina", "login", "abc123", projeto3, null, null, null, null, null);
		Usuario usuario17 = new Usuario(null, "Hanna", "login", "abc123", projeto3, null, null, null, null, null);
		Usuario usuario18 = new Usuario(null, "Flavio", "login", "abc123", projeto3, null, null, null, null, null);
		Usuario usuario19 = new Usuario(null, "Lucas", "login", "abc123", projeto3, null, null, null, null, null);
		Usuario usuario20 = new Usuario(null, "Barbara", "login", "abc123", projeto3, null, null, null, null, null);
		Usuario usuario21 = new Usuario(null, "Diogo", "login", "abc123", projeto3, null, null, null, null, null);
		Usuario usuario22 = new Usuario(null, "Pedro", "login", "abc123", projeto3, null, null, null, null, null);
		Usuario usuario23 = new Usuario(null, "Fernanda", "login", "abc123", projeto3, null, null, null, null, null);
		
		Item item1 = new Item(null, "Freddy","", projeto1, null, null, null, null, null);
		Item item2 = new Item(null, "O Ultimato Bourne","", projeto1, null, null, null, null, null);
		Item item3 = new Item(null, "Star Trek","", projeto1, null, null, null, null, null);
		Item item4 = new Item(null, "Exterminador do Futuro","", projeto1, null, null, null, null, null);
		Item item5 = new Item(null, "Norbit","", projeto1, null, null, null, null, null);
		Item item6 = new Item(null, "Star Wars","", projeto1, null, null, null, null, null);
		
		Item item7 = new Item(null, "Gondeneye 007","", projeto2, null, null, null, null, null);
		Item item8 = new Item(null, "Far Cry 3","", projeto2, null, null, null, null, null);
		Item item9 = new Item(null, "Gears of War","", projeto2, null, null, null, null, null);
		Item item10 = new Item(null, "Portal 2","", projeto2, null, null, null, null, null);
		Item item11 = new Item(null, "Doom","", projeto2, null, null, null, null, null);
		Item item12 = new Item(null, "Half-Life 2","", projeto2, null, null, null, null, null);
		Item item13 = new Item(null, "The Legend of Zelda: A link to the past","", projeto2, null, null, null, null, null);
		Item item14 = new Item(null, "Final Fantasy VII","", projeto2, null, null, null, null, null);
		Item item15 = new Item(null, "The Last of Us","", projeto2, null, null, null, null, null);
		Item item16 = new Item(null, "The Witcher 3","", projeto2, null, null, null, null, null);
		Item item17 = new Item(null, "Minecraft","", projeto2, null, null, null, null, null);
		Item item18 = new Item(null, "Super Mario 64","", projeto2, null, null, null, null, null);
		Item item19 = new Item(null, "World of Warcraft","", projeto2, null, null, null, null, null);
		Item item20 = new Item(null, "Tekken 3","", projeto2, null, null, null, null, null);
		Item item21 = new Item(null, "Red Dead Redemption","", projeto2, null, null, null, null, null);
		Item item22 = new Item(null, "Tomb Raider","", projeto2, null, null, null, null, null);
		Item item23 = new Item(null, "Skyrim","", projeto2, null, null, null, null, null);
		Item item24 = new Item(null, "GTA V","", projeto2, null, null, null, null, null);
		Item item25 = new Item(null, "Uncharted 4","", projeto2, null, null, null, null, null);
		Item item26 = new Item(null, "THe Legend of Zelda: Ocarina of Time","", projeto2, null, null, null, null, null);
		
		Item item27 = new Item(null, "Good Girls","", projeto3, null, null, null, null, null);
		Item item28 = new Item(null, "The Good Place","", projeto3, null, null, null, null, null);
		Item item29 = new Item(null, "How I met Your Mother","", projeto3, null, null, null, null, null);
		Item item30 = new Item(null, "Friends","", projeto3, null, null, null, null, null);
		Item item31 = new Item(null, "The Vampire Diaries", "", projeto3, null, null, null, null, null);
		Item item32 = new Item(null, "Chernobyl","", projeto3, null, null, null, null, null);
		Item item33 = new Item(null, "The 100","", projeto3, null, null, null, null, null);
		Item item34 = new Item(null, "Brooklyn 99","", projeto3, null, null, null, null, null);
		Item item35 = new Item(null, "Orange is The New Black","", projeto3, null, null, null, null, null);
		Item item36 = new Item(null, "The End of the F***ing World","", projeto3, null, null, null, null, null);
		Item item37 = new Item(null, "Sex Education","", projeto3, null, null, null, null, null);
		Item item38 = new Item(null, "La Casa de Papel","", projeto3, null, null, null, null, null);
		Item item39 = new Item(null, "Stranger Things","", projeto3, null, null, null, null, null);
		Item item40 = new Item(null, "Black Mirror","", projeto3, null, null, null, null, null);
		Item item41 = new Item(null, "Doctor Who","", projeto3, null, null, null, null, null);
		Item item42 = new Item(null, "Game of Thrones","", projeto3, null, null, null, null, null);
		Item item43 = new Item(null, "The Flash","", projeto3, null, null, null, null, null);
		Item item44 = new Item(null, "Gotham","", projeto3, null, null, null, null, null);
		Item item45 = new Item(null, "Demolidor","", projeto3, null, null, null, null, null);
		Item item46 = new Item(null, "Jessica Jones","", projeto3, null, null, null, null, null);
		Item item47 = new Item(null, "Modern Family","", projeto3, null, null, null, null, null);
		Item item48 = new Item(null, "Supergirl","", projeto3, null, null, null, null, null);
		Item item49 = new Item(null, "Arrow","", projeto3, null, null, null, null, null);
		Item item50 = new Item(null, "Big Mouth","", projeto3, null, null, null, null, null);
		Item item51 = new Item(null, "South Park","", projeto3, null, null, null, null, null);
		Item item52 = new Item(null, "Bojack","", projeto3, null, null, null, null, null);
		Item item53 = new Item(null, "Greys Anatomy","", projeto3, null, null, null, null, null);
		Item item54 = new Item(null, "Hannibal","", projeto3, null, null, null, null, null);
		Item item55 = new Item(null, "Sabrina","", projeto3, null, null, null, null, null);
		Item item56 = new Item(null, "Lucifer","", projeto3, null, null, null, null, null);
		Item item57 = new Item(null, "Titans","", projeto3, null, null, null, null, null);
		Item item58 = new Item(null, "Breaking Bad","", projeto3, null, null, null, null, null);
		Item item59 = new Item(null, "Lost","", projeto3, null, null, null, null, null);
		Item item60 = new Item(null, "Westworld","", projeto3, null, null, null, null, null);
		Item item61 = new Item(null, "Narcos","", projeto3, null, null, null, null, null);
		Item item62 = new Item(null, "Supernatural","", projeto3, null, null, null, null, null);
		Item item63 = new Item(null, "Mr Robot","", projeto3, null, null, null, null, null);
		
		Tag tag1 = new Tag(null, "Ação", projeto1);
		Tag tag2 = new Tag(null, "Comédia", projeto1);
		Tag tag3 = new Tag(null, "Terror", projeto1);
		Tag tag4 = new Tag(null, "1971-1980", projeto1);
		Tag tag5 = new Tag(null, "1981-1990", projeto1);
		Tag tag6 = new Tag(null, "1991-2010", projeto1);
		Tag tag7 = new Tag(null, "2011-2020", projeto1);
		Tag tag8 = new Tag(null, "Jonny Depp", projeto1);
		Tag tag9 = new Tag(null, "Matt Damon", projeto1);
		Tag tag10 = new Tag(null, "Chris Pine", projeto1);
		Tag tag11 = new Tag(null, "Arnold Schwarzenegger", projeto1);
		Tag tag12 = new Tag(null, "Eddie Murphy", projeto1);
		Tag tag13 = new Tag(null, "Mark Hamill", projeto1);
		
		Tag tag14 = new Tag(null, "1990-1999", projeto2);
		Tag tag15 = new Tag(null, "2000-2010", projeto2);
		Tag tag16 = new Tag(null, "2011-2020", projeto2);
		Tag tag17 = new Tag(null, "Nintendo", projeto2);
		Tag tag18 = new Tag(null, "Ubisoft", projeto2);
		Tag tag19 = new Tag(null, "Epic Games", projeto2);
		Tag tag20 = new Tag(null, "Valve", projeto2);
		Tag tag21 = new Tag(null, "Id", projeto2);
		Tag tag22 = new Tag(null, "Squaresoft", projeto2);
		Tag tag23 = new Tag(null, "Naughty Dog", projeto2);
		Tag tag24 = new Tag(null, "Red Studio", projeto2);
		Tag tag25 = new Tag(null, "Mojang", projeto2);
		Tag tag26 = new Tag(null, "Blizzard", projeto2);
		Tag tag27 = new Tag(null, "Namco", projeto2);
		Tag tag28 = new Tag(null, "Rockstar", projeto2);
		Tag tag29 = new Tag(null, "Crystal Dinamics", projeto2);
		Tag tag30 = new Tag(null, "Bethesda", projeto2);
		Tag tag31 = new Tag(null, "Ação", projeto2);
		Tag tag32 = new Tag(null, "Tiro", projeto2);
		Tag tag33 = new Tag(null, "FPS", projeto2);
		Tag tag34 = new Tag(null, "Moderno", projeto2);
		Tag tag35 = new Tag(null, "Arcade", projeto2);
		Tag tag36 = new Tag(null, "TPS", projeto2);
		Tag tag37 = new Tag(null, "Sci-fi", projeto2);
		Tag tag38 = new Tag(null, "Aventura", projeto2);
		Tag tag39 = new Tag(null, "Fantasia", projeto2);
		Tag tag40 = new Tag(null, "RPG", projeto2);
		Tag tag41 = new Tag(null, "3D", projeto2);
		Tag tag42 = new Tag(null, "SandBox", projeto2);
		Tag tag43 = new Tag(null, "FP", projeto2);
		Tag tag44 = new Tag(null,"Plataforma", projeto2);
		Tag tag45 = new Tag(null, "MMO", projeto2);
		Tag tag46 = new Tag(null, "Online", projeto2);
		Tag tag47 = new Tag(null, "Luta", projeto2);
		Tag tag48 = new Tag(null, "Historia", projeto2);
		Tag tag49 = new Tag(null, "Mundo Aberto", projeto2);
		Tag tag50 = new Tag(null, "Linear", projeto2);
		
		Tag tag51 = new Tag(null, "Comedia", projeto3);
		Tag tag52 = new Tag(null, "Drama", projeto3);
		Tag tag53 = new Tag(null, "Crime", projeto3);
		Tag tag54 = new Tag(null, "Fantasia", projeto3);
		Tag tag55 = new Tag(null, "Romance", projeto3);
		Tag tag56 = new Tag(null, "Terror", projeto3);
		Tag tag57 = new Tag(null, "Real", projeto3);
		Tag tag58 = new Tag(null, "Misterio", projeto3);
		Tag tag59 = new Tag(null, "Sci-Fi", projeto3);
		Tag tag60 = new Tag(null, "Aventura", projeto3);
		Tag tag61 = new Tag(null, "Ação", projeto3);
		Tag tag62 = new Tag(null, "Suspense", projeto3);
		Tag tag63 = new Tag(null, "Animação", projeto3);
		
		
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
		
		ItemTag itemTag19 = new ItemTag(item7, tag14);
		ItemTag itemTag20 = new ItemTag(item7, tag17);
		ItemTag itemTag21 = new ItemTag(item7, tag31);
		ItemTag itemTag22 = new ItemTag(item7, tag32);
		ItemTag itemTag23 = new ItemTag(item7, tag33);
		ItemTag itemTag24 = new ItemTag(item7, tag34);
		
		ItemTag itemTag25 = new ItemTag(item8, tag16);
		ItemTag itemTag26 = new ItemTag(item8, tag18);
		ItemTag itemTag27 = new ItemTag(item8, tag31);
		ItemTag itemTag28 = new ItemTag(item8, tag32);
		ItemTag itemTag29 = new ItemTag(item8, tag33);
		ItemTag itemTag30 = new ItemTag(item8, tag34);
		ItemTag itemTag31 = new ItemTag(item8, tag35);
		ItemTag itemTag32 = new ItemTag(item8, tag49);
		
		ItemTag itemTag33 = new ItemTag(item9, tag15);
		ItemTag itemTag34 = new ItemTag(item9, tag19);
		ItemTag itemTag35 = new ItemTag(item9, tag31);
		ItemTag itemTag36 = new ItemTag(item9, tag32);
		ItemTag itemTag37 = new ItemTag(item9, tag36);
		ItemTag itemTag38 = new ItemTag(item9, tag37);
		ItemTag itemTag39 = new ItemTag(item9, tag35);
		
		ItemTag itemTag40 = new ItemTag(item10, tag16);
		ItemTag itemTag41 = new ItemTag(item10, tag20);
		ItemTag itemTag42 = new ItemTag(item10, tag31);
		ItemTag itemTag43 = new ItemTag(item10, tag32);
		ItemTag itemTag44 = new ItemTag(item10, tag33);
		ItemTag itemTag45 = new ItemTag(item10, tag37);
		ItemTag itemTag46 = new ItemTag(item10, tag35);
		
		ItemTag itemTag47 = new ItemTag(item11, tag14);
		ItemTag itemTag48 = new ItemTag(item11, tag21);
		ItemTag itemTag49 = new ItemTag(item11, tag31);
		ItemTag itemTag50 = new ItemTag(item11, tag32);
		ItemTag itemTag51 = new ItemTag(item11, tag33);
		ItemTag itemTag52 = new ItemTag(item11, tag37);
		ItemTag itemTag53 = new ItemTag(item11, tag35);
		
		ItemTag itemTag54 = new ItemTag(item12, tag15);
		ItemTag itemTag55 = new ItemTag(item12, tag20);
		ItemTag itemTag56 = new ItemTag(item12, tag31);
		ItemTag itemTag57 = new ItemTag(item12, tag32);
		ItemTag itemTag58 = new ItemTag(item12, tag33);
		ItemTag itemTag59 = new ItemTag(item12, tag37);
		ItemTag itemTag60 = new ItemTag(item12, tag35);
		
		ItemTag itemTag61 = new ItemTag(item13, tag14);
		ItemTag itemTag62 = new ItemTag(item13, tag17);
		ItemTag itemTag63 = new ItemTag(item13, tag31);
		ItemTag itemTag64 = new ItemTag(item13, tag38);
		ItemTag itemTag65 = new ItemTag(item13, tag39);
		ItemTag itemTag66 = new ItemTag(item13, tag40);
		
		ItemTag itemTag67 = new ItemTag(item14, tag14);
		ItemTag itemTag68 = new ItemTag(item14, tag22);
		ItemTag itemTag69 = new ItemTag(item14, tag40);
		
		ItemTag itemTag70 = new ItemTag(item15, tag16);
		ItemTag itemTag71 = new ItemTag(item15, tag23);
		ItemTag itemTag72 = new ItemTag(item15, tag34);
		ItemTag itemTag73 = new ItemTag(item15, tag38);
		ItemTag itemTag74 = new ItemTag(item15, tag31);
		
		ItemTag itemTag75 = new ItemTag(item16, tag16);
		ItemTag itemTag76 = new ItemTag(item16, tag24);
		ItemTag itemTag77 = new ItemTag(item16, tag40);
		
		ItemTag itemTag78 = new ItemTag(item17, tag15);
		ItemTag itemTag79 = new ItemTag(item17, tag25);
		ItemTag itemTag80 = new ItemTag(item17, tag31);
		ItemTag itemTag81 = new ItemTag(item17, tag38);
		ItemTag itemTag82 = new ItemTag(item17, tag41);
		ItemTag itemTag83 = new ItemTag(item17, tag42);
		ItemTag itemTag84 = new ItemTag(item17, tag43);
		ItemTag itemTag85 = new ItemTag(item17, tag39);
		
		ItemTag itemTag86 = new ItemTag(item18, tag14);
		ItemTag itemTag87 = new ItemTag(item18, tag17);
		ItemTag itemTag88 = new ItemTag(item18, tag31);
		ItemTag itemTag89 = new ItemTag(item18, tag44);
		ItemTag itemTag90 = new ItemTag(item18, tag41);
		
		ItemTag itemTag91 = new ItemTag(item19, tag15);
		ItemTag itemTag92 = new ItemTag(item19, tag26);
		ItemTag itemTag93 = new ItemTag(item19, tag40);
		ItemTag itemTag94 = new ItemTag(item19, tag45);
		ItemTag itemTag95 = new ItemTag(item19, tag39);
		ItemTag itemTag96 = new ItemTag(item19, tag46);
		
		ItemTag itemTag97 = new ItemTag(item20, tag14);
		ItemTag itemTag98 = new ItemTag(item20, tag27);
		ItemTag itemTag99 = new ItemTag(item20, tag31);
		ItemTag itemTag100 = new ItemTag(item20, tag47);
		ItemTag itemTag101 = new ItemTag(item20, tag41);
		
		ItemTag itemTag102 = new ItemTag(item21, tag15);
		ItemTag itemTag103 = new ItemTag(item21, tag28);
		ItemTag itemTag104 = new ItemTag(item21, tag31);
		ItemTag itemTag105 = new ItemTag(item21, tag32);
		ItemTag itemTag106 = new ItemTag(item21, tag36);
		ItemTag itemTag107 = new ItemTag(item21, tag48);
		ItemTag itemTag108 = new ItemTag(item21, tag38);
		ItemTag itemTag109 = new ItemTag(item21, tag49);
		
		ItemTag itemTag110 = new ItemTag(item22, tag16);
		ItemTag itemTag111 = new ItemTag(item22, tag29);
		ItemTag itemTag112 = new ItemTag(item22, tag31);
		ItemTag itemTag113 = new ItemTag(item22, tag38);
		ItemTag itemTag114 = new ItemTag(item22, tag34);
		ItemTag itemTag115 = new ItemTag(item22, tag50);
		
		ItemTag itemTag116 = new ItemTag(item23, tag16);
		ItemTag itemTag117 = new ItemTag(item23, tag30);
		ItemTag itemTag118 = new ItemTag(item23, tag40);
		
		ItemTag itemTag119 = new ItemTag(item24, tag16);
		ItemTag itemTag120 = new ItemTag(item24, tag28);
		ItemTag itemTag121 = new ItemTag(item24, tag31);
		ItemTag itemTag122 = new ItemTag(item24, tag32);
		ItemTag itemTag123 = new ItemTag(item24, tag38);
		ItemTag itemTag124 = new ItemTag(item24, tag36);
		ItemTag itemTag125 = new ItemTag(item24, tag49);
		ItemTag itemTag126 = new ItemTag(item24, tag46);
		
		ItemTag itemTag127 = new ItemTag(item25, tag16);
		ItemTag itemTag128 = new ItemTag(item25, tag23);
		ItemTag itemTag129 = new ItemTag(item25, tag34);
		ItemTag itemTag130 = new ItemTag(item25, tag31);
		ItemTag itemTag131 = new ItemTag(item25, tag38);
		ItemTag itemTag132 = new ItemTag(item25, tag50);
		
		ItemTag itemTag133 = new ItemTag(item26, tag14);
		ItemTag itemTag134 = new ItemTag(item26, tag17);
		ItemTag itemTag135 = new ItemTag(item26, tag31);
		ItemTag itemTag136 = new ItemTag(item26, tag38);
		ItemTag itemTag137 = new ItemTag(item26, tag39);	
		ItemTag itemTag138 = new ItemTag(item26, tag40);
		
		ItemTag itemTag139 = new ItemTag(item27, tag51);
		ItemTag itemTag140 = new ItemTag(item27, tag52);
		ItemTag itemTag141 = new ItemTag(item27, tag53);
		
		ItemTag itemTag142 = new ItemTag(item28, tag51);
		ItemTag itemTag143 = new ItemTag(item28, tag52);
		ItemTag itemTag144 = new ItemTag(item28, tag54);
		
		ItemTag itemTag145 = new ItemTag(item29, tag51);
		ItemTag itemTag146 = new ItemTag(item29, tag55);
		
		ItemTag itemTag147 = new ItemTag(item30, tag51);
		ItemTag itemTag148 = new ItemTag(item30, tag55);
		
		ItemTag itemTag149 = new ItemTag(item31, tag52);
		ItemTag itemTag150 = new ItemTag(item31, tag56);
		ItemTag itemTag151 = new ItemTag(item31, tag54);
		ItemTag itemTag152 = new ItemTag(item31, tag55);
		
		ItemTag itemTag153 = new ItemTag(item32, tag52);
		ItemTag itemTag154 = new ItemTag(item32, tag57);
		
		ItemTag itemTag155 = new ItemTag(item33, tag52);
		ItemTag itemTag156 = new ItemTag(item33, tag58);
		ItemTag itemTag157 = new ItemTag(item33, tag59);
		
		ItemTag itemTag158 = new ItemTag(item34, tag51);
		ItemTag itemTag159 = new ItemTag(item34, tag53);
		
		ItemTag itemTag160 = new ItemTag(item35, tag51);
		ItemTag itemTag161 = new ItemTag(item35, tag52);
		ItemTag itemTag162 = new ItemTag(item35, tag53);
		
		ItemTag itemTag163 = new ItemTag(item36, tag51);
		ItemTag itemTag164 = new ItemTag(item36, tag60);
		ItemTag itemTag165 = new ItemTag(item36, tag53);
		
		ItemTag itemTag166 = new ItemTag(item37, tag51);
		ItemTag itemTag167 = new ItemTag(item37, tag52);
		
		ItemTag itemTag168 = new ItemTag(item38, tag61);
		ItemTag itemTag169 = new ItemTag(item38, tag58);
		ItemTag itemTag170 = new ItemTag(item38, tag53);
		
		ItemTag itemTag171 = new ItemTag(item39, tag52);
		ItemTag itemTag172 = new ItemTag(item39, tag56);
		ItemTag itemTag173 = new ItemTag(item39, tag54);
		
		ItemTag itemTag174 = new ItemTag(item40, tag52);
		ItemTag itemTag175 = new ItemTag(item40, tag62);
		ItemTag itemTag176 = new ItemTag(item40, tag59);
		
		ItemTag itemTag177 = new ItemTag(item41, tag60);
		ItemTag itemTag178 = new ItemTag(item41, tag52);
		ItemTag itemTag179 = new ItemTag(item41, tag59);
		
		ItemTag itemTag180 = new ItemTag(item42, tag61);
		ItemTag itemTag181 = new ItemTag(item42, tag60);
		ItemTag itemTag182 = new ItemTag(item42, tag52);
		
		ItemTag itemTag183 = new ItemTag(item43, tag61);
		ItemTag itemTag184 = new ItemTag(item43, tag60);
		ItemTag itemTag185 = new ItemTag(item43, tag52);
		
		ItemTag itemTag186 = new ItemTag(item44, tag61);
		ItemTag itemTag187 = new ItemTag(item44, tag52);
		ItemTag itemTag188 = new ItemTag(item44, tag53);
		
		ItemTag itemTag189 = new ItemTag(item45, tag61);
		ItemTag itemTag190 = new ItemTag(item45, tag52);
		ItemTag itemTag191 = new ItemTag(item45, tag53);
		
		ItemTag itemTag192 = new ItemTag(item46, tag61);
		ItemTag itemTag193 = new ItemTag(item46, tag52);
		ItemTag itemTag194 = new ItemTag(item46, tag53);
		
		ItemTag itemTag195 = new ItemTag(item47, tag51);
		ItemTag itemTag196 = new ItemTag(item47, tag55);
		
		ItemTag itemTag197 = new ItemTag(item48, tag61);
		ItemTag itemTag198 = new ItemTag(item48, tag60);
		ItemTag itemTag199 = new ItemTag(item48, tag52);
		
		ItemTag itemTag200 = new ItemTag(item49, tag61);
		ItemTag itemTag201 = new ItemTag(item49, tag60);
		ItemTag itemTag202 = new ItemTag(item49, tag52);
		
		ItemTag itemTag203 = new ItemTag(item50, tag51);
		ItemTag itemTag204 = new ItemTag(item50, tag55);
		ItemTag itemTag205 = new ItemTag(item50, tag63);
		
		ItemTag itemTag206 = new ItemTag(item51, tag51);
		ItemTag itemTag207 = new ItemTag(item51, tag63);
		
		ItemTag itemTag208 = new ItemTag(item52, tag52);
		ItemTag itemTag209 = new ItemTag(item52, tag51);
		ItemTag itemTag210 = new ItemTag(item52, tag63);
		
		ItemTag itemTag211 = new ItemTag(item53, tag52);
		ItemTag itemTag212 = new ItemTag(item53, tag55);
		
		ItemTag itemTag213 = new ItemTag(item54, tag56);
		ItemTag itemTag214 = new ItemTag(item54, tag52);
		ItemTag itemTag215 = new ItemTag(item54, tag53);
		
		ItemTag itemTag216 = new ItemTag(item55, tag52);
		ItemTag itemTag217 = new ItemTag(item55, tag56);
		ItemTag itemTag218 = new ItemTag(item55, tag54);
		
		ItemTag itemTag219 = new ItemTag(item56, tag53);
		ItemTag itemTag220 = new ItemTag(item56, tag52);
		ItemTag itemTag221 = new ItemTag(item56, tag54);
		
		ItemTag itemTag222 = new ItemTag(item57, tag61);
		ItemTag itemTag223 = new ItemTag(item57, tag60);
		ItemTag itemTag224 = new ItemTag(item57, tag52);
		
		ItemTag itemTag225 = new ItemTag(item58, tag52);
		ItemTag itemTag226 = new ItemTag(item58, tag62);
		ItemTag itemTag227 = new ItemTag(item58, tag53);
		
		ItemTag itemTag228 = new ItemTag(item59, tag60);
		ItemTag itemTag229 = new ItemTag(item59, tag52);
		ItemTag itemTag230 = new ItemTag(item59, tag54);
		
		ItemTag itemTag231 = new ItemTag(item60, tag52);
		ItemTag itemTag232 = new ItemTag(item60, tag58);
		ItemTag itemTag233 = new ItemTag(item60, tag59);
		
		ItemTag itemTag234 = new ItemTag(item61, tag52);
		ItemTag itemTag235 = new ItemTag(item61, tag53);
		ItemTag itemTag236 = new ItemTag(item61, tag57);
		
		ItemTag itemTag237 = new ItemTag(item62, tag52);
		ItemTag itemTag238 = new ItemTag(item62, tag56);
		ItemTag itemTag239 = new ItemTag(item62, tag54);
		
		ItemTag itemTag240 = new ItemTag(item63, tag62);
		ItemTag itemTag241 = new ItemTag(item63, tag52);
		ItemTag itemTag242 = new ItemTag(item63, tag53);
		
		item1.setItens(Arrays.asList(itemTag1, itemTag2, itemTag3));
		item2.setItens(Arrays.asList(itemTag4, itemTag5, itemTag6));
		item3.setItens(Arrays.asList(itemTag7, itemTag8, itemTag9));
		item4.setItens(Arrays.asList(itemTag10, itemTag11, itemTag12));
		item5.setItens(Arrays.asList(itemTag13, itemTag14, itemTag15));
		item6.setItens(Arrays.asList(itemTag16, itemTag17, itemTag18));
		
		item7.setItens(Arrays.asList(itemTag19, itemTag20, itemTag21, itemTag22, itemTag23, itemTag24));
		item8.setItens(Arrays.asList(itemTag25, itemTag26, itemTag27, itemTag28, itemTag29, itemTag30, itemTag31, itemTag32));
		item9.setItens(Arrays.asList(itemTag33, itemTag34, itemTag35, itemTag36, itemTag37, itemTag38, itemTag39));
		item10.setItens(Arrays.asList(itemTag40, itemTag41, itemTag42, itemTag43, itemTag44, itemTag45, itemTag46));
		item11.setItens(Arrays.asList(itemTag47, itemTag48, itemTag49, itemTag50, itemTag51, itemTag52, itemTag53));
		item12.setItens(Arrays.asList(itemTag54, itemTag55, itemTag56, itemTag57, itemTag58, itemTag59, itemTag60));
		item13.setItens(Arrays.asList(itemTag61, itemTag62, itemTag63, itemTag64, itemTag65, itemTag66));
		item14.setItens(Arrays.asList(itemTag67, itemTag68, itemTag69));
		item15.setItens(Arrays.asList(itemTag70, itemTag71, itemTag72, itemTag73, itemTag74));
		item16.setItens(Arrays.asList(itemTag75, itemTag76, itemTag77));
		item17.setItens(Arrays.asList(itemTag78, itemTag79, itemTag80, itemTag81, itemTag82, itemTag83, itemTag84, itemTag85));
		item18.setItens(Arrays.asList(itemTag86, itemTag87, itemTag88, itemTag89, itemTag90));
		item19.setItens(Arrays.asList(itemTag91, itemTag92, itemTag93, itemTag94, itemTag95, itemTag96));
		item20.setItens(Arrays.asList(itemTag97, itemTag98, itemTag99, itemTag100, itemTag101));
		item21.setItens(Arrays.asList(itemTag102, itemTag103, itemTag104, itemTag105, itemTag106, itemTag107, itemTag108, itemTag109));
		item22.setItens(Arrays.asList(itemTag110, itemTag111, itemTag112, itemTag113, itemTag114, itemTag115));
		item23.setItens(Arrays.asList(itemTag116, itemTag117, itemTag118));
		item24.setItens(Arrays.asList(itemTag119, itemTag120, itemTag121, itemTag122, itemTag123, itemTag124, itemTag125, itemTag126));
		item25.setItens(Arrays.asList(itemTag127, itemTag128, itemTag129, itemTag130, itemTag131, itemTag132));
		item26.setItens(Arrays.asList(itemTag133, itemTag134, itemTag135, itemTag136, itemTag137, itemTag138));
		
		item27.setItens(Arrays.asList(itemTag139, itemTag140, itemTag141));
		item28.setItens(Arrays.asList(itemTag142, itemTag143, itemTag144));
		item29.setItens(Arrays.asList(itemTag145, itemTag146));
		item30.setItens(Arrays.asList(itemTag147, itemTag148));
		item31.setItens(Arrays.asList(itemTag149, itemTag150, itemTag151, itemTag152));
		item32.setItens(Arrays.asList(itemTag153, itemTag154));
		item33.setItens(Arrays.asList(itemTag155, itemTag156, itemTag157));
		item34.setItens(Arrays.asList(itemTag158, itemTag159));
		item35.setItens(Arrays.asList(itemTag160, itemTag161, itemTag162));
		item36.setItens(Arrays.asList(itemTag163, itemTag164, itemTag165));
		item37.setItens(Arrays.asList(itemTag166, itemTag167));
		item38.setItens(Arrays.asList(itemTag168, itemTag169, itemTag170));
		item39.setItens(Arrays.asList(itemTag171, itemTag172, itemTag173));
		item40.setItens(Arrays.asList(itemTag174, itemTag175, itemTag176));
		item41.setItens(Arrays.asList(itemTag177, itemTag178, itemTag179));
		item42.setItens(Arrays.asList(itemTag180, itemTag181, itemTag182));
		item43.setItens(Arrays.asList(itemTag183, itemTag184, itemTag185));
		item44.setItens(Arrays.asList(itemTag186, itemTag187, itemTag188));
		item45.setItens(Arrays.asList(itemTag189, itemTag190, itemTag191));
		item46.setItens(Arrays.asList(itemTag192, itemTag193, itemTag194));
		item47.setItens(Arrays.asList(itemTag195, itemTag196));
		item48.setItens(Arrays.asList(itemTag197, itemTag198, itemTag199));
		item49.setItens(Arrays.asList(itemTag200, itemTag201, itemTag202));
		item50.setItens(Arrays.asList(itemTag203, itemTag204, itemTag205));
		item51.setItens(Arrays.asList(itemTag206, itemTag207));
		item52.setItens(Arrays.asList(itemTag208, itemTag209, itemTag210));
		item53.setItens(Arrays.asList(itemTag211, itemTag212));
		item54.setItens(Arrays.asList(itemTag213, itemTag214, itemTag215));
		item55.setItens(Arrays.asList(itemTag216, itemTag217, itemTag218));
		item56.setItens(Arrays.asList(itemTag219, itemTag220, itemTag221));
		item57.setItens(Arrays.asList(itemTag222, itemTag223, itemTag224));
		item58.setItens(Arrays.asList(itemTag225, itemTag226, itemTag227));
		item59.setItens(Arrays.asList(itemTag228, itemTag229, itemTag230));
		item60.setItens(Arrays.asList(itemTag231, itemTag232, itemTag233));
		item61.setItens(Arrays.asList(itemTag234, itemTag235, itemTag236));
		item62.setItens(Arrays.asList(itemTag237, itemTag238, itemTag239));
		item63.setItens(Arrays.asList(itemTag240, itemTag241, itemTag242));
		
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
		
		Avaliacao avaliacao36 = new Avaliacao(null, 2.5f, sdf.parse("19/03/2019 16:22"), usuario8, item7);
		Avaliacao avaliacao37 = new Avaliacao(null, 4.5f, sdf.parse("19/03/2019 16:22"), usuario8, item8);
		Avaliacao avaliacao38 = new Avaliacao(null, 2.5f, sdf.parse("19/03/2019 16:22"), usuario8, item9);
		Avaliacao avaliacao39 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario8, item10);
		Avaliacao avaliacao40 = new Avaliacao(null, 3.0f, sdf.parse("19/03/2019 16:22"), usuario8, item11);
		Avaliacao avaliacao41 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario8, item12);
		Avaliacao avaliacao42 = new Avaliacao(null, 1.5f, sdf.parse("19/03/2019 16:22"), usuario8, item13);
		Avaliacao avaliacao43 = new Avaliacao(null, 2.0f, sdf.parse("19/03/2019 16:22"), usuario8, item14);
		Avaliacao avaliacao44 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario8, item15);
		Avaliacao avaliacao45 = new Avaliacao(null, 3.0f, sdf.parse("19/03/2019 16:22"), usuario8, item16);
		Avaliacao avaliacao46 = new Avaliacao(null, 1.0f, sdf.parse("19/03/2019 16:22"), usuario8, item17);
		Avaliacao avaliacao47 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario8, item18);
		Avaliacao avaliacao48 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario8, item19);
		Avaliacao avaliacao49 = new Avaliacao(null, 4.0f, sdf.parse("19/03/2019 16:22"), usuario8, item22);
		Avaliacao avaliacao50 = new Avaliacao(null, 3.0f, sdf.parse("19/03/2019 16:22"), usuario8, item23);
		Avaliacao avaliacao51 = new Avaliacao(null, 4.5f, sdf.parse("19/03/2019 16:22"), usuario8, item24);
		Avaliacao avaliacao52 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario8, item25);
		
		Avaliacao avaliacao53 = new Avaliacao(null, 2.0f, sdf.parse("19/03/2019 16:22"), usuario9, item8);
		Avaliacao avaliacao54 = new Avaliacao(null, 4.0f, sdf.parse("19/03/2019 16:22"), usuario9, item10);
		Avaliacao avaliacao55 = new Avaliacao(null, 2.0f, sdf.parse("19/03/2019 16:22"), usuario9, item11);
		Avaliacao avaliacao56 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario9, item12);
		Avaliacao avaliacao57 = new Avaliacao(null, 4.5f, sdf.parse("19/03/2019 16:22"), usuario9, item13);
		Avaliacao avaliacao58 = new Avaliacao(null, 4.5f, sdf.parse("19/03/2019 16:22"), usuario9, item14);
		Avaliacao avaliacao59 = new Avaliacao(null, 2.0f, sdf.parse("19/03/2019 16:22"), usuario9, item15);
		Avaliacao avaliacao60 = new Avaliacao(null, 2.0f, sdf.parse("19/03/2019 16:22"), usuario9, item21);
		Avaliacao avaliacao61 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario9, item22);
		Avaliacao avaliacao62 = new Avaliacao(null, 4.5f, sdf.parse("19/03/2019 16:22"), usuario9, item23);
		
		Avaliacao avaliacao63 = new Avaliacao(null, 4.5f, sdf.parse("19/03/2019 16:22"), usuario10, item7);
		Avaliacao avaliacao64 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario10, item11);
		Avaliacao avaliacao65 = new Avaliacao(null, 3.0f, sdf.parse("19/03/2019 16:22"), usuario10, item12);
		Avaliacao avaliacao66 = new Avaliacao(null, 2.5f, sdf.parse("19/03/2019 16:22"), usuario10, item14);
		Avaliacao avaliacao67 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario10, item16);
		Avaliacao avaliacao68 = new Avaliacao(null, 4.5f, sdf.parse("19/03/2019 16:22"), usuario10, item19);
		Avaliacao avaliacao69 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario10, item26);
		
		Avaliacao avaliacao70 = new Avaliacao(null, 5.0f, sdf.parse("19/03/2019 16:22"), usuario11, item8);
		Avaliacao avaliacao71 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario11, item10);
		Avaliacao avaliacao72 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario11, item15);
		Avaliacao avaliacao73 = new Avaliacao(null, 2.5f, sdf.parse("19/03/2019 16:22"), usuario11, item21);
		Avaliacao avaliacao74 = new Avaliacao(null, 4.5f, sdf.parse("19/03/2019 16:22"), usuario11, item22);
		Avaliacao avaliacao75 = new Avaliacao(null, 4.5f, sdf.parse("19/03/2019 16:22"), usuario11, item24);
		
		Avaliacao avaliacao76 = new Avaliacao(null, 1.5f, sdf.parse("19/03/2019 16:22"), usuario12, item9);
		Avaliacao avaliacao77 = new Avaliacao(null, 3.0f, sdf.parse("19/03/2019 16:22"), usuario12, item10);
		Avaliacao avaliacao78 = new Avaliacao(null, 2.0f, sdf.parse("19/03/2019 16:22"), usuario12, item13);
		Avaliacao avaliacao79 = new Avaliacao(null, 1.0f, sdf.parse("19/03/2019 16:22"), usuario12, item17);
		Avaliacao avaliacao80 = new Avaliacao(null, 5.0f, sdf.parse("19/03/2019 16:22"), usuario12, item20);
		Avaliacao avaliacao81 = new Avaliacao(null, 4.0f, sdf.parse("19/03/2019 16:22"), usuario12, item24);
		
		Avaliacao avaliacao82 = new Avaliacao(null, 1.5f, sdf.parse("19/03/2019 16:22"), usuario13, item7);
		Avaliacao avaliacao83 = new Avaliacao(null, 2.0f, sdf.parse("19/03/2019 16:22"), usuario13, item11);
		Avaliacao avaliacao84 = new Avaliacao(null, 4.0f, sdf.parse("19/03/2019 16:22"), usuario13, item13);
		Avaliacao avaliacao85 = new Avaliacao(null, 5.0f, sdf.parse("19/03/2019 16:22"), usuario13, item16);
		Avaliacao avaliacao86 = new Avaliacao(null, 2.0f, sdf.parse("19/03/2019 16:22"), usuario13, item18);
		Avaliacao avaliacao87 = new Avaliacao(null, 4.0f, sdf.parse("19/03/2019 16:22"), usuario13, item23);
		Avaliacao avaliacao88 = new Avaliacao(null, 4.5f, sdf.parse("19/03/2019 16:22"), usuario13, item26);
		
		Avaliacao avaliacao89 = new Avaliacao(null, 4.0f, sdf.parse("19/03/2019 16:22"), usuario14, item9);
		Avaliacao avaliacao90 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario14, item12);
		Avaliacao avaliacao91 = new Avaliacao(null, 4.0f, sdf.parse("19/03/2019 16:22"), usuario14, item15);
		Avaliacao avaliacao92 = new Avaliacao(null, 2.5f, sdf.parse("19/03/2019 16:22"), usuario14, item20);
		Avaliacao avaliacao93 = new Avaliacao(null, 3.5f, sdf.parse("19/03/2019 16:22"), usuario14, item24);
		Avaliacao avaliacao94 = new Avaliacao(null, 4.0f, sdf.parse("19/03/2019 16:22"), usuario14, item25);
		
		Avaliacao avaliacao95 = new Avaliacao(null, 3.7f, sdf.parse("14/06/2019 13:36"), usuario15, item27);
		Avaliacao avaliacao96 = new Avaliacao(null, 4.5f, sdf.parse("14/06/2019 13:36"), usuario15, item28);
		Avaliacao avaliacao97 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario15, item29);
		Avaliacao avaliacao98 = new Avaliacao(null, 3.5f, sdf.parse("14/06/2019 13:36"), usuario15, item30);
		Avaliacao avaliacao99 = new Avaliacao(null, 3.8f, sdf.parse("14/06/2019 13:36"), usuario15, item31);
		Avaliacao avaliacao100 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario15, item32);
		Avaliacao avaliacao101 = new Avaliacao(null, 4.8f, sdf.parse("14/06/2019 13:36"), usuario15, item33);
		Avaliacao avaliacao102 = new Avaliacao(null, 3.5f, sdf.parse("14/06/2019 13:36"), usuario15, item34);
		Avaliacao avaliacao103 = new Avaliacao(null, 4f, sdf.parse("14/06/2019 13:36"), usuario15, item35);
		Avaliacao avaliacao104 = new Avaliacao(null, 3.5f, sdf.parse("14/06/2019 13:36"), usuario15, item36);
		Avaliacao avaliacao105 = new Avaliacao(null, 3.5f, sdf.parse("14/06/2019 13:36"), usuario15, item38);
		Avaliacao avaliacao106 = new Avaliacao(null, 3.2f, sdf.parse("14/06/2019 13:36"), usuario15, item40);
		Avaliacao avaliacao107 = new Avaliacao(null, 4.8f, sdf.parse("14/06/2019 13:36"), usuario15, item41);
		Avaliacao avaliacao108 = new Avaliacao(null, 4.8f, sdf.parse("14/06/2019 13:36"), usuario15, item43);
		Avaliacao avaliacao109 = new Avaliacao(null, 3.8f, sdf.parse("14/06/2019 13:36"), usuario15, item46);
		Avaliacao avaliacao110 = new Avaliacao(null, 4f, sdf.parse("14/06/2019 13:36"), usuario15, item47);
		Avaliacao avaliacao111 = new Avaliacao(null, 3f, sdf.parse("14/06/2019 13:36"), usuario15, item49);
		Avaliacao avaliacao112 = new Avaliacao(null, 4f, sdf.parse("14/06/2019 13:36"), usuario15, item50);
		Avaliacao avaliacao113 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario15, item52);
		Avaliacao avaliacao114 = new Avaliacao(null, 3.5f, sdf.parse("14/06/2019 13:36"), usuario15, item55);
		Avaliacao avaliacao115 = new Avaliacao(null, 4.5f, sdf.parse("14/06/2019 13:36"), usuario15, item58);
		Avaliacao avaliacao116 = new Avaliacao(null, 4.8f, sdf.parse("14/06/2019 13:36"), usuario15, item61);
		Avaliacao avaliacao117 = new Avaliacao(null, 4.8f, sdf.parse("14/06/2019 13:36"), usuario15, item63);
		
		Avaliacao avaliacao118 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario16, item28);
		Avaliacao avaliacao119 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario16, item29);
		Avaliacao avaliacao120 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario16, item31);
		Avaliacao avaliacao121 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario16, item32);
		Avaliacao avaliacao122 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario16, item33);
		Avaliacao avaliacao123 = new Avaliacao(null, 3f, sdf.parse("14/06/2019 13:36"), usuario16, item34);
		Avaliacao avaliacao124 = new Avaliacao(null, 4f, sdf.parse("14/06/2019 13:36"), usuario16, item35);
		Avaliacao avaliacao125 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario16, item38);
		Avaliacao avaliacao126 = new Avaliacao(null, 4f, sdf.parse("14/06/2019 13:36"), usuario16, item40);
		Avaliacao avaliacao127 = new Avaliacao(null, 4f, sdf.parse("14/06/2019 13:36"), usuario16, item41);
		Avaliacao avaliacao128 = new Avaliacao(null, 4f, sdf.parse("14/06/2019 13:36"), usuario16, item46);
		Avaliacao avaliacao129 = new Avaliacao(null, 4f, sdf.parse("14/06/2019 13:36"), usuario16, item59);
		Avaliacao avaliacao130 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario16, item62);
		
		Avaliacao avaliacao131 = new Avaliacao(null, 4f, sdf.parse("14/06/2019 13:36"), usuario17, item28);
		Avaliacao avaliacao132 = new Avaliacao(null, 4.6f, sdf.parse("14/06/2019 13:36"), usuario17, item30);
		Avaliacao avaliacao133 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario17, item32);
		Avaliacao avaliacao134 = new Avaliacao(null, 4.5f, sdf.parse("14/06/2019 13:36"), usuario17, item35);
		Avaliacao avaliacao135 = new Avaliacao(null, 3.5f, sdf.parse("14/06/2019 13:36"), usuario17, item36);
		Avaliacao avaliacao136 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario17, item37);
		Avaliacao avaliacao137 = new Avaliacao(null, 1f, sdf.parse("14/06/2019 13:36"), usuario17, item38);
		Avaliacao avaliacao138 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario17, item39);
		Avaliacao avaliacao139 = new Avaliacao(null, 4.5f, sdf.parse("14/06/2019 13:36"), usuario17, item40);
		Avaliacao avaliacao140 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario17, item42);
		Avaliacao avaliacao141 = new Avaliacao(null, 1f, sdf.parse("14/06/2019 13:36"), usuario17, item44);
		Avaliacao avaliacao142 = new Avaliacao(null, 4f, sdf.parse("14/06/2019 13:36"), usuario17, item46);
		Avaliacao avaliacao143 = new Avaliacao(null, 4.7f, sdf.parse("14/06/2019 13:36"), usuario17, item53);
		Avaliacao avaliacao144 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario17, item54);
		Avaliacao avaliacao145 = new Avaliacao(null, 3.5f, sdf.parse("14/06/2019 13:36"), usuario17, item55);
		Avaliacao avaliacao146 = new Avaliacao(null, 4f, sdf.parse("14/06/2019 13:36"), usuario17, item56);
		Avaliacao avaliacao147 = new Avaliacao(null, 5f, sdf.parse("14/06/2019 13:36"), usuario17, item60);
		
		
		gerenteRepository.save(Arrays.asList(gerente1));
		
		projetoRepository.save(Arrays.asList(projeto1, projeto2, projeto3));
		
		usuarioRepository.save(Arrays.asList(usuario1, usuario2, usuario3, usuario4, usuario5, usuario6, usuario7, usuario8, usuario9, usuario10,
				usuario11, usuario12, usuario13, usuario14, usuario15, usuario16, usuario17, usuario18,usuario19, usuario20,
				usuario21, usuario22, usuario23));
		
		itemRepository.save(Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8, item9,
				item10, item11, item12, item13, item14, item15, item16, item17, item18, item19,
				item20, item21, item22, item23, item24, item25, item26, item27, item28, item29,
				item30, item31, item32, item33, item34, item35, item36, item37, item38, item39,
				item40, item41, item42, item43, item44, item45, item46, item47, item48, item49,
				item50, item51, item52, item53, item54, item55, item56, item57, item58, item59,
				item60, item61, item62, item63));
		
		tagRepository.save(Arrays.asList(tag1, tag2,tag3,tag4,tag5,tag6,tag7,tag8,tag9,
				tag10, tag11, tag12, tag13, tag14, tag15, tag16, tag17, tag18, tag19,
				tag20, tag21, tag22 ,tag23, tag24, tag25, tag26, tag27, tag28, tag29,
				tag30, tag31, tag32, tag33, tag34, tag35, tag36, tag37, tag38, tag39,
				tag40, tag41, tag42, tag43, tag44, tag45, tag46, tag47, tag48, tag49,
				tag50, tag51, tag52, tag53, tag54, tag55, tag56, tag57, tag58, tag59,
				tag60, tag61, tag62, tag63));
		
		itemTagRepository.save(Arrays.asList(itemTag1, itemTag2, itemTag3, itemTag4, itemTag5, itemTag6, itemTag7, itemTag8, itemTag9, itemTag10, 
				itemTag11, itemTag12, itemTag13, itemTag14, itemTag15, itemTag16, itemTag17, itemTag18, itemTag19, itemTag20,
				itemTag21, itemTag22, itemTag23, itemTag24, itemTag25, itemTag26, itemTag27, itemTag28, itemTag29, itemTag30, 
				itemTag31, itemTag32, itemTag33, itemTag34, itemTag35, itemTag36, itemTag37, itemTag38, itemTag39, itemTag40,
				itemTag41, itemTag42, itemTag43, itemTag44, itemTag45, itemTag46, itemTag47, itemTag48, itemTag49, itemTag50, 
				itemTag51, itemTag52, itemTag53, itemTag54, itemTag55, itemTag56, itemTag57, itemTag58, itemTag59, itemTag60,
				itemTag61, itemTag62, itemTag63, itemTag64, itemTag65, itemTag66, itemTag67, itemTag68, itemTag69, itemTag70, 
				itemTag71, itemTag72, itemTag73, itemTag74, itemTag75, itemTag76, itemTag77, itemTag78, itemTag79, itemTag80,
				itemTag81, itemTag82, itemTag83, itemTag84, itemTag85, itemTag86, itemTag87, itemTag88, itemTag89, itemTag90, 
				itemTag91, itemTag92, itemTag93, itemTag94, itemTag95, itemTag96, itemTag97, itemTag98, itemTag99, itemTag100,
				itemTag101, itemTag102, itemTag103, itemTag104, itemTag105, itemTag106, itemTag107, itemTag108, itemTag109, itemTag110, 
				itemTag111, itemTag112, itemTag113, itemTag114, itemTag115, itemTag116, itemTag117, itemTag118, itemTag119, itemTag120,
				itemTag121, itemTag122, itemTag123, itemTag124, itemTag125, itemTag126, itemTag127, itemTag128, itemTag129, itemTag130, 
				itemTag131, itemTag132, itemTag133, itemTag134, itemTag135, itemTag136, itemTag137, itemTag138, itemTag139, itemTag140,
				itemTag141, itemTag142, itemTag143, itemTag144, itemTag145, itemTag146, itemTag147, itemTag148, itemTag149, itemTag150, 
				itemTag151, itemTag152, itemTag153, itemTag154, itemTag155, itemTag156, itemTag157, itemTag158, itemTag159, itemTag160,
				itemTag161, itemTag162, itemTag163, itemTag164, itemTag165, itemTag166, itemTag167, itemTag168, itemTag169, itemTag170, 
				itemTag171, itemTag172, itemTag173, itemTag174, itemTag175, itemTag176, itemTag177, itemTag178, itemTag179, itemTag180,
				itemTag181, itemTag182, itemTag183, itemTag184, itemTag185, itemTag186, itemTag187, itemTag188, itemTag189, itemTag190, 
				itemTag191, itemTag192, itemTag193, itemTag194, itemTag195, itemTag196, itemTag197, itemTag198, itemTag199, itemTag200,
				itemTag201, itemTag202, itemTag203, itemTag204, itemTag205, itemTag206, itemTag207, itemTag208, itemTag209, itemTag210, 
				itemTag211, itemTag212, itemTag213, itemTag214, itemTag215, itemTag216, itemTag217, itemTag218, itemTag219, itemTag220,
				itemTag221, itemTag222, itemTag223, itemTag224, itemTag225, itemTag226, itemTag227, itemTag228, itemTag229, itemTag230, 
				itemTag231, itemTag232, itemTag233, itemTag234, itemTag235, itemTag236, itemTag237, itemTag238, itemTag239, itemTag240,
				itemTag241, itemTag242));
		
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
				avaliacao141, avaliacao142, avaliacao143, avaliacao144, avaliacao145, avaliacao146, avaliacao147));
		
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
