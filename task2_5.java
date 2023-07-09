import java.util.*;



//2. Пусть дан список сотрудников:
        // Иван Иванов,  Светлана Петрова, Кристина Белова,  Анна Мусина,    Анна Крутова,    Иван Юрин,
        // Петр Лыков,   Павел Чернов,     Петр Чернышов,    Мария Федорова, Марина Светлова, Мария Савина,
        // Мария Рыкова, Марина Лугова,    Анна Владимирова, Иван Мечников,  Петр Петин,      Иван Ежов.
//   Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
//   Отсортировать по убыванию популярности с помощью TreeMap.
public class task2_5 {
    public static void main(String[] args) {
        String s = "Иван Иванов, Светлана Петрова, Кристина Белова, Анна Мусина, Анна Крутова, Иван Юрин, " +
                "Петр Лыков, Павел Чернов, Петр Чернышов, Мария Федорова, Марина Светлова, Мария Савина, " +
                "Мария Рыкова, Марина Лугова, Анна Владимирова, Иван Мечников, Петр Петин, Иван Ежов";

        Map<Integer, List<String>> map = new TreeMap<>(Comparator.reverseOrder());
        String[] cooperator = s.split(",");
        List<String> list1 = Arrays.asList(cooperator);
        List<String> list3 = new ArrayList<>();
        List<List<String>> listList = new ArrayList<>();
        String zzz = "";



        for (int i = 0; i < list1.size(); i++)  {
            listList.add(Arrays.asList(list1.get(i).trim()));
        }

        for (int i = 0; i < listList.size(); i++) {
            int count = 0;
            int m = listList.get(i).toString().indexOf(" ");
            if (!list3.contains(listList.get(i).toString().substring(1, m))) {
                list3.add(listList.get(i).toString().substring(1, m));
                int n = listList.get(i).toString().indexOf(" ");
                zzz = "";

                for (int j = 0; j < listList.size(); j++) {
                    if (listList.get(i).toString().substring(1, m).equalsIgnoreCase(listList.get(j).toString().substring(1, n))) {
                        count++;
                        zzz = zzz + listList.get(j).toString();;
                    }
                }





                if (map.containsKey(count)) {
                    List<String> list = map.get(count);
                    list.add(zzz);

                } else {
                    List<String> list = new ArrayList<>();
                    list.add(zzz);
                    map.put(count, list);

                }

            }



        }

        System.out.println(map);


    }


}
