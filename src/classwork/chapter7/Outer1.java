package classwork.chapter7;

public class Outer1 {
    int outerX=100;
    void test(){
        Inner inner = new Inner();
        inner.display();
    }
    class Inner{
        int y=10;
        void display(){
            System.out.println(outerX);
        }
        void showy(){
            System.out.println(y);
        }
    }

        }

        class InnerClassDemo1{
            public static void main(String[] args) {
                Outer outer = new Outer();
                outer.test();
    }
}
