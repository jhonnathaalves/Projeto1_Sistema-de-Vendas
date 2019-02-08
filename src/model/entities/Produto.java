package model.entities;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Integer qt;
	private Double preço;
	private Double precoTotal;
	
	public Produto() {
	}

	public Produto(Integer id, String nome, Integer qt, Double preço) {
		super();
		this.id = id;
		this.nome = nome;
		this.qt = qt;
		this.preço = preço;
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

	public Integer getQt() {
		return qt;
	}

	public void setQt(Integer qt) {
		this.qt = qt;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
	public double precoTotal(int quantidade, double preço) {
		this.precoTotal = quantidade * preço;
		return precoTotal;
	}

	@Override
	public String toString() {
		return "Produto id:" + id + ", nome:" + nome + ", qt:" + qt + ", preço unit:" + preço + ", preço total: " + precoTotal;
	}
	

}
