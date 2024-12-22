public class LargestNumberDivisibleBy10And13 {
    public static void main(String[] args) {
        // Start from the largest 4-digit number
        int num = 9999;
        
        // Check divisibility by both 10 and 13
        while (num >= 1000) {
            if (num % 10 == 0 && num % 13 == 0) {
                System.out.println("The largest 4-digit number divisible by 10 and 13 is: " + num);
                break;
            }
            num--;
        }
    }
}