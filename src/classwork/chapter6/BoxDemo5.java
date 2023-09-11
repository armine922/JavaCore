package classwork.chapter6;

public class BoxDemo5 {
    public static void main(String[] args) {

        Box3 mybox1 = new Box3();
        Box3 mybox2 = new Box3();
        double vol;

        mybox1.setDim(10, 20, 15);
        mybox2.setDim(3, 6, 9);
        vol = mybox1.volume();
        System.out.println(vol);
        vol = mybox2.volume();
        System.out.println(vol);
    }
}

