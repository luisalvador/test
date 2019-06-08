import java.util.*;

public class Main {

    // Returns the distance between the two closest numbers.
    static int distClosestNumbers(int[] numbers) {
        MouseEvent te = new MouseEvent();
        // try to implement it!
        int minDist=9999;
        ArrayList<Integer> lista = new ArrayList<Integer>(numbers.length);
        for (int i=0;i<numbers.length;i++)
        {
            lista.add(numbers[i]);
        }

        Collections.sort(lista);
        for (int i=0;i<lista.size()-1;i++)
        {
            System.out.println(lista.get(i));
            if (lista.get(i+1)-lista.get(i)<minDist)
                minDist=lista.get(i+1)-lista.get(i);
        }
        System.out.println(lista.get(lista.size()-1));

        return minDist;
    }

    public static void main(String[] args) {
        int[] testArray = {3, 9, 50, 15, 95, 7, 98, 65};
        int result = distClosestNumbers(testArray);
        System.out.println("Minima distancia = " + result); // Expected result is 1 (the 2 closest numbers are 98 and 99)
    }
}