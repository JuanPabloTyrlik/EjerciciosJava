import java.util.Random;

public class Password {
    public String generate (int size) {
        StringBuilder str = new StringBuilder();
        Random ran = new Random();
        char c;
        while (str.toString().length() < size) {
            //Chr from 33 to 126
            c = (char) (ran.nextInt(94)+33);
            str.append(c);
        }
        return str.toString();
    }
}
