package leetcode;

/**
 * @author tengguokun
 * @date 2022-11-18 16:59:43
 * @description
 */
public class 合并两个有序数组88 {
    public static void main(String[] args) {
        int[] a = {1,2,3,0,0,0};
        int[] b = {2,5,6};
        a = merge(a,3,b,3);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m -1;
        int p2 = n -1;
        int i = m + n -1;
        while(p1 >= 0 && p2 >= 0){
            nums1[i--] = nums1[p1] >= nums2[p2] ? nums1[p1--] : nums2[p2--];
        }
        while (p1 >= 0){
            nums1[i--] = nums1[p1--];
        }
        while (p2 >= 0){
            nums1[i--] = nums2[p2--];
        }
        return nums1;
    }
}
