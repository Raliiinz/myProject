package Pizzeria;

public class Order {
    private Client client;
    private Cook cook;
    private PizzaType pizzaType;
    private String date;
    private int orderNumber;
    private Status status;
    public Order(int orderNumber, Status status, Client client, Cook cook, PizzaType pizzaType, String date) {
        this.orderNumber = orderNumber;
        this.status = status;
        this.client = client;
        this.cook = cook;
        this.pizzaType = pizzaType;
        this.date = date;
        this.status = Status.RECEIVED;
        //Main.orders.add(this);
    }
    public void processOrder(CircularQueue q) {
        this.orderNumber = q.next();
        this.status = Status.READY;
        System.out.println("Заказ №" + orderNumber + " выдан клиенту");
    }
    /*public String toString() {
        System.out.printf("Order has been placed (order number: %d, status: " + status + " orderer: %s, cook: %s, time: %s, type: " + pizzaType + ")" +"\n", orderNumber, client.getName(), cook.getName(), date);
        return null;
    }

    public void placeOrder() {
        toString();
        // Реализация оформления заказа
        this.status = Status.COOKING;
        this.status = Status.READY;
    }

    public void updateStatus(Status status) {
        this.status = status;
        if (status == Status.READY){
            System.out.println("Order is ready. " + client.getName() + " you can take your order");
        }
    }*/
}
