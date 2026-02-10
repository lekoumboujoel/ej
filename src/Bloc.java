public abstract class Bloc {
    protected int longueur;
    protected int largeur;
    protected int hauteur;

    public Bloc(int largeur, int longueur, int hauteur) {
        this.largeur = largeur;
        this.longueur = longueur;
        this.hauteur = hauteur;
    }

    public int getLongueur() {
        return longueur;
    }

    public int getLargeur() {
        return largeur;
    }

    public int getHauteur() {
        return hauteur;
    }
}
