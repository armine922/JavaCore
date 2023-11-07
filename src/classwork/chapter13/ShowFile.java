package classwork.chapter13;

import java.io.*;

public class ShowFile {
    public static void main(String[] args) throws IOException {
        int i;
        FileInputStream fin;
        if (args.length != 1) {
            System.out.println("Use file 'Test'");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch (FileNotFoundException e) {
            System.out.println("File can't open");
            return;
        }
        try {
            do {
                i = fin.read();
                if (i != -1) System.out.println((char) i);
            } while ((i != -1));
        } catch (IOException e) {
            System.out.println("Error of reading file");
        }
        try{fin.close();

    }catch (IOException e){
            System.out.println("Error of reading file");
        }
}}