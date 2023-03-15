public class SumEven {
    public static int sumEvenFibonacci(int limit) {
        int sum = 0;
        int prev1 = 1;
        int prev2 = 2;

        if (prev1 % 2 == 0) {
            sum += prev1; // add first term if it's even
        }
        if (prev2 % 2 == 0) {
            sum += prev2; // add second term if it's even
        }

        int curr = prev1 + prev2;
        while (curr <= limit) {
            if (curr % 2 == 0) {
                sum += curr; // add even-valued term to sum
            }
            prev1 = prev2;
            prev2 = curr;
            curr = prev1 + prev2; // calculate next term
        }

        return sum;
    }
}