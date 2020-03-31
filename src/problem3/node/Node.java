package problem3.node;

public class Node {
    String name;
    int rollNo;
    Node next;

    public Node(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
        this.next = next;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}