package tp5;

public class AssietteRonde extends Assiette {
    private double rayon;

    public AssietteRonde(int anneeFabrication, double rayon) {
        super(anneeFabrication);
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    public double calculerValeur() {
        int age = java.time.Year.now().getValue() - getAnneeFabrication();
        if (age > 50)
            return (age - 50);
        else
            return 0;
    }

    public double calculerSurface() {
        return 3.14 * rayon * rayon;
    }
}
