package br.senai.sp.jandira.model;

public enum Console {

	PLAYSTATION("Playstation"), XBOX("Xbox"), NINTENDO("Nintendo"), PC("PC");

	private Console(String descricao) {
		this.descricao = descricao;
	}

	private String descricao;

	private Console() {

	}

	public String getDescricao() {
		return descricao;
	}
}
