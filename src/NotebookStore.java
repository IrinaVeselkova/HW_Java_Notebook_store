import javax.sound.midi.Soundbank;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class NotebookStore {
    public static void main(String[] args) {
        System.out.println("Добро пожаловать в магазин ноутбуков \"NOTEXPRESS\"!\nУ нас много новинок, что Вас интересует?\n");
        Scanner keyboard = new Scanner(System.in);
        Map<Integer, String> resultFilter = new HashMap<>(); // словарь, куда будем заносить выбранные пользователем критерии фильтрации
        int search;
        boolean Flag;
        do {
            resultFilter.clear();
            System.out.println("Вы можете выбрать следующие критерии для поиска");
            for (Integer i : NoteFilter().keySet()) {
                System.out.println(i + " - " + NoteFilter().get(i));
            }
            do {
                System.out.print("Введите номер критерия или 0 для поиска: => ");
                search = keyboard.nextInt();
                if (search != 0) {
                    System.out.print(NoteFilter().get(search) + "=> ");
                    resultFilter.put(search, keyboard.next());
                }
            } while (search != 0);
            Set<Notbooks> filteredNotebooks = filterSet(resultFilter);
            if (filteredNotebooks.isEmpty()) {
                System.out.print("К сожалению, по выбранным характеристикам ничего не нашлось,\nпоказать Вам ноутбуки с самым высоким рейтингом? (Y/N) => ");
                if ("YyДадаYesyesнН".contains(keyboard.next())) {
                    resultFilter.clear();
                    resultFilter.put(7, "4.8");
                    for (Notbooks rate_notes : filterSet(resultFilter)) {
                        System.out.println(rate_notes.toString());
                        System.out.println();
                    }
                    System.out.print("Поищем что-то еще? (Y/N) => ");
                    Flag = "YyДадаYesyesнН".contains(keyboard.next());

                } else {
                    System.out.print("Поищем что-то еще? (Y/N) => ");
                    Flag = "YyДадаYesyesнН".contains(keyboard.next());
                }
            } else {
                System.out.println("\nПо Вашему запросу удалось найти " + filteredNotebooks.size()+ " ноутбуков:\n");
                for (Notbooks nots : filteredNotebooks) {
                    System.out.println(nots.toString());
                    System.out.println();
                }
                System.out.print("Поищем что-то еще? (Y/N) => ");
                Flag = "YyДадаYesyesнН".contains(keyboard.next());
            }
        } while (Flag);

        System.out.println("До свидания, приходите за покупками!");

        keyboard.close();
    }


    static Set<Notbooks> addNotebooks() {
        Notbooks notebook1 = new Notbooks();
        notebook1.RAM = 16; // ОЗУ
        notebook1.HDD = 512; // объем жесткого диска
        notebook1.TradeMark = "Aser"; //Марка
        notebook1.OpSystem = "Linux"; //Операционная система
        notebook1.Colour = "Black"; //Цвет
        notebook1.Price = 105_999.00; //Стоимость
        notebook1.Rating = 4.7; //Рейтинг по 5-бальной шкале

        Notbooks notebook2 = new Notbooks();
        notebook2.RAM = 8; // ОЗУ
        notebook2.HDD = 256; // объем жесткого диска
        notebook2.TradeMark = "Asus"; //Марка
        notebook2.OpSystem = "Win10"; //Операционная система
        notebook2.Colour = "Grey"; //Цвет
        notebook2.Price = 70_800.40; //Стоимость
        notebook2.Rating = 4.9; //Рейтинг по 5-бальной шкале

        Notbooks notebook3 = new Notbooks();
        notebook3.RAM = 16; // ОЗУ
        notebook3.HDD = 512; // объем жесткого диска
        notebook3.TradeMark = "Honor"; //Марка
        notebook3.OpSystem = "BIOS"; //Операционная система
        notebook3.Colour = "Grey"; //Цвет
        notebook3.Price = 68_340.20; //Стоимость
        notebook3.Rating = 4.6; //Рейтинг по 5-бальной шкале

        Notbooks notebook4 = new Notbooks();
        notebook4.RAM = 8; // ОЗУ
        notebook4.HDD = 256; // объем жесткого диска
        notebook4.TradeMark = "Honor"; //Марка
        notebook4.OpSystem = "Linux"; //Операционная система
        notebook4.Colour = "Grey"; //Цвет
        notebook4.Price = 52_698.10; //Стоимость
        notebook4.Rating = 4.8; //Рейтинг по 5-бальной шкале

        Notbooks notebook5 = new Notbooks();
        notebook5.RAM = 16; // ОЗУ
        notebook5.HDD = 512; // объем жесткого диска
        notebook5.TradeMark = "Asus"; //Марка
        notebook5.OpSystem = "Linux"; //Операционная система
        notebook5.Colour = "Black"; //Цвет
        notebook5.Price = 74_699.10; //Стоимость
        notebook5.Rating = 4.7; //Рейтинг по 5-бальной шкале

        Notbooks notebook6 = new Notbooks();
        notebook6.RAM = 8; // ОЗУ
        notebook6.HDD = 256; // объем жесткого диска
        notebook6.TradeMark = "MSI"; //Марка
        notebook6.OpSystem = "Win10"; //Операционная система
        notebook6.Colour = "Grey"; //Цвет
        notebook6.Price = 99_999.10; //Стоимость
        notebook6.Rating = 4.9; //Рейтинг по 5-бальной шкале

        Notbooks notebook7 = new Notbooks();
        notebook7.RAM = 8; // ОЗУ
        notebook7.HDD = 256; // объем жесткого диска
        notebook7.TradeMark = "MSI"; //Марка
        notebook7.OpSystem = "Win10"; //Операционная система
        notebook7.Colour = "Silver"; //Цвет
        notebook7.Price = 68_698.10; //Стоимость
        notebook7.Rating = 4.8; //Рейтинг по 5-бальной шкале

        Notbooks notebook8 = new Notbooks();
        notebook8.RAM = 8; // ОЗУ
        notebook8.HDD = 256; // объем жесткого диска
        notebook8.TradeMark = "Honor"; //Марка
        notebook8.OpSystem = "Win10"; //Операционная система
        notebook8.Colour = "Grey"; //Цвет
        notebook8.Price = 54_698.10; //Стоимость
        notebook8.Rating = 4.8; //Рейтинг по 5-бальной шкале

        Set<Notbooks> notebook = new HashSet<>();

        notebook.add(notebook1);
        notebook.add(notebook2);
        notebook.add(notebook3);
        notebook.add(notebook4);
        notebook.add(notebook5);
        notebook.add(notebook6);
        notebook.add(notebook7);
        notebook.add(notebook8);
        return notebook;
    }

    static Set<Notbooks> filterSet(Map<Integer, String> map) {
        if (map.isEmpty()) return addNotebooks();
        Set<Notbooks> notebooks = addNotebooks();
        Set<Notbooks> set = new HashSet<>(notebooks);
        Map<String, String> colours = new HashMap<>();
        colours.put("чёрный", "Black");
        colours.put("черный", "Black");
        colours.put("серый", "Grey");
        colours.put("серебряный", "Silver");
        Map<String, String> marks = new HashMap<>();
        marks.put("асер", "Aser");
        marks.put("хонор", "Honor");
        marks.put("МСИ", "MSI");
        marks.put("асус", "Asus");
        Map<String, String> osystem = new HashMap<>();
        osystem.put("линукс", "Linux");
        osystem.put("линакс", "Linux");
        osystem.put("виндоус", "Win10");
        osystem.put("винда", "Win10");
        osystem.put("вин", "Win10");
        osystem.put("win", "Win10");
        osystem.put("windows", "Win10");
        osystem.put("биос", "BIOS");
        for (Notbooks notebook : notebooks) {

            if (map.containsKey(1) && notebook.RAM != Integer.parseInt(map.get(1))
                    || map.containsKey(2) && notebook.HDD != Integer.parseInt(map.get(2))
                    || map.containsKey(3) && !(notebook.TradeMark.equalsIgnoreCase(map.get(3)))
                    && !(notebook.TradeMark.equalsIgnoreCase(marks.get(map.get(3).toLowerCase())))
                    || map.containsKey(4) && !(notebook.OpSystem.equalsIgnoreCase(map.get(4)))
                    && !(notebook.OpSystem.equalsIgnoreCase(osystem.get(map.get(4).toLowerCase())))
                    || map.containsKey(5) && !(notebook.Colour.equalsIgnoreCase(colours.get(map.get(5).toLowerCase())))
                    && (!(notebook.Colour.equalsIgnoreCase(map.get(5))))
                    || map.containsKey(6) && notebook.Price >= Double.parseDouble(map.get(6))
                    || map.containsKey(7) && notebook.Rating <= Double.parseDouble(map.get(7))) {
                set.remove(notebook);

            }

        }
        return set;
    }

    static Map<Integer, String> NoteFilter() {
        Map<Integer, String> noteFilter = new HashMap<>(); // словарь критериев фильтрации
        noteFilter.put(1, "Объем оперативной памяти");
        noteFilter.put(2, "Объем жесткого диска");
        noteFilter.put(3, "Марка ноутбука");
        noteFilter.put(4, "Операционная система");
        noteFilter.put(5, "Цвет");
        noteFilter.put(6, "Максимальная цена");
        noteFilter.put(7, "Минимальный рейтинг покупателей");
        noteFilter.put(0, "Поиск");
        return noteFilter;
    }


}
