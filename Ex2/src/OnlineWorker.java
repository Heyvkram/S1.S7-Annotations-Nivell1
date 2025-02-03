public class OnlineWorker extends Worker {
    private final int INTERNET_COST = 50;

    public OnlineWorker(String name, String surename, int priceHour) {
        super(name, surename, priceHour);
    }

    @Override
    protected int salary(int workedHours) {
        return super.salary(workedHours) + INTERNET_COST;
    }

    @Deprecated
    protected String deprecatedMethod(){
        return "This is the Deprecated method of the OnlineWorker class";
    }
}
