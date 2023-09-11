package classwork.chapter6;

public class BoxDemo4 {
    public static void main(String[] args) {
        double vol;
        Box2 mybox1=new Box2();
        Box2 mybox2= new Box2();
        mybox1.width=10;
        mybox1.height=20;
        mybox1.depth=15;
        mybox2.width=3;
        mybox2.height=6;
        mybox2.depth=9;
        vol=mybox1.volume();
        System.out.println(vol);
        vol=mybox2.volume();
        System.out.println(vol);
    }
}
