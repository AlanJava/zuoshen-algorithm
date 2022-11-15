package 时间复杂度;

public class 冒泡排序 {
    public static void main(String[] args) {
        int[] arr = {1,5,7,2,4,7,8,3,5,12};
        int[] sortArr = popSort(arr);
        for (int num : sortArr) {
            System.out.println(num);
        }
    }

    /**
     * 从后往前比,看谁小谁在前,一轮下来最小的就确定了
     * @return
     */
    public static int[] popSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i <= n-1; i++) {
            for (int j = n-1; j >i; j--) {
                if(arr[j-1] > arr[j]){
                    arr = swap(arr,j-1,j);
                }
            }
        }
        return arr;
    }

    /**
     * 异或交换
     * @param arr
     * @param i
     * @param j
     * @return
     */
    public static int[] swap(int[] arr,int i,int j){
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
        return arr;
    }
}
