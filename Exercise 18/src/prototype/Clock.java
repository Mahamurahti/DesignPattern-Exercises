package prototype;

public class Clock implements Cloneable{

    private String name;
    private Pointer secPoint, minPoint, hourPoint;

    public Clock(String name, int hour, int min, int sec){
        this.name = name;
        hourPoint = new Pointer(hour);
        minPoint = new Pointer(min);
        secPoint = new Pointer(sec);
    }

    public void time(){
        if(hourPoint.getTime() == 24){
            System.out.println("Max time");
        }else if(minPoint.getTime() == 59){
            hourPoint.setTime(hourPoint.getTime() + 1);
            minPoint.setTime(0);
        }else if(secPoint.getTime() == 59){
            minPoint.setTime(minPoint.getTime() + 1);
            secPoint.setTime(0);
        }else
            secPoint.setTime(secPoint.getTime() + 1);

        System.out.println(displayTime());
    }

    public String displayTime(){
        return name + "'s time is now " + hourPoint.getTimeString() + ":" + minPoint.getTimeString() + ":" + secPoint.getTimeString();
    }

    public Object shallowCopy(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public Object deepCopy(){
        Clock clock = null;
        try {
            clock = (Clock) super.clone();
            clock.hourPoint = (Pointer) hourPoint.clone();
            clock.minPoint = (Pointer) minPoint.clone();
            clock.secPoint = (Pointer) secPoint.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clock;
    }

    public Pointer getSecPoint() {
        return secPoint;
    }

    public void setSecPoint(Pointer secPoint) {
        this.secPoint = secPoint;
    }

    public Pointer getMinPoint() {
        return minPoint;
    }

    public void setMinPoint(Pointer minPoint) {
        this.minPoint = minPoint;
    }

    public Pointer getHourPoint() {
        return hourPoint;
    }

    public void setHourPoint(Pointer hourPoint) {
        this.hourPoint = hourPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
