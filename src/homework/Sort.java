package homework;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

//Bubble
public class Sort {
    public static void main(String[] args) {
        int[] array = {4, 7, 1, 3, 9, 0, 2};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int k = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = k;

                    for (int x : array) {
                        System.out.print(x + "|");

                    }
                    System.out.println();

                }


            }
        }


    }
}