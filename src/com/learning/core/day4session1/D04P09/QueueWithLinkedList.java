package com.learning.core.day4session1.D04P09;

import java.util.Scanner;

class QueueNode {
    int data;
    QueueNode next;

    public QueueNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class QueueWithLinkedList {
    private QueueNode front;
    private QueueNode rear;
    private int size;

    public QueueWithLinkedList() {
        this.front = null;
        this.rear = null;
        this.size = 0;
    }

    public void enqueue(int item) {
        QueueNode newNode = new QueueNode(item);
        if (isEmpty()) {
            front = newNode;
        } else {
            rear.next = newNode;
        }
        rear = newNode;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeuedItem = front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return dequeuedItem;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in queue: ");
        QueueNode current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueWithLinkedList queue = new QueueWithLinkedList();

        // Input elements to enqueue
        System.out.println("Enter elements to enqueue (separate each element with a space):");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        for (String element : elements) {
            queue.enqueue(Integer.parseInt(element));
        }

        // Display elements in the queue
        queue.display();

        // Dequeue two elements
        queue.dequeue();
        queue.dequeue();

        // Display elements after removing two elements
        System.out.println("After removing two elements:");
        queue.display();

        scanner.close();
    }
}
