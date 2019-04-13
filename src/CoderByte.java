public class CoderByte {
    public boolean simpleSymbols(String str) {
        Character c;
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            if (Character.isLetter(c)) {
                if (i==0 || i+1>=str.length()) {
                    return false;
                } else {
                    if (str.charAt(i-1) != '+' || str.charAt(i+1) != '+') {
                        return false;
                    }
                }
            }
        }
        return true;
    }



}
