package tp2;

public class Main {
    public static void main(String[] args)
    {
        livre l1 = new livre (125466132 , " power of mind " , " jonson " , 125.40 );

        System.out.println ("Cette id : " + l1.getId() + " est du livre : " + l1.getTitre() + " est ecrit par " + l1.getAuteur() + " et son prix est " + l1.getPrix() );
    }

}
