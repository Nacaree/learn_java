
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Data01 {
    public static void main(String[] args) {
        System.out.println("Hello Numbers");
        List<Integer> number = new ArrayList<>();
        Random NewRandom = new Random();

        for (int i = 0; i < 5; i++) {
            number.add(NewRandom.nextInt(100));
            System.out.print(number.get(i) + " ");
        }
        List<Integer> sortedNumbers = CustomSort(number);
        System.out.println();
        System.out.println("sorted: " + sortedNumbers + " ");
        // System.out.println(number);

    }

    public static List<Integer> CustomSort(List<Integer> unsorted) {
        List<Integer> sorted = new ArrayList<>();
        sorted.addAll(unsorted);
        for (int i = 0; i < sorted.size() - 1; i++) {
            for (int j = i + 1; j < sorted.size() - 1 - i; j++) {
                if (sorted.get(j) < sorted.get(i)) {
                    int temp = sorted.get(i);
                    sorted.set(i, sorted.get(j));
                    sorted.set(j, temp);
                }
            }
        }
        return sorted;
    }

}