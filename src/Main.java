public class Main {
    public static void main(String[] args) {
        int[] sales = {50, 100, 60, 200, 30};
        SalesManager test = new SalesManager(sales);

        int max = test.max();
        System.out.println("Проверяем работу метода max: " + max);
        System.out.println("Все работает корректно");

        int min = test.min();
        System.out.println("Проверяем работу метода min: " + min);
        System.out.println("Все работает корректно");

        System.out.println();
        int trimmedMean = test.trimmedMean();
        System.out.println("Проверяем работу метода trimmedMean: " + trimmedMean);
        System.out.println("Все работает корректно");
    }
}
