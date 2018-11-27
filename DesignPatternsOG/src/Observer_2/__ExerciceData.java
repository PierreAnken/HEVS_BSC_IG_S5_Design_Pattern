package Observer_2;

public class __ExerciceData {

/*
    We consider a ClockTimer with the following interface:

    public interface ClockTimer {
        public int getHour();
        public int getMinute();
        public int getSecond();
        public void tick();
    }

    MyTimer implements this interface. It uses an internal class:

    import java.util.Calendar;
    import java.util.Timer;
    import java.util.TimerTask;

    public class MyTimer implements ClockTimer {
        private Calendar cal;
        private Timer timer;

        // Constructor
        public MyTimer() {
            cal = Calendar.getInstance();
            timer = new Timer();
            timer.schedule(new TimerAction(), 0, 1*1000);
        }

        class TimerAction extends TimerTask {
            public void run() {
                cal = Calendar.getInstance();
                tick();
            }
        }

        public int getHour() {
            return cal.get(Calendar.HOUR_OF_DAY);
        }

        public int getMinute() {
            return cal.get(Calendar.MINUTE);
        }

        public int getSecond() {
            return cal.get(Calendar.SECOND);
        }

        // Gets called by the internal timer every second to provide an accurate time base.
        public void tick() {
            // DO SOMETHING
        }
    }

    We define two classes that register to the ClockTimer: a digital and an
    analog clock. Design and implement this application with an observer
    pattern (you do not need to develop any special GUI interface), using the
    following main :

    public class Main {
        public static void main(String[] args) {
            MyTimer clockTimer = new MyTimer();
            AnalogTimer analo = new AnalogTimer(clockTimer);
            DigitalTimer digit = new DigitalTimer(clockTimer); }
    }
*/

}
