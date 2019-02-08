package com.lambdaschool;

public class Stack {
    String[] stack;
    private int stackEnd;
    private int capacity;

    public Stack(int capacity) {
        stackEnd = 0;
        this.stack = new String[capacity];
        this.capacity = capacity;
    }
//Print - print the items in the order they were added to the stack. Should be in the form of [‘item1’, ‘item2’]
    public void print() {
        // functional interface that is like a forEach()
        System.out.print("[ ");
        for(int i = 0; i < stackEnd; i++) {
            System.out.print("'" + stack[i]);
            System.out.print(i == stackEnd - 1 ? "' " :  "', ");
        }
        System.out.println(']');
    }
//Pop - Remove the last item from the stack and return the item
    public String pop() {
        if(stack.length == 0) {
            return "There are no items in your Stack.";
        }
        String item = stack[stackEnd - 1];
        stackEnd--;
        return item;
    }

    public void push(String item) {

        if(stackEnd < this.capacity) {

            String[] arr = new String[stackEnd+1];
            for(int i = 0; i < stackEnd; i++) {
                arr[i] = this.stack[i];
            }
            arr[stackEnd] = item;
            stack = arr;
            stackEnd++;
        }
    }
//    numOfItems - No items in on the stack, return the message “There are no items in your Stack, otherwise, return the number of items.

    public String numOfItems() {
        return stackEnd > 0 ? "" + stackEnd : "There are no items in your Stack.";
    }
}
