package decorator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter text that will be saved:");
        String text = scanner.nextLine();

        IFileHandling fileHandler = new FileHandler();
        fileHandler.write(text);
        fileHandler.read();

        fileHandler = new Cipher(new FileHandler());
        fileHandler.write(text);
        fileHandler.read();

        fileHandler = new UnCipher(new FileHandler());
        fileHandler.read();
    }
}
