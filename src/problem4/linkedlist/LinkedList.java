package problem4.linkedlist;

public class LinkedList {
    private Node first;
    private Node last;

    public void addLast(int data) {
        Node node = new Node(data);
        if (first == null) {
            first = last = node;
            return;
        }
        last.setNext(node);
        last = node;
    }

    public void deleteFirst() {
        if (first == null) {
            first = last = null;
            return;

        }
        var second = first.getNext();
        first.setNext(null);
        first = second;

    }

    public void display() {
        var current = first;
        while (current != null) {
            System.out.println(current.getData());
            current = current.getNext();
        }

    }

    public Node getLast() {
        return last;
    }

    public void setLast(Node last) {
        this.last = last;
    }

    public Node search(int data) {
        var current = first;
        while (current != null) {
            if (current.getData() == data) {
                return current;
            }
            current = current.getNext();
        }
        return null;

    }
}
