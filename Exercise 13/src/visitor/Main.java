package visitor;

import visitor.bulbasaurLine.BulbasaurState;
import visitor.squirtleLine.SquirtleState;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);

        System.out.println(Gallery.getHeader());

        System.out.println("Enter your name: ");
        String name = reader.nextLine();

        Pokemon pokemon1 = new Pokemon(SquirtleState.getInstance());
        Pokemon pokemon2 = new Pokemon(BulbasaurState.getInstance());
        Pokemon currentPokemon = pokemon1;
        System.out.println("Welcome pokemon trainer " + name + ".\nYour starter pokemon's are " + pokemon1.getEvolutionName() +
                " and " + pokemon2.getEvolutionName() + "! You have to train your pokemon by using moves.\nHave fun !! :--)");

        char select;
        do {
            System.out.println("\n\t\t\t1. Use " + currentPokemon.getEvolutionName() + "'s first move");
            System.out.println("\t\t\t2. Use " + currentPokemon.getEvolutionName() + "'s second move");
            System.out.println("\t\t\t3. Use " + currentPokemon.getEvolutionName() + "'s third move");
            System.out.println("\t\t\t4. Use " + currentPokemon.getEvolutionName() + "'s fourth move");

            System.out.println("\n\t\t\t5. Current pokemon");
            System.out.println("\t\t\t6. Change pokemon");
            System.out.println("\t\t\t7. Give bonus experience");
            System.out.println("\t\t\t8. Exit ");
            System.out.print("\n\n");
            try{
                select = reader.nextLine().charAt(0);
            }catch (Exception e){
                select = '0';
            }
            switch (select) {
                case '1':
                    currentPokemon.move1();
                    break;
                case '2':
                    currentPokemon.move2();
                    break;
                case '3':
                    currentPokemon.move3();
                    break;
                case '4':
                    currentPokemon.move4();
                    break;
                case '5':
                    System.out.println(currentPokemon.getEvolutionName());
                    break;
                case '6':
                    if(currentPokemon.equals(pokemon1))
                        currentPokemon = pokemon2;
                    else
                        currentPokemon = pokemon1;
                    System.out.println("Changed pokemon to " + currentPokemon.getEvolutionName());
                    break;
                case '7':
                    pokemon1.bonusExperience();     // Call visitor pattern
                    pokemon2.bonusExperience();     // Call visitor pattern
                    break;
                case '8':
                    System.out.println("Thank you for playing, your end score was: " +
                                       (pokemon1.getExperience() + pokemon2.getExperience()) + "!");
                    break;
                case '0':
                    break;
            }
        }while(select != '8');
    }
}
