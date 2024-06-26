import java.util.List;
import java.util.Map;
import java.util.Set;

public class App {

    /**
     * TODO:
     * 
     * completare la classe DataHelper
     * 
     * aggiungere i seguenti metodi per testare la classe DataHelper:
     * - testRandomInteger : void
     * testare le 3 implementazioni del metodo getRandomInteger
     * 
     * - testRandomUniqueInteger : void
     * testare le 3 implementazioni del metodo getRandomUniqueInteger
     * 
     * - testFrequencyMap : void
     * testare il metodo getFrequencyMap;
     * sfruttare i metodi precedentemente svolti e utilizzarli come
     * dati in ingresso per il metodo getFrequencyMap
     * 
     */

    public static void main(String[] args) throws Exception {

        testRandom();
    }

    public static void testRandom() {

        List<Integer> list1 = DataHelper.getRandomInteger(10);
        System.out.println(list1);

        System.out.println("-----------------------------------------------------------------");

        List<Integer> list2 = DataHelper.getRandomInteger(5, 20);
        System.out.println(list2);

        System.out.println("-----------------------------------------------------------------");

        List<Integer> list3 = DataHelper.getRandomInteger(8, 3, 7);
        System.out.println(list3);

        System.out.println("-----------------------------------------------------------------");

        try {
            Set<Integer> set1 = DataHelper.getRandomUniqueInteger(10);
            System.out.println(set1);
        } catch (Exception e) {

            System.out.println("Valori in ingresso non validi");
        }

        System.out.println("-----------------------------------------------------------------");

        try {
            Set<Integer> set1 = DataHelper.getRandomUniqueInteger(10, 15);
            System.out.println(set1);
        } catch (Exception e) {

            System.out.println("Valori in ingresso non validi");
        }

        System.out.println("-----------------------------------------------------------------");

        try {
            Set<Integer> set1 = DataHelper.getRandomUniqueInteger(8, 3, 7);
            System.out.println(set1);
        } catch (Exception e) {

            System.out.println("Valori in ingresso non validi");
        }

        System.out.println("-----------------------------------------------------------------");

        Map<Integer, Integer> freqMap = DataHelper.getFrequencyMap(list1);
        System.out.println(freqMap);
    }
}
