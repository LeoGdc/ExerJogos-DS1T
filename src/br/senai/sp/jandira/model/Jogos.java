package br.senai.sp.jandira.model;

public class Jogos {

	private Fabricante fabricante;
	private String jogo;
	private String Observacao;
	private Console console;
	private boolean zerado;

	private double valor;
	

	// nome do jogo
	public void setNome(String nome) {
		this.jogo = nome;
	}

	public String getObservacao() {
		return Observacao;
	}

	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

	public String getValor() {
		String valorString = String.valueOf(this.valor);
		return valorString; 
	}

	public void setValor(String valorString) {
		double valor = Double.parseDouble(valorString);
		this.valor = valor;
	}

	public String getNome() {
		return this.jogo;
	}

	// fabricante
	public Fabricante getFabricante() {
		return this.fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public Console getConsole() {
		return this.console;
	}

	public void setConsole(Console console) {
		this.console = console;
	}

	public boolean isZerado() {
		return zerado;
	}

	public void setZerado(boolean zerado) {
		this.zerado = zerado;
	}
}