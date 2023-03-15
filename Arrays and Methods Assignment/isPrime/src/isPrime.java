public class isPrime {

static int num,num1;
    public static Boolean prime(int num) {

        if (num <= 1) {
            return false;
        }
        for (int num1 = 2; num1 <= Math.sqrt(num); num1++) {
            if (num % num1 == 0) {
                return false;
            }
            return false;
        }

        return true;
    }
}





