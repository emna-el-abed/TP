package tp3;

public class Une_adresse {
    public String gouvernat;
    public String ville;
    public int codepostal;

    public Une_adresse (String gouvernat,String ville,int codepostal)
    {
        this.codepostal=codepostal;
        this.gouvernat=gouvernat;
        this.ville=ville;
    }
    public void Afficher_Une_adresse()
    {
        System.out.println(" Gouvernat de cette adresse est : " +gouvernat+ " , ca ville est : " +ville+ " et son code postale est : " +codepostal);
    }
    public void modifier(int c)
    {
        codepostal=c;
    }
    public String toString(){
        return " Gouvernat de cette adresse est : " +gouvernat+ " , ca ville est : " +ville+ " et son code postale est : " +codepostal;
    }


}

