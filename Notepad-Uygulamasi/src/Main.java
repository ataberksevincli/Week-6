import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin girin: ");
        String text = scanner.nextLine();


        try {
           FileWriter fileWriter = new FileWriter("notlar.txt");
           PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.print(text);


            fileWriter.close();
            printWriter.close();


            FileReader fileReader = new FileReader("notlar.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String readText = bufferedReader.readLine();
            System.out.println(readText);
            bufferedReader.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    }
