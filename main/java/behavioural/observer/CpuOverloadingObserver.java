package behavioural.observer;

public class CpuOverloadingObserver implements Observer {

    @Override
    public void update(int cpuPercentage) {
        if (cpuPercentage >= 90) {
            overloading(cpuPercentage);
        }
    }

    private void overloading(int cpuPercentage) {
        System.out.println("cpu is overloading , please reduce your task");
    }
}
