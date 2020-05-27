package tree.example1;

import tree.example1.build.BiTNode;

public class Client {

    /**
     * 将一个有序的数组转化为一个二叉树
     *
     */

    public static void main(String[] args) {

        BiTNode biTNode6 = new BiTNode(60);

        BiTNode biTNode61 = new BiTNode(61);
        BiTNode biTNode7 = new BiTNode(70);
        BiTNode biTNode8 = new BiTNode(80);
        BiTNode biTNode4 = new BiTNode(40);
        BiTNode biTNode5 = new BiTNode(50);
        BiTNode biTNode51 = new BiTNode(51);
        biTNode6.addNode(biTNode5);
        biTNode6.addNode(biTNode7);
        biTNode6.addNode(biTNode51);
        biTNode6.addNode(biTNode8);
        biTNode6.addNode(biTNode61);
        System.out.println(biTNode6.findMax());


    }


}
