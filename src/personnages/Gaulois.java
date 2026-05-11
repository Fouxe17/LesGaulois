package personnages;

import village_gaulois.Village;

public class Gaulois {
	private String nom;
	private int force;
	private Village village;
	
	public Gaulois(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;
		this.village = null;
	}
		
	public void setVillage(Village nouveau_village) {
		this.village = nouveau_village;
	}

	public int getForce() {
		return this.force;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "\'" + texte + "\'");
	}
	
	public String prendreParole() {
		return "Le gaulois " + nom + ": ";
	}
	
	public void sePresenter()
	{
		if (this.village.getChef() == this) {
			System.out.println("Bonjour je m'appelle "+ this.getNom()+ ". Je suis le chef du village !");
		} else {
			if (this.village != null) {
				System.out.println("Bonjour je m'appelle "+this.getNom()+". Je suis un habitant du village !");
			} else {
				System.out.println("Bonjour ke m'appelle "+this.getNom()+". Je n'ai pas de village !");
			}
		}
	}
}
