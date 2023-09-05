package homework;

public class ArrayUtil {
    public static void main(String[] args) {
        //1
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
        int i = 0;
        numbers[i] = numbers[0];
        for (i = numbers[0]; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");

        }
        System.out.println();
        System.out.println("---------------------");
        //2
        System.out.println(numbers[0]);
        System.out.println("---------------------");
        //3
        System.out.println(numbers.length - 1);
        System.out.println("---------------------");
        //4
        System.out.println(numbers.length);
        System.out.println("---------------------");
        //5
        for (i = 0; i < numbers.length; i++) {
            int min = numbers[0];
            if (min > numbers[i]) {
                min = numbers[i];
                System.out.println(min);
                System.out.println("---------------------");

            }
        }
//6
        int midvalue = 0;
        midvalue = numbers.length / 2;

        if (numbers.length > 2) {

            System.out.println("numbers.length[" + midvalue + "]");
        }
        if (numbers.length <= 2) {
            System.out.print("Can't print middle values");
            System.out.println();


        }
        if (numbers.length % 2 == 1) {
            System.out.println("numbers.length[" + midvalue + "]");
        }
        if (numbers.length % 2 == 0) {
            System.out.print("numbers[" + midvalue + "]" + "numbers[" + (++midvalue) + "]");
            System.out.println();
        }
        System.out.println("---------------------");

        //7
        int count = 0;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);


        System.out.println("---------------------");

        //8
        int odd = 0;
        for (i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1 || -numbers[i] % 2 == 1) {
                odd++;
            }
        }
        System.out.println(odd);
        System.out.println("---------------------");

        //9
        int sum = 0;
        for (i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println(sum);
        System.out.println("---------------------");

        //10
        System.out.println(sum / 2);
        System.out.println("---------------------");


    }
}
