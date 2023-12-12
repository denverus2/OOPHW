import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите данные в произвольном порядке, разделенные пробелом:");
        System.out.println("Фамилия Имя Отчество дата рождения номер телефона пол");
        String line = input.nextLine();
        input.close();

        String[] words = line.split(" ");

        if (words.length != 6) {
            System.out.println("Вы ввели неверное количество данных");
            return;
        }


        try {
            // Фамилия, имя и отчество - строки
            String surname = words[0];
            String name = words[1];
            String patronymic = words[2];

            // Дата рождения - строка формата dd.mm.yyyy
            String dateOfBirth = words[3];
            // Проверяем, что дата соответствует формату
            if (!dateOfBirth.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                // Если нет, выбрасываем исключение
                throw new IllegalArgumentException("Неверный формат даты рождения");
            }

            // Номер телефона - целое беззнаковое число без форматирования
            int phoneNumber = Integer.parseUnsignedInt(words[4]);

            // Пол - символ м или ж
            char gender = words[5].charAt(0);
            if (gender != 'м' && gender != 'ж') {
                throw new IllegalArgumentException("Неверный символ пола");
            }


            File file = new File(surname + ".txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(surname + name + patronymic + dateOfBirth + " " + phoneNumber + gender + "\n");
            writer.close();

            System.out.println("Данные записаны в файл " + file.getName());

        } catch (NumberFormatException e) {
            System.out.println("Неверный формат номера телефона");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
