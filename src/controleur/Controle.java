package controleur;

import vue.EntreeJeu;

public class Controle {

	private EntreeJeu frmEntreeJeu;

	/**
	 * Cons_tructeur
	 */
	private Controle() {

		this.frmEntreeJeu = new EntreeJeu();
		this.frmEntreeJeu.setVisible(true);

	}

	/**
	 * Mé_thode d'entrée application
	 */
	public static void main(String[] args) {

		new Controle();

	}
}