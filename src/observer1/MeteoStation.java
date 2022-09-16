package observer1;

import java.util.ArrayList;
import java.util.List;

public class MeteoStation implements IObservered{
    private int temperature;
    private int pressure;
    List<IObserver> observers = new ArrayList<>();

    public void setMeteoStation(int temperature, int pressure){
        this.temperature = temperature;
        this.pressure = pressure;
        notifyObserver();
    }

    @Override
    public void add(IObserver observer) {
       observers.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        observers.stream().forEach(o->o.handleEvent(temperature, pressure));
//        for(IObserver o : observers){
//            o.handleEvent(temperature, pressure);
//        }
    }
}
