package strategy;

import java.util.Scanner;

public class Main {
    public static final int MAX = 100000;

    public static void main(String[] args){

        ISort sorter;

        Scanner reader = new Scanner(System.in);
        char select;
        do{
            System.out.println("\n\t\t\t1. Select sort");
            System.out.println("\t\t\t2. Merge sort");
            System.out.println("\t\t\t3. Quick sort");
            System.out.println("\t\t\t4. Exit");
            System.out.print("\n\n");
            select = reader.nextLine().charAt(0);
            int[] table;
            switch (select) {
                case '1':
                    table = Generator.generateNumbers();
                    sorter = SelectSort.getInstance();
                    sorter.sort(table);
                    break;
                case '2':
                    table = Generator.generateNumbers();
                    sorter = MergeSort.getInstance();
                    sorter.sort(table);
                    break;
                case '3':
                    table = Generator.generateNumbers();
                    sorter = QuickSort.getInstance();
                    sorter.sort(table);
                    break;
                case '4':
                    break;
            }
        }while (select != '4');
    }
}
