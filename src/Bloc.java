public abstract class Bloc implements IBloc{
    protected int longueur;
    protected int largeur;
    protected int hauteur;
    protected Couleur couleur;

    public Bloc(int largeur, int longueur, int hauteur) {
        this.largeur = largeur;
        this.longueur = longueur;
        this.hauteur = hauteur;
    }

    public int getLongueur() {
        return longueur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }
}
