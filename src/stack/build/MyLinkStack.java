package stack.build;

import java.util.Iterator;

public class MyLinkStack<Item> implements Iterable<Item>{

    //定义链表
    //定义栈size的方法
    //定义栈是否为空的方法
    //定义栈的push方法
    //定义栈的pop方法
    //定义栈的修改容量的方法
    //实现栈的迭代方法


    public class Node{
        Item item;
        Node next;
    }

    private Node first;

    private int N = 0;
    public int size(){return N;}

    public boolean isEmpty(){
        return first == null;
    }

    public void push(Item item){

        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
        N ++;
    }

    public Item pop(){

        N --;
        Item item1 = first.item;
        first = first.next;
        return item1;
    }


    @Override
    public Iterator<Item> iterator() {
        return null;
    }

    private class MyArrayStackIterator implements Iterator<Item>{

        @Override
        public boolean hasNext() {
            return N > 0;
        }

        @Override
        public Item next() {
             return first.next.item;
        }
    }



}
