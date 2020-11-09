package numbers;

public class Circle {

    double pi= 3.14;
    double d;

    public Circle(double d) {
        this.d = d;
    }
    public double perimeter(){

        return d*pi;

    }

    public double area(){

        return (d/2.0)*(d/2.0)*pi;

    }

}
