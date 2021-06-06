import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leng = sc.nextInt();
        long[] elem = new long[leng];
        int counter = 0;
        for (int i = 0; i < leng; i++) {
            elem[i] =  sc.nextLong();
            if (i > 1 && elem[i] - elem[i - 1] == 1 && elem[i - 1] - elem[i - 2] == 1) {
                counter++;
            }
        }
        System.out.print(counter);
    }
}
