package tp2;

public class TestPoint
{
    public static void main(String[]args)
    {
        Point p1 = new Point(6,4);
        System.out.println(" A l'origine p1 est : " +p1.origine());

        Point p2 = new Point();
        p2.setCoordonePoint();
        System.out.println("A l'origine p2 est : " +p2.origine());

        p2.setCoordoneePoint(p1);
        p1.affichePoint();
        p2.affichePoint();

        Point p = new Point();
        Point q = new Point();
        p.setCoordoneePoint(5,6);
        q.setCoordoneePoint(5,6);
        System.out.println("p et q sont égaux : " +p.egale(q));

        p1.translate(4,4);
        p1.affichePoint();
        Point p4 = p1.symetrie();
        p4.affichePoint();
    }
}
