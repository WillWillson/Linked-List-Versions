public class LinkedList {

    public Node head;
    public Node tail;

    public LinkedList() {
        head = tail = null;
    }

    public void append(float data) {
        Node temp = new Node(data);

        if (head == null) {
            head = temp;
            tail = temp;
        }

        else {
            tail.next = temp;
        }
    }

    public boolean search(float data) {
        boolean result = false;
        Node walker = head;
        while (walker != null) {
            if (walker.data == data) {
                result = true;
                break;
            }
            walker = walker.next;
        }
        return result;
    }

    public void printValues() {
        Node walker = head;
        while (walker != null) {
            System.out.print(walker.data + ", ");
            walker = walker.next;
        }
    }
}