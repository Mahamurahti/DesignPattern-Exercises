package strategy;

import java.util.Scanner;

public class Main {
    public static final int MAX = 200000;

    public static void main(String[] args){

        Sorter sorter = null;

        Scanner reader = new Scanner(System.in);
        char select;
        do{
            System.out.println("\n\t\t\t1. Select sort");
            System.out.println("\t\t\t2. Merge sort");
            System.out.println("\t\t\t3. Quick sort");
            System.out.println("\t\t\t4. Exit");
            System.out.print("\n\n");
            try{
                select = reader.nextLine().charAt(0);
            }catch (Exception e){
                select = '5';
            }
            int[] table = null;
            switch (select) {
                case '1':
                    table = Generator.generateNumbers();
                    sorter = new Sorter(SelectSort.getInstance());
                    break;
                case '2':
                    table = Generator.generateNumbers();
                    sorter = new Sorter(MergeSort.getInstance());
                    break;
                case '3':
                    table = Generator.generateNumbers();
                    sorter = new Sorter(QuickSort.getInstance());
                    break;
                case '4':
                    break;
            }
            if(select != '4')
                sorter.executeStrategy(table);
        }while (select != '4');
    }
}
