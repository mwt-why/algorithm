package com.mwt.dataStructure.stack;

public interface Stack {
    /**
     * 向栈中添加元素
     *
     * @param o
     * @return
     */
    Object add(Object o);

    /**
     * 弹出一个元素，并删除
     *
     * @return
     */
    Object pop();

    /**
     * 获取栈顶元素
     *
     * @return
     */
    Object top();

    /**
     * 获取栈中元素量
     *
     * @return
     */
    int getSize();
}
