package br.arquitetura.dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tratamento")
public class Tratamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String descricao;
	
	@ManyToOne()
	@JoinColumn(name="id_categoria_tratamento", referencedColumnName="id")
	private CategoriaTratamento categoriaTratamento;

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDescricao() {
		return descricao;
	}


	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}


	public CategoriaTratamento getCategoriaTratamento() {
		return categoriaTratamento;
	}


	public void setCategoriaTratamento(CategoriaTratamento categoriaTratamento) {
		this.categoriaTratamento = categoriaTratamento;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}
