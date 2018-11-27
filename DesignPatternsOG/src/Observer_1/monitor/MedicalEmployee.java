package Observer_1.monitor;

import Observer_1.observer.Observer;
import Observer_1.observer.Problem;
import Observer_1.observer.Subject;

public class MedicalEmployee implements Observer {

    private String name;

    public MedicalEmployee(String name, Subject subject) {
        this.name = name;
        subject.registerObserver(this);
    }

    public void update(int position, Problem p, int bloodPressure , int electroCardioGram, int pulseOximetry) {
        System.out.print("Employee " + name + " receives notification: ");
        System.out.println("Position " + position + " observer.Problem " + p + " BloodPressure " + bloodPressure + " ElectroCardioGram " + electroCardioGram + " PulseOximetry " + pulseOximetry);
    }


}
