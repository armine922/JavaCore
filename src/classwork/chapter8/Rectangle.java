package classwork.chapter8;

public class Rectangle extends Figure {
    Rectangle(double a, double b){
    super(a,b);}
    double area(){
        System.out.println("Square area is");
        return dim1*dim2;
    }
}
