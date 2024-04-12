package Area;

import java.awt.geom.Area;
import java.security.PublicKey;

public class Square {
    public Square(int l){
        System.out.println("Area of Square = " + l*l);
    }

    public Square(int l, int b){
        System.out.println("Area of Rectangle = " + l*b);
    }

    public Square(double r){
        System.out.println("Area of circle = " + 3.142*r*r);
    }

    public Square(double b, double h){
        System.out.println("Area of triangle = " + 0.5*b*h);
    }
}
