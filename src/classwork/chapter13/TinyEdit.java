package classwork.chapter13;
import java.io.*;

public class TinyEdit {
    public static void main(String[] args) throws IOException {
       BufferedReader br =new BufferedReader(new InputStreamReader(System.in)) ;
       String str[]= new String[100];
        System.out.println("Write text lines");
        System.out.println("Input 'stop' to Exit");
        for(int i=0;i<100;i++){
          str[i]=br.readLine();
          if(str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
