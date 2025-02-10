public abstract class Worker {
    protected String name;
    protected String surname;
    protected int priceHour;

    public Worker(String name, String surname, int priceHour) {
        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public int salary(int workedHours){
        int total = workedHours * priceHour;
        return total;
    }
}
