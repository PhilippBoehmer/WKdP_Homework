package P4.Ex1;

public class WrapperTask {

    public static void main(String[] args) {
        char[] values = {'1', 'a', '3', 'z', '9'};
        int[] nums = {10, 0, -4, 20, 5};

        // You can call your methods here and print results
        // Example:
     //   System.out.println(countDigitsPrimitive(values));
      //  System.out.println(countDigitsWrapper(values));
      //  System.out.println(maxPrimitive(nums));
        System.out.println(maxWithWrapper(nums));
    }

    // Task A: Count digits using only primitives (e.g., ASCII comparison)
    public static int countDigitsPrimitive(char[] values) {
        int count = 0;
        for (char c : values) {
            if (c >= '0' && c <= '9') {
                count++;
            }
        }
        return count; // Return the total count
    }

    // Task B: Count digits using Character.isDigit()
    public static int countDigitsWrapper(char[] values) {
        int count = 0;
        for (char c : values) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count; // Return the total count
    }

    // Task C: Find max using only primitives
    public static int maxPrimitive(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i: nums) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    // Task D: Find max using Integer.compare()
    public static int maxWithWrapper(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i: nums) {
            if (Integer.compare(i, max) > 0) {
                max = i;
            }
        }
        return max;
    }
}

