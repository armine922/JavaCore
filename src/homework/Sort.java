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
                    System.out.print("{");
                    for (int x : array) {
                        System.out.print(x);

                    }
                    System.out.print("}");
                    System.out.println();

                }

            }
        }

        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = min + 1; j < array.length; j++) {
                if (array[j] <array[min]) {
                    min = j;

                }
            }
            if (array[i]!=array[min]) {

                int tmp=array[i];
                array[i]=array[min];
                array[min]=tmp;
                for(int y:array){
                    System.out.print(y+",");

                }System.out.println();

            }
        }

    }
}