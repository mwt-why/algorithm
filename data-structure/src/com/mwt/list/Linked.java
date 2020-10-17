package com.mwt.list;

public interface Linked {
    /**
     * 添加元素
     *
     * @param o
     * @return
     */
    Object add(Object o);

    /**
     * 根据下标删除元素
     *
     * @param index
     * @return
     */
    Object delete(int index);

    /**
     * 根据下标修改元素值
     *
     * @param index
     * @param o
     * @return
     */
    Object set(int index, Object o);

    /**
     * 根据下标获取元素
     *
     * @param index
     * @return
     */
    Object get(int index);

    /**
     * 获取连表的元素个数
     *
     * @return
     */
    int size();

    /**
     * 判断连表中是否包含传入的值
     *
     * @param o
     * @return 存在返回true，否则返回false
     */
    boolean contains(Object o);

    /**
     * 查询传入值在连表中的下标值
     *
     * @param o
     * @return 存在返回元素下标，不存在返回-1
     */
    int indexOf(Object o);
}
