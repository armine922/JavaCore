package classwork.chapter8;

public class DemoSuper {
    public static void main(String[] args) {
        BoxWeight1 mybox1 = new BoxWeight1(10, 20, 15, 32.4);
        BoxWeight1 mybox2 = new BoxWeight1(2, 3, 4, 0.078);
        BoxWeight1 mybox3 = new BoxWeight1();
        BoxWeight1 mycube = new BoxWeight1(3, 2);
        BoxWeight1 myclone = new BoxWeight1(mybox1);
        double vol;
        vol =mybox1.volume();
        System.out.println(vol);
        System.out.println(mybox1.weight);
        vol =mybox2.volume();
        System.out.println(vol);
        System.out.println(mybox2.weight);
        vol =mybox3.volume();
        System.out.println(vol);
        System.out.println(mybox3.weight);
        vol =mycube.volume();
        System.out.println(vol);
        System.out.println(mycube.weight);
        vol =myclone.volume();
        System.out.println(vol);
        System.out.println(myclone.weight);
    }
}
