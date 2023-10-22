package td4;

public class Magazine extends Livre{
	private int mois_parution;
	
	Magazine(String Nom,int id,double TVA,String domaine,int nbPages,int mois_parution){
		super(Nom,id,TVA,domaine,nbPages);
		this.mois_parution=mois_parution;
	}
	@Override public String toString() {
		return (super.toString()+ "et mois parution : '"+mois_parution+"' ");
	}
	public void afficher() {
		System.out.println(this);
	}
	
	public double calculPrix(int bonus) {
		double prix=0;
		prix = (0.35*nbPages)*(1+TVA)+bonus;
		return prix ;
	}

}
