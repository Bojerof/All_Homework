package Homework_4.Task2;

import java.util.*;

public class Functional {
    private static Scanner in = new Scanner(System.in);
    private static List<Client> clients = new ArrayList<>(Arrays.asList(new Client("Bob", 25),
            new Client("Sam", 23), new Client("Tom", 35)));
    private static List<Product> products = new ArrayList<>(Arrays.asList(new Product("Milk", 100, 10),
            new Product("Chocolate", 150, 3), new Product("Water", 50, 5)));
    private static List<Order> orders = new ArrayList<>();

    public static void run(){
        while (true) {
            Order order = make();
            if (order != null) {
                orders.add(order);
                System.out.println("Если вы хотите закончить, нажмите (N), если нет нажмите Enter");
                String flag = in.nextLine();
                if (flag.equals("n") || flag.equals("N")) break;
            }
            else break;
        }
        for (var item : orders) {
            System.out.println(item);
        }
    }

    private static Order make() {
        try {
            String nameClient = checkNameClient();
            String nameProduct = checkNameProduct();
            int count = checkCountProduct(nameProduct);
            int orderNumber = orders.size();
            return new Order(orderNumber + 1, nameClient, nameProduct, count);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    private static int checkCountProduct(String nameProduct) throws CountException{
        System.out.println("Введите кол-во товара для покупки");
        String number = in.nextLine();
        int count = Integer.parseInt(number);
        for (var item : products) {
            if (item.getNameProduct().toLowerCase().equals(nameProduct.toLowerCase())){
                if (item.getCount() < count) throw new CountException();
                int result = item.getCount() - count;
                item.setCount(result);
            }
        }
        return count;
    }

    private static String checkNameProduct() throws ProductNameException {
        System.out.println("Введите название продукта");
        String nameProduct = in.nextLine().toLowerCase();
        for (var item : products){
            if (item.getNameProduct().toLowerCase().equals(nameProduct)) return nameProduct;
        }
        throw new ProductNameException();
    }

    private static String checkNameClient() throws ClientNameException {
        System.out.println("Введите имя покупателя");
        String nameClient = in.nextLine().toLowerCase();
        for (var item : clients) {
            if (item.getName().toLowerCase().equals(nameClient)) return nameClient;

        }
        throw new ClientNameException();
    }
}
class ClientNameException extends Exception{
    public ClientNameException() {
        System.out.println("Такого имени покупателя не существует");
    }
}
class ProductNameException extends Exception{
    public ProductNameException() {
        System.out.println("Такого продукта нету");
    }
}
class CountException extends Exception{
    public CountException() {
        System.out.println("Количество в заказе больше чем товара");;
    }
}