package Observer_1;

public class __ExerciceData {

/*    We want to define a patient monitoring system for a new constructed hospital in Valais. This hospital wants to monitor the health status of each of his patients.
    It is therefore planning a pilot application device that should monitor:
            - the blood pressure,
            - ElectroCardioGram (ECG),
            - and the pulse oximetry.
    Whenever those values come out of an allowed value, medical employees are automatically informed about the problem, including the patient position within the hospital.
    The problem is defined using a enum:

    public enum Problem { noProblem,
        bloodPressure, ECG,
        oximetry;
    }

    The main is defined as follows:

    public class Main {
        public static void main(String[] args) {
            PatientMonitoring pm = new PatientMonitoring(1, 10,10,10);
            MedicalEmployee jean = new MedicalEmployee("Jean ", pm);
            MedicalEmployee pauline = new MedicalEmployee("Pauline ", pm);
            MedicalEmployee matthieu = new MedicalEmployee("Matthieu", pm);
            MedicalEmployee symeon = new MedicalEmployee("Symeon ", pm);

            pm.setBloodPressure(7);
            pm.setElectroCardioGram(12);
            pm.setPosition(3);
            pm.setPosition(7);
            pm.setPulseOximetry(13);
            pm.setPulseOximetry(7);
            pm.setBloodPressure(22);
            pm.removeObserver(matthieu);
            pm.setPosition(9);
            pm.setElectroCardioGram(14);
        }
   }

    Your work: Design in UML this application that uses the observer pattern, and implement it in Java.*/

}
