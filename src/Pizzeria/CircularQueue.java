package Pizzeria;

public class CircularQueue implements Queue {
    private Node current;

    public CircularQueue() {
        Node root = new Node(1);
        current = root;

        for (int i = 2; i <= 10; ++i) {
            current.next = new Node(i);
            current = current.next;
        }

        current.next = root;
    }

    @Override
    public int next() {
        current = current.next;
        int result = current.value;
        return result;
    }
    public int getOrderNumber() {
        return current.value;
    }
}
