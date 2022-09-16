package observer1;

public interface IObservered {
    public void add(IObserver observer);
    public void remove(IObserver observer);
    public void notifyObserver();

}
