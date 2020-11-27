public class SinglyLinkedList {

    Node head = null;
    int size = 0;

    void add(int value) {
        size++;
        if (head == null) {
            head = new Node(value, null);
        } else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
        }
        temp.next = new Node(value, null);
    }
}

    void printList() {
        if (size == 0){
            return;
        }
        Node temp = head;
        while (temp.next != null){
            System.out.println(temp.value + ",");
            temp = temp.next;
        }
        System.out.println(temp.value);
    }

    void remove(int index) {
        size--;
        if (index == 0){
        head = head.next;
        return;
    }
        Node temp = head;
        int i = 0;
        Node temp = head;
        while (temp != null) {
            if ((i + 1) == index){
                break;
            }
            temp = temp.next;
            i++;
        }
        temp.next = temp.next.next;
    }

    int get(int index){
        return -1;
    }

    int size() {
        return 0;
    }

    void clear() {
    }
}
