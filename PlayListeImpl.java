
public class PlayListeImpl extends MusiqueImpl implements PlayListe {
	
	
	
	public final Integer MAX_MUSIQUES=100;
	public String nom;
	public String genre2;
	public Integer nombreTitres;
	public MusiqueImpl[] tableau= new MusiqueImpl[MAX_MUSIQUES];
	
	

	

	

	public PlayListeImpl(String nom, String genre2, Integer nombreTitres, MusiqueImpl[] tableau) {
		super();
		this.nom = nom;
		this.genre2 = genre;
		this.nombreTitres = nombreTitres;
		this.tableau = tableau;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getGenre() {
		return genre2;
	}

	public void setGenre(String genre2) {
		this.genre2 = genre;
	}

	public Integer getNombreTitres() {
		return nombreTitres;
	}

	public void setNombreTitres(Integer nombreTitres) {
		this.nombreTitres = nombreTitres;
	}

	public Musique[] getTableau() {
		return tableau;
	}

	public void setTableau(MusiqueImpl[] tableau) {
		this.tableau = tableau;
	}
	
	
	@Override
	public void aff_Mus_Play(String titre, String genre2) {
		for (Integer i=0 ; i < MAX_MUSIQUES; tableau[i] !=   ; i++)  
		    aff_Mus_Play(tableau[i].titre , tableau[i].genre);
		    System.out.println("Le nom : "+titre+" Le genre : "+genre2);
		
	}

	@Override
	public void add_Mus_Play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove_Mus_Play() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tri_Auteur() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void tri_Interprete() {
		// TODO Auto-generated method stub
		
	}

	

	
		
	

	
	
	
	
	
	
	
	
		

}
