package com.mwt.list;

public interface Linked {
    /**
     * 添加元素
     * @param o
     * @return
     */
    Object add(Object o);

    /**
     * 根据下标删除元素
     * @param index
     * @return
     */
    Object delete(int index);

    /**
     * 根据下标修改元素值
     * @param index
     * @param o
     * @return
     */
    Object set(int index, Object o);

    /**
     * 根据下标获取元素
     * @param index
     * @return
     */
    Object get(int index);

    /**
     * 获取连表的元素个数
     * @return
     */
    int size();
}
