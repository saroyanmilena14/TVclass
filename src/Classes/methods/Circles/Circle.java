package Classes.methods.Circles;

    public class Circle {

       private double Radius;
       private double x=5;
       private double y=6;


    public Circle (double r, double x1, double y1) {
        x=x1; y=y1;
        setRadius(r);
    }


    public Circle (double r1) {
        setRadius(r1);
    }

    public double LengthofCircle () {
        double C=0;
        if(Radius>0) {
            C=2*3.14*Radius;
        } else {
            System.out.println("the value of radius is 0 or negative");
        }
        return C;
    }

    public double SofCircle () {
        double S=0;
        if(Radius>0) {
            S=3.14*(Radius*Radius);
        } else {
            System.out.println("the value of radius is 0 or negative");
        }
        return S;
    }

    public void setRadius(double R) {
        if (R > 0) {
            Radius = R;
        } else {
            System.out.println("invalid input");
        }
    }
     public double getRadius() {
            return Radius;
        }

     public double getX() {
        return x;
     }
     public double getY () {
        return y;
     }
    }

