import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> patentes = new ArrayList<>();
        Patente patente = new Patente();
        Collections.addAll(patentes,"ABC123","AB123CD","123","","AAAA11");
        for (String pat: patentes) {
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
        System.out.printf("\nNumeros primos entre 2 y %s: " + criba.primeNumbers(n), n);

    }
}
