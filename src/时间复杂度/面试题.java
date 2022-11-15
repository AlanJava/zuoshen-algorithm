package 时间复杂度;

public class 面试题 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,9,8,7,6,5,4,3,2,1};
        int i = t1(arr);
        System.out.println("题目一答案");
        System.out.println(i);
        int[] arr2 = {1,2,3,4,5,6,7,8,9,10,8,7,6,5,4,3,2,1};
        int[] ints = t2(arr2);
        System.out.println("题目二答案");
        for (int cur : ints){
            System.out.println(cur);
        }
    }

    public static int t1(int[] arr){
        int eor = 0;
        for (int cur : arr){
            eor = eor ^ cur;
        }
        return eor;
    }

    public static int[] t2(int[] arr){
        int eor = 0;
        for (int cur : arr){
            eor = eor ^ cur;
        }
        // 提取最后一位的1
        int rightOne = eor & (~eor + 1);
        // eor'
        int onlyOne = 0;
        for (int cur : arr){
            if((cur & rightOne) == 0){
                onlyOne = onlyOne ^ cur;
            }
        }
        int[] result = {onlyOne,(eor ^ onlyOne)};
        return result;
    }
}