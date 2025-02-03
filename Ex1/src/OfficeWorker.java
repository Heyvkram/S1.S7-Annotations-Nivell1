public class OfficeWorker extends Worker{
    private static int fuel = 120;

    public OfficeWorker(String name, String surename, int priceHour) {
        super(name, surename, priceHour);
    }

    @Override
    protected int salary(int workedHours) {
        return super.salary(workedHours) + fuel;
    }
}
