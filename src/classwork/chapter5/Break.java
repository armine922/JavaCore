package classwork.chapter5;

public class Break {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Before break.");
                    if (t) break second;
                    System.out.println("This operator won't be run.");
                }
                System.out.println("This operator won't be run.");

            }
            System.out.println("This operator is after the second block");
        }
    }
}
