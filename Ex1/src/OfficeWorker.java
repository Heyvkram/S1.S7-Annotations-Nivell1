public class OfficeWorker extends Worker{
    private static int fuel = 120;

    public OfficeWorker(String name, String surname, int priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public int salary(int workedHours) {
        return super.salary(workedHours) + fuel;
    }
}
