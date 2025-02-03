public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OfficeWorker worker1 = new OfficeWorker("Carlos", "García", 6);
        OnlineWorker worker2 = new OnlineWorker("Pepe", "Pepez", 6);

        System.out.println(worker1.salary(40));
        System.out.println(worker2.salary(40));

        System.out.println(worker1.deprecatedMethod());
        System.out.println(worker2.deprecatedMethod());

    }
}