package Map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class IntegerString {

   private Map <Integer, String> map = new LinkedHashMap<>();

    public void addLinked(Integer integer, String string){
        map.put(integer, string);
    }

    public String toString() {
        StringBuilder out= new StringBuilder();
        for (Map.Entry<Integer, String> meaning: map.entrySet()) {
            out.append(meaning.getKey()).append(" - ").append(meaning.getValue()).append("\n");
        }

        return out.toString();
    }
}
