public class Vowels {

    public static int getCount(String str) {
        int vowelsCount = 0;
        final char[] vowels = {'a','e','i','o','u'};
        for (int i = 0; i < str.length(); i++) {
            for (char vowel : vowels) {
                if (str.charAt(i) == vowel) {
                    vowelsCount++;
                }
            }
        }

        return vowelsCount;
    }

/*// BETTER SOLUTION
    public static int getCount(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
*/
}
