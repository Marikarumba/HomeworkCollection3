package Map;

import java.util.*;

public class StringList {

    private Map< String, List<Integer>> map = new HashMap<>();
    public StringInteger stringinteger = new StringInteger();

    public StringList(){
        Random random = new Random();
        for (int i = 0; i < 5; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                list.add(random.nextInt(1000));
            }
            map.put("string"+i,list);
        }

    }

    public String toString() {
        StringBuilder out= new StringBuilder();
        for (Map.Entry<String, List<Integer>> meaning: map.entrySet()) {
            out.append(meaning.getKey()).append(" - ").append(meaning.getValue()).append("\n");
        }
        return out.toString();
    }

    public StringInteger convert (){
        for (Map.Entry<String, List<Integer>> meaning: map.entrySet()) {
            int sum=0;
            for (int i = 0; i < meaning.getValue().size(); i++) {
                sum += meaning.getValue().get(i);
            }
            stringinteger.addMeaning(meaning.getKey() , sum);
        }
        return stringinteger;
    }

}
