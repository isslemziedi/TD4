package td4;

public class Livre {
	protected String Nom ;
	protected int id ;
	protected final double TVA=0.1 ;
	protected String domaine ;
	protected int nbPages;
	
	Livre (String Nom,int id,double TVA,String domaine,int nbPages){
		this.Nom=Nom;
		this.id=id;
		this.domaine=domaine;
		this.nbPages=nbPages;
	}
	
	@Override public String toString() {
		return ("le livre de titre : '"+Nom+"' a l'identifiant : '"+id+" et son domaine est : '"+domaine+"et a "+nbPages+" pages ");
		
	}
	public double calculPrix() {
		double prix=0;
		prix = (0.75 * nbPages)*(1+TVA);
		return prix ;
	}
	

}
