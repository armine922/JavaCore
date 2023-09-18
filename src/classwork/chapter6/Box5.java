package classwork.chapter6;

public class Box5 {
    double width;
    double height;
    double depth;
    Box5(double w,double h, double d){
        width=w;
        height=h;
        depth=d;
    }
    double volume(){
        return width*height*depth;
    }
}
