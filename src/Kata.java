import java.util.ArrayList;


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

    public static int ConvertBinaryArrayToInt(Integer[] binary) {
        String str = "";
        for (Integer i: binary) {
            str += i;
        }
        return Integer.parseInt(str, 2);
    }

    public static String disemvowel(String str) {
        return str.replaceAll("(?i)[aeiou]","");
    }

    public static boolean isValid(char[] walk) {
        int x=0,y=0,min=0;
        for (char c : walk) {
            switch (c) {
                case 'n':
                    y++;
                    min++;
                    break;
                case 's':
                    y--;
                    min++;
                    break;
                case 'e':
                    x++;
                    min++;
                    break;
                case 'w':
                    x--;
                    min++;
                    break;
            }
        }
        if (x==0 && y==0 && min==10) {
            return true;
        }
        return false;
    }

    public static String spinWords(String sentence) {
        String[] words = sentence.trim().split(" ");
        sentence = "";
        for (String word : words) {
            if (word.length()>=5) {
                word = new StringBuilder(word).reverse().toString();
            }
            sentence += word+" ";
        }
        return sentence.trim();
    }

    public static String[] dirReduc(String[] arr) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            switch (s) {
                case "NORTH":
                    if (list.contains("SOUTH")) {
                        list.remove("SOUTH");
                    } else {
                        list.add(s);
                    }
                    break;
                case "SOUTH":
                    if (list.contains("NORTH")) {
                        list.remove("NORTH");
                    } else {
                        list.add(s);
                    }
                    break;
                case "EAST":
                    if (list.contains("WEST")) {
                        list.remove("WEST");
                    } else {
                        list.add(s);
                    }
                    break;
                case "WEST":
                    if (list.contains("EAST")) {
                        list.remove("EAST");
                    } else {
                        list.add(s);
                    }
                    break;
            }
        }
        String[] directions = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            directions[i] = list.get(i);
        }
        return directions;
    }
}
