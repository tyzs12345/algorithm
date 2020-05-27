package link.reverse_order.entry;

public class Item {

    public int order;
    public String value;
    public Item pre;
    public Item next;

    public boolean hasNext(){
        if(next == null){
            return false;
        }
        return true;
    }


    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Item getPre() {
        return pre;
    }

    public void setPre(Item pre) {
        this.pre = pre;
    }

    public Item getNext() {
        return next;
    }

    public void setNext(Item next) {
        this.next = next;
    }

    public Item() {
    }

    public Item(int order, String value, Item pre, Item next) {
        this.order = order;
        this.value = value;
        this.pre = pre;
        this.next = next;
    }
}
