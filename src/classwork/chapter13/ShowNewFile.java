package classwork.chapter13;
import java.io.*;



public class ShowNewFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin = null;
        if (args.length != 1) {
            System.out.println("Test file");
            return;
        }
        try {
            fin = new FileInputStream(args[0]);
            do {
                i = fin.read();
                if (i != -1)
                    System.out.println((char)i);
                } while (i != -1) ;
            }catch(FileNotFoundException e){
                System.out.println("File is not found.");
            }catch(IOException e){
                System.out.println("Error of input- output");
            }finally{
                try {
                    if (fin != null) fin.close();
                } catch (IOException e) {
                    System.out.println("Error of closing file.");
                }
            }
        }
    }