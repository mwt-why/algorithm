package com.mwt.dataStructure.tree;

public class BinaryTree implements Tree {

    private Node root;

    public BinaryTree() {
    }

    private class Node {
        private Object key;
        private Object value;
        private Node parent;
        private Node left;
        private Node right;

        public Node(Node parent, Object key, Object value) {
            this.parent = parent;
            this.key = key;
            this.value = value;
        }
    }

    private int hash(Object data) {
        return data.hashCode();
    }

    @Override
    public Object add(Object key, Object value) {
        if (root == null) {
            root = new Node(null, key, value);
        }
        return put(root, key, value);
    }

    /**
     * 树插入数据的真实逻辑
     *
     * @param root
     * @param key
     * @param value
     * @return
     */
    private Object put(Node root, Object key, Object value) {
        int rootHash = hash(root);
        int keyHash = hash(key);
        if ((rootHash == keyHash) || (root.key == key) || (root.key.equals(key))) {
            Object oldVal = root.value;
            root.value = value;
            return oldVal;
        }
        if (keyHash < rootHash && root.left != null) {
            put(root.left, key, value);
        } else if (keyHash < rootHash) {
            root.left = new Node(root, key, value);
        }
        if (keyHash > rootHash && root.right != null) {
            put(root.right, key, value);
        } else if (keyHash > rootHash) {
            root.right = new Node(root, key, value);
        }
        return value;
    }

    @Override
    public Object delete(Object key) {
        return null;
    }

    @Override
    public Object set(Object key, Object value) {
        return null;
    }

    @Override
    public Object get(Object key) {
        if (root == null) {
            throw new RuntimeException("这是一颗空树");
        }
        int keyHash = hash(key);

        return null;
    }

    private Node findNode(Node root, int keyHash) {
        return null;
    }


}
