package td4;

public class Test {

	public static void main(String[] args) {
		Librairie lib = new Librairie(4);
		Livre l  = new Livre("Orgueil et Prejuges",1,0.1,"histoire d'amour",622);
		Roman R = new Roman("Le monde sans fin",2,0.1,"ecologie",196,"Jean-Marc Jancovici","Christophe Blain");
		Magazine M = new Magazine("Health Life Magazine",3,0.1,"Magazine",350,1);
		
		lib.inventaire(l.domaine);
		
		Roman R2 = new Roman("Harry Potter",4,0.1,"fantasy",6095,"J.K. Rowling","Bloomsbury Publishing");
		lib.ajoutLiv(R2);
		
		R.afficher();
		R2.afficher();
		System.out.println("le montant de tous les romans disponibles dans la librairie = "+ (R.calculPrix()+ R2.calculPrix()));
		
		Magazine M2 = new Magazine("Nouveau Magazine", 5, 0.1, "News", 50,6);
        //lib.ajoutLiv(M2);
        // il n'ya pas de place pour l'ajouter on  doit supprimer l'un des livres pour le remédier
        lib.suppLiv(1);
        lib.ajoutLiv(M2);
		
		
	}

}
