package behavioural.observer;

public class CpuBalancedObserver implements Observer {

    @Override
    public void update(int cpuPercentage) {
        if (cpuPercentage < 90) {
            balanced(cpuPercentage);
        }
    }

    private void balanced(int cpuPercentage) {
        System.out.println("cpu is balanced , you can increase your task now");
    }
}
