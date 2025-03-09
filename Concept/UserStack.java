package Concept;
import java.util.EmptyStackException;


class UserStack {

    private int[] stackArray;
    private int top;
    private int capacity;

    public UserStack(int size)
    {
        stackArray = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int element)
    {
        if(isFull())
        {
            System.out.println("Stack is Full");
        }
        else{
            stackArray[++top] = element;
            System.out.println("Element " + element + " push successfully");
        }
    }

    public int pop()
    {
        if(isEmpty())
        {
            throw new EmptyStackException();
        }
        return stackArray[top--];
    }

    public boolean isEmpty()
    {
        return top == -1;
    }

    public boolean isFull()
    {
        return top == capacity - 1;
    }

    public void display()
    {
        for(int i :stackArray)
        {
            System.out.println(i);
        }
    }



    public static void main(String[] args) {

        UserStack stack = new UserStack(5);


        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Element " + stack.pop() + " pop successfully");
        System.out.println(stack.top);
        stack.display();

    }
}