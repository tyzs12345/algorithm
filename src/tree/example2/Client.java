package tree.example2;

import tree.example1.build.BiTNode;

public class Client {

    /**
     * 将有序数组转化为二叉树
     */

    public static void main(String[] args) {

        int [] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        //递归取中间；
        BiTNode biTNode = arrToTree(0, arr.length-1, arr);
        printTree(biTNode);

    }
   //0、1、2、3、4、（5）、6、7、8、9    ----18
    public static BiTNode arrToTree(int start, int end, int[] arr)
    {
        if(arr.length == 0) return null;
        if(arr.length == 1) return new BiTNode(arr[0]);
        if(start > end) return null;

        int intermediate = (start + end + 1)/2;
        BiTNode biTNode = new BiTNode(arr[intermediate]);
        biTNode.right = arrToTree(intermediate + 1, end, arr);
        biTNode.left = arrToTree(start, intermediate - 1, arr);
        return biTNode;
    }
    /**
     * 遍历打印二叉树
     */
    public static void printTree(BiTNode node)
    {
        if(node == null) return;
        System.out.println(node.getValue());
        printTree(node.left);
        printTree(node.right);




    }



}
