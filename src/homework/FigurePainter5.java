package homework;

public class FigurePainter5 {
    public static void main(String[] args) {
        int height=6;

        for(int i=height-1;i>-height;i--){
            int k =i;
            if(k<0){
                k=-i;

            }

            for(int j=0;j<k;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(height-k-1);j++){
                System.out.print(" *");
            }

            System.out.println();



        }
    }
}


