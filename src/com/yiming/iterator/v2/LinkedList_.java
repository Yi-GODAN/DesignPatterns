package com.yiming.iterator.v2;

/**
 * @Program: DesignPatterns
 * @Description:
 * @Author: YiMing
 * @Created: 2020/09/28 11:42
 */
public class LinkedList_ {
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

    public static void main(String[] args) {
        LinkedList_ lists = new LinkedList_();
        for (int i = 0; i < 15; i++) {
            lists.add(i);
        }
        System.out.println(lists.size);
    }
}
