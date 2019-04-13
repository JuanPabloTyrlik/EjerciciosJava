import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
/*        ArrayList<String> patentes = new ArrayList<>();
        Patente patente = new Patente();
        Collections.addAll(patentes, "ABC123", "AB123CD", "123", "", "AAAA11");
        for (String pat : patentes) {
            if (patente.isPatente(pat)) {
                System.out.printf("Patente: %s es Valida %n", pat);
            } else {
                System.out.printf("Patente: %s es Invalida %n", pat);
            }
        }

        Password pass = new Password();
        System.out.println("\nGenerated Password = " + pass.generate(8));

        int n = 20;
        CribaDeEratostenes criba = new CribaDeEratostenes();
        System.out.printf("\nNumeros primos entre 2 y %s: " + criba.primeNumbers(n) + "\n", n);

        System.out.println("\n" + ASCII.stringToASCII("juan"));

        System.out.println(Password.verify("a"));
        System.out.println(Password.verify("a123_"));
        System.out.println(Password.verify("abc123_"));
        System.out.println(Password.verify("abc12345678_"));
        System.out.println(Password.verify("abc 123_"));
*/
/*        CoderByte cb = new CoderByte();
        System.out.println(cb.simpleSymbols("+++b+"));
        System.out.println(cb.simpleSymbols("b++"));
        System.out.println(cb.simpleSymbols("!-.asd"));
        System.out.println(cb.simpleSymbols("+b+c+d+"));
        System.out.println(cb.simpleSymbols("+b+c+d"));
*/
        System.out.println(Vowels.getCount("hola todo bien?"));

        System.out.println(Kata.getMiddle("testing"));
        System.out.println(Kata.getMiddle("abcd"));



    }
}
