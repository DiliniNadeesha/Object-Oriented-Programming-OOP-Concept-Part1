public class Demo {

    public static void main(String[] args) {

        SinglyLinkedList ls = new SinglyLinkedList();
        ls.add(10);
        ls.add(20);
        ls.add(30);
        ls.add(40);
        ls.printList();     // [10,20,30,40]

        ls.remove(3);
        ls.printList();     // [10,20,40]

        System.out.println("Size : " + ls.size()); // Size : 3

        ls.clear();
        ls.printList();     // []

    }
}
