class Product {
    private int quantity; // Количество товаров
    private double price; // Цена товара
    private double discount; // Скидка на товар в процентах

    // Конструктор для инициализации товара
    public Product(int quantity, double price, double discount) {
        this.quantity = quantity;
        this.price = price;
        this.discount = discount;
    }

    public void calculateTotal() {
        double totalWithoutDiscount = quantity * price;
        double discountAmount = totalWithoutDiscount * (discount / 100);
        double totalWithDiscount = totalWithoutDiscount - discountAmount;

        totalWithoutDiscount = Math.round(totalWithoutDiscount * 100.0) / 100.0;
        totalWithDiscount = Math.round(totalWithDiscount * 100.0) / 100.0;

        System.out.println("Общая стоимость без скидки: " + totalWithoutDiscount + " руб.");
        System.out.println("Общая стоимость со скидкой: " + totalWithDiscount + " руб.");
    }
}