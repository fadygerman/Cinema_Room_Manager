import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] numbers = scanner.nextLine().split(" ");
        int[] nums = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            nums[i] = Integer.parseInt(numbers[i]);
        }
        int rotNum = scanner.nextInt() % nums.length;
        int[] newNums;
        for (int i = 0; i < rotNum; i++) {
            newNums = new int[nums.length];
            for (int j = 1; j < nums.length; j++) {
                if (j == nums.length - 1) {
                    newNums[0] = nums[j];
                }
                newNums[j] = nums[j - 1];
            }
            nums = newNums;
        }
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
