package PractiseCodingJava;

import java.util.regex.Pattern;

public class regularExpression {
    public static void main(String[] args) {
        // Data format (dd/mm/yyyy)
        String dateregx = "^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)$";
//                         Explanation: ^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\d\d)$
//                                      ^ and $ = start and end of the string.
//                                      (0?[1-9]|[12][0-9]|3[01]) = matches 01 to 31
//                                       / = slash separator
//                                       (0?[1-9]|1[012]) =  matches 01 to 12
//                                       (19|20)\\d\\d = matches years starting with 19 and 20
        System.out.println("Date '25/12/2023' is valid: " + Pattern.matches(dateregx, "25/12/2023"));
        System.out.println("Date '32/01/2024' is valid: " + Pattern.matches(dateregx, "32/01/2024"));

        // Email format
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
//         Explanation Email:- ^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$
//                             ^[a-zA-Z0-9._%+-]+ = username part (letters, numbers, dots, etc.)
//                             @ = at symbol
//                             [a-zA-Z0-9.-]+ = domain name (e.g., gmail, yahoo)
//                             \\.[a-zA-Z]{2,}$ = dot followed by 2 or more letters (like .com, .org)
        System.out.println("Email 'test@example.com' is valid: " + Pattern.matches(emailRegex, "test@example.com"));
        System.out.println("Email 'invalid.email' is valid: " + Pattern.matches(emailRegex, "invalid.email"));
    }
}
