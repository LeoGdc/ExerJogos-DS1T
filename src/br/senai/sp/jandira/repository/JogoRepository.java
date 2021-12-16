package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogos;

public class JogoRepository {

	private Jogos[] lista;

	public JogoRepository() {
		lista = new Jogos[32];
	}

	public JogoRepository(int quantidadeJogos) {
		lista = new Jogos[quantidadeJogos];
	}

	public void gravar(Jogos jogo, int posicao) {
		lista[posicao] = jogo;
	}

	public Jogos listarJogos(int posicao) {
		return lista[posicao];
	}

	public Jogos[] listarTodos() {
		return lista;
	}

	public int getTamanho() {
		return lista.length;
	}
}