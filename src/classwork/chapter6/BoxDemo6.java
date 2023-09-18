package classwork.chapter6;

public class BoxDemo6 {
    public static void main(String[] args) {
        Box4 mybox1=new Box4();
        Box4 mybox2=new Box4();
        double vol;
        vol=mybox1.volume();
        System.out.println(vol);
        vol=mybox2.volume();
        System.out.println(vol);
    }
}
