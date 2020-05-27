package stack.build;

import java.util.Iterator;

public class MyArrayStack<Item> implements Iterable<Item>{

    //定义数组
    //定义数组大小
    //定义栈size的方法
    //定义栈是否为空的方法
    //定义栈的push方法
    //定义栈的pop方法
    //定义栈的修改容量的方法
    //实现栈的迭代方法
    private Item[] a = (Item[])new Object[1];
    private int N = 0;
    public int size(){return N;}

    public boolean isEmpty(){
        return N == 0;
    }

    public void push(Item item){
        a[N++] = item;
        if(a.length == N) resert(2*N);
    }

    public Item pop(){
        Item item = a[--N];
        a[N] = null;
        if(N>0 && a.length/4 == N) resert(a.length/2);
        return item;
    }

    public void resert(int max){
        Item[] tem = (Item[])new Object[max];
        for(int i =0; i < N; i++){
            tem[i] = a[i];
        }
        a = tem;

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
            return a[--N];
        }
    }



}
