package reverseLinkedList;

public class LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node head;

    Node reverse(Node node) {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }

    void printList(Node node) {
        while (node != null) {
            System.out.println(node.data + "->");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(11);
        linkedList.head.next = new Node(12);
        linkedList.head.next.next = new Node(13);
        linkedList.head.next.next.next = new Node(15);
        linkedList.printList(head);
        head = linkedList.reverse(head);
        System.out.println("reverse");
        linkedList.printList(head);

    }
}
