package tcc.ifes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tcc.ifes.model.Avaliacao;
import tcc.ifes.model.Item;
import tcc.ifes.model.Usuario;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Integer>{
	
	@Transactional(readOnly=true)
	public List<Avaliacao> findByItem(Item item);
	
	@Transactional(readOnly=true)
	public List<Avaliacao> findByUsuario(Usuario usuario);

}
