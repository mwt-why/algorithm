package com.mwt.dataStructure.table;

public class HashTable implements Table {
    private static Node[] table;
    private static final int DEFAULT_SIZE = 9;

    public HashTable() {
        table = new Node[DEFAULT_SIZE];
    }

    /**
     * 计算key的hash
     *
     * @param key
     * @return
     */
    private int hash(Object key) {
        int hash = key.hashCode();
        return hash % 7;
    }

    private class Node {
        private Object value;
        private Object key;
        private Node next;

        public Node(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
    }

    @Override
    public Object put(Object key, Object value) {
        int hash = hash(key);
        Node p = table[hash];
        if (p == null) {
            p = new Node(key, value);
            table[hash] = p;
            return p;
        }
        while (p.next != null) {
            if (p.key == key) {
                Object oldVal = p.value;
                p.value = value;
                return oldVal;
            }
            p = p.next;
        }
        p.next = new Node(key, value);
        return value;
    }

    @Override
    public Object delete(Object key) {
        int hash = hash(key);
        Node p = table[hash];
        Node pre = null;
        checkNode(p);
        while (!((p.key == key) || (p.key.equals(key)))) {
            checkNode(p);
            pre = p;
            p = p.next;
        }
        Node next = p.next;
        if (pre == null) table[hash] = null; //被删除元素是头元素
        if (next != null && pre != null) pre.next = next; //把头元素和被删除元素相连
        return p.value;
    }

    @Override
    public Object set(Object key, Object value) {
        Node node = getNode(key);
        checkNode(node);
        Object oldVal = node.value;
        node.value = value;
        return oldVal;
    }

    @Override
    public Object get(Object key) {
        Node node = getNode(key);
        checkNode(node);
        return node.value;
    }

    private Node getNode(Object key) {
        Node p = table[hash(key)];
        checkNode(p);
        while (!(((p.key == key) || (p.key.equals(key))) || p == null)) {
            p = p.next;
        }
        return p;
    }

    private void checkNode(Node node) {
        if (node == null) {
            throw new RuntimeException("不存在的元素");
        }
    }

}
