package td4;

public class Librairie {
	private Livre Livre_Liste[];
	private int capacite;
	private int nb;
	
	Librairie(int capacite){
		this.capacite=capacite;
		Livre_Liste= new Livre[capacite];
		this.nb=0;
	}
	
	int getNb() {
		return this.nb;
	}

	public void inventaire() {
		for(int i=0;i<nb;i++) {
			System.out.println(" la listes des livre : \n"+Livre_Liste[i].Nom+" et son prix= "+Livre_Liste[i].calculPrix());
		}
	}
	public void inventaire(String categ) {
		for(int i=0;i<nb;i++) {
			if(Livre_Liste[i].getClass().getSimpleName().equals(categ)) {
				System.out.println(" la listes des livre : \n"+Livre_Liste[i].Nom+" et son prix= "+Livre_Liste[i].calculPrix());
			}
		}
	}
	
	public void ajoutLiv(Livre liv) {
		if(this.nb>capacite) {
			Livre_Liste[nb]=liv;
			nb++;
		}
		else {
			System.out.println("la capacite maximale des livres est sature");
		}
	}
	
	public void suppLiv(int num) {
		for(int i=0;i<nb;i++) {
			if((Livre_Liste[i].id == num)&&(Livre_Liste[i]!= null)){
				Livre_Liste[i]=null;
				this.nb--;
				break;
			}
		}	
	}
}
