package tp5;

public class Collection {
    public static void main(String[] args) {
        Ustensile[] us = new Ustensile[5];
        us[0] = new AssietteCarree(1934, 4.0);
        us[1] = new Cuillere(1950, 3.5);
        us[2] = new Cuillere(1975, 5.0);
        us[3] = new AssietteRonde(1999, 5.5);
        us[4] = new Cuillere(1980, 3.0);

        afficherCuilleres(us);
        afficherSurfaceAssiettes(us);
        afficherValeurTotale(us);
    }

    public static void afficherCuilleres(Ustensile[] ust) {
        int nbr = 0;
        for (Ustensile i : ust) {
            if (i instanceof Cuillere) {
                nbr++;
            }
        }
        System.out.println("Dans cette collection il y a " + nbr +" cuillères .");
    }

    public static void afficherSurfaceAssiettes(Ustensile[] ust) {
        double surfaceTotale = 0;
        for (Ustensile i : ust) {
            if (i instanceof Assiette) {
                surfaceTotale += ((Assiette) i).calculerSurface();
            }
        }
        System.out.println("La surface totale des assiettes est : " + surfaceTotale +" .");
    }

    public static void afficherValeurTotale(Ustensile[] ust) {
        double valeurTotale = 0;
        for (Ustensile ustensile : ust) {
            valeurTotale += ustensile.calculerValeur();
        }
        System.out.println("la valeur totale de la collection est : " + valeurTotale+" .");
    }
}
