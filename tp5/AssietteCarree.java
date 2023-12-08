package tp5;

public class AssietteCarree extends Assiette {
        private double cote;

        public AssietteCarree(int anneeFabrication, double cote) {
            super(anneeFabrication);
            this.cote = cote;
        }

        public double getCote() {
            return cote;
        }

        public void setCote(double cote) {
            this.cote = cote;
        }

        public double calculerValeur() {
            int age = java.time.Year.now().getValue() - getAnneeFabrication();
            if (age > 50)
                return ((age-50)*5);
            else
                return 0;
        }

        public double calculerSurface() {
            return cote * cote;
        }
}
