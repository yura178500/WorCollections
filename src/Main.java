import java.util.Map;public class Main {
    public static void main(String[] args) {
        java.util.HashMap<String,String> map = new java.util.HashMap<>();
        map.put("Попов А.А.", "+890455566612");
        map.put("Сидоров А.А.", "+890455566612");
        map.put("Петров А.А.", "+890455566612");
        map.put("Никитин А.А.", "+890455566612");
        map.put("Соколов А.А.", "+890455566612");
        map.put("Мишарин А.А.", "+890455566612");
        map.put("Анисимов А.А.", "+890455566612");
        map.put("Проныров А.А.", "+890455566612");
        map.put("Сидоров Н.Ю.", "+890455566612");
        map.put("Решетов А.А.", "+890455566612");
        map.put("Николаев А.А.", "+890455566612");
        map.put("Сорников А.А.", "+890455566612");
        map.put("Мышкин А.А.", "+890455566612");
        map.put("Арбузов А.А.", "+890455566612");
        map.put("Пименов А.А.", "+890455566612");
        map.put("Сидорчук А.А.", "+890455566612");
        map.put("Потапов А.А.", "+890455566612");
        map.put("Носков А.А.", "+890455566612");
        map.put("Сомов А.А.", "+890455566612");
        map.put("Мирошкин А.А.", "+890455566612");

        System.out.println(map.get("Мишарин А.А."));
        System.out.println(map.values());
        System.out.println(map.toString());

        System.out.println();

        java.util.Map<String,Integer> mapsy = new java.util.HashMap<>();

        updateValue(mapsy, "Алексей", 3000);
        updateValue(mapsy, "Дмитрий", 9000);
        updateValue(mapsy, "Антон", 3000);
        updateValue(mapsy, "Алексей", 7000);
        updateValue(mapsy, "Антон", 8000);

        System.out.println(mapsy.toString());
    }


    public static void updateValue(Map<String, Integer> mapsy, String key, Integer value) {
        if (mapsy.containsKey(key)) {
            mapsy.put(key, mapsy.get(key) + value);
        } else {
            mapsy.put(key, value);
        }
    }


    }



