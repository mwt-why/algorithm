package com.mwt.stack;

/**
 * 数据结构：栈
 */
public class Stack {
    private Object[] stack;
    private int top = -1;
    private int size;
    private final int MAX_SIZE = Integer.MAX_VALUE;
    private final int DEFAULT_SIZE = 16;
    private final int INCREMENT = 16;

    /**
     * 自定义初始化栈大小
     *
     * @param size 初始栈大小
     */
    public Stack(int size) {
        if (size > MAX_SIZE) {
            throw new RuntimeException("传入的size过大");
        }
        this.size = size;
        stack = new Object[size];
    }

    /**
     * 默认构造器，栈大小是默认是16
     */
    public Stack() {
        size = DEFAULT_SIZE;
        stack = new Object[DEFAULT_SIZE];
    }

    /**
     * 向栈添加元素
     *
     * @param o
     * @return
     */
    public Object add(Object o) {
        if (top > MAX_SIZE - 1) {
            throw new RuntimeException("栈满");
        }
        if (top >= size - 1) {
            inc();
        }
        top++;
        stack[top] = o;
        return o;
    }

    /**
     * 弹出一个元素并删除
     *
     * @return
     */
    public Object pop() {
        Object data;
        if (top < 0) {
            throw new RuntimeException("栈中无元素");
        }
        data = stack[top];
        stack[top] = null;
        top--;
        return data;
    }

    /**
     * 获取栈中元素量
     *
     * @return
     */
    public int getSize() {
        return top + 1;
    }

    /**
     * 获取栈顶元素
     *
     * @return
     */
    public Object top() {
        if (top == -1) {
            throw new RuntimeException("栈中无元素");
        }
        return stack[top];
    }

    /**
     * 打印栈中元素
     */
    public void print() {
        if (top == -1) {
            throw new RuntimeException("栈中无元素");
        }
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
    }

    /**
     * 扩充栈大小，每次扩充16
     */
    private void inc() {
        if (size >= MAX_SIZE) {
            throw new RuntimeException("超过栈最大值:" + Integer.MAX_VALUE);
        }
        int destSize = size + INCREMENT;
        if (destSize >= MAX_SIZE) {
            destSize = MAX_SIZE;
        }
        Object[] dest = new Object[destSize];
        Object[] src = stack;
        System.arraycopy(src, 0, dest, 0, size);
        stack = dest;
        size = destSize;
    }

}
