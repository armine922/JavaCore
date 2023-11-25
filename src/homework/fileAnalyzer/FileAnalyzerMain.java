package homework.fileAnalyzer;

import java.io.IOException;

public class FileAnalyzerMain {
    public static void main(String[] args) throws IOException {
        FileAnalyzer fileAnalyzer= new FileAnalyzer();
fileAnalyzer.wordMap("/Users/developer/Desktop/JavaCore/src/homework/fileAnalyzer/directory");
fileAnalyzer.totalWordCount("/Users/developer/Desktop/JavaCore/src/homework/fileAnalyzer/directory");
fileAnalyzer.uniqueWordCount("/Users/developer/Desktop/JavaCore/src/homework/fileAnalyzer/directory");
fileAnalyzer.countWordOccurrences("/Users/developer/Desktop/JavaCore/src/homework/fileAnalyzer/directory","task");
}}