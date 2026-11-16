
import java.util.*;

class Twosum {
    public static void main(String[] args) {

        int array[] = {2, 3, 7, 8, 9};
        int target = 10;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {

            int remaining = target - array[i];

            if (map.containsKey(remaining)) {

                System.out.println("Indices: " + map.get(remaining) + ", " + i);
                return;
            }

            map.put(array[i], i);
        }
    }
}
