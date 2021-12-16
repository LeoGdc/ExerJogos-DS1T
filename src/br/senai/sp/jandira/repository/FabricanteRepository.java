package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {

	Fabricante[] fabricante;

	public FabricanteRepository() {
		this.fabricante = new Fabricante[10];
		fabricante[0] = new Fabricante("Ubisoft", "Montreuil, França", "1986");
		fabricante[1] = new Fabricante("Nintendo", "Quioto, Quioto, Japão", "1889");
		fabricante[2] = new Fabricante("Rockstar Games", "Nova Iorque, Nova York, EUA", "1998");
		fabricante[3] = new Fabricante("Electronic Arts", "Redwood City, California, EUA", "1982");
		fabricante[4] = new Fabricante("Sony Computer Entertainment", "San Mateo, Califónia, EUA", "1993");
		fabricante[5] = new Fabricante("Capcom Company", "Osaka, Osaka, Japão", "1979");
		fabricante[6] = new Fabricante("Epic Games", "Cary, Carolina do Norte, EUA", "1991");
		fabricante[7] = new Fabricante("Activion Blizzard", "Santa Mônica, Califórnia, EUA", "2008");
		fabricante[8] = new Fabricante("Valve Corporation", "Bellevue, Washington, EUA", "1996");
		fabricante[9] = new Fabricante("Mojang", "Estocomo, Suécia ", "2009");
	}

	public Fabricante[] getFabricante() {
		return fabricante;
	}

	public void setFabricantes(Fabricante[] fabricantes) {
		this.fabricante = fabricantes;
	}

	public Fabricante listarFabricante(int posicao) {
		return fabricante[posicao];
	}

	public int getlegth() {
		return fabricante.length;
	}
}