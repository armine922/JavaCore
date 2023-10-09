package classwork.chapter8;

public class AbstarctAreas {
    public static void main(String[] args) {
//        Figures f = new Figures(10,10);
        Rectangles r= new Rectangles(9,5);
        Triangles t = new Triangles(10,8);
        Figures figref;
        figref =r;
        System.out.println(figref.area());
        figref = t;
        System.out.println(figref.area());

    }
}
