import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int i = scanner.nextInt();
            if (i == 0) {
                break;
            }
            System.out.println(i % 2 == 0 ? "even" : "odd");
            
        }
    }
}
