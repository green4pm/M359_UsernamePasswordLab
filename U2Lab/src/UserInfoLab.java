import java.util.Scanner;
public class UserInfoLab {
    public static void main(String[] args) {
        String first = "";
        String last = "";
        String passCard = "";

        // Part 1
        // Create a Scanner for keyboard input
        Scanner scan = new Scanner(System.in);
        // Ask the user to enter their first and last name and pass these
        System.out.print("Put in yo first name ");
        first = scan.nextLine();
        System.out.print("Put in yo last name ");
        last = scan.nextLine();
        // values to the generateUsername method and save the returned result.
        String saved = generateUsername(first, last);
        // Part 2
        // Ask the user to enter a password and pass this value to the validatePassword method.
        System.out.print("Enter yo password twin");
        String password = scan.nextLine();
        Boolean savedP = validatePassword(password);
        // The validatePassword method will check if the password meets the criteria:
        // Part 3
        // If the user entered a valid password in step 2, then ask the user to enter their
        // credit card number and pass this value to the maskCreditCard method.
        if(savedP == true) {
            System.out.println("Please put in your credit card info");
            String credit = scan.nextLine();
            passCard = maskCreditCard(credit);
        }
        // Part 4
        // If the user entered a valid password AND valid credit card number, display the output
        // as shown in the demo video
        if (savedP == true && passCard.length() == 16){
            System.out.println(savedP);
        }
        // https://drive.google.com/file/d/1sMOw5wkOgSfuUcvQhFyZ5flnv_d9qQd3/view?usp=sharing
        System.out.println("Your username is " + savedP);
        System.out.println("Your password is " + savedP);
        System.out.println("Your username is " + savedP);

    }

    public static String generateUsername(String firstName, String lastName) {
        String a = "";
        String b = "";
        // Fill in this method and return an appropriate username
        if(firstName.length() >= 3) {
            a = firstName.substring(0,3).toLowerCase();
        }
        if(lastName.length() >= 3) {
            b = firstName.substring(0,3).toLowerCase();
        }
        else{
            a = firstName.toLowerCase();
            b = lastName.toLowerCase();
        }
        return a + b;
    }
    public static boolean validatePassword(String password) {
        // Fill in this method and return true/false if the password is valid
        Boolean a = true;
        Boolean b = false;
        Boolean c = true;
        if (password.length() < 8) {
            a = false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (password.substring(i, i + 1).equals(password.substring(i, i + 1).toUpperCase()))
                b = true;
        }
        for (int i = 0; i < password.length(); i++) {
            if(containsDigit(password.substring(i, i+1).toUpperCase()))
                b = true;
        }
        if(){

        }
        else{
            return false;
        }
        return true;
    }
    public static String maskCreditCard(String creditCardNumber) {
        // Fill in this method and if the credit card is valid, return a masked CC
        String a = "";
        if(creditCardNumber.length() == 16){
            if(allDigits(creditCardNumber) == true){
                a = creditCardNumber.substring(12,16);
                return " **** **** **** " + a;
            }
        }
        return "";
    }

    /**
     This method verifies that the string contains at least one numeric digit
     @param str The string to check
     @return true or false if a digit is present
     */
    public static boolean containsDigit(String str) {
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (Character.isDigit(c))
                return true;
        }
        return false;
    }

    /**
     * Checks if the entire String is all numerical
     * @param str The string to check
     * @return true or false if the string is ALL digits
     */
    public static boolean allDigits(String str) {
        char[] chars = str.toCharArray();
        for (char c: chars) {
            if (!Character.isDigit(c))
                return false;
        }
        return true;
    }

}
