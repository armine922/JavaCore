package classwork.chapter6;

public class BoxDemo3 {

    public static void main(String[] args) {
        Box1 mybox1 = new Box1();
        Box1 mybox2 = new Box1();
        mybox1.depth = 10;
        mybox1.height = 20;
        mybox1.width = 15;
        mybox2.width = 3;
        mybox2.height = 9;
        mybox2.depth = 6;
        mybox1.volume();

        mybox2.volume();


    }
}
