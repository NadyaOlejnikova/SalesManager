public class SalesManager {
    protected int[] sales = {100, 200, 300};

    public SalesManager() {
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


    public String toString() {
        return "Наиболее покумаемое количество товара  " + max();
    }
}