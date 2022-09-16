package observer1;

public class ConsolObserver implements IObserver{
    @Override
    public void handleEvent(int temp, int presser) {
        System.out.println("Погода изменилась. " +
                "Темпеература = " + temp + " Давление = " + presser);
    }
}
