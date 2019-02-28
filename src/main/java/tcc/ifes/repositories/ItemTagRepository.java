package tcc.ifes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import tcc.ifes.model.ItemTag;
import tcc.ifes.model.ItemTagPK;

public interface ItemTagRepository extends JpaRepository<ItemTag, ItemTagPK> {
	
	

}
