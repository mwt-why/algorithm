package com.mwt.list;

public class SingleLinked implements Linked {

    private Node head;
    private int size;

    public SingleLinked() {
        head = new Node();
        size = 0;
    }

    class Node {
        Object data;
        Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Node() {
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
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
        if (index == 0) {
            oldData = head.next.getData();
            head.next.setData(o);
            return oldData;
        }
        Node p = head;
        while (index >= 0) {
            p = p.next;
            index--;
        }
        oldData = p.getData();
        p.setData(o);
        return oldData;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        if (index == 0) {
            return head.next.getData();
        }
        Node p = head;
        while (index >= 0) {
            p = p.next;
            index--;
        }
        return p.getData();
    }

    @Override
    public int getSize() {
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
