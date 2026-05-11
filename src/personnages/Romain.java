package personnages;

import objets.Equipement;

public class Romain {
	private String nom;
	private int force;
	private Equipement[] equipements;
	private int nbEquipements;

	public Romain(String nom, int force) {
		super();
		this.nom = nom;
		this.force = force;

		this.equipements = new Equipement[2];
		this.nbEquipements = 0;
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

	public void sEquiper(Equipement equipement) {
		if (this.nbEquipements == 2) {
			System.out.println("Le soldat " + this.getNom() + " est déjà bien protégé !");
		} else {
			boolean obtained = false;

			for (Equipement current : this.equipements) {
				if (current == null)
				{
					continue;
				}
				
				if (current.getNom() == equipement.getNom()) {
					System.out.println("Le soldat " + this.getNom() + " possède déjà un " + current.getNom() + " !");
					obtained = true;
					break;
				}
			}

			if (!obtained) {
				this.equipements[this.nbEquipements] = equipement;
				this.nbEquipements++;
				System.out.println(
						"Le soldat " + this.getNom() + " est désormais armé d'un " + equipement.getNom() + " !");
			}
		}
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);

		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);
	}
}
