package classwork.chapter13;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BRReadLines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Write diferent words");
        System.out.println("Write 'stop' to Exit");

    do{
        str=br.readLine();
        System.out.println(str);
    }while (!str.equals("stop"));
}}
