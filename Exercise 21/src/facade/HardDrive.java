package facade;

import java.io.BufferedReader;
import java.io.FileReader;

public class HardDrive {
    public char Read(long lba, int size){
        System.out.println("Reading from hard drive sector " + lba + " with a sector size of " + size);

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("Exercise 21/src/facade/Local Disk (C)"));

            String sector = bufferedReader.readLine();
            while (sector != null){
                if(sector.contains(String.valueOf(lba))){
                    sector = bufferedReader.readLine();
                    if(sector.contains(String.valueOf(size))){
                        System.out.println("Found the data of " + sector.charAt(sector.length() - 1));
                        bufferedReader.close();
                        return sector.charAt(sector.length() - 1);
                    }
                }
                sector = bufferedReader.readLine();
            }
            error();
            bufferedReader.close();
        }catch (Exception e){
            System.out.println("Failed to read from sector " + lba + " with a sector size of " + size);
            error();

            e.printStackTrace();
        }
        return '0';
    }
    private void error(){
        System.out.println("Error in hard drive! Check your parameters... Shutting down...");
        System.exit(0);
    }
}
