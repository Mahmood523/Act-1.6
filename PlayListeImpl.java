
public class PlayListeImpl extends MusiqueImpl implements PlayListe {
	
	
	
	public final Integer MAX_MUSIQUES=100;
	public String nom;
	public String genre2;
	public Integer nombreTitres;
	public MusiqueImpl[] playliste= new MusiqueImpl[MAX_MUSIQUES];
	
	
	
	

	

	

	public PlayListeImpl(String nom, String genre2, Integer nombreTitres, MusiqueImpl[] tableau) {
		super();
		this.nom = nom;
		this.genre2 = genre;
		this.nombreTitres = nombreTitres;
		this.playliste = tableau;
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
		return playliste;
	}

	public void setTableau(MusiqueImpl[] playliste) {
		this.playliste = playliste;
	}
	
	
	@Override
	public void aff_Mus_Play(String titre, String genre2) {
		for (Integer i=0 ; i < MAX_MUSIQUES  ; i++) {  
		    aff_Mus_Play(playliste[i].titre , playliste[i].genre);
		    System.out.println("Le nom : "+titre+" Le genre : "+genre2);
		}
	}

	@Override
	public void add_Mus_Play(MusiqueImpl[] playliste, MusiqueImpl m2 ) {
		MusiqueImpl[] playliste1 = new MusiqueImpl[] {m2};
		MusiqueImpl[] playliste2 = new MusiqueImpl[MAX_MUSIQUES];
		
		Integer position = 0 ;
		for (MusiqueImpl objet : playliste) 
		{ 
		  playliste2[position] = objet ;
		  position++;
		}
		for (MusiqueImpl objet : playliste1)
		{
		  playliste2[position] = objet;
		  position++;
		}
      playliste = playliste2; 	
	}
	

	@Override
	public void remove_Mus_Play(boolean verif ) {
		if (verif == true)
		   playliste = playliste1;
		else 
		   
		
		   
		   
		
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
