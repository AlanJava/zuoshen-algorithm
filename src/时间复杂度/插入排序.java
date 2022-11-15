package 时间复杂度;

public class 插入排序 {
    public static void main(String[] args) {
        int[] arr = {3,5,7,2,6,7,8,9,10,9,8,7,6,5,4,3,2,1};
        int[] sort = sort(arr);
        for (int i : sort) {
            System.out.println(i);
        }
    }

    /**
     * 外循环:先让0-1是有序的,再让0-2是有序的,一直让0-n有序
     * 内循环:2和1比,看谁小,2和0比,看谁小
     * @param arr
     * @return
     */
    public static int[] sort(int[] arr){
        // 空数组和2位数就不比较了
        if (arr == null || arr.length <2){
            return arr;
        }
        // 0-n有序
        for (int i = 1; i < arr.length; i++) {
            // 到了左边数比右边小,或者左边直接左到头了就停下来
            for (int j = i;j > 0 && arr[j-1] > arr[j];j--){
                arr = swap(arr,j-1,j);
            }
        }
        return arr;
    }
    
    public static int[] swap(int[] arr,int i,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
        return arr;
    }
    
}
