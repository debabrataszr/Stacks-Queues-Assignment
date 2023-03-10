package com.bridgelabz;

public class MyStack<K> {
    LinkedList myLinkedList = new LinkedList();

    public void push(INode element) {
        myLinkedList.addToFront(element);
    }

    public INode peak() {
        return myLinkedList.head;
    }

    public INode pop() {
        return myLinkedList.popFirstNode();
    }

    public void printStack() {
        myLinkedList.printMyNodes();
    }
}