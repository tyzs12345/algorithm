package sort.example1;

public class Cleint {

    /**
     * 冒泡排序：
     * 从左往右比较元素，大的元素往右放.
     * 每一次循环都把数值大的元素放到后面，
     * 每一次比较都将当前的比较元素置换成数值大的元素
     */
    public static void main(String[] args)
    {

        int[] arr = new int[]{6, 4, 5, 7, 2, 3, 8, 9};
        int[] sortArr = sort(arr);
        System.out.println(sortArr);

    }

    /**
     * 冒泡排序
     */
    public static int[] sort(int[] arr)
    {
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = i+1; j < arr.length; j++){
                if(arr[i] > arr[j]){
                    int tem = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tem;
                }
            }
        }

        return arr;
    }
    /**
     * 快速排序
     */







}
