import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++){
            nums[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        for (int j : nums){
            if(j > n){
                sum += j;
            }
        }
        System.out.println(sum);

    }
}