package fr.uvsq.pglp_3.LSP;

/**
 * classe représentant une coordonnée sur un plan 2D
 * avec une valeur x et y.
 */
public class Position {
	/**
	 * valeur de l'abscisse.
	 */
	public int x;
	/**
	 * valeur de l'ordonnée.
	 */
	public int y;
	/**
	 * constructeur de la classe avec initialisation.
	 * des coordonnées à x =0 et y = 0.
	 */
	public Position() {
		x = 0;
		y = 0;
	}
	/**
	 * constructeur de la classe.
	 * @param x initialise x
	 * @param y initialise y
	 */
	public Position(final int x, final int y) {
		this.x = x;
		this.y = y;
	}
	/**
	 * convertit les coordonnées au format String.
	 * @return représentation au format String de la classe
	 */
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}