package tp3;

public class Un_chercheur {
    public String nom;
    public String post;
    public int nb_ord;
    public int nbc=0;

    public Un_chercheur(){
        nbc++;
    }
    public String toString(){
        return " le nom de cet chercheur est : " +nom+ " , son post est : " +post+ " et son nombre d'ordinateurs est : " +nb_ord;
    }
    public Un_chercheur(String nom,String post,int nb_ord){
        this.nom=nom;
        this.post=post;
        this.nb_ord=nb_ord;
        nbc++;
    }
    public void Afficher_Un_chercheur(){
        System.out.println(" le nom de cet chercheur est : " +nom+ " , son post est : " +post+ " et son nombre d'ordinateurs est : " +nb_ord);
    }
    public Boolean comparer(Un_chercheur c)
    {
        if (this.nb_ord == c.nb_ord)
        {
            if(this.nom==c.nom)
            {
                if(this.post==c.post)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public void modifier(int c)
    {
        nb_ord = c;
    }
    public void ajouter(String nom,String post,int nb_ord)
    {
        this.nom=nom;
        this.post=post;
        this.nb_ord=nb_ord;
    }

}
