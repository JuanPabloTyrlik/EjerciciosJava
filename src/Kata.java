class Kata {
    public static String getMiddle(String word) {
        String w = "";
        if (word.length() % 2 != 0) {
            w += word.charAt(Math.round(word.length()/2));
        } else {
            w += word.charAt(word.length()/2-1);
            w += word.charAt(word.length()/2);
        }
        return w;
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        //Code here ;)
        return null;
    }
}
