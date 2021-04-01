package strategy;

import java.util.Random;

public class Generator {
    public static int[] generateNumbers(){
        System.out.println("GENERATING NUMBERS:");
        int[] numbers = new int[Main.MAX];
        Random rnd = new Random();

        for(int i = 0; i < Main.MAX; i++){
            numbers[i] = rnd.nextInt(1000);
            System.out.print(numbers[i] + " ");
            if (i > 0 && i % 40 == 0)
                System.out.println();
        }
        return numbers;
    }
    public static void printResults(int[] sortedTable){
        System.out.println("\nSORTED RESULT:");
        for (int i = 0; i < Main.MAX; i++) {
            System.out.print(sortedTable[i] + " ");
            if (i > 0 && i % 40 == 0)
                System.out.println();
        }
    }
}
