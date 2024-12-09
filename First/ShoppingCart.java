class Product {
    int quantity;
    double price;
    double discount;

    public Product(int quantity, double price, double discount) {
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public void calculateTotal() {
        double totalWithoutDiscount = quantity * price;
        double totalWithDiscount = totalWithoutDiscount * (1 - discount / 100);

        System.out.printf("Общая сумма без скидки: %.2f\n", totalWithoutDiscount);
        System.out.printf("Общая сумма со скидкой: %.2f\n", totalWithDiscount);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        Product product1 = new Product(10, 100, 0.75);
        Product product2 = new Product(5, 200, 42.575);
        Product product3 = new Product(7, 50, 59.1);

        product1.calculateTotal();
        product2.calculateTotal();
        product3.calculateTotal();
    }
}
