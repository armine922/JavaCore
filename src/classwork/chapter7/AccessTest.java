package classwork.chapter7;

public class AccessTest {
    public static void main(String[] args) {
        TestP ob=new TestP();
        ob.a=10;
        ob.b=20;
      //  ob.c=30; Mistake
        ob.setc(100);//Right
        System.out.println( ob.a+ob.b+ob.getc());
    }
}
