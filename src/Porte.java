public class Porte extends Bloc{

    private boolean Verouille;


    public Porte(int largeur, int longueur, int hauteur, boolean Verouille) {
        super(largeur, longueur, hauteur);
        this.Verouille = Verouille;

        this.couleur = Couleur.bleu;

    }

    public boolean isVerouille(){
        return Verouille;
    }
}
