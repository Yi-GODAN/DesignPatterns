package com.yiming.iterator.v5;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/28 11:42
 */
public class LinkedList_<E> implements Collection_<E> {
    Node head = null;
    Node tail = null;
    //目前容器中有多少个元素
    private int size = 0;

    public void add(E element) {
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
    private class Node<E> {

        private E data;
        Node next;

        Node() {
        }

        Node(E data) {
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
            E o = (E) head.data;
            head = head.next;
            currentIterator++;
            return o;
        }
    }
}
