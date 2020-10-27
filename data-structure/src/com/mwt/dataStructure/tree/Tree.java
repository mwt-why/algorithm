package com.mwt.dataStructure.tree;

public interface Tree {
    Object add(Object key, Object value);

    Object delete(Object key);

    Object set(Object key, Object value);

    Object get(Object key);
}
