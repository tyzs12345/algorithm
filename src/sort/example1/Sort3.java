package sort.example1;

import org.omg.Messaging.SyncScopeHelper;

import java.time.Instant;

import static java.time.temporal.ChronoField.INSTANT_SECONDS;

/**
 * 插入排序
 */
public class Sort3 {

    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 4, 6, 7, 1, 3, 10, 6, 7, 6, 9 };
        sort(arr);
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] +", ");
        }

    }

    public static void sort(int[] arr)
    {
        int N = arr.length;
        if(N <= 1) return;
        for(int i = 1; i < N; i ++){
            //如果 arr[j]>= arr[j-1]则跳出下面的循环
            for(int j = i; 0 < j && arr[j] < arr[j-1]; j--)
            {
                exch(arr, j, j-1);
            }

        }

    }

    private static void exch(int[] arr, int lo, int hi) {
        if(arr[lo] == arr[hi]) return;
        else {
            int tem = arr[hi];
            arr[hi] = arr[lo];
            arr[lo] = tem;
        }
    }




}
