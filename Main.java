public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.append((float)3.6);
        list.append((float)8.2);
        list.printValues();
        System.out.println(list.search((float)939));
        System.out.println(list.search((float)3.6));
    }

}