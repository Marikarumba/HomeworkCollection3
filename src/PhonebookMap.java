import java.util.HashMap;
import java.util.Map;

public class PhonebookMap {

    private static Map < String, String> map = new HashMap<>();



    public void addPhone(String name, String phone){
        map.put(name,phone);
    }

    @Override
    public String toString() {
    StringBuilder out= new StringBuilder();
        for (Map.Entry<String, String> contact: map.entrySet()) {
            out.append("Фио: ").append(contact.getKey()).append(" - ").append(contact.getValue()).append("\n");
        }
        return out.toString();
    }
}
