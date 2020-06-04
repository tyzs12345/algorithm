package sort.example1;

/**
 * 归并排序
 */
public class Sort2 {


    private static int[] aux;

    public static void main(String[] args)
    {
        int[] arr = {9,3,5,2,5,6,8,8,5,8,9,4,1,2};
        sort(arr);
        for(int i = 0; i < arr.length; i ++){
            System.out.print(arr[i] +", ");
        }

    }

    public static void sort(int[] arr)
    {
        aux = new int[arr.length];
        sort(arr, 0,arr.length - 1);
    }


    public static void sort(int[] arr,  int lo, int hi)
    {
        if(hi <= lo) return;
        int mid = lo + (hi - lo)/2;
        sort(arr, lo, mid);
        sort(arr, mid+1, hi);
        merge(arr, lo, mid, hi);

    }



    public static void merge(int[] arr, int lo, int mid, int hi)
    {
        for(int i = lo; i <= hi; i++)
           aux[i] = arr[i];

        int i = lo;
        int j = mid + 1;
        for(int k = lo; k <= hi; k++ )
            if(j > hi) arr[k] = aux[i++];
            else if (i > mid) arr[k] = aux[j--];
            else if(aux[i] < aux[j]) arr[k] = aux[i++];
            else arr[k] = aux[j++];
    }


}
