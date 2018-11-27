package Observer_2.timer;

public interface ClockTimer {
    int getHour();
    int getMinute();
    int getSecond();
    void tick();
}