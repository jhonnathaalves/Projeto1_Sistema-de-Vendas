package model.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private int numeroRua;
	private String bairro;
	private String cep;
	private String estado;
	private String cidade;
	
	private Produto produto;
	
	List<Produto> listProduto = new ArrayList<>();
	
	public Cliente() {
		
	}
	


	public Cliente(Integer id, String nome, String cpf, String telefone, String rua, int numeroRua, String bairro,
			String cep, String estado, String cidade, List<Produto> listProduto) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numeroRua = numeroRua;
		this.bairro = bairro;
		this.cep = cep;
		this.estado = estado;
		this.cidade = cidade;
		this.listProduto = listProduto;
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumeroRua() {
		return numeroRua;
	}

	public void setNumeroRua(int numeroRua) {
		this.numeroRua = numeroRua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Cliente ID:" + id + ", Nome:" + nome + ", CPF:" + cpf + ", Telefone:" + telefone + ", Endereço:" + rua
				+ ", Numero:" + numeroRua + ", Bairro:" + bairro + ", CEP:" + cep + ", Estado: " + estado
				+ ", Cidade:" + cidade;
	}
	

	

}
