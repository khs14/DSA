public class fibonacci {
    public static void fibo(int a, int b, int n) {
        if (n == 0) {
            return;
        }
        int next_term = a + b;
        System.out.println(next_term);
        fibo(b, next_term, n - 1);

    }

    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int n = 7;

        System.out.println(a);
        System.out.println(b);
        fibo(a, b, n - 2);
    }

}
