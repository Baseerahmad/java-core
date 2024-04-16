package com.learning.core.day4session1.D04P09;

import java.util.Scanner;

public class CircularQueue {
    private int maxSize;
    private double[] queueArray;
    private int front;
    private int rear;
    private int currentSize;

    public CircularQueue(int size) {
        this.maxSize = size;
        this.queueArray = new double[maxSize];
        this.front = 0;
        this.rear = -1;
        this.currentSize = 0;
    }

    public void enqueue(double item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        rear = (rear + 1) % maxSize;
        queueArray[rear] = item;
        currentSize++;
    }

    public double dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Double.NaN;
        }
        double dequeuedItem = queueArray[front];
        front = (front + 1) % maxSize;
        currentSize--;
        return dequeuedItem;
    }

    public boolean isEmpty() {
        return currentSize == 0;
    }

    public boolean isFull() {
        return currentSize == maxSize;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in circular queue: ");
        int count = 0;
        int i = front;
        while (count < currentSize) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
            count++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the circular queue
        System.out.print("Enter the size of the circular queue: ");
        int size = scanner.nextInt();
        CircularQueue circularQueue = new CircularQueue(size);

        // Input elements to enqueue
        System.out.println("Enter elements to enqueue (separate each element with a space):");
        for (int i = 0; i < size; i++) {
            double element = scanner.nextDouble();
            circularQueue.enqueue(element);
        }

        // Display elements in the circular queue
        circularQueue.display();

        // Dequeue an element
        double removedElement = circularQueue.dequeue();
        System.out.println("After removing first element:");
        circularQueue.display();

        scanner.close();
    }
}
