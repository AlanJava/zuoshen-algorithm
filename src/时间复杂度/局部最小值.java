package 时间复杂度;

/**
 * @author tengguokun
 * @date 2022-11-17 16:29:18
 * @description
 */
public class 局部最小值 {
    public static void main(String[] args) {
        //测试
        int[] arr = {4,3,6,8,2,1,5,7,8};
        int res = findMin(arr);
        if(res < 0) {
            System.out.println("最小值不存在");
        } else {
            System.out.println(arr[res]);
        }
    }
    
    public static int findMin(int[] arr){
        //数组为空或数据长度为0
        if (arr == null || arr.length == 0) { 
            return -1;
        }
        //数组只有一个元素即为局部最小值
        if (arr.length == 1) { 
            return 0;
        }
        //数组第一个元素比第二个元素小，即为局部最小值
        if (arr[0] < arr[1]) { 
            return 0;
        }
        //数组最后一个元素比它前一个元素小，即为局部最小值
        if (arr[arr.length - 1] < arr[arr.length - 2]) {
            return arr.length - 1;
        }
        //上述条件均不满足，局部最小值必在数组内部取得(左边往中间下降趋势,右边往中间也是下降趋势,中间肯定有局部最小值)
        //用二分法思想求解
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + ((right - left) >> 1);
            // 在左边找
            if (arr[mid - 1] < arr[mid]) {
                right = mid;
            }
            // 在右边找
            else if (arr[mid+1] < arr[mid]) {
                left = mid + 1;
            } 
            // 局部最小值  arr[mid - 1] < arr[mid] < arr[mid+1]
            else {
                return mid;
            }
        }
        return -1;
    }
}
