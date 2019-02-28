package tcc.ifes.model;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class ItemTag implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@JsonIgnore
	@EmbeddedId
	private ItemTagPK id = new ItemTagPK();
	
	public ItemTag() {
		
	}
	
	public ItemTag(Item item, Tag tag) {
		this.id.setItem(item);
		this.id.setTag(tag);
	}
	
	@JsonIgnore
	public Item getItem() {
		return id.getItem();
	}
	
	public void setItem(Item item) {
		id.setItem(item);
	}
	
	public Tag getTag() {
		return id.getTag();
	}
	
	public void setTag(Tag tag) {
		id.setTag(tag);
	}
	
	public ItemTagPK getId() {
		return id;
	}
	
	public void setId(ItemTagPK id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ItemTag other = (ItemTag) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return getTag().toString();
	}
}
