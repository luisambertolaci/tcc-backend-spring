package tcc.ifes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tcc.ifes.model.Gerente;
import tcc.ifes.model.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Integer>{

	@Transactional(readOnly=true)
	public List<Projeto> findByGerente(Gerente gerente);
}
