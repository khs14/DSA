public class recursion_fact {
    public static int fact(int n){
        if (n==1 || n==0){
            return 1;
        }
        int ans  = n*fact(n-1);
        return ans;
    }
    public static void main(String[] args) {
        int n = 5;
        int test = fact(n);
        System.out.println(test);
    }
    
}
