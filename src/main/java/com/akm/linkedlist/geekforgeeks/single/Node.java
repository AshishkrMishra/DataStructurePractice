package com.akm.linkedlist.geekforgeeks.single;

/**
 * Created by ashishkumarmishra on 11/10/16.
 * Represents Element or Node of LinkedList
 */
public class Node {

    /**
     * val - this Represents Value of Node
     */
    int val;
    /**
     * Reference (in Java) / Address (in C) of Next Node
     */
    Node nextNode;

    public Node(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
