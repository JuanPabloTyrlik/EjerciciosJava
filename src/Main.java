import java.sql.Array;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> patentes = new ArrayList<>();
//        Patente patente = new Patente();
//        Collections.addAll(patentes, "ABC123", "AB123CD", "123", "", "AAAA11");
//        for (String pat : patentes) {
//            if (patente.isPatente(pat)) {
//                System.out.printf("Patente: %s es Valida %n", pat);
//            } else {
//                System.out.printf("Patente: %s es Invalida %n", pat);
//            }
//        }
//
//        Password pass = new Password();
//        System.out.println("\nGenerated Password = " + pass.generate(8));
//
//        int n = 20;
//        CribaDeEratostenes criba = new CribaDeEratostenes();
//        System.out.printf("\nNumeros primos entre 2 y %s: " + criba.primeNumbers(n) + "\n", n);
//
//        System.out.println("\n" + ASCII.stringToASCII("juan"));
//
//        System.out.println(Password.verify("a"));
//        System.out.println(Password.verify("a123_"));
//        System.out.println(Password.verify("abc123_"));
//        System.out.println(Password.verify("abc12345678_"));
//        System.out.println(Password.verify("abc 123_"));
//
//        CoderByte cb = new CoderByte();
//        System.out.println(cb.simpleSymbols("+++b+"));
//        System.out.println(cb.simpleSymbols("b++"));
//        System.out.println(cb.simpleSymbols("!-.asd"));
//        System.out.println(cb.simpleSymbols("+b+c+d+"));
//        System.out.println(cb.simpleSymbols("+b+c+d"));
//
//        System.out.println(Vowels.getCount("hola todo bien?"));
//
//        System.out.println(Kata.getMiddle("testing"));
//        System.out.println(Kata.getMiddle("abcd"));
//
//        Integer[] binary = {1,1,1,1};
//        System.out.println(Kata.ConvertBinaryArrayToInt(binary));
//
//        System.out.println(Kata.disemvowel("What are you, a communist?"));
//
//        System.out.println(Kata.spinWords("Welcome"));
//        System.out.println(Arrays.toString(Kata.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
//        System.out.println(Arrays.toString(Kata.dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"})));
//
//        System.out.println(Kata.bouncingBall(3,0.66,1.5));
//        System.out.println(Kata.bouncingBall(30,0.66,1.5));

/*        CoderByte cb = new CoderByte();
        System.out.println(cb.simpleSymbols("+++b+"));
        System.out.println(cb.simpleSymbols("b++"));
        System.out.println(cb.simpleSymbols("!-.asd"));
        System.out.println(cb.simpleSymbols("+b+c+d+"));
        System.out.println(cb.simpleSymbols("+b+c+d"));
*/
/*        System.out.println(Vowels.getCount("hola todo bien?"));

        System.out.println(Kata.getMiddle("testing"));
        System.out.println(Kata.getMiddle("abcd"));

        Integer[] binary = {1,1,1,1};
        System.out.println(Kata.ConvertBinaryArrayToInt(binary));

        System.out.println(Kata.disemvowel("What are you, a communist?"));
*/
/*        System.out.println(Kata.spinWords("Welcome"));
        System.out.println(Arrays.toString(Kata.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
        System.out.println(Arrays.toString(Kata.dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"})));

        System.out.println(Kata.bouncingBall(3,0.66,1.5));
        System.out.println(Kata.bouncingBall(30,0.66,1.5));
*/
        System.out.println(Arrays.toString(Kata.xbonacci(new double[]{1,1,1},10)));
        System.out.println(Arrays.toString(Kata.xbonacci(new double[]{1,1,1,1},10)));
        System.out.println(Arrays.toString(Kata.xbonacci(new double[]{1,1,1,1,1},10)));
        System.out.println(Arrays.toString(Kata.xbonacci(new double[]{1,1,1,1,1,1},10)));

        System.out.println(Kata.isValid("(){}[]"));
        System.out.println(Kata.isValid("([{}])"));
        System.out.println(Kata.isValid("[({})](]"));
        System.out.println(Kata.isValid(")}()"));


    }
}
