import DoubleDispatch.*;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
/*
        ArrayList<String> patentes = new ArrayList<>();
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

        CoderByte cb = new CoderByte();
        System.out.println(cb.simpleSymbols("+++b+"));
        System.out.println(cb.simpleSymbols("b++"));
        System.out.println(cb.simpleSymbols("!-.asd"));
        System.out.println(cb.simpleSymbols("+b+c+d+"));
        System.out.println(cb.simpleSymbols("+b+c+d"));

        System.out.println(Vowels.getCount("hola todo bien?"));

        System.out.println(Kata.getMiddle("testing"));
        System.out.println(Kata.getMiddle("abcd"));

        Integer[] binary = {1,1,1,1};
        System.out.println(Kata.ConvertBinaryArrayToInt(binary));

        System.out.println(Kata.disemvowel("What are you, a communist?"));

        System.out.println(Kata.spinWords("Welcome"));
        System.out.println(Arrays.toString(Kata.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
        System.out.println(Arrays.toString(Kata.dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"})));

        System.out.println(Kata.bouncingBall(3,0.66,1.5));
        System.out.println(Kata.bouncingBall(30,0.66,1.5));

        CoderByte cb = new CoderByte();
        System.out.println(cb.simpleSymbols("+++b+"));
        System.out.println(cb.simpleSymbols("b++"));
        System.out.println(cb.simpleSymbols("!-.asd"));
        System.out.println(cb.simpleSymbols("+b+c+d+"));
        System.out.println(cb.simpleSymbols("+b+c+d"));

        System.out.println(Kata.getMiddle("testing"));
        System.out.println(Kata.getMiddle("abcd"));

        Integer[] binary = {1,1,1,1};
        System.out.println(Kata.ConvertBinaryArrayToInt(binary));

        System.out.println(Kata.disemvowel("What are you, a communist?"));

        System.out.println(Kata.spinWords("Welcome"));
        System.out.println(Arrays.toString(Kata.dirReduc(new String[]{"NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST"})));
        System.out.println(Arrays.toString(Kata.dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH", "WEST", "EAST", "EAST", "SOUTH", "NORTH", "WEST"})));

        System.out.println(Kata.bouncingBall(3,0.66,1.5));
        System.out.println(Kata.bouncingBall(30,0.66,1.5));

        System.out.println(Arrays.toString(Kata.xbonacci(new double[]{1,1,1},10)));
        System.out.println(Arrays.toString(Kata.xbonacci(new double[]{1,1,1,1},10)));
        System.out.println(Arrays.toString(Kata.xbonacci(new double[]{1,1,1,1,1},10)));
        System.out.println(Arrays.toString(Kata.xbonacci(new double[]{1,1,1,1,1,1},10)));

        System.out.println(Kata.isValid("(){}[]"));
        System.out.println(Kata.isValid("([{}])"));
        System.out.println(Kata.isValid("[({})](]"));
        System.out.println(Kata.isValid(")}()"));
*/
        int[][][] matrixs = {
                                {{1, 2, 3}, {4, 5, 6}, {7,8,9}},
                                {{1,2},{3,4}},
                                {{1}},
                                {{2,5,3}, {1,-2,-1}, {1, 3, 4}},
                {{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30},{31,32,33,34,35,36}},
                {{1,2,3,4,5,6,7,8,9,10,11,12,13,14},
                {15,16,17,18,19,20,21,22,23,24,25,26,27,28},
                {29,30,31,32,33,34,35,36,37,38,39,40,41,42},
                {43,44,45,46,47,48,49,50,51,52,53,54,55,56},
                {57,58,59,60,61,62,63,64,65,66,67,68,69,70},
                {71,72,73,74,75,76,77,78,79,80,81,82,83,84},
                {85,86,87,88,89,90,91,92,93,94,95,96,97,98},
                {99,100,101,102,103,104,105,106,107,108,109,110,111,112},
                {113,114,115,116,117,118,119,120,121,122,123,124,125,126},
                {127,128,129,130,131,132,133,134,135,136,137,138,139,140},
                {141,142,143,144,145,146,147,148,149,150,151,152,153,154},
                {155,156,157,158,159,160,161,162,163,164,165,166,167,168},
                {169,170,171,172,173,174,175,176,177,178,179,180,181,182},
                {183,184,185,186,187,188,189,190,191,192,193,194,195,196}}
        };




        Matrix mat = new Matrix();


        System.out.println(mat.det(matrixs[0])); //0
        System.out.println(mat.det(matrixs[1])); //-2
        System.out.println(mat.det(matrixs[2])); //1
        System.out.println(mat.det(matrixs[3])); //-20
        System.out.println(mat.det(matrixs[4])); //-20
        System.out.println(mat.det(matrixs[5])); //-20

        Trabajador artesano = new Artesano();
        Trabajador zapatero = new Zapatero();
        Material cuero = new Cuero();
        Material goma = new Goma();

        artesano.trabajar(cuero);
        artesano.trabajar(goma);
        zapatero.trabajar(cuero);
        zapatero.trabajar(goma);


    }
}
