public class Main {
    public static void main(String[] args) {
        long[] sales = {50, 100, 60, 200, 30};
        SalesManager test = new SalesManager(sales);

        long max = test.max();
        System.out.println("Проверяем работу метода max: " + max);
        System.out.println("Все работает корректно");

        long min = test.min();
        System.out.println("Проверяем работу метода min: " + min);
        System.out.println("Все работает корректно");

        System.out.println();
        long trimmedMean = test.trimmedMean();
        System.out.println("Проверяем работу метода trimmedMean: " + trimmedMean);
        System.out.println("Все работает корректно");
    }
}
