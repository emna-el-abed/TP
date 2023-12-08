package tp5;

public abstract class Assiette extends Ustensile {
        public Assiette(int anneeFabrication) {
            super(anneeFabrication);
        }

        public abstract double calculerSurface();
}
