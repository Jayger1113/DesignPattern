package behavioural.observer;

public class ClientApp {

    public static void main(String[] args){
        CpuBalancedObserver cpuBalancedObserver = new CpuBalancedObserver();
        CpuOverloadingObserver cpuOverloadingObserver = new CpuOverloadingObserver();
        CpuObserverManager.getInstance().registerObserver(cpuBalancedObserver);
        CpuObserverManager.getInstance().registerObserver(cpuOverloadingObserver);

        CpuObserverManager.getInstance().notifyObservers(90);
        CpuObserverManager.getInstance().notifyObservers(89);
    }

}
