
public class Mur extends Bloc {
    private boolean isPorteur;

    public Mur(int largeur, int longueur, int hauteur, boolean isPorteur) {
        super(largeur, longueur, hauteur);
    }

    public boolean isTraversable(boolean isPorteur){
        if(isPorteur){
            return true;
        }
        else return false;
    }
}
