package tp1;

import static java.lang.System.out;

public class Main {
    public  static void main(String[] args)
    {
            exer3 R1 = new exer3();
            out.println("la longeur 12 et le  largeur 9" + R1.diagonale(12, 9));
            out.println("la longeur 15 et la largeur 10" + R1.doubler(15, 10));
            out.println("la longeur 30 et de largeur 9" + R1.perimetre(30, 9));
    }
}

