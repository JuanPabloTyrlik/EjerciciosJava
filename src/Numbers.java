public class Numbers {
    private Integer a, b;

    public void swapWhile(int a, int b) {
        this.a = a;
        this.b = b;
        if (b < a) {
            swap(a, b);
        }
        do {
            System.out.println(this.a);
        } while (++this.a <= this.b);
    }

    public void printNumbersWhile(int a, int b) {
        int min = Integer.min(a, b);
        int max = Integer.max(a, b);
        do {
            System.out.println(min);
        } while (++min <= max);
    }

    public void printNumbersFor(int a, int b) {
        int min = Integer.min(a, b);
        int max = Integer.max(a, b);
        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }

    public void printNumbersRecursive(int a, int b) {
        int min = Integer.min(a, b);
        int max = Integer.max(a, b);
        if (min < max) {
            System.out.println(min);
            printNumbersRecursive(++min, max);
        } else {
            if (min == max) {
                System.out.println(min);
            }
        }
    }

    private void swap(Integer a, Integer b) {
        Integer aux = a;
        this.a = b;
        this.b = aux;
    }

    public void swapRecursive(int a, int b) {
        this.a = a;
        this.b = b;
        if (a > b)
            swap(a, b);
        recursive(this.a, this.b);
    }

    private void recursive(int a, int b) {
        if (a <= b) {
            System.out.println(a);
            recursive(++a, b);
        }
    }

    public static boolean isAcronym(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        } else {
            for (int i = 1; i < b.length(); i++) {
                if (a.indexOf(b.charAt(i)) == -1) {
                    return false;
                }
            }
            return true;
        }
    }
}
