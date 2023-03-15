public class Fibonacci {
    public static void main(String[] args) {
        int num1=10;
       int num=0;
        int prev1=1;
        int prev2=2;
        System.out.println(prev1+""+prev2+"");
        int curr=prev1+prev2;
        System.out.println(curr+"");
        prev1=prev2;
        prev2=curr;

    }

}
