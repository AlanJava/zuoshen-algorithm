package 时间复杂度;

/**
 * @author tengguokun
 * @date 2022-11-16 15:30:19
 * @description
 */
public class 二分查找 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12};
        int i = binarySearch(arr, 9, 0, arr.length-1);
        System.out.println(i);
    }

    /**
     * 二分查找
     * @param arr
     * @param target
     * @param leftIndex
     * @param rightIndex
     * @return
     */
    public static int binarySearch(int[] arr,int target,int leftIndex,int rightIndex) {
        // 目标数比队列最小的数还小 || 目标数比队列最大的数还大 || 左下标大于等于右下标
        if (target < arr[leftIndex] || target > arr[rightIndex] || leftIndex >= rightIndex) {
            return -1;
        }
        //初始中间位置
        int middle = (leftIndex + rightIndex) / 2;
        if (arr[middle] > target) {
            //比关键字大则关键字在左区域
            return binarySearch(arr, target, leftIndex, middle - 1);
        } 
        else if (arr[middle] < target) {
            //比关键字小则关键字在右区域
            return binarySearch(arr, target, middle + 1, rightIndex);
        } 
        else {
            return middle;
        }
    }
}
