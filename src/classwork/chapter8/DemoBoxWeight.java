package classwork.chapter8;

public class DemoBoxWeight {
    public static void main(String[] args) {
        BoxWeight mybox1 = new BoxWeight(10, 15, 20, 43.4);
        BoxWeight mybox2 = new BoxWeight(2, 3, 4, 0.34);
        double vol;
        vol = mybox1.volume();
        System.out.println(vol);
        System.out.println(mybox1.weight);
        System.out.println();
        vol = mybox2.volume();
        System.out.println(vol);
        System.out.println(mybox2.weight);
        System.out.println();

    }
}
