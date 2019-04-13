import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Patente {
    public boolean isPatente(String patente) {
        String regex = "^([a-zA-Z]{3}[0-9]{3}|[a-zA-z]{2}[0-9]{3}[a-zA-Z]{2})";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(patente);
        return matcher.find();
    }
}
