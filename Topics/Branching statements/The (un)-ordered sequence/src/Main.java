import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = scanner.nextInt();
        boolean inOrder0 = base != 0;
        boolean inOrderAsc = false;
        boolean inOrderDes = false;
        while (scanner.hasNext()) {
            int follow = scanner.nextInt();
            if (follow == 0) {
                break;
            }
            if (follow < base && !inOrderDes) {
                inOrderDes = true;
            }
            if (follow > base && !inOrderAsc) {
                inOrderAsc = true;
            }
            base = follow;

        }
        boolean case1 = inOrderAsc && !inOrderDes;
        boolean case2 = !inOrderAsc && inOrderDes;
        boolean case3 = !inOrderAsc && !inOrderDes;
        boolean fullCase = case1 || case2 || case3;
        
        System.out.print(inOrder0 && fullCase);
    }
}
