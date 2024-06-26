import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DataHelper {

    // TODO: completare i metodi seguenti

    // restituisce una lista di numeri interi casuali compresi tra 0 e 10
    public static List<Integer> getRandomInteger(int size) {

        return getRandomInteger(size, 10);
    }

    // restituisce una lista di numeri interi casuali compresi tra 0 e max
    public static List<Integer> getRandomInteger(int size, int max) {

        return getRandomInteger(size, 0, max);
    }

    // restituisce una lista di numeri interi casuali compresi tra min e max
    public static List<Integer> getRandomInteger(int size, int min, int max) {

        Random rnd = new Random();

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            list.add(rnd.nextInt(min, max + 1));
        }

        return list;
    }

    // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e 10
    public static Set<Integer> getRandomUniqueInteger(int size)
            throws IllegalArgumentException {

        return getRandomUniqueInteger(size, 0, 10);
    }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra 0 e max
    public static Set<Integer> getRandomUniqueInteger(int size, int max)
            throws IllegalArgumentException {

        return getRandomUniqueInteger(size, 0, max);
    }

    // // restituisce una lista di numeri casuali NON DUPLICATI compresi tra min e
    // max
    public static Set<Integer> getRandomUniqueInteger(int size, int min, int max)
            throws IllegalArgumentException {

        if (size > max - min + 1)
            throw new IllegalArgumentException("size > max - min + 1");

        Set<Integer> uniqueValues = new HashSet<>();

        Random rnd = new Random();

        while (uniqueValues.size() < size) {

            uniqueValues.add(rnd.nextInt(min, max + 1));
        }

        return uniqueValues;
    }

    // restituisce una mappa di frequenza di numeri interi
    public static Map<Integer, Integer> getFrequencyMap(List<Integer> list) {

        Map<Integer, Integer> frequencyMap = new HashMap<>();

        for (Integer value : list) {

            if (frequencyMap.containsKey(value))
                frequencyMap.put(value, frequencyMap.get(value) + 1);
            else
                frequencyMap.put(value, 1);
        }

        return frequencyMap;
    }

}
