public abstract class Worker {
    protected String name;
    protected String surename;
    protected int priceHour;

    public Worker(String name, String surname, int priceHour) {
        this.name = name;
        this.surename = surname;
        this.priceHour = priceHour;
    }

    public int salary(int workedHours){
        int total = workedHours * priceHour;
        return total;
    }
}
