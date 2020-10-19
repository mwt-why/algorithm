package com.mwt.dataStructure.stack;

public class Test {
    public static void main(String[] args) {
//        addTest();
//        getSizeTest();
//        popTest();
        topTest();
    }

    public static ArrayStack addTest() {
        ArrayStack stack = new ArrayStack();
        for (int i = 0; i < 50; i++) {
            stack.add(i);
        }
//        stack.print();
        return stack;
    }

    public static void getSizeTest() {
        ArrayStack stack = addTest();
        System.out.println(stack.getSize());
    }

    public static void popTest() {
        ArrayStack stack = addTest();
        for (int i = 0; i < 51; i++) {
            System.out.println(stack.pop());
        }
    }

    public static void topTest() {
        ArrayStack stack = addTest();
        System.out.println(stack.top());
    }
}
