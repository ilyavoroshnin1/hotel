import java.util.Scanner;

/**
 * программа для автоматизации работы администратора гостиницы
 * - 1 Поиск свободных комнат /getFreeRooms
 * - 2 Поиск свободных комнат с условиями /getFreeRooms 1000-2000 2 bar conditioner
 * - 3 Бронирование комнаты   /reserve 32
 * - 4 Выселение /outRoom 12
 * - 5 Справка по работе с программой
 */

public class Main {
    public static void main(String[] args) {
        Room[] rooms = {
                new Room(11, 2, 2000, true, true),
                new Room(12, 3, 3500, true, true),
                new Room(13, 1, 1000, false, false),
                new Room(21, 4, 5500, true, false),
                new Room(22, 3, 3500, true, true),
                new Room(23, 2, 1000, false, false),
                new Room(33, 4, 5500, false, false),
                new Room(32, 3, 3500, true, false),
                new Room(33, 1, 1000, false, true),
        };
        // 1
        Scanner scanner = new Scanner(System.in);
        String command = "";
        while (!command.equals("/exit")) {
            command = scanner.nextLine();
            if (command.equals("/getFreeRooms")) {
                for (int i = 0; i < rooms.length; i++) {
                    if (!rooms[i].isReserved())
                        System.out.print(rooms[i].getNum() + ", ");
                }
            } else if (command.contains("/reserve")) {
                int num = Integer.parseInt(command.split(" ")[1]); // формула вывода номера комнаты, который мы хотим забронировать
                for (int i = 0; i < rooms.length; i++) {
                    if (rooms[i].getNum() == num)
                        rooms[i].setReserved(true);
                }
            } else if (command.equals("/getFreeRooms")) {
                String[] splitted = command.split(" ");
                boolean bar = false;
                boolean conditioner = false;
                int min = 0;
                int max = (int) Double.POSITIVE_INFINITY; // от нуля (выше) до бесконености
                int place = 0;
                for (int i = 0; i < splitted.length; i++) {
                    String param = splitted[i];
                    if (param.equals("bar")) bar = true;
                    else if (param.equals("conditioner")) conditioner = true;
                    else if (param.contains("-")) { // проверка условия запроса цены
                        min = Integer.parseInt(param.split("-")[0]); // минимальное значение условия поиска по цене
                        max = Integer.parseInt(param.split("-")[1]); // макс порог поиска по цене
                    } else if (param.matches("\\d")) { // регулярное выражение
                        place = Integer.parseInt(param);
                    }
                }
                for (int i = 0; i < rooms.length; i++) { // перебираем все комнаты после набора необходиых параметров
                    Room room = rooms[i];
                    int mark = 0; // переменная оценка. Чтобы комната была выбрана при запросе кондея и бара, нужно, чтобы она набрала 2 балла.
                    if (room.isReserved()) continue; // проверка на резерв комнаты. если резерв - пропускаем дальше
                    if (bar && room.isBar()) mark++;
                    if (conditioner && room.isConditioner()) mark++;
                    if (room.getPrice() >= min && room.getPrice()<=max) mark++;
                    if (room.getPlace() == place || place == 0) mark++;
                    if (splitted.length - 1 == mark) // если комната подходит по параметрам
                        System.out.print(room.getNum() + ", ");
                }
            } else if (command.contains("/outRoom")) {
                int num = Integer.parseInt(command.split(" ")[1]); // формула вывода номера комнаты, который мы хотим забронировать
                for (int i = 0; i < rooms.length; i++) {
                    if (rooms[i].getNum() == num)
                        rooms[i].setReserved(false);
                }
            }
        }
    }
}