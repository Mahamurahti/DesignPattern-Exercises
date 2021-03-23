package observer;

import java.util.Scanner;

class Main {
    public static void main(String[] args){

        Time observable = new Time();
        DigitalClock observer = new DigitalClock();

        observable.addObserver(observer);
        Scanner reader = new Scanner(System.in);
        char input = 'y';
        do{
            if(input == 'y')
                observable.setTime();
            else
                System.out.println("Answer with 'y' or 'n'");

            System.out.println("Get current time? y/n");
            input = reader.nextLine().charAt(0);
        }
        while (input != 'n');
        System.out.print("You exited the software: ");
        observable.setTime();
    }
}
