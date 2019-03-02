import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> patentes = new ArrayList<>();
        Patente patente = new Patente();
        Collections.addAll(patentes,"ABC123","AB123CD","123","","AAAA11");
        for (String pat: patentes) {
            if (patente.isPatente(pat)) {
                System.out.printf("Patente: %s\t es Valida %n", pat);
            } else {
                System.out.printf("Patente: %s\t es Invalida %n", pat);
            }
        }

        Password pass = new Password();
        System.out.println("Generated Password = " + pass.generate(8));


    }
}
