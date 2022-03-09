package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public final class CpuObserverManager implements Subject {

    private List<Observer> observerList = new ArrayList();
    private static volatile CpuObserverManager cpuObserverManager = null;

    public static CpuObserverManager getInstance(){
        if(cpuObserverManager == null){
            synchronized (CpuObserverManager.class){
                if(cpuObserverManager == null){
                    cpuObserverManager = new CpuObserverManager();
                }
            }
        }
        return cpuObserverManager;
    }

    private CpuObserverManager(){}

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void unregisterObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyObservers(int cpuPercentage) {
        observerList.forEach(o -> o.update(cpuPercentage));
    }
}
