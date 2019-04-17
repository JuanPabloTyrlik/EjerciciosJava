import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Stack;


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
//        ArrayList<String> list = new ArrayList<>();
//        for (String s : arr) {
//            switch (s) {
//                case "NORTH":
//                    if (list.contains("SOUTH")) {
//                        list.remove("SOUTH");
//                    } else {
//                        list.add(s);
//                    }
//                    break;
//                case "SOUTH":
//                    if (list.contains("NORTH")) {
//                        list.remove("NORTH");
//                    } else {
//                        list.add(s);
//                    }
//                    break;
//                case "EAST":
//                    if (list.contains("WEST")) {
//                        list.remove("WEST");
//                    } else {
//                        list.add(s);
//                    }
//                    break;
//                case "WEST":
//                    if (list.contains("EAST")) {
//                        list.remove("EAST");
//                    } else {
//                        list.add(s);
//                    }
//                    break;
//            }
//        }
//        String[] directions = new String[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            directions[i] = list.get(i);
//        }
//        return directions;
//    }
    ArrayList<String> list = new ArrayList<>();
    int counter =0;
        for (int i = 0; i < arr.length; i++) {
        list.add(arr[i]);
    }
        do { counter = 0;
        for (int i = 0; i < list.size(); ++i) {
            switch (list.get(i)) {
                case "NORTH":
                    try {
                        if (list.get(i+1) == "SOUTH") {
                            list.remove(i+1);
                            list.remove(i);
                            counter++;
                        }
                        break;
                    } catch (Exception e) {break;}
                case "SOUTH":
                    try {
                        if (list.get(i+1) == "NORTH") {
                            list.remove(i+1);
                            list.remove(i);
                            counter++;
                        }
                        break;
                    } catch (Exception e) {break;}
                case "EAST":
                    try {
                        if (list.get(i+1) == "WEST") {
                            list.remove(i+1);
                            list.remove(i);
                            counter++;
                        }
                        break;
                    } catch (Exception e) {break;}
                case "WEST":
                    try {
                        if (list.get(i+1) == "EAST") {
                            list.remove(i+1);
                            list.remove(i);
                            counter++;
                        }
                        break;
                    } catch (Exception e) {break;}
            }
        }
    } while (counter > 0);
    String[] directions = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
        directions[i] = list.get(i);
    }
        return directions;
    }

    public static int bouncingBall(double h, double bounce, double window) {
        if (!(h>0 && window < h && (bounce > 0 && bounce < 1))) {
            return -1;
        }
        return calculateBounce(h,bounce,window,0);
    }

    public static int calculateBounce (double h, double bounce, double window, int views) {
        if (h>0 && window < h && (bounce > 0 && bounce < 1)) {
            if (h>window) {
                if (h*bounce > window) {
                    views += 2+calculateBounce(h*bounce,bounce,window,views);
                } else {
                    views += 1 + calculateBounce(h * bounce, bounce, window, views);
                }
            } else {
                return views;
            }
        }
        return views;
    }

    public static boolean isValid(String braces) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < braces.length(); i++) {
            switch (braces.charAt(i)) {
                case ')':
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        if (stack.lastElement() == '(') {
                            stack.pop();
                        } else {
                            stack.add(braces.charAt(i));
                        }
                    }
                    break;
                case ']':
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        if (stack.lastElement() == '[') {
                            stack.pop();
                        } else {
                            stack.add(braces.charAt(i));
                        }
                    }
                    break;
                case '}':
                    if (stack.isEmpty()) {
                        return false;
                    } else {
                        if (stack.lastElement() == '{') {
                            stack.pop();
                        } else {
                            stack.add(braces.charAt(i));
                        }
                    }
                    break;
                default:
                    stack.add(braces.charAt(i));
                    break;
            }
        }
        if (stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
