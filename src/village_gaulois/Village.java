package village_gaulois;

import java.util.Arrays;

import personnages.Gaulois;

public class Village {
	private int nbVillageois;
	private String nom;
	private Gaulois chef;
	private Gaulois[] villageois;

	public Village(String nom, Gaulois chef, int taille) {
		this.nom = nom;
		this.chef = chef;
		this.villageois = new Gaulois[taille];
		this.nbVillageois = 0; // Sera rempli au fur à mesure.

		ajouterVillageois(chef);
	}

	public String getNom() {
		return nom;
	}

	public Gaulois getChef() {
		return chef;
	}

	public void ajouterVillageois(Gaulois gaulois) {
		if (this.nbVillageois == this.villageois.length) {
			System.out.println("Il n'y a plus de place !");
			return;
		}

		this.villageois[this.nbVillageois] = gaulois;
		gaulois.setVillage(this);
		this.nbVillageois++;
	}

	public Gaulois trouverVillageois(int num) {
		if (num-1 > this.nbVillageois) {
			System.out.println("Il n'y a pas autant de villageois !");
			return null;
		}

		return this.villageois[num-1];
	}

	public void afficherVillage() {
		
		System.out.print("Village nbVillageois=" + nbVillageois + ", nom=" + nom + ", chef=" + chef.getNom() + ", villageois = ");
		for (Gaulois gaulois : villageois) {
			if (gaulois == null)
			{
				break;
			}
			
			System.out.print(gaulois.getNom()+" ");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Village village = new Village("Village des Irréductibles", abraracourcix, 30);

		Gaulois asterix = new Gaulois("Astérix", 6);

		village.ajouterVillageois(asterix);

		Gaulois gaulois = village.trouverVillageois(1);

		System.out.println(gaulois);

		gaulois = village.trouverVillageois(2);
		
		System.out.println(gaulois);
		
		village.afficherVillage();
		
		Gaulois obelix = new Gaulois("Obélix", 25);
		village.ajouterVillageois(obelix);
		
		obelix.sePresenter();
	}

}
