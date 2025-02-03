public abstract class Worker {
    protected String name;
    protected String surename;
    protected int priceHour;

    public Worker(String name, String surename, int priceHour) {
        this.name = name;
        this.surename = surename;
        this.priceHour = priceHour;
    }

    protected int salary(int workedHours){
        int total = workedHours * priceHour;
        return total;
    }
}
