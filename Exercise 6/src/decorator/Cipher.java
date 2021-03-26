package decorator;

import java.io.FileWriter;
import java.io.IOException;

public class Cipher extends CipherHandler{
    public Cipher(IFileHandling handlerToBeDecorated) {
        super(handlerToBeDecorated);
    }

    @Override
    public void write(String message){
        try {
            FileWriter writer = new FileWriter("text.txt");
            writer.write(cipher(message));
            writer.close();
            System.out.println("Successfully wrote ciphered text to the file.");
        } catch (IOException e) {
            System.out.println("Something went wrong.");
            e.printStackTrace();
        }
    }

    private String cipher(String message){
        message = message.replaceAll("[a]", "4");
        message = message.replaceAll("[b]", "8");
        message = message.replaceAll("[c]", "€");
        message = message.replaceAll("[d]", "ꓷ");
        message = message.replaceAll("[e]", "3");
        message = message.replaceAll("[f]", "Ⅎ");
        message = message.replaceAll("[g]", "6");
        message = message.replaceAll("[h]", "#");
        message = message.replaceAll("[i]", "1");
        message = message.replaceAll("[j]", "!");
        message = message.replaceAll("[k]", "⋊");
        message = message.replaceAll("[l]", "˥");
        message = message.replaceAll("[m]", "m");
        message = message.replaceAll("[n]", "И");
        message = message.replaceAll("[o]", "0");
        message = message.replaceAll("[p]", "Գ");
        message = message.replaceAll("[q]", "Ϙ");
        message = message.replaceAll("[r]", "Я");
        message = message.replaceAll("[s]", "5");
        message = message.replaceAll("[t]", "7");
        message = message.replaceAll("[u]", "∩");
        message = message.replaceAll("[v]", "v");
        message = message.replaceAll("[w]", "w");
        message = message.replaceAll("[x]", "x");
        message = message.replaceAll("[y]", "⅄");
        message = message.replaceAll("[z]", "z");
        return message;
    }

    @Override
    public String getDescription(){
        return super.getDescription() + ", cipher";
    }
}
