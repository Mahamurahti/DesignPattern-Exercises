package states;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println(Gallery.getHeader());

        System.out.println("Enter your name: ");
        String name = reader.nextLine();

        Pokemon pokemon = new Pokemon();
        System.out.println("Welcome pokemon trainer " + name + ".\nYour starter pokemon is " + pokemon.getEvolutionName() +
                "! You have to train your pokemon by using moves.\nHave fun !! :--)");

        char select;
        do {
            System.out.println("\n\t\t\t1. Use " + pokemon.getEvolutionName() + "'s first move");
            System.out.println("\t\t\t2. Use " + pokemon.getEvolutionName() + "'s second move");
            System.out.println("\t\t\t3. Use " + pokemon.getEvolutionName() + "'s third move");
            System.out.println("\t\t\t4. Use " + pokemon.getEvolutionName() + "'s fourth move");
            System.out.println("\t\t\t5. Exit ");
            System.out.print("\n\n");
            try{
                select = reader.nextLine().charAt(0);
            }catch (Exception e){
                select = '6';
            }
            switch (select) {
                case '1':
                    pokemon.move1();
                    break;
                case '2':
                    pokemon.move2();
                    break;
                case '3':
                    pokemon.move3();
                    break;
                case '4':
                    pokemon.move4();
                    break;
                case '5':
                    System.out.println("Thank you for playing, your end score was: " + pokemon.getExperience() + "!");
                    break;
                case '6':
                    break;
            }
        }while(select != '5');
    }
}
