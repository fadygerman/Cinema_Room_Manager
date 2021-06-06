import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leng = scanner.nextInt();
        int[] elem = new int[leng];
        int sum = 0;
        for (int i = 0; i < leng && scanner.hasNext(); i++) {
            elem[i] = scanner.nextInt();
            sum += elem[i]; 
        }  
        System.out.print(sum);
    }
}
