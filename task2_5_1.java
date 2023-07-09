
import java.util.*;

//2. Пусть дан список сотрудников:
// Иван Иванов,  Светлана Петрова, Кристина Белова,  Анна Мусина,    Анна Крутова,    Иван Юрин,
// Петр Лыков,   Павел Чернов,     Петр Чернышов,    Мария Федорова, Марина Светлова, Мария Савина,
// Мария Рыкова, Марина Лугова,    Анна Владимирова, Иван Мечников,  Петр Петин,      Иван Ежов.
//   Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//   Отсортировать по убыванию популярности с помощью TreeMap.
public class task2_5_1 {
    public static void main(String[] args) {
        String s = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " +
                "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, " +
                "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        Map<String, Integer> mapTemp = new HashMap<>();
        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        String[] cooperator = s.replace(",","").split("\\s");
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < cooperator.length; i+=2) {
            int count = 0;
            if (!list1.contains(cooperator[i])) {
                list1.add(cooperator[i]);

                for (int j = 0; j < cooperator.length; j += 2) {
                    if (cooperator[i].equalsIgnoreCase(cooperator[j])) {

                        count++;

                    }

                }




                if (map.containsKey(count)) {
                    List<String> list = map.get(count);
                    list.add(cooperator[i]);
                } else {
                    List<String> list = new ArrayList<>();
                    list.add(cooperator[i]);
                    map.put(count, list);
                }
            }
        }



        System.out.println(map);

    }


}
