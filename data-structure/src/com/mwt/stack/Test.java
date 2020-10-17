package com.mwt.stack;

public class Test {
    public static void main(String[] args) {
//        addTest();
//        getSizeTest();
//        popTest();
        topTest();
    }

    public static Stack addTest() {
        Stack stack = new Stack();
        for (int i = 0; i < 50; i++) {
            stack.add(i);
        }
//        stack.print();
        return stack;
    }

    public static void getSizeTest() {
        Stack stack = addTest();
        System.out.println(stack.getSize());
    }

    public static void popTest() {
        Stack stack = addTest();
        for (int i = 0; i < 51; i++) {
            System.out.println(stack.pop());
        }
    }

    public static void topTest() {
        Stack stack = addTest();
        System.out.println(stack.top());
    }
}
