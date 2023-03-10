package com.bridgelabz;

public class Queue {
    public static void main(String[] args) {


        MyStack myQueue = new MyStack();
        MyNode<Integer> myFirstNode = new MyNode<>(56);
        MyNode<Integer> mySecondNode = new MyNode<>(30);
        MyNode<Integer> myThirdNode = new MyNode<>(70);

        myQueue.pushQueue(myFirstNode);
        myQueue.pushQueue(mySecondNode);
        myQueue.pushQueue(myThirdNode);

        myQueue.printStack();

    }
}

