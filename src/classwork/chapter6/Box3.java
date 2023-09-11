package classwork.chapter6;

public class Box3 {
    double width;
    double height;
    double depth;

    double volume() {
        return width * height * depth;
    }
    void setDim(double d,double w,double h){
        depth=d;
        width=w;
        height=h;
    }

}
