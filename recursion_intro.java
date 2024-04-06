public class recursion_intro {
    public static void print_num(int n) {
        if (n == 6) {
            return;
        } else {
            System.out.println(n);
            print_num(n + 1);
        }
    }

    public static void main(String[] args) {
        print_num(1);
    }

}
