package tasks.day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(" Введите город: ");
            String city = scanner.nextLine();

            if (city.equals("Stop"))
                break;
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов":
                    System.out.println(" это Россия ");
                    break;
                case "Рим":
                case "Милан":
                case "Турин":
                    System.out.println(" это Италия ");
                    break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон":
                    System.out.println(" это Англия ");
                    break;
                case "Мюнхен":
                case "Берлин":
                case "Кёльн":
                    System.out.println(" это Германия ");
                    break;
                default:
                    System.out.println(" Такой город не предусмотрен, повтори попытку ");
            }
        }
    }
}
