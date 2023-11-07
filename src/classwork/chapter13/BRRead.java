package classwork.chapter13;
import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.io.*;



public class BRRead {
    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter 'q' to exit");
        do{c=(char) br.read();
            System.out.print(c);

        }while (c!='q');



    }


}
