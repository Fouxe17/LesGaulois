package personnages;

public class Romain {
	private String nom;
	private int force;
	
	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	
	public int getForce() {
		return force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\'" + texte + "\'");
	}
	
	public String prendreParole() {
		return "Le romain " + nom + ": ";
	}
}
