import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regNum = scanner.nextLine(); // a valid or invalid registration number
        String vrn = "[ABEKMHOPCTYX]\\d{3}[ABEKMHOPCTYX]{2}";
        boolean isVrn = regNum.matches(vrn);
        System.out.print(isVrn);
    }
}
