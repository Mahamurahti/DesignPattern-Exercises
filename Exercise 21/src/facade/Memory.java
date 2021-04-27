package facade;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Memory {
    public void Load(long position, char data){
        System.out.println("Loading " + data + " into RAM address " + position);

        try {
            List<String> lines = Files.readAllLines(Paths.get("Exercise 21/src/facade/RAM"), StandardCharsets.UTF_8);
            List<String> toWrite = new ArrayList<>();
            boolean isLoaded = false;

            for (String line : lines) {
                if (line.startsWith(String.valueOf(position))) {
                    System.out.println(data + " loaded into RAM address of " + position);
                    String updated = line.split(" ")[0] + " " + data;
                    toWrite.add(updated);
                    isLoaded = true;
                } else {
                    toWrite.add(line.split(" ")[0]);
                }
            }
            if(!isLoaded)
                error();

            Files.write(Paths.get("Exercise 21/src/facade/RAM"), toWrite, StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("Failed to load " + data + " into address " + position);
            error();

            e.printStackTrace();
        }
    }
    private void error(){
        System.out.println("Error in memory! Check your parameters... Shutting down...");
        System.exit(0);
    }
}
