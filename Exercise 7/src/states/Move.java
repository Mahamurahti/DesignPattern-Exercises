package states;

public class Move {
    private String moveName;
    private int experienceGain;

    public Move(String name, int exp){
        moveName = "\u001B[31m " + name + "\u001B[0m";
        experienceGain = exp;
    }

    public String getMoveName() {
        return moveName;
    }

    public void setMoveName(String moveName) {
        this.moveName = moveName;
    }

    public int getExperienceGain() {
        return experienceGain;
    }

    public void setExperienceGain(int experienceGain) {
        this.experienceGain = experienceGain;
    }
}
