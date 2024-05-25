package Day2.Strings;

import java.util.Scanner;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ipAddress = scanner.nextLine();
        scanner.close();
        Solution solution = new Solution();
        System.out.println(solution.defangIPaddr(ipAddress));
    }
}
