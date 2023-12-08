package tp5;

public class Cuillere extends Ustensile{
    private double longueur;

    public Cuillere(int anneeFabrication, double longueur) {
        super(anneeFabrication);
        this.longueur = longueur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double calculerValeur() {
        int age = java.time.Year.now().getValue() - getAnneeFabrication();
        if (age > 50)
            return (age - 50);
        else
            return 0;
    }
}
