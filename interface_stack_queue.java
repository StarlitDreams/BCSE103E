/*
Write a Java program to create two Interfaces and implement the following operations (Stack and Queue).

Interface stack

 void Push(int)

 int pop()

 int isempty()

 int isfull()

 void display() 



Interface Queue 

void Enqueue(int)

 int Dequeu()

 int isempty()

 int isfull()

 void display() 


 */
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;

interface StackInterface {
    void Push(int value);
    int pop();
    boolean isempty();
    boolean isfull();
    void display();
}

interface QueueInterface {
    void Enqueue(int value);
    int Dequeu();
    boolean isempty();
    boolean isfull();
    void display();
}

class MyStack implements StackInterface {
    private static final int MAX_SIZE = 10;
    private Stack<Integer> stack = new Stack<>();

    @Override
    public void Push(int value) {
        if (!isfull()) {
            stack.push(value);
        } else {
            System.out.println("Stack is full!");
        }
    }

    @Override
    public int pop() {
        if (!isempty()) {
            return stack.pop();
        } else {
            System.out.println("Stack is empty!");
            return -1;
        }
    }

    @Override
    public boolean isempty() {
        return stack.isEmpty();
    }

    @Override
    public boolean isfull() {
        return stack.size() == MAX_SIZE;
    }

    @Override
    public void display() {
        System.out.println(stack);
    }
}

class MyQueue implements QueueInterface {
    private static final int MAX_SIZE = 10;
    private Queue<Integer> queue = new LinkedList<>();

    @Override
    public void Enqueue(int value) {
        if (!isfull()) {
            queue.add(value);
        } else {
            System.out.println("Queue is full!");
        }
    }

    @Override
    public int Dequeu() {
        if (!isempty()) {
            return queue.poll();
        } else {
            System.out.println("Queue is empty!");
            return -1;
        }
    }

    @Override
    public boolean isempty() {
        return queue.isEmpty();
    }

    @Override
    public boolean isfull() {
        return queue.size() == MAX_SIZE;
    }

    @Override
    public void display() {
        System.out.println(queue);
    }
}

public class interface_stack_queue{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack s = new MyStack();
        MyQueue q = new MyQueue();

        while (true) {
            System.out.println("Choose operation:");
            System.out.println("1. Stack Menu");
            System.out.println("2. Queue Menu");
            System.out.println("3. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    handleStackMenu(s);
                    break;
                case 2:
                    handleQueueMenu(q);
                    break;
                case 3:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void handleStackMenu(MyStack s) {
        Scanner stackScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Stack Menu:");
            System.out.println("1. Stack Push");
            System.out.println("2. Stack Pop");
            System.out.println("3. Display Stack");
            System.out.println("4. Exit Stack Menu");
            int choice = stackScanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value to push:");
                    s.Push(stackScanner.nextInt());
                    break;
                case 2:
                    System.out.println("Popped: " + s.pop());
                    break;
                case 3:
                    s.display();
                    break;
                case 4:
                    stackScanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    private static void handleQueueMenu(MyQueue q) {
        Scanner queueScanner = new Scanner(System.in);

        while (true) {
            System.out.println("Queue Menu:");
            System.out.println("1. Queue Enqueue");
            System.out.println("2. Queue Dequeue");
            System.out.println("3. Display Queue");
            System.out.println("4. Exit Queue Menu");
            int choice = queueScanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter value to enqueue:");
                    q.Enqueue(queueScanner.nextInt());
                    break;
                case 2:
                    System.out.println("Dequeued: " + q.Dequeu());
                    break;
                case 3:
                    q.display();
                    break;
                case 4:
                    queueScanner.close();
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
