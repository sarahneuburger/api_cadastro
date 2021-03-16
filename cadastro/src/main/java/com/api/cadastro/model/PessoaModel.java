package com.api.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pessoas")
public class PessoaModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idPessoa")
	private Integer idPessoa;
	
	@Column(name = "nomePessoa")
	private String nomePessoa;
	
	@Column(name = "enderecoPessoa")
	private String enderecoPessoa;
	
	@Column(name = "numeroEndPessoa")
	private String numeroEndPessoa;
	
	@Column(name = "complementoEndPessoa")
	private String complementoEndPessoa;
	
	@Column(name = "bairroEndPessoa")
	private String bairroEndPessoa;
	
	@Column(name = "cidadeEndPessoa")
	private String cidadeEndPessoa;
	
	@Column(name = "telefonePessoa")
	private String telefonePessoa;

	public Integer getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(Integer idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public String getEnderecoPessoa() {
		return enderecoPessoa;
	}

	public void setEnderecoPessoa(String enderecoPessoa) {
		this.enderecoPessoa = enderecoPessoa;
	}

	public String getNumeroEndPessoa() {
		return numeroEndPessoa;
	}

	public void setNumeroEndPessoa(String numeroEndPessoa) {
		this.numeroEndPessoa = numeroEndPessoa;
	}

	public String getComplementoEndPessoa() {
		return complementoEndPessoa;
	}

	public void setComplementoEndPessoa(String complementoEndPessoa) {
		this.complementoEndPessoa = complementoEndPessoa;
	}

	public String getBairroEndPessoa() {
		return bairroEndPessoa;
	}

	public void setBairroEndPessoa(String bairroEndPessoa) {
		this.bairroEndPessoa = bairroEndPessoa;
	}

	public String getCidadeEndPessoa() {
		return cidadeEndPessoa;
	}

	public void setCidadeEndPessoa(String cidadeEndPessoa) {
		this.cidadeEndPessoa = cidadeEndPessoa;
	}

	public String getTelefonePessoa() {
		return telefonePessoa;
	}

	public void setTelefonePessoa(String telefonePessoa) {
		this.telefonePessoa = telefonePessoa;
	}

	public PessoaModel(Integer idPessoa, String nomePessoa, String enderecoPessoa, String numeroEndPessoa,
			String complementoEndPessoa, String bairroEndPessoa, String cidadeEndPessoa, String telefonePessoa) {
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.enderecoPessoa = enderecoPessoa;
		this.numeroEndPessoa = numeroEndPessoa;
		this.complementoEndPessoa = complementoEndPessoa;
		this.bairroEndPessoa = bairroEndPessoa;
		this.cidadeEndPessoa = cidadeEndPessoa;
		this.telefonePessoa = telefonePessoa;
	}
	
	public PessoaModel() {
	}
}
