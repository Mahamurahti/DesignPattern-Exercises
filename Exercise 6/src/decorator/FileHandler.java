package decorator;

import java.io.*;
import java.util.Scanner;

public class FileHandler implements IFileHandling {
    @Override
    public void write(String message) {
        try {
            FileWriter writer = new FileWriter("text.txt");
            writer.write(message);
            writer.close();
            System.out.println("Successfully wrote text to the file.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
    }

    @Override
    public void read() {
        try {
            File file = new File("text.txt");
            String message = "";
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                message += data;
            }
            reader.close();
            System.out.println("Read message: " + message);
        } catch (FileNotFoundException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
    }

    @Override
    public String getDescription() {
        return "File handler";
    }
}
