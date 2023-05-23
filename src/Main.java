import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        email();
        phone();
        date();
        url();
        creditcard();
        zipcode();
        identifier();
        hexadecimal();
        time();

    }
    //        Write a regular expression to match a valid email address.
    public static void email() {
        String email = "infolog@example.com";
        String regex = "^[\\w.%+-]+@[\\w.-]+\\.[A-Za-z]{2,}$";

        boolean validity = Pattern.matches(regex, email);
        System.out.println("The email's validity: " + validity);
    }
    //        Write a regular expression to match a valid phone number in the format (123) 456-7890.
    public static void phone() {

        boolean phonevalidity = Pattern.compile("^\\(?\\d{1,3}?\\)?[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,4}[-.\\s]?\\d{1,9}$")
                .matcher("(615) 243-5172")
                .find();
        System.out.println("The phone number's validity is: " + phonevalidity);
    }
//       Write a regular expression to match a valid date in the format MM/DD/YYYY.
    public static void date() {
        boolean datevalidity = Pattern.compile("^(0?[1-9]|[12][0-9]|3[01])[\\/\\-](0?[1-9]|1[012])[\\/\\-]\\d{4}$")
                .matcher("10/04/1999")
                .find();
        System.out.println("The date's validity is: " + datevalidity);

    }

//              Write a regular expression to match a valid URL.
    public static void url() {
        boolean urlvalidity = Pattern.compile("((http|https)://)(www.)?[a-zA-Z0-9@:%._\\+~#?&//=]{2,256}\\.[a-z]{2,6}\\b([-a-zA-Z0-9@:%._\\+~#?&//=]*)")
                .matcher("https://google.com")
                .find();
        System.out.println("The URL's validity is: " + urlvalidity);

    }
//     Write a regular expression to match a valid credit card number (16 digits, may be separated by dashes or spaces).
public static void creditcard() {
    boolean cardvalidity = Pattern.compile("(?<mastercard>5[1-5][0-9]{14})|")
            .matcher("1111 2222 3333 4444 5555")
            .find();
    System.out.println("The credit card's validity is: " + cardvalidity);

}
//                Write a regular expression to match a valid US zip code (5 digits, may have a dash followed by 4 more digits).
public static void zipcode() {
    boolean zipvalidity = Pattern.compile("^[0-9]{5}(?:-[0-9]{4})?$")
            .matcher("11706-1111")
            .find();
    System.out.println("The zip code's validity is: " + zipvalidity);
}

//       Write a regular expression to match a valid Java identifier (a sequence of letters, digits, underscores, and dollar signs, not starting with a digit).
public static void identifier() {
    boolean identifiervalidity = Pattern.compile("^([a-zA-Z_$][a-zA-Z\\\\d_$]*)$")
            .matcher("D$skjd_$h")
            .find();
    System.out.println("The identifier's validity is: " + identifiervalidity);
}

//       Write a regular expression to match a valid hexadecimal color code (starts with a # followed by 6 hexadecimal digits).
public static void hexadecimal() {
    boolean hexvalidity = Pattern.compile("^#([A-Fa-f0-9]{6}|[A-Fa-f0-9]{3})$")
            .matcher("#543028")
            .find();
    System.out.println("The hexadecimal code's validity is: " + hexvalidity);
}

//                Write a regular expression to match a valid time in the 24-hour format (HH:MM).
public static void time() {
    boolean timevalidity = Pattern.compile("^([01]\\d|2[0-3]):?([0-5]\\d)$")
            .matcher("22:30")
            .find();
    System.out.println("The time's validity is: " + timevalidity);
}


    }

