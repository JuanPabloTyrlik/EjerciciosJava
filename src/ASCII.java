import org.jetbrains.annotations.NotNull;

public class ASCII {
    public static String stringToASCII(@NotNull String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str += Character.getNumericValue(s.charAt(i)) + " ";
        }
        return str;
    }
}
