import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class IDChecker {
    private String Id = null;

    public IDChecker(String id) {
        Id = id;
    }

    public boolean check() {
        int sum = 0;
        int weight = 7;

        Integer[] values = new Integer[9];
        char[] letters = Id.substring(0, 3).toCharArray();
        for (int i = 0; i < 9; i++) {
            if (i < 3) {
                values[i] = dictionary().get(letters[i]);
            } else {
                values[i] = Integer.valueOf(Id.substring(i, i + 1));
            }
        }
        for (int i = 0; i < 9; i++) {
            sum += WeightDic().get(i) * values[i];
        }
        System.out.println(sum);
        if (sum % 10 == 0) {
            return true;
        }
        return false;
    }

    private Map<Character, Integer> dictionary() {
        Map<Character, Integer> characterDictionary = new HashMap<Character, Integer>();
        characterDictionary.put('A', 10);
        characterDictionary.put('B', 11);
        characterDictionary.put('C', 12);
        characterDictionary.put('D', 13);
        characterDictionary.put('E', 14);
        characterDictionary.put('F', 15);
        characterDictionary.put('G', 16);
        characterDictionary.put('H', 17);
        characterDictionary.put('I', 18);
        characterDictionary.put('J', 19);
        characterDictionary.put('K', 20);
        characterDictionary.put('L', 21);
        characterDictionary.put('M', 22);
        characterDictionary.put('N', 23);
        characterDictionary.put('O', 24);
        characterDictionary.put('P', 25);
        characterDictionary.put('Q', 26);
        characterDictionary.put('R', 27);
        characterDictionary.put('S', 28);
        characterDictionary.put('T', 29);
        characterDictionary.put('U', 30);
        characterDictionary.put('V', 31);
        characterDictionary.put('W', 32);
        characterDictionary.put('X', 33);
        characterDictionary.put('Y', 34);
        characterDictionary.put('Z', 35);
        return characterDictionary;
    }

    private Map<Integer, Integer> WeightDic() {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        map.put(0, 7);
        map.put(1, 3);
        map.put(2, 1);
        map.put(3, 9);
        map.put(4, 7);
        map.put(5, 3);
        map.put(6, 1);
        map.put(7, 7);
        map.put(8, 3);
        return map;
    }
}
