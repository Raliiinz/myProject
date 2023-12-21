package Pizzeria;


public class Main{
    //static List<Order> orders = new ArrayList<>();
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue();
        Client client1 = new Client("Alice", Gender.FEMALE, DiscountCategory.STUDENT);
        Client client2 = new Client("Bob", Gender.MALE, DiscountCategory.STUDENT);
        Client client3 = new Client("Eve",  Gender.FEMALE, DiscountCategory.VIP);

        Cook cook1 = new Cook("Chef1",  Gender.MALE);
        Cook cook2 = new Cook("Chef2", Gender.FEMALE);

        /*Order order1 = new Order(q.next(), client1, cook1, PizzaType.PEPPERONI, "12:00");
        Order order2 = new Order(q.next(), client2, cook2, PizzaType.MARGHERITA, "12:30");
        Order order3 = new Order(q.next(), client3, cook1, PizzaType.BBQCHICKEN, "13:00");
        Order order4 = new Order(q.next(), client1, cook1, PizzaType.PEPPERONI, "13:10");
        Order order5 = new Order(q.next(), client2, cook2, PizzaType.MARGHERITA, "13:20");
        Order order6 = new Order(q.next(), client3, cook1, PizzaType.BBQCHICKEN, "13:30");

        Order order1 = new Order(q.getOrderNumber(), Status.RECEIVED, client1, cook1, PizzaType.PEPPERONI, "12:00");
        Order order2 = new Order(q.getOrderNumber(), Status.RECEIVED, client2, cook2, PizzaType.MARGHERITA, "12:30");
        Order order3 = new Order(q.getOrderNumber(), Status.RECEIVED, client3, cook1, PizzaType.BBQCHICKEN, "13:00");
        Order order4 = new Order(q.getOrderNumber(), Status.RECEIVED, client1, cook1, PizzaType.PEPPERONI, "13:10");
        Order order5 = new Order(q.getOrderNumber(), Status.RECEIVED, client2, cook2, PizzaType.MARGHERITA, "13:20");
        Order order6 = new Order(q.getOrderNumber(), Status.RECEIVED, client3, cook1, PizzaType.BBQCHICKEN, "13:30");*/

        Order[] orders = new Order[15];
        for (int i = 0; i < 15; i+=3) {
            orders[i] = new Order(q.getOrderNumber(), Status.RECEIVED, client1, cook1, PizzaType.BBQCHICKEN, "14:00");
            orders[i+1] = new Order(q.getOrderNumber(), Status.RECEIVED, client2, cook2, PizzaType.MARGHERITA, "15:00");
            orders[i+2] = new Order(q.getOrderNumber(), Status.RECEIVED, client3, cook1, PizzaType.PEPPERONI, "16:00");
            orders[i].processOrder(q);
            orders[i+1].processOrder(q);
            orders[i+2].processOrder(q);
        }

        /*for (Order o: orders){
            o.placeOrder();
        }

        for (Order o: orders){
            o.updateStatus(Status.READY);
        }*/
    }
}
