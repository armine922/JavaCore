package classwork.chapter5;

public class SampleSwitch {
    public static void main(String[] args) {
        for (int i = 0; i < 6; i++)
            switch (i) {
                case 0:
                    System.out.println("i is equal to 0");
                    break;
                case 1:
                    System.out.println("i is equal to 1");
                    break;
                case 2:
                    System.out.println("i is equal to 2");
                    break;
                case 3:
                    System.out.println("i is equal to 3");
                    break;
                default:
                    System.out.println("i is more than 3");


            }
    }
}
