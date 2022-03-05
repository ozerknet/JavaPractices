package week08;

public class ZPrac3 {
    public static void main(String[] args) {
        // amazon website search results for a product
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};

        for (double price : prices) {
            if (price >= 10 && price <= 70) {
                System.out.println(price);
            }

        }
        int freq = 0;
        for (double price : prices) {
            if (price > 50) {
                freq++;

            }
            System.out.println(freq);

        }


    }
}
