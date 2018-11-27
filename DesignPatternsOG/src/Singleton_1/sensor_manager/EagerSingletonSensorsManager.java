package Singleton_1.sensor_manager;

public class EagerSingletonSensorsManager extends SingletonSensorManager {

    private static SingletonSensorManager instance = new EagerSingletonSensorsManager();
    
    private EagerSingletonSensorsManager() {
    	super();
    }

    public static SingletonSensorManager getInstance() {
        return instance;
    }
}
