package homework.fileAnalyzer;

import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FileAnalyzer {

    public  Map<String, Integer> wordMap(String path) throws IOException {
        // Читаем файл, составляем мапу слово-количество и возвращаем ее
        final String FILE_PATH = "/Users/developer/Desktop/JavaCore/src/homework/fileAnalyzer/directory";
        File directory = new File(path);
        File[] listOfFiles = directory.listFiles();//To get the list of file-names found at the "directory"
        String words[] = null;
        String line;
        String files;
        Map<String, Integer> wordCount = new HashMap<String, Integer>();     //Creates an Hash Map for storing the words and its count
        for (File file : listOfFiles) {
            if (file.isFile()) {
                files = file.getName();
                try {
                    if (files.endsWith(".txt") || files.endsWith(".TXT")) {  //Checks whether an file is an text file
                        BufferedReader br = new BufferedReader(new FileReader(files));      //creates an Buffered Reader to read the contents of the file
                        while ((line = br.readLine()) != null) {
                            line = line.toLowerCase();
                            words = line.split(" ");                      //Splits the words with "space" as an delimeter
                        }
                        br.close();
                    }
                    for (String word : words) {
                        Integer freq = wordCount.get(word);
                        wordCount.put(word, freq);
                        System.out.println(wordCount);
                    }
                } catch (NullPointerException | IOException e) {
                    System.out.println("I could'nt read your files:" + e);
                }
            }
        }
        return wordCount;
    }


    public  int totalWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем общее количество слов
        final String FILE_PATH = "/Users/developer/Desktop/JavaCore/src/homework/fileAnalyzer/directory";
        File directory = new File(path);
        File[] listOfFiles = directory.listFiles();//To get the list of file-names found at the "directoy"
        String words[] = null;
        String line;
        String files;
        Map<String, Integer> wordCount = new HashMap<String, Integer>();     //Creates an Hash Map for storing the words and its count
        for (File file : listOfFiles) {
            if (file.isFile()) {
                files = file.getName();
                try {
                    if (files.endsWith(".txt") || files.endsWith(".TXT")) {  //Checks whether an file is an text file
                        BufferedReader br = new BufferedReader(new FileReader(files));      //creates an Buffered Reader to read the contents of the file
                        while ((line = br.readLine()) != null) {
                            words = line.split(" ");                      //Splits the words with "space" as an delimeter
                        }
                        br.close();
                    }
                    for (String word : words) {


                        Integer freq = wordCount.get(word);
                        wordCount.put(word, (freq == null) ? 1 : freq + 1); //For Each word the count will be incremented in the Hashmap

                    }
                } catch (NullPointerException | IOException e) {
                    System.out.println("I could'nt read your files:" + e);
                }

            }
            System.out.println(wordCount.size() + " distinct words:");     //Prints the Number of Distinct words found in the files read
            System.out.println(wordCount);                                 //Prints the Word and its occurrence
        }

        return 0;
    }


    public int uniqueWordCount(String path) throws IOException {
        // Читаем файл, подсчитываем количество уникальных слов
        final String FILE_PATH = "/Users/developer/Desktop/JavaCore/src/homework/fileAnalyzer/directory";
        File directory = new File(path);
        File[] listOfFiles = directory.listFiles();//To get the list of file-names found at the "directory"

        String words[] = null;
        String line;
        String files;
        Set<String> wordCount = new HashSet<>();
        for (File f : listOfFiles) {
            if (f.isFile()) {
                files = f.getName();
                try {
                    if (files.endsWith(".txt") || files.endsWith(".TXT")) {
                        BufferedReader br = new BufferedReader(new FileReader(files));
                        while ((line = br.readLine()) != null) {
                            words = line.split(" ");
                        }
                        br.close();
                    }
                    for (String word : words) {
                        wordCount.add(word);

                    }

                } catch (NullPointerException | IOException e) {
                    System.out.println("I could'nt read your files:" + e);
                }

            }
            System.out.println(wordCount.size() + " distinct words:");
            System.out.println(wordCount);
        }

        return 0;
    }

    //
//        public Map<String, Integer> topFrequentWords (String path,int n) throws IOException {
//            // Читаем файл, находим топ-N часто встречающихся слов
//            return null;
//        }
//
    public int countWordOccurrences(String path, String word) throws IOException {
        // Читаем файл, находим количество вхождений слова и возвращаем это число
        final String FILE_PATH = "/Users/developer/Desktop/JavaCore/src/homework/fileAnalyzer/directory";
        File directory = new File(path);
        File[] listOfFiles = directory.listFiles();//To get the list of file-names found at the "directoy"
        String words[] = null;
        String line;
        String files;
        Map<String, Integer> wordCount = new HashMap<String, Integer>();     //Creates an Hash Map for storing the words and its count
        for (File file : listOfFiles) {
            if (file.isFile()) {
                files = file.getName();
                try {
                    if (files.endsWith(".txt") || files.endsWith(".TXT")) {  //Checks whether an file is an text file
                        BufferedReader br = new BufferedReader(new FileReader(files));      //creates an Buffered Reader to read the contents of the file
                        while ((line = br.readLine()) != null) {
                            words = line.split(" ");                      //Splits the words with "space" as an delimeter
                        }
                        br.close();
                    }
                    for (String wrd : words) {
                        if (wrd.contains(word)) {

                            Integer freq = wordCount.get(wrd);
                            wordCount.put(wrd, (freq == null) ? 1 : freq + 1); //For Each word the count will be incremented in the Hashmap

                        }
                    }
                } catch (NullPointerException | IOException e) {
                    System.out.println("I could'nt read your files:" + e);
                }

            }
            System.out.println(wordCount.size() + " distinct words:");
            System.out.println(wordCount);
        }

        return 0;
    }

}

