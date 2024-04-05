package com.exercicesbasic03programeio.model;

public class Agenda {
	
	private String descricao;
	private String nome;
	private String telefone;
	private String endereco;
	private String cep;
	
	public Agenda() {}

	public Agenda(String descricao, String nome, String telefone, String endereco, String cep) {
		super();
		this.descricao = descricao;
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.cep = cep;
	}
	
	public void agendaPrinter() {
		System.out.println("==================================================");
		System.out.println("DESCRICAO: " + this.descricao);
		System.out.println("NOME: " + this.nome);
		System.out.println("TELEFONE: " + this.telefone);
		System.out.println("ENDERECO: " + this.endereco);
		System.out.println("CEP: " + this.cep);
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	@Override
	public String toString() {
		return "Agenda [descricao=" + descricao + ", nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco
				+ ", cep=" + cep + "]";
	}

}
