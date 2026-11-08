//Java program to find duplicate elements in an array using HashSet.
import java.util.HashSet;
import java.util.Set;

public class DuplicateArrary {
      public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 2, 5, 3, 6};

        Set<Integer> set = new HashSet<>();

        System.out.println("Duplicate elements:");

        for (int i = 0; i < arr.length; i++) {

            if (!set.add(arr[i])) {
                System.out.println(arr[i]);
            }
        }
    }
}
