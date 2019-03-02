import java.util.LinkedList;

public class CribaDeEratostenes {

    public LinkedList <Integer> primeNumbers (int n){
       LinkedList <Integer> list = new LinkedList<>();
       for (int i=2; i<=n; i++) {
           list.add(i);
       }
       int j = 0;
       int num;
       while (j < list.size())  {
           for (int i=2; (list.get(j)*i) <= n; i++) {
               num = list.get(j) * i;
               if (num > n) {break;}
               if (list.contains(num)) {
                   list.remove(list.indexOf(num));
               }
           }
           j++;
       }
       return list;
    }
}
