public class Class07 {
    public static double power(int x, int n) {
        if (n == 0) {
            return 1; // 當 n 為 0 時，任何數的 0 次方都是 1
        } else if (n % 2 == 0) {
            double halfPower = power(x, n / 2);
            return halfPower * halfPower; // 若 n 為偶數，將問題拆分為 x^(n/2) * x^(n/2)
        } else {
            return x * power(x, n - 1); // 若 n 為奇數，將問題拆分為 x * x^(n-1)
        }
    }

    public static void main(String[] args) {
        int base1 = 2;
        int exp1 = 5;
        int base2 = 3;
        int exp2 = 2;

        // 先計算 (2^5)
        double result1 = power(base1, exp1);

        // 再計算 (3^2)
        double result2 = power(base2, exp2);

        // 最後計算 (2^5)^(3^2)
        double finalResult = power((int) result1, (int) result2);

        System.out.println("(2^5)^(3^2) = " + finalResult);
    }
}
