package tp3;

public class Un_laboratoire {
    String nom;
    String spécialité;
    int nb_bureaux;
    public Une_adresse a;
    public Un_bureau b[];

    public Un_laboratoire(String nom,String spécialité,int nb_bureaux,Une_adresse a ,Un_bureau b1[])
    {
        this.nom=nom;
        this.spécialité=spécialité;
        this.a=a;
        this.b =new Un_bureau[50];
        this.b=b1;
    }
    public void Afficher_Un_laboratoire() {
        System.out.println(" le nom de ce laboratoire est : " +nom+ " , sa spécialité est : " +spécialité+ " , le nbr de bureaux est : " +nb_bureaux+ " , sa adresse est :  " +a+ " et sa bureau est : " +b);
        this.a.Afficher_Une_adresse();
        int i;
        int n=this.b.length;
        for (i=0;i<n;i++){
            this.b[i].Afficher_Un_bureau();
        }

    }
    public String toString(){
        String result=" le nom de laboratoire est : " +nom+ " , la specialité est : "+spécialité ;

        result+=spécialité;
        result += " , l'adresse est : " +a;
        int i;
        int n=this. b. length;
        for (i=0; i<n; i++){
            result+=this.b[i];
        }
        for (Un_bureau bb:b)
        {
            if (bb!=null)
                result += bb;
        }
        return result;
    }
}

