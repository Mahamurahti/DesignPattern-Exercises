package prototype;

public class Pointer implements Cloneable{

    private int time;

    public Pointer(int time){
        this.time = time;
    }

    public String getTimeString() {
        if(time < 10)
            return "0" + time;
        else
            return String.valueOf(time);
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
