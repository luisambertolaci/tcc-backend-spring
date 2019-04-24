package tcc.ifes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tcc.ifes.model.Gerente;

@Repository
public interface GerenteRepository extends JpaRepository<Gerente, Integer>{
	
	

}
