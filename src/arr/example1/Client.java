package arr.example1;

import java.util.HashMap;
import java.util.Map;

public class Client {


    /**
     * 数字1～1000放在含有1001个元素的数组中，其中只有唯一的一个元素值重复，其他数字均只出现一次。
     * 设计一个算法，将重复元素找出来，要求每个数组元素只能访问一次。如果不使用辅助存储空间，能否设计一个算法实现？
     */

    public static void main(String[] args)
    {
        // 0 , 1, 2, 3, 4, 5
        int[] searchMax = new int[]{0, 1, 2, 3,4, 5, 6, 7, 8, 9, 3};
        int i = searchRepeat2(searchMax);
        System.out.println(i);

    }

    /**
     * 算法1，借用hashMap实现，
     * 初始化hashmap，1001个数值为0的元素，
     * 将这1001一个数当作key存进hashmap里，对应的值不为0即可。
     * 存进去之前先根据对应的key获取，如果不为0就表明，对应的value重复
     *
     */
    public static int searchRepeat1(int[] arr)
    {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i ++){
            map.put(i, 0);
        }

        for(int i = 0; i < arr.length; i ++){
           if(map.get(arr[i]) == 0) map.put(arr[i], 1);
           else return arr[i];
        }
        return -1;
    }

    /**
     * 求和，比正常的0+1+...+1000大的数值，就是重复的数值
     */
    public static int searchRepeat2(int[] arr)
    {
        int min = searchMin(arr);
        int max = searchMax(arr);
        //(max - min + 1) * (max + min)/2
        int result = (max - min + 1) * (max + min)/2;
        int resultExtr = arrSum(arr, 0);

        return resultExtr - result;
    }

    //遍历数组找出最大的
    public static int searchMax(int[] arr)
    {
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
        }
        return max;
    }

    //遍历数组找出最大的
    public static int searchMin(int[] arr)
    {
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min) min = arr[i];
        }
        return min;
    }
    //数组求和
    public static int arrSum(int[] arr, int i)
    {
        if(arr == null) return 0;
        if(i == arr.length) return 0;
        return arr[i] + arrSum(arr, ++i);
    }



}
