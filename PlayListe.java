
public interface PlayListe {
  
   public abstract void aff_Mus_Play(String titre, String genre);
   public abstract void add_Mus_Play(MusiqueImpl[] playliste, MusiqueImpl m2);
   public abstract void remove_Mus_Play(boolean verif);
   public abstract void tri_Auteur();
   public abstract void tri_Interprete();
}
