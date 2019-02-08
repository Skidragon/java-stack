package com.lambdaschool;

public class Main
{

    public static void main(String[] args)
    {
        Stack stack1 = new Stack(1000);

        System.out.println(stack1.numOfItems());
        stack1.push("first");
        stack1.push("second");
        stack1.push("third");
        System.out.println(stack1.numOfItems());
        stack1.print();
        stack1.pop();
        stack1.print();
        stack1.pop();
        stack1.print();
        stack1.pop();
        stack1.print();
        System.out.println(stack1.numOfItems());

//        There are no items in your Stack.
//////
//////        3
//////
//////                [ 'first', 'second', 'third' ]
//////
//////[ 'first', 'second' ]
//////
//////[ 'first' ]
//////
//////[]
//////
//////        There are no items in your Stack.

    }
}
