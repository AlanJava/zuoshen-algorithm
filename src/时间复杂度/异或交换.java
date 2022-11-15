package 时间复杂度;

public class 异或交换 {
        public static void main(String[] args) {
            int a = 1;
            int b = 2;
            System.out.println("a="+a);
            System.out.println("b="+b);
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;
            System.out.println("异或结果");
            System.out.println("a="+a);
            System.out.println("b="+b);
    }
}
