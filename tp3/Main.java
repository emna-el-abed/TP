package tp3;
public class Main {
    public static void main(String[] args) {
        Une_adresse a1 = new Une_adresse("Sfax", "kerkennah", 3035);
        a1.Afficher_Une_adresse();
        a1.modifier(5600);
        a1.Afficher_Une_adresse();

        Une_adresse a2 = new Une_adresse("Sfax", "manzel chaker", 7100);
        a2.Afficher_Une_adresse();
        a2.modifier(4600);
        a2.Afficher_Une_adresse();

        Un_chercheur c1 = new Un_chercheur("emna", "etudiante", 2);
        c1.Afficher_Un_chercheur();
        c1.nom = "rahma";
        c1.post = "architecteur";
        c1.nb_ord = 2;
        c1.Afficher_Un_chercheur();

        Un_chercheur c2 = new Un_chercheur("imen", "developpeur", 4);
        System.out.println("toString");
        System.out.println(c1);
        String x = c1.toString();
        System.out.println("le nombre de chercheurs : " + c1.nbc);
        boolean tes = c1.comparer(c2);
        if (tes) {
            System.out.println("Les deux chercheurs sont identiques.");
        } else {
            System.out.println("Les deux chercheurs sont différents.");
        }
        c2.modifier(18);
        c1.modifier(20);

        Un_chercheur c3 = new Un_chercheur();
        c3.ajouter("siwar", "professeur", 1);
        c3.Afficher_Un_chercheur();
        System.out.println("Nombre de chercheurs est : " + c1.nbc);

        Un_chercheur[] CT = {c1, c2, c3};
        Un_bureau b1 = new Un_bureau(123, "bureau1", CT);
        Un_bureau b2 = new Un_bureau(456, "bureau2", CT);
        Un_bureau[] BT = {b1, b2};

        Une_adresse labd1 = new Une_adresse("Tunis", "SidiBouzid", 9100);
        Un_laboratoire l = new Un_laboratoire("laboratoire1", "cybersecurity", 5, labd1, BT);

        System.out.println("..........................");
        l.Afficher_Un_laboratoire();

    }
}



