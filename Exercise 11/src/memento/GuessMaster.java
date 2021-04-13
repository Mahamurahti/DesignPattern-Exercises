package memento;

public class GuessMaster {

    public GuessMaster(){ }

    private class Memento {
        private final int correctNumber;

        public Memento(int num){
            correctNumber = num;
        }

        public int getCorrectNumber(){
            return correctNumber;
        }
    }

    public void joinGame(Guesser guesser){               // Upon joining game give a random number that needs to be guessed
        guesser.getNumberFromMaster(new Memento((int) Math.round(Math.random() * 100)));
    }

    public synchronized void checkNumber(Guesser guesser, int guess){
        Memento guesserMemento = (Memento) guesser.giveMementoToMaster();   // Cast the Object memento into a Memento

        if(guesserMemento.getCorrectNumber() == guess) {                    // Check if the guess is correct
            System.out.println("\u001B[32m" + guesser.getGuesserName() + " your guess of " + guess + " is correct!" + "\u001B[0m");
            System.out.println(guesser.getGuesserName() + " has stopped guessing after " + guesser.getGuesses() + " guesses!\n");
            guesser.stopGuessing();
        }else
            System.out.println(guesser.getGuesserName() + " your guess of " + guess + " is wrong!\n");
    }

}
