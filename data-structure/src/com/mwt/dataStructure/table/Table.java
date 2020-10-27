package com.mwt.dataStructure.table;

/**
 * 简单的hashTable没有扩容等机制
 */
public interface Table {
    /**
     * 存放key,value
     * @param key
     * @param value
     * @return
     */
    Object put(Object key,Object value);

    /**
     * 根据key删除hashTable中的元素
     * @param key
     * @return
     */
    Object delete(Object key);

    /**
     * 修改hashTable中的元素
     * @param key
     * @param value
     * @return
     */
    Object set(Object key,Object value);

    /**
     * 根据key获取hashTable中的value
     * @param key
     * @return
     */
    Object get(Object key);
}
