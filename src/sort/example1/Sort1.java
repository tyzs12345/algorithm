package sort.example1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 快速排序
 *
 */
public class Sort1 {


    public static void main(String[] args) 
    {
        int[] arr = new int[]{6, 4, 5, 7, 2, 3, 8, 9};




    }

    public static void sort(int[] arr, int lo, int hi)
    {   // 6、6
        if(lo == hi) return;
        int i = quickSort(arr, lo, hi);
        sort(arr, lo, i-1);
        sort(arr, i+1, hi);
    }



    //{7, 1, 3, 5, 13, 9, 3, 6, 11}
    //{7, 1, 3, 5, 6, 9, 3, 13, 11}
    //{7, 1, 3, 5, 6, 3, 9, 13, 11}
    //{3, 1, 3, 5, 6, 7, 9, 13, 11}

     //     i = 3,j=2
    //   6、8、7、5 --- 6、4、5、7
    //   7、6、5、4        i = 3; j = 2   i>j
    //   4、3、2、5  ---  4、3、5、2
    //   从左边找比当前基数大的数（i）；
    //   从右边找比当前基数小的数（j）；
    //   基数（lo）与比她小的数交换；
    /**
     * 情况分析:
     *  0、正常情况，将元素i与元素j交换位置，再将基数与i交换位置
     *
     *  1、当找不到比lo大的数{
     *      跳出当前循环；如果右边有比它小的数，则交换两者位置。
     *
     *
     *  }
     *  2、当找不到比lo小的数：{
     *      跳出当前循环；
     *
     *  }
     *
     *  3、当找到比lo大的数{
     *      1、没有比它小的数；
     *      2、i >= j;
     *  }
     *  6、5
     */
    public static int quickSort(int[] arr, int lo, int hi)
    {
       // if(lo == hi) return arr;
        int i = lo;
        int j = hi + 1;
        while(true){
            //从左边找比当前基数大的数（i）；
            while (less(arr, ++i, lo)) if(i == hi) break;
            //   从右边找比当前基数小的数（j）；
            while (less(arr, lo, --j)) if(j == lo) break;
            //
            if(i >= j) break;
            exch(arr, i, j);
        }
        exch(arr, lo, j);
        return j;
    }

    private static void exch(int[] arr, int lo, int hi) {
        if(arr[lo] == arr[hi]) return;
        else {
            int tem = arr[hi];
            arr[hi] = arr[lo];
            arr[lo] = tem;
        }
    }

    /**
     *  arr[i] 小于或者等于
     */
    public static boolean less(int[] arr, int i, int j)
    {
        return arr[i] <= arr[j];
    }




}
