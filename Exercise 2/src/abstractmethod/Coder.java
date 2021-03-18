package abstractmethod;

public class Coder {
    private String name;
    private String occupation;
    private String hat;
    private String shirt;
    private String pants;
    private String shoes;

    public Coder(String name, String occupation){
        this.name = name;
        this.occupation = occupation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getHat() {
        return hat;
    }

    public void setHat(String hat) {
        this.hat = hat;
    }

    public String getShirt() {
        return shirt;
    }

    public void setShirt(String shirt) {
        this.shirt = shirt;
    }

    public String getPants() {
        return pants;
    }

    public void setPants(String pants) {
        this.pants = pants;
    }

    public String getShoes() {
        return shoes;
    }

    public void setShoes(String shoes) {
        this.shoes = shoes;
    }

}
