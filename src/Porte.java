public class Porte extends Bloc{

    private boolean Verouille;


    public Porte(int largeur, int longueur, int hauteur, boolean Verouille) {
        super(largeur, longueur, hauteur);
        this.Verouille = Verouille;

    }

    public boolean isVerouille(boolean verouille){
        if(verouille){
            return true;
        }
        else return false;
    }
}
