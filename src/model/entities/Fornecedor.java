package model.entities;

import java.io.Serializable;

public class Fornecedor implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String RazaoSocial;
	private String CNPJ;
	private String email;
	private String telefone;
	
	public Fornecedor() {
		
	}

	public Fornecedor(Integer id, String razaoSocial, String cNPJ, String email, String telefone) {
		this.id = id;
		RazaoSocial = razaoSocial;
		CNPJ = cNPJ;
		this.email = email;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRazaoSocial() {
		return RazaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		RazaoSocial = razaoSocial;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Fornecedor [id=" + id + ", RazaoSocial=" + RazaoSocial + ", CNPJ=" + CNPJ + ", email=" + email
				+ ", telefone=" + telefone + "]";
	}
	
	

}
