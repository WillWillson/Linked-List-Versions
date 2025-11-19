public class LinkedList {

    public Node head;
    public Node tail;

    public LinkedList() {
        head = tail = null;
    }

    public void append(int data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            tail = temp;
        }

        else {
            tail.next = temp;
        }
    }

    public boolean search(int data) {
        return false;
    }

    public void printValues() {
        Node walker = head;
        while (walker != null) {
            System.out.print(walker.data + ", ");
            walker = walker.next;
        }
    }
}