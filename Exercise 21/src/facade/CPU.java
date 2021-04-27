package facade;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CPU {
    private char data;

    public void Freeze(){
        System.out.println("Freezing CPU");
    }

    public void Jump(long position){
        System.out.println("Jumping in CPU to RAM address of " + position);

        try {
            List<String> lines = Files.readAllLines(Paths.get("Exercise 21/src/facade/RAM"), StandardCharsets.UTF_8);

            for(String line : lines)
                if(line.startsWith(String.valueOf(position))){
                    System.out.println("Found position " + position);
                    data = line.charAt(line.length() - 1);
                }

        } catch (IOException e) {
            System.out.println("Failed to jump into position " + position);

            e.printStackTrace();
        }
    }

    public void Execute(){
        System.out.println("Executing data of " + data);
    }
}
