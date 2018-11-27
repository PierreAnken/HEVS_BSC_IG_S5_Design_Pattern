package Observer_2;

import Observer_2.clock.AnalogClock;
import Observer_2.clock.DigitalClock;
import Observer_2.timer.MyTimer;

public class Main {

    public static void main(String[] args) {
        MyTimer clockTimer = new MyTimer();

        new AnalogClock(clockTimer);
        new DigitalClock(clockTimer);
    }
}