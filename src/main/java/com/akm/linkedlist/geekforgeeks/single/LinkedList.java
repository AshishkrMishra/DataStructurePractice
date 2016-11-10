package com.akm.linkedlist.geekforgeeks.single;

/**
 * Created by ashishkumarmishra on 11/10/16.
 * This Class Represents Single-LinkedList
 */
public class LinkedList {

    /**
     * head - Represents Head of LinkedList
     */
    private Node head;

    public LinkedList(Node head) {
        this.head = head;
    }

    public static void main(String[] args) {
        /**
         * nodes is Representing elements of LinkedList
         */
        int[] nodes = {1, 2, 3, 4, 5, 6, 7, 8};
        // Creating LinkedList From Array
        LinkedList linkedList = LinkedList.createLinkedListFromArray(nodes);
        System.out.println("Printing LinkedList");
        // Printing elemets of LinkedList
        linkedList.print();
        System.out.println("\nPrinting LinkedList in Reverse Order");
        linkedList.printReverse();


    }

    /**
     * createLinkedListFromArray - will create LinkedList from Array
     *
     * @param nodes arrays of elements of Node
     * @return LinkedList
     */
    public static LinkedList createLinkedListFromArray(int[] nodes) {
        LinkedList linkedList = null;

        if (nodes == null || nodes.length == 0) {
            return linkedList;
        }
        Node head = new Node(nodes[0]);
        int length = nodes.length;
        linkedList = new LinkedList(head);
        Node currentNode = head;
        for (int index = 1; index < length; index++) {
            Node nextNode = new Node(nodes[index]);
            currentNode.setNextNode(nextNode);
            currentNode = nextNode;

        }
        return linkedList;
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    /**
     * print - will print elements of Array
     */
    public void print() {
        printUtil(this.getHead());
    }

    /**
     * printUtil - will print recursively elements of LinkedList
     *
     * @param node Node to be printed
     */
    private void printUtil(Node node) {
        if (node == null)
            return;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ")
                .append(node.getVal())
                .append(" ");
        System.out.print(stringBuilder);
        printUtil(node.getNextNode());
    }

    /**
     * print LinkedList in Reverse
     */
    public void printReverse() {
        printReverseUtil(head);
    }

    /**
     * printReverseUtil - will print recursively elements of LinkedList in Reverse Order
     *
     * @param node Node to be printed
     */
    private void printReverseUtil(Node node) {
        if (node == null)
            return;
        printReverseUtil(node.getNextNode());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" ")
                .append(node.getVal())
                .append(" ");
        System.out.print(stringBuilder);
    }

}
