public class Main {
    public static void main(String[] args) {
        int[] sales = {50, 100, 60, 200, 30};
        SalesManager test = new SalesManager(sales);

        int max = test.max();
        System.out.println("Проверяем работу метода max: " + max);
        System.out.println("Все работает корректно");
    }
}
