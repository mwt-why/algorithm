package com.mwt.dataStructure.tree;

public interface Tree {
    Object add(Object o);

    Object delete(String key);

    Object set(String key, Object o);

    Object get(String key);
}
