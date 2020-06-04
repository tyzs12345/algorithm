package sort.example1;

/**
 * 快速排序
 */
public class Sort4 {

    public static void main(String[] args)
    {
        int[] arr = new int[]{5, 4, 6, 7, 1, 3, 10, 6, 7, 6, 9 };
        sort(arr, 0, arr.length - 1);
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] +", ");
        }

    }

    public static void sort(int[] arr, int lo, int hi)
    {
        if(lo >= hi) return;
        int j = partition(arr, lo, hi);
        sort(arr, lo, j - 1);
        sort(arr, j + 1, hi);

    }

    public static int partition(int[] arr, int lo, int hi)
    {
        int i = lo;
        int j = hi+1;

        while(true)
        {
            while (less(arr, ++i, lo)) if (i == hi) break;
            while (less(arr, lo, --j)) if (j == lo) break;
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

    private static boolean less(int[] arr, int i, int j)
    {
        return arr[i] < arr[j];
    }






}
