package com.yiming.iterator.v4;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/28 11:42
 */
public class LinkedList_ implements Collection_ {
    Node head = null;
    Node tail = null;
    //目前容器中有多少个元素
    private int size = 0;

    public void add(Object element) {
        Node n = new Node(element);
        n.next = null;

        if (head == null) {
            head = n;
            tail = n;
        }

        tail.next = n;
        tail = n;

        size++;
    }

    public int size() {
        return size;
    }

    //节点
    private class Node {

        private Object data;
        Node next;
        Node() {
        }

        Node(Object data) {
            this.data = data;
        }

    }

    @Override
    public Iterator_ iterator() {
        return new LinkedListIterator();
    }


    private class LinkedListIterator implements Iterator_ {
        private int currentIterator = 0;

        @Override
        public boolean hasNext() {
            if (currentIterator > size - 1) return false;
            return true;
        }

        @Override
        public Object next() {
            Object o = head.data;
            head = head.next;
            return o;
        }
    }
}
