package tp3;

public class Un_bureau {
    public int code;
    public String nom;
    public Un_chercheur c[];

    public Un_bureau(int code,String nom, Un_chercheur c1[]){
        this.code=code;
        this.nom=nom;
        this.c=new Un_chercheur[5];
        this.c=c1;
    }
    public void Afficher_Un_bureau(){
        System.out.println(" le code de cet bureau est : " +code+ " , son nom est : " +nom);
    int i;
    int n=this.c.length;
    for(i=0;i<n;i++){
        this.c[i].Afficher_Un_chercheur();
        System.out.println(this.c[i].toString());
    }
    }
    public String toString(){
        String result=" le code de cet bureau est : " +code+ " , son nom est : " +nom;
        int i;
        int n=this.c.length;
        for(i=0;i<n;i++){
            result+=this.c[i].toString();
        }
        return result;
    }


}

