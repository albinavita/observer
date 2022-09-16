package observer1;

public class Main {
    public static void main(String[] args) {
        MeteoStation station = new MeteoStation();
        station.add(new ConsolObserver());
        station.setMeteoStation(25, 760);
    }
}
