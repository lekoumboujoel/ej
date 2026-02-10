
public class Mur extends Bloc {
    private boolean isPorteur;

    public Mur(int largeur, int longueur, int hauteur, boolean isPorteur) {

        super(largeur, longueur, hauteur);
        this.isPorteur = isPorteur;
        this.couleur = Couleur.gris;
    }

    public boolean estTraversable(){
        return !isPorteur;
    }
}
