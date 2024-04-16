package com.learning.core.day4session1.D04P09;

import java.util.Scanner;

public class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new String[maxSize];
        this.top = -1;
    }

    public void push(String item) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stackArray[top] = item;
        }
    }

    public String pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else {
            String item = stackArray[top];
            top--;
            return item;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int stackSize = scanner.nextInt();
        scanner.nextLine(); // consume newline

        Stack stack = new Stack(stackSize);

        System.out.println("Enter elements to push onto the stack:");
        for (int i = 0; i < stackSize; i++) {
            String element = scanner.nextLine();
            stack.push(element);
        }

        System.out.println("After Pushing Elements:");
        stack.display();

        // Pop one element from the stack
        String poppedElement = stack.pop();
        System.out.println("After a Pop:");
        stack.display();

        scanner.close();
    }
}