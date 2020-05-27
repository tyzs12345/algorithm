package link.reverse_order;

import link.reverse_order.entry.Item;

public class Client {

    public static void main(String[] args) {

        Item item = productData();
        //逆序
        //method1(item);

        Item item1 = method2(item);
        System.out.println(item1);


    }

    private static Item method2(Item head)
    {
        if(head == null || head.getNext() == null)
            return head;
        Item newNext = method2(head.next);
       // System.out.println(newNext == head.next);
        //    1   2    3     4
        head.next.next = head;
        head.setNext(null);

        return newNext;


    }


    private static void method1(Item item) {
        Item pre = null;
        Item cur = null;
        Item next = null;
        cur = item.getNext();
        item.setNext(null);
        pre = item;
        //  cur.setNext(item);
        while (cur.hasNext()){
            next = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = next;
        }
        System.out.println(pre);
    }

    private static Item productData() {
        Item item_zero = new Item();
        item_zero.setOrder(0);
        item_zero.setValue("0");
        Item item_pre = new Item();
        item_pre.setOrder(1);
        item_pre.setValue("1");
        Item item_cur = new Item();
        item_cur.setOrder(2);
        item_cur.setValue("2");
        Item item_next = new Item();
        item_next.setOrder(3);
        item_next.setValue("3");
        Item item_4 = new Item();
        item_4.setOrder(4);
        item_4.setValue("4");

        item_zero.setNext(item_pre);
        item_pre.setNext(item_cur);
        item_cur.setNext(item_next);
        item_next.setNext(item_4);
        return item_zero;
    }

}
