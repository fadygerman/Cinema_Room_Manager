import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        String ipp = "(((2[1-4]\\d)|(25[0-5]))|(1?[1-9]?\\d))";
        String isIp = String.format("%s\\.%s\\.%s\\.%s", ipp, ipp, ipp, ipp);
        System.out.println(ip.matches(isIp) ? "YES" : "NO");
    }
}
