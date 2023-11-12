package homework.fileutil;

import java.io.*;

import java.util.Scanner;

public class FileUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        boolean isRun = true;
        while (isRun) {

            System.out.println("Please enter 1 for fileSearch");
            System.out.println("Please enter 2 for contentSearch");
            System.out.println("Please enter 3 to  FIND LINES");
            System.out.println("Please enter 4 to  Print Size Of Package");
            System.out.println("Please enter 5 to Create File With Content  ");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input path");
                    String path = scanner.nextLine();
                    System.out.println("Please input fileName");
                    String fileName = scanner.nextLine();
                    System.out.println(fileSearch(path, fileName));
                    break;
                case "2":
                    System.out.println("Please input path");
                    path = scanner.nextLine();
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    contentSearch(path, keyword);
                    break;
                case "3":
                    System.out.println("Please input txtfile path");
                    String txtpath = scanner.nextLine();
                    System.out.println("Please input keyword");
                    keyword = scanner.nextLine();
                    findLines(txtpath, keyword);
                    break;
                case "4":
                    System.out.println("Please input path to print folders length");
                    path = scanner.nextLine();
                    printSizeOfPackage(path);
                    break;
                case "5":
                    System.out.println("Please input path to creat new file");
                    path = scanner.nextLine();
                    System.out.println("Please write NAME for new file");
                    fileName = scanner.nextLine();
                    System.out.println("Please write the content ov new file.");
                    String content = scanner.nextLine();
                    createFileWithContent(path, fileName, content);
                    System.out.println("File is created!");
                    break;
                default:
                    System.out.println("Unknown command.");
            }
        }
    }


    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - fileName - ֆայլի անունը, որը փնտրում ենք։
    //Որպես արդյունք պտի ծրագիրը տպի true եթե կա էդ ֆայլը էդ պապկի մեջ, false եթե չկա։
    static boolean fileSearch(String path, String fileName) {
        File file = new File(path);
        if (!file.exists() || file.isFile()) {
            return false;
        }
        if (file.listFiles() == null || file.listFiles().length == 0) {
            return false;
        }
        for (File item : file.listFiles()) {
            if (item.getName().equals(fileName)) {
                return true;
            }
        }
        return false;
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - path թե որ ֆոլդերում ենք փնտրելու
    // 2 - keyword - ինչ որ բառ
    // Մեթոդը պետք է նշված path-ում գտնի բոլոր .txt ֆայլերը, և իրենց մեջ փնտրի
    // մեր տված keyword-ը, եթե գտնի, պետք է տպի տվյալ ֆայլի անունը։
    static void contentSearch(String path, String keyword) {
        File file = new File(path);
        if (!file.exists() || file.isFile()) {
            System.out.println("File does not exist");
        } else {
            File[] list = file.listFiles();
            for (File item : file.listFiles()) {
                if (item.getName().contains(keyword)) {
                    System.out.println(item);
                }
            }

        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երկու string.
    // 1 - txtPath txt ֆայլի փաթը
    // 2 - keyword - ինչ որ բառ
    // տալու ենք txt ֆայլի տեղը, ու ինչ որ բառ, ինքը տպելու է էն տողերը, որտեղ գտնի էդ բառը։
    static void findLines(String txtPath, String keyword) {
        File txtfile = new File(txtPath);

        try (BufferedReader inputStream = new BufferedReader(new FileReader(txtPath))) {
            String line = " ";

            while (line.equals(inputStream.readLine() != null)) {
                if (line.contains(keyword)) {
                    System.out.println(inputStream);
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }

    }

    //այս մեթոդը պետք է սքաններով վերցնի մեկ string.
    // 1 - path թե որ ֆոլդերի չափն ենք ուզում հաշվել
    // ֆոլդերի բոլոր ֆայլերի չափսերը գումարում ենք իրար, ու տպում
    static void printSizeOfPackage(String path) {
        File file = new File(path);
        if (file.exists() && file.isDirectory()) {
            int sum = 0;

            for (File item : file.listFiles()) {
                sum += item.length();
            }
            System.out.println(sum);

        }
    }

    //այս մեթոդը պետք է սքաններով վերցնի երեք string.
    // 1 - path պապկի տեղը, թե որտեղ է սարքելու նոր ֆայլը
    // 2 - fileName ֆայլի անունը, թե ինչ անունով ֆայլ է սարքելու
    // 3 - content ֆայլի պարունակությունը։ Այսինքն ստեղծված ֆայլի մեջ ինչ է գրելու
    // որպես արդյունք պապկի մեջ սարքելու է նոր ֆայլ, իրա մեջ էլ լինելու է content-ով տվածը
    static void createFileWithContent(String path, String fileName, String content) throws IOException {
        File file = new File(path);

        try {


            file.createNewFile();
            file.getName().equals("NewFile");
            BufferedWriter bf = new BufferedWriter(new FileWriter(file));
            bf.write(content);
            bf.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
