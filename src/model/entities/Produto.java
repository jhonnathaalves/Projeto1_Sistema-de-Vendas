package model.entities;

import java.io.Serializable;

public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Integer qt;
	private Double pre�o;
	private Double precoTotal;
	
	public Produto() {
	}

	public Produto(Integer id, String nome, Integer qt, Double pre�o) {
		super();
		this.id = id;
		this.nome = nome;
		this.qt = qt;
		this.pre�o = pre�o;
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

	public Double getPre�o() {
		return pre�o;
	}

	public void setPre�o(Double pre�o) {
		this.pre�o = pre�o;
	}
	
	public double precoTotal(int quantidade, double pre�o) {
		this.precoTotal = quantidade * pre�o;
		return precoTotal;
	}

	@Override
	public String toString() {
		return "Produto id:" + id + ", nome:" + nome + ", qt:" + qt + ", pre�o unit:" + pre�o + ", pre�o total: " + precoTotal;
	}
	

}
