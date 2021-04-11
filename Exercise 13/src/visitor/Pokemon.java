package visitor;

public class Pokemon {

    private IIEvolutionState evolutionState;
    private int experience;

    public Pokemon(IIEvolutionState state){
        evolutionState = state;
        experience = 0;
    }

    private void evolve(){
        evolutionState.evolve(this);
    }

    public void move1(){
        System.out.println(evolutionState.evolutionName() + " used move 1: " + evolutionState.move1().getMoveName() + "!");
        System.out.println(evolutionState.evolutionName() + " gained " + evolutionState.move1().getExperienceGain() +
                " experience points!");

        experience += evolutionState.move1().getExperienceGain();
        System.out.println(evolutionState.evolutionName() + " has " + experience + " total experience now!");
        checkForEvolution();
    }

    public void move2(){
        System.out.println(evolutionState.evolutionName() + " used move 2: " + evolutionState.move2().getMoveName() + "!");
        System.out.println(evolutionState.evolutionName() + " gained " + evolutionState.move2().getExperienceGain() +
                " experience points!");

        experience += evolutionState.move2().getExperienceGain();
        System.out.println(evolutionState.evolutionName() + " has " + experience + " total experience now!");
        checkForEvolution();
    }

    public void move3(){
        System.out.println(evolutionState.evolutionName() + " used move 3: " + evolutionState.move3().getMoveName() + "!");
        System.out.println(evolutionState.evolutionName() + " gained " + evolutionState.move3().getExperienceGain() +
                " experience points!");

        experience += evolutionState.move3().getExperienceGain();
        System.out.println(evolutionState.evolutionName() + " has " + experience + " total experience now!");
        checkForEvolution();
    }

    public void move4(){
        System.out.println(evolutionState.evolutionName() + " used move 4: " + evolutionState.move4().getMoveName() + "!");
        System.out.println(evolutionState.evolutionName() + " gained " + evolutionState.move4().getExperienceGain() +
                " experience points!");

        experience += evolutionState.move4().getExperienceGain();
        System.out.println(evolutionState.evolutionName() + " has " + experience + " total experience now!");
        checkForEvolution();
    }

    private void checkForEvolution(){
        switch (evolutionState.evolutionStage()){
            case 1:
                if(experience >= 1000)
                    evolve();
                break;
            case 2:
                if(experience >= 5000)
                    evolve();
                break;
            case 3:
                if(experience >= 15000)
                    evolve();
                break;
        }
    }

    public String getEvolutionName() {
        return evolutionState.evolutionName();
    }

    public int getExperience(){
        return experience;
    }

    public void bonusExperience() {
        experience += evolutionState.accept(new BonusVisitor());    // The current state accepts the visitor and returns
                                                                    // an amount that is specific to the state (evolution)
        System.out.println(evolutionState.evolutionName() + " has " + experience + " total experience now!");
        checkForEvolution();
    }

    public void setEvolutionState(IIEvolutionState evolutionState) {
        this.evolutionState = evolutionState;
    }

    public IIEvolutionState getEvolutionState() {
        return this.evolutionState;
    }
}
