public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int min() {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public int trimmedMean() {
        int trimmedMean = 0;
        for (int sale : sales) {
            if (sale == this.min() || sale == this.max()) {
                continue;
            }
            trimmedMean += sale;
        }
        return trimmedMean;
    }
}
