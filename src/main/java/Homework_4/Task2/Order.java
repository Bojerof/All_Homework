package Homework_4.Task2;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Order {
    private int numberOrder;
    private String nameClient;
    private String nameProduct;
    private int count;

    @Override
    public String toString() {
        return String.format("Заказ №%d, имя покупателя %s, название продукта %s, кол-во %d",
                numberOrder, nameClient, nameProduct, count);
    }
}
