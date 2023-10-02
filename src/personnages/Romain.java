package personnages;

public class Romain {
	private String nom;
	private int force;
	public Romain(String nom, int force) {
		this.nom = nom;
		if (force < 0) {
			this.force = -1;
		} else {
			this.force = force;
		}
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	public void recevoirCoup(int forceCoup) {
		assert force >= 0: "La force du romain ne peut pas être négative";
		int forceAvant = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force < forceAvant: "La force du romain n'a pas diminué";
	}
	public static void main(String[] args) {
		Romain romain = new Romain("Minus", 6);
		System.out.println(romain.prendreParole());
		romain.parler("Bonjour");
		romain.recevoirCoup(1);
	}
}
