package observer;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Time extends Observable {

    private String hours, minutes, seconds;
    private Calendar calendar;
    private ArrayList observers = new ArrayList();

    public Time(){
        calendar = GregorianCalendar.getInstance();
        Date date = new Date();
        calendar.setTime(date);

        currentTime();
    }

    private void currentTime(){
        Date date = new Date();
        calendar.setTime(date);
        hours = String.valueOf(calendar.get(Calendar.HOUR_OF_DAY));
        minutes = String.valueOf(calendar.get(Calendar.MINUTE));
        seconds = String.valueOf(calendar.get(Calendar.SECOND));
    }

    public String getHour(){
        if(Integer.parseInt(hours) < 10)
            hours = "0" + hours;
        return hours;

    }
    public String getMinute(){
        if(Integer.parseInt(minutes) < 10)
            minutes = "0" + minutes;
        return minutes;

    }
    public String getSecond(){
        if(Integer.parseInt(seconds) < 10)
            seconds = "0" + seconds;
        return seconds;
    }

    public void setTime(){
        currentTime();
        String timeNow = getHour() + ":" + getMinute() + ":" + getSecond();
        DateTimeFormatter simpleTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime = LocalTime.parse(timeNow, simpleTime);
        setChanged();
        notifyObservers(localTime);
    }
}
