package tcc.ifes.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String nome;
	private String descricao;
	private String atributo1;
	private String atributo2;
	private String atributo3;
	private String atributo4;
	private String atributo5;

	@ManyToOne
	@JoinColumn(name = "projeto_id")
	private Projeto projeto;
	
	@OneToMany(mappedBy="id.item")
	private List<ItemTag> itensTag = new ArrayList<>();

	public Item() {

	}

	public Item(Integer id, String nome, String descricao, Projeto projeto, String atributo1,
			String atributo2, String atributo3, String atributo4, String atributo5) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.projeto = projeto;
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
		this.atributo4 = atributo4;
		this.atributo5 = atributo5;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public String getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}

	public String getAtributo2() {
		return atributo2;
	}

	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}

	public String getAtributo3() {
		return atributo3;
	}

	public void setAtributo3(String atributo3) {
		this.atributo3 = atributo3;
	}

	public String getAtributo4() {
		return atributo4;
	}

	public void setAtributo4(String atributo4) {
		this.atributo4 = atributo4;
	}

	public String getAtributo5() {
		return atributo5;
	}

	public void setAtributo5(String atributo5) {
		this.atributo5 = atributo5;
	}
	

	public List<ItemTag> getItens() {
		return itensTag;
	}

	public void setItens(List<ItemTag> itens) {
		this.itensTag = itens;
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
		Item other = (Item) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return nome;
	}
}
