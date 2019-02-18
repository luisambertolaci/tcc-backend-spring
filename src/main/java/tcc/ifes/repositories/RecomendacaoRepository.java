package tcc.ifes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tcc.ifes.model.Item;
import tcc.ifes.model.Recomendacao;
import tcc.ifes.model.Usuario;

@Repository
public interface RecomendacaoRepository extends JpaRepository<Recomendacao, Integer>{
	
	@Transactional(readOnly=true)
	public List<Recomendacao> findByItem(Item item);
	
	@Transactional(readOnly=true)
	public List<Recomendacao> findByUsuario(Usuario usuario);


}
