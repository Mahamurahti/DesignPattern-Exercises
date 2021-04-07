package memento;

public class Guesser extends Thread{

    private GuessMaster master;
    private Object memento;                             // We store the memento as an Object that the guesser doesn't
    private final String name;                          // have access to the correct number, but has it stored.
    private int guesses;

    private volatile boolean guessing;

    public Guesser(String name, GuessMaster master){
        this.name = name;
        this.master = master;
        guesses = 0;
        guessing = true;
    }

    public void getNumberFromMaster(Object memento){    // Memento is passed as an Object
        this.memento = memento;                         // (guesser doesn't need to have access to it)
    }

    public void guessNumber(int num){
        guesses++;
        master.checkNumber(this, num);          // We pass the whole guesser, since we also want to display the name
    }

    public Object giveMementoToMaster(){
        return memento;
    }

    public String getGuesserName() {
        return name;
    }

    public int getGuesses(){
        return guesses;
    }

    @Override
    public void run() {
        master.joinGame(this);                          // Join the masters game -> master gives the guesser a number
        System.out.println(name + " has started guessing!");
        while(guessing){
            int guess = (int)Math.round(Math.random() * 100);
            guessNumber(guess);                                 // Guess a random number

            try{ Thread.sleep(Main.SLEEP_TIME); }
            catch (Exception e){ e.printStackTrace(); }
        }
    }

    public void stopGuessing(){
        guessing = false;
    }
}
