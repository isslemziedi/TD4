package td4;

public class Roman extends Livre{
	private String Nom_Aut;
	private String Nom_Edit;
	
	Roman(String Nom,int id,double TVA,String domaine,int nbPages,String Nom_Aut,String Nom_Edit){
		super(Nom,id,TVA,domaine,nbPages);
		this.Nom_Aut=Nom_Aut;
		this.Nom_Edit=Nom_Edit;
		
		
	}
	
	@Override public String toString() {
		return (super.toString()+ " de l'auteur : '"+Nom_Aut+"' et d'editeur :'"+Nom_Edit+"' ");
	}
	public void afficher() {
		System.out.println(this);
	}
	
	public double calculPrix() {
		double prix=0;
		prix = (0.05*nbPages)*(1+TVA);
		return prix ;
	}

}
