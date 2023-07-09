import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TelephonBook {
    Map<String, String> telephons = new HashMap<>();

    void addNote(String lastName, String telephone){
                List <String> list = new ArrayList<>();

        int count = 0;

            for (Map.Entry<String, String> entry : telephons.entrySet()) {
                String name = entry.getKey();

                if (name.equalsIgnoreCase(lastName)) {
                    list.add(telephons.get(name));
                    list.add(telephone);
                    break;
                }
                count++;


            }
            if (count == telephons.size())
                list.add(telephone);

        telephons.put(lastName,String.join(",", list));


    }

    String findByName(String lastName){
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, String> entry: telephons.entrySet()){
            String name = entry.getKey();
            String telephone = entry.getValue();
            if (name.equalsIgnoreCase(lastName)){
                stringBuilder.append(name);
                stringBuilder.append(": ");
                stringBuilder.append(telephone);

            }
        }
        return stringBuilder.toString();
    }
}
