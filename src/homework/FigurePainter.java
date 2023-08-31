package homework;

public class FigurePainter {
    public static void main(String[] args) {
        int height = 5;
        //1
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();

        }
        System.out.println("-------------");


        //2


        for (int i = 0; i < height; i++) {
            for (int j = 0; j < height - i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        System.out.println("-------------");

        //3

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (height - i - 1); j++)
                System.out.print("  ");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");


            System.out.println();
        }
        System.out.println("---------------");


        //4

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j < height - i; j++) {
                System.out.print("* ");
            }


            System.out.println();


        }


        System.out.println("--------------");

        //5

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < (height - i - 1); j++)
                System.out.print(" ");
            for (int j = 0; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j < height - i; j++) {
                System.out.print("* ");
            }


            System.out.println();


        }


    }
}
