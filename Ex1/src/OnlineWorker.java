public class OnlineWorker extends Worker {
    private static final int INTERNET_COST = 50;

    public OnlineWorker(String name, String surname, int priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public int salary(int workedHours) {
        return super.salary(workedHours) + INTERNET_COST;
    }
}
