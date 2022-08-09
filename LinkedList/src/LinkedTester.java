public class LinkedTester {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.addHead(5);
        list.addTail(8);
        list.add(1,24);
        list.printList();
    }
}
