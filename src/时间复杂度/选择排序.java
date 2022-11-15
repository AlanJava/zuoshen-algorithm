package 时间复杂度;


public class 选择排序 {
    public static void main(String[] args) {
        int[] arr = {1,5,7,2,4,7,8,3,5,12};
        int[] sortArr = selectSort(arr);
        for (int num : sortArr) {
            System.out.println(num);
        }
    }

    /**
     * 谁最小谁在0,谁最小谁在1.....谁最小谁在n-1
     * @param arr
     * @return
     */
    public static int[] selectSort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                if(arr[i] > arr[j]){
                    arr = swap(arr,i,j);
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
