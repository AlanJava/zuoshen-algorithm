package leetcode;

/**
 * @author tengguokun
 * @date 2022-11-18 16:59:43
 * @description
 */
public class 合并两个有序数组88 {
    public static void main(String[] args) {
        int[] a = {3,1};
        int[] b = {5,2};
        merge(a,2,b,2);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] tempArray = new int[m+n];
        int i = 0;
        int p1 = 0;
        int p2 = 0;
        while(p1 <= m-1 && p2 <= n-1){
            tempArray[i++] = nums1[p1++] >= nums2[p2++] ? nums1[p1++] : nums2[p2++] ;
        }
        while (p1 <= m){
            tempArray[i++] = nums1[p1++];
        }
        while (p2 <= n){
            tempArray[i++] = nums2[p2++];
        }
        nums1 = tempArray;
    }
}
