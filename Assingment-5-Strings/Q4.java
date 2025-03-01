import java.util.Scanner;

public class Q4 {
    public static boolean isValidEmail(String email) {
        int atIndex = email.indexOf('@');
        if (atIndex == -1 || atIndex != email.lastIndexOf('@')) {
            return false;
        }
        String localPart = email.substring(0, atIndex);
        String domainPart = email.substring(atIndex + 1);
        if (localPart.isEmpty() || domainPart.isEmpty()) {
            return false;
        }
        int dotIndex = domainPart.indexOf('.');
        if (dotIndex == -1 || dotIndex == domainPart.length() - 1) {
            return false;
        }
        String tld = domainPart.substring(dotIndex + 1);

        String[] validTLDs = {"com", "net", "org", "edu", "gov", "in"};
        boolean isValidTLD = false;
        for (String validTLD : validTLDs) {
            if (tld.equalsIgnoreCase(validTLD)) {
                isValidTLD = true;
                break;
            }
        }

        return isValidTLD;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an email address: ");
        String email = scan.nextLine();

        if (isValidEmail(email)) {
            System.out.println("Valid email address.");
        } else {
            System.out.println("Invalid email address.");
        }
    }
}
