package com.mwt.list;

public interface Linked {
    Object add(Object o);

    Object delete(int index);

    Object set(int index, Object o);

    Object get(int index);

    int size();
}
