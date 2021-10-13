
public class MusiqueImpl implements Musique {
	
	public String titre;
	public String autheur;
	public String interprete;
	public String genre;
	public boolean verif;
	
	
	public MusiqueImpl() {
		super();
	}

	public MusiqueImpl(String titre, String autheur, String interprete, String genre) {
		super();
		this.titre = titre;
		this.autheur = autheur;
		this.interprete = interprete;
		this.genre = genre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAutheur() {
		return autheur;
	}

	public void setAutheur(String autheur) {
		this.autheur = autheur;
	}

	public String getInterprete() {
		return interprete;
	}

	public void setInterprete(String interprete) {
		this.interprete = interprete;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public boolean isVerif() {
		return verif;
	}

	public void setVerif(boolean verif) {
		this.verif = verif;
	}
	
	
	

	@Override
	public void affichMusqiue(String titre,String autheur, String interprete, String genre) {
		
		System.out.println("Le titre : "+titre+" L'autheur : "+autheur+"L'interprete :"+interprete+" Le genre : "+genre);
		
		
	}

	@Override
	public boolean verifMusique(Musique m1, Musique m2) {
		if   (m1==m2)
		     verif=true;
		else verif = false;	
		return verif;
	}
	
	@Override
	public void aff_Mus_Play(String titre, String genre) {
		
	}
	@Override
	public void add_Mus_Play(MusiqueImpl[] playliste, MusiqueImpl m2 ) {
	

	}
	

}
