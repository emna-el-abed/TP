package tp2;

public class livre
{
    private int id ;
    private String titre ;
    private String auteur ;
    private double prix ;

    public livre(int i, String t, String a, double p) {
        id = i;
        titre = t;
        auteur = a;
        prix = p;
    }

    public void setId(int id)
    {
        this.id = id;
    }
    public void setAuteur(String auteur)
    {
        this.auteur = auteur;
    }

    public void setPrix(double prix)
    {
        this.prix = prix;
    }

    public void setTitre(String titre)
    {
        this.titre = titre;
    }

    public int getId()
    {
        return id;
    }
    public double getPrix()
    {
        return prix;
    }

    public String getAuteur()
    {
        return auteur;
    }

    public String getTitre()
    {
        return titre;
    }
}
