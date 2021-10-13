
public interface Musique {
	public abstract void affichMusqiue(String titre,String autheur, String interprete, String genre );
	public abstract boolean verifMusique(Musique m1 , Musique m2);
	public abstract void aff_Mus_Play(String titre, String genre);
	public abstract void add_Mus_Play(MusiqueImpl[] playliste, MusiqueImpl m2 );
	
	

}
