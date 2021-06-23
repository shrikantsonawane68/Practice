

abstract class shape{

    abstract double area();
    abstract double perimeter();
}

class Circle extends shape{

    double r;

    @Override
    double area() {
        return Math.PI*r*r;
    }

    @Override
    double perimeter() {
        return 2*Math.PI*r;
    }
}

class Rectangle extends shape{

    double l,b,h;
    @Override
    double area() {
        return l*b;
    }

    @Override
    double perimeter() {
        return l*b*h;
    }
}

public class AbstractDemo {

    public static void main(String []args){

        Circle c= new Circle();
        c.r = 2.5;
        System.out.println("Area of circle : "+c.area());
        System.out.println("Perimeter of circle : "+c.perimeter());

        Rectangle r=new Rectangle();
        r.l=10;
        r.b=20;
        r.h=10;
        System.out.println("Area of Rectangle : "+r.area());
        System.out.println("Perimeter of Rectangle : "+r.perimeter());

    }
}
