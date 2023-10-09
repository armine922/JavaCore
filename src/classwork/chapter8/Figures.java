package classwork.chapter8;

 abstract class Figures {
    double dim1;
    double dim2;
    Figures(double a, double b){
       dim1=a;
       dim2=b;
    }
    abstract double area();
}
 class Rectangles extends Figures{
    Rectangles(double a, double b){
        super(a,b);
    }
        double area(){
            System.out.println("For rectangle area :");
            return dim1*dim2;
        }
    }

 class Triangles extends Figures{
    Triangles(double a, double b){
        super(a,b);

    }
    double area(){
        System.out.println("For triangle area:");
        return dim1*dim2/2;
    }
 }