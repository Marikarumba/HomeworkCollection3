package Map;

import java.util.HashMap;
import java.util.Map;

public class StringInteger {

    Map < String, Integer> map = new HashMap<>();


    public void addMeaning(String string, Integer integer){
        if (map.containsKey(string) ){
            if (map.get(string).equals(integer))
                throw new IllegalArgumentException("Значения равны");
        }
        map.put(string,integer);
    }

    @Override
    public String toString() {
        StringBuilder out= new StringBuilder();
        for (Map.Entry<String, Integer> meaning: map.entrySet()) {
            out.append(meaning.getKey()).append(" - ").append(meaning.getValue()).append("\n");
        }
        return out.toString();
    }
}
