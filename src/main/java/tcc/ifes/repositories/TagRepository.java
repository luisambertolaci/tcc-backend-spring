package tcc.ifes.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import tcc.ifes.model.Projeto;
import tcc.ifes.model.Tag;

public interface TagRepository extends JpaRepository<Tag, Integer>{

	@Transactional(readOnly=true)
	public List<Tag> findByProjeto(Projeto projeto);
}
