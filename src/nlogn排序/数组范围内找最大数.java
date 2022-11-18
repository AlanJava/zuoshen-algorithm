package nlogn排序;

public class 数组范围内找最大数 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7,8,2,234,435,63};
        int max = findMax(arr, 0, arr.length-1);
        System.out.println(max);
    }
    
    public static int findMax(int[] arr, int left,int right){
        if(left == right){
            return arr[left];
        }
        // 中间下标 本来应该是(left + right) / 2,为了防止数组特别大,left +right 超出int 的取值范围
        // 变成了 left + ((right-left) / 2)
        // 既然是除以2,就可以变成二进制的位运算 >> 
        int midIndex = left + ((right - left) >> 1);
        int leftMax = findMax(arr,left,midIndex);
        int rightMax = findMax(arr,midIndex+1,right);
        return Math.max(leftMax,rightMax);
    }
}
