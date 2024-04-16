package com.learning.core.day4session1.D04P09;

import java.util.Scanner;

public class Queue {
	private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    public void enqueue(int item) {
        if (currentSize == maxSize) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        currentSize++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeuedItem = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return dequeuedItem;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in queue: ");
        int i = front;
        while (i != rear) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
        }
        System.out.println(queueArray[rear]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the queue
        System.out.print("Enter the size of the queue: ");
        int size = scanner.nextInt();
        Queue queue = new Queue(size);

        // Input elements to enqueue
        System.out.println("Enter elements to enqueue:");
        for (int i = 0; i < size; i++) {
            int element = scanner.nextInt();
            queue.enqueue(element);
        }

        // Display elements in the queue
        queue.display();

        // Dequeue an element
        int removedElement = queue.dequeue();
        System.out.println("After removing first element:");
        queue.display();

        scanner.close();
    }
}