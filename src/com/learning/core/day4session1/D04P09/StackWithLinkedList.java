package com.learning.core.day4session1.D04P09;
import java.util.Scanner;

class Node {
    double data;
    Node next;

    Node(double data) {
        this.data = data;
        this.next = null;
    }
}

public class StackWithLinkedList {
    private Node top;

    public StackWithLinkedList() {
        this.top = null;
    }

    public void push(double item) {
        Node newNode = new Node(item);
        newNode.next = top;
        top = newNode;
    }

    public double pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return Double.NaN;
        } else {
            double poppedValue = top.data;
            top = top.next;
            return poppedValue;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.print("The elements of the stack are: ");
            Node current = top;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StackWithLinkedList stack = new StackWithLinkedList();

        System.out.println("Enter the elements to push onto the stack (separate each element with a space):");
        String input = scanner.nextLine();
        String[] elements = input.split(" ");

        for (String element : elements) {
            try {
                double value = Double.parseDouble(element);
                stack.push(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + element);
            }
        }

        // Display elements of the stack
        stack.display();

        // Pop twice
        stack.pop();
        stack.pop();

        // Display elements after popping twice
        System.out.print("After popping twice: ");
        stack.display();

        scanner.close();
    }
}
