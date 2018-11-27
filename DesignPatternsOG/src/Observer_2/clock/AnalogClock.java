package Observer_2.clock;

import Observer_2.observer.Observer;
import Observer_2.observer.Subject;

public class AnalogClock implements Observer {
    private int hour;
    private int minute;
    private int second;

    public AnalogClock(Subject clockTimer) {
        clockTimer.registerObserver(this);
    }

    public void update(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        display();
    }

    private void display() {
        System.out.println("ANALOG CLOCK: Hour : " + hour + " / Min : " + minute + " / Sec : " + second);
    }
}
