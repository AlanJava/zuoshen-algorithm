package nlogn排序;

public class 归并排序 {
    public static void main(String[] args) {
        int[] arr = {4,1,6,3,2};
        arr = mergeSort(arr,0,arr.length -1);
        for (int i : arr) {
            System.out.println(i);
        }
    }
    
    public static int[] mergeSort(int[] arr,int left,int right){
        if(left == right){
            return arr;
        }
        // 中间值
        int mid = left + ((right - left) >> 1);
        // 左边排序
        arr = mergeSort(arr,left,mid);
        // 右边排序
        arr = mergeSort(arr,mid + 1,right);
        arr = mergeArray(arr,left,mid,right);
        return arr;
    }
    
    public static int[] mergeArray(int[] array, int left, int mid, int right){
        int[] temp = new int[right - left + 1];
        int i = 0;
        int p1 = left;
        int p2 = mid + 1;
        // 比较左右两部分的元素，哪个小，把那个元素填入temp中
        while (p1 <= mid && p2 <= right) {
            temp[i++] = array[p1] < array[p2] ? array[p1++] : array[p2++];
        }
        // 上面的循环退出后，把剩余的元素依次填入到temp中
        // 以下两个while只有一个会执行
        while (p1 <= mid) {
            temp[i++] = array[p1++];
        }
        while (p2 <= right) {
            temp[i++] = array[p2++];
        }
        // 把最终的排序的结果复制给原数组
        for (i = 0; i < temp.length; i++) {
            array[left + i] = temp[i];
        }
        return array;
    }
}
