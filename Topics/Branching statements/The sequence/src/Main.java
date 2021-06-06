import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int limit = scanner.nextInt();
        for (int n = 1; n <= limit; n++) {
            for (int i = 1; i <= n; i++) {
                if (limit <= count) {
                    break;
                }
                System.out.print(n + " ");
                count++;
            }
        }
    }
}
