public class Main {
    public static void main(String[] args) {
        // Создание объектов товаров с разными скидками
        Product product1 = new Product(10, 200, 0.75);
        Product product2 = new Product(5, 1500, 42.575);
        Product product3 = new Product(3, 1000, 59.1);

        // Вызов метода calculateTotal для каждого товара
        System.out.println("Товар 1:");
        product1.calculateTotal();
        System.out.println();

        System.out.println("Товар 2:");
        product2.calculateTotal();
        System.out.println();

        System.out.println("Товар 3:");
        product3.calculateTotal();
    }
}