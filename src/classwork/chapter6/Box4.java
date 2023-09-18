package classwork.chapter6;

public class Box4 {
    double width;
    double height;
    double depth;
    Box4(){
        System.out.println("Construction of Box object");
        width=10;
        height=10;
        depth=10;
    }
    double volume(){
        return height*width*depth;
    }
}
