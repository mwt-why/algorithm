package com.mwt.list;

public class SingleLinked implements Linked {

    private Node head;
    private int size;

    public SingleLinked() {
        head = new Node();
        size = 0;
    }

    private class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Node() {
        }
    }


    @Override
    public Object add(Object o) {
        Node p = head;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new Node(o);
        size++;
        return o;
    }

    @Override
    public Object delete(int index) {
        checkIndex(index);
        if (index == 0) {
            return head.next;
        }
        Node p = head;
        while (index > 0) {
            p = p.next;
            index--;
        }
        Node pre = p;
        Node deleteNode = p.next;
        Node next = deleteNode.next;
        if (next != null) {
            pre.next = next;
        }
        size--;
        return deleteNode;
    }

    @Override
    public Object set(int index, Object o) {
        checkIndex(index);
        Object oldData;
        Node p = head;
        while (index >= 0) {
            p = p.next;
            index--;
        }
        oldData = p.data;
        p.data = o;
        return oldData;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        Node p = head;
        while (index >= 0) {
            p = p.next;
            index--;
        }
        return p.data;
    }

    @Override
    public int size() {
        return size;
    }

    private void checkIndex(int index) {
        if (index > size - 1) {
            throw new RuntimeException("下标越界");
        }
        if (index < 0) {
            throw new RuntimeException("下标不能为0");
        }
    }
}
