public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long trimmedMean() {
        long trimmedMean = 0;
        long k = 0;
        for (long sale : sales) {
            if (sale == this.min() || sale == this.max()) {
                continue;
            }
            trimmedMean += sale;
            k++;
        }
        trimmedMean /= k;
        return trimmedMean;
    }
}
