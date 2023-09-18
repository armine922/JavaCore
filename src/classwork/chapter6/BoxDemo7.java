package classwork.chapter6;

public class BoxDemo7 {
    public static void main(String[] args) {
        Box5 mybox1=new Box5(   10,20,15);
        Box5 mybox2=new Box5(3,6,9);
        double vol;
        vol=mybox1.volume();
        System.out.println(vol);
        vol=mybox2.volume();
        System.out.println(vol);
    }
}
