package br.senai.sp.jandira.model;

public class Fabricante {

	private String nomeEmpresa;
	private String cidadeEmpresa;
	private String anoCriacao;

	public Fabricante(String nomeEmpresa, String cidadeEmpresa, String anoCriacao) {
		this.anoCriacao = anoCriacao;
		this.cidadeEmpresa = cidadeEmpresa;
		this.nomeEmpresa = nomeEmpresa;

	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

}
