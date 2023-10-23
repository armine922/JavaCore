package classwork.chapter10;

public class SuperSubCatch {
    public static void main(String[] args) {
        try {
            int a = 0;
            int b = 42 / 0;
        } catch (Exception e) {
            System.out.println("Catching all exceptions.");
//        }catch(ArithmeticException e){
//            System.out.println("Unreachable code.");
//        }ALREADY CAUGHT EXCEPTION
        }
    }
}
