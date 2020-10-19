package com.mwt.dataStructure.list;

/**
 * 数据结构：双向连表
 * 和单向连表相比，支持从尾元素开始查询
 */
public class DulLinked implements Linked {
    private Node head;
    private Node tail;
    private int size;

    private class Node {
        Object data;
        Node next;
        Node pre;

        public Node() {

        }

        public Node(Object data) {
            this.data = data;
        }
    }

    public DulLinked() {
        head = new Node();
        tail = new Node();
        size = 0;
    }

    @Override
    public Object add(Object o) {
        Node current = new Node(o);
        if (tail.pre == null) {
            head.next = current;
            current.pre = head;
        } else {
            Node pre = tail.pre;
            pre.next = current;
            current.pre = pre;
        }
        current.next = tail;
        tail.pre = current;
        size++;
        return o;
    }

    @Override
    public Object delete(int index) {
        return delete(index, true);
    }

    public Object delete(int index, boolean head) {
        Node node = getNode(index, head);
        Node pre = node.pre;
        Node next = node.next;
        pre.next = next;
        next.pre = pre;
        size--;
        return node.data;
    }

    @Override
    public Object set(int index, Object o) {
        return set(index, o, true);
    }

    public Object set(int index, Object o, boolean head) {
        Node node = getNode(index, head);
        Object oldData = node.data;
        node.data = o;
        return oldData;
    }

    @Override
    public Object get(int index) {
        return get(index, true);
    }

    public Object get(int index, boolean head) {
        return getNode(index, head).data;
    }

    /**
     * 根据方向获取node
     *
     * @param index node 下标
     * @param head  是否从头开始获取元素
     * @return index下标对应的node
     */
    private Node getNode(int index, boolean head) {
        checkIndex(index);
        Node p;
        if (head) {
            p = this.head;
            while (index >= 0) {
                p = p.next;
                index--;
            }
        } else {
            int rIndex = ((size - 1) - index);
            p = tail;
            while (rIndex >= 0) {
                p = p.pre;
                rIndex--;
            }
        }
        return p;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public int indexOf(Object o) {
        return indexOf(o, true);
    }

    public int indexOf(Object o, boolean head) {
        Node h = this.head.next;
        Node t = this.tail.pre;
        int index = 0;
        if (head) {
            while (true) {
                if (h.data == o) {
                    return index;
                }
                if (h.next == null) {
                    return -1;
                }
                h = h.next;
                index++;
            }
        } else {
            while (true) {
                if (t.data == o) {
                    return ((size - 1) - index);
                }
                if (t.pre == null) {
                    return -1;
                }
                t = t.pre;
                index++;
            }
        }
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
