import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
    public String generate(int size) {
        StringBuilder str = new StringBuilder();
        Random ran = new Random();
        char c;
        while (str.toString().length() < size) {
            //Chr from 33 to 126
            c = (char) (ran.nextInt(94) + 33);
            str.append(c);
        }
        return str.toString();
    }

    public static boolean verify(String s) {
        // Length between 5 and 10: {min, [max]} -> {5,10}
        // At least one number: /d+
        // At least one special character: [\x21-\x2F\x3A-\x40\x5B-\x60\x7B-\x7E]+
        // Does not contain spaces: /s{0}
        //String regex = "([[a-zA-Z]*\\d+\\s{0}[\\x21-\\x2F\\x3A-\\x40\\x5B-\\x60\\x7B-\\x7E]+]{5,10})";
        String regex = "^" + "(?=.*{5,10}$)" + "(?=.*[0-9]+)" + "(?=.*[\\x21-\\x2F\\x3A-\\x40\\x5B-\\x60\\x7B-\\x7E]+)" + "((?!\\s).)*$" + ".*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        return matcher.find();
    }
}
