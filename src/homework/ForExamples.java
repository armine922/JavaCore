package homework;

public class ForExamples {
    public static void main(String[] args) {

        //Task 1


        for (int i = 1; i < 1000; i++) {
            System.out.print(i + "-");

        }
        int i = 1000;
        System.out.println(i);
        System.out.println("--------------");


        //Task2

        for (i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + "|");

            }

        }
        System.out.println();
        System.out.println("--------------");

        //Task3
        int[] array = {2, 5, 8, 4, 9, 3, 7};
        int k;
        int max = array[0];
        for (k = 0; k < array.length; k++) {
            if (max < array[k]) {
                max = array[k];

            }
        }
        System.out.println(max);


    }
}
