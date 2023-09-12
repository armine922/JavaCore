package homework;

public class Selection {
    public static void main(String[] args) {


        int[] array = {4, 7, 1, 3, 9, 0, 2};

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;

                }
            }
            if (array[i] != array[min]) {

                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
                for (int y : array) {
                    System.out.print(y + ",");

                }
                System.out.println();

            }
        }

    }
}
