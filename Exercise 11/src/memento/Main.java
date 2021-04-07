package memento;

public class Main {

    static final long SLEEP_TIME = 100;

    public static void main(String[] args) throws InterruptedException {
        GuessMaster master = new GuessMaster();

        Guesser[] guessers = new Guesser[3];                // A list of guessers, who have one master
        guessers[0] = new Guesser("Nathan", master);
        guessers[1] = new Guesser("Mike", master);
        guessers[2] = new Guesser("Alena", master);

        for (Guesser guesser : guessers)
            guesser.start();                                // Start guessing

        for (Guesser guesser : guessers)
            guesser.join();                                 // Wait till everyone is finished

        for (Guesser guesser : guessers)
            System.out.println(guesser.getGuesserName() + " guessed the correct number after " +
                    guesser.getGuesses() + " guesses!");
    }
}
