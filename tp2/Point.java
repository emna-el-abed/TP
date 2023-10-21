package tp2;
//Fichier Point.java
public class Point
{
    //deux attributes contenant les informations de l'abscisse et l'ordonnee de type int
    int abs;
    int ord;
    static int nombre;
    int numero;

    //constructeur
    Point()
    {
        abs = 0;
        ord = 0;
        numero = ++nombre;
    }
    Point(int u , int v)
    {
        abs = u;
        ord = v;
        numero = ++nombre;
    }
    void setCoordoneePoint(int u , int v)
    {
        abs = u;
        ord = v;
    }
    //methode permettant de changer les coordonnees d'un point
    void setCoordoneePoint(Point p)
    {
        abs = p.abs;
        ord = p.ord;
    }

    //methode permettant de translater un point
    void translate(int u, int v)
    {
        abs = abs + u;
        ord = ord + v;
    }
    //une methode
    void affichePoint()
    {
        System.out.println("le Point numéro " + numero+ ":");
        System.out.println("l'abscisse est : "+abs);
        System.out.println("l'ordonnée est : "+ord);
    }
    boolean origine()
    {
        if (abs == 0 && ord == 0 )
        {
            return true;
        }
        return false;
    }
    boolean egale(Point q)
    {
        if ((abs == q.abs) && (ord == q.ord))
        {
            return true;
        }
        return false;
    }
    Point symetrie()
    {
        return new Point(- abs, - ord);
    }

    public void setCoordonePoint() {
    }
}
