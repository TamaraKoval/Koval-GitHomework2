public class Main {
    public static void main(String[] args) {
        SalesManager test = new SalesManager(new int[]{50, 100, 60, 200, 30});

        int max = test.max();
        System.out.println("Проверяем работу метода класса: " + max);
        System.out.println("Все работает корректно");
    }
}
