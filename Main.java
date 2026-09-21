import java.util.Scanner;

public class PrimitiveTypesDemo {
    public static void main(String[] args) {
        // Виведення інформації про типи даних
        System.out.println("========== ІНФОРМАЦІЯ ПРО ПРИМІТИВНІ ТИПИ ==========");
        
        System.out.println("Тип: byte");
        System.out.println("Розмір: " + Byte.BYTES + " байт (" + Byte.SIZE + " біт)");
        System.out.println("Мінімальне значення: " + Byte.MIN_VALUE);
        System.out.println("Максимальне значення: " + Byte.MAX_VALUE);
        System.out.println("----------------------------------------------------");

        System.out.println("Тип: short");
        System.out.println("Розмір: " + Short.BYTES + " байт (" + Short.SIZE + " біт)");
        System.out.println("Мінімальне значення: " + Short.MIN_VALUE);
        System.out.println("Максимальне значення: " + Short.MAX_VALUE);
        System.out.println("----------------------------------------------------");

        System.out.println("Тип: int");
        System.out.println("Розмір: " + Integer.BYTES + " байт (" + Integer.SIZE + " біт)");
        System.out.println("Мінімальне значення: " + Integer.MIN_VALUE);
        System.out.println("Максимальне значення: " + Integer.MAX_VALUE);
        System.out.println("----------------------------------------------------");

        System.out.println("Тип: long");
        System.out.println("Розмір: " + Long.BYTES + " байт (" + Long.SIZE + " біт)");
        System.out.println("Мінімальне значення: " + Long.MIN_VALUE);
        System.out.println("Максимальне значення: " + Long.MAX_VALUE);
        System.out.println("----------------------------------------------------");

        System.out.println("Тип: float");
        System.out.println("Розмір: " + Float.BYTES + " байт (" + Float.SIZE + " біт)");
        System.out.println("Мінімальне значення: " + Float.MIN_VALUE);
        System.out.println("Максимальне значення: " + Float.MAX_VALUE);
        System.out.println("----------------------------------------------------");

        System.out.println("Тип: double");
        System.out.println("Розмір: " + Double.BYTES + " байт (" + Double.SIZE + " біт)");
        System.out.println("Мінімальне значення: " + Double.MIN_VALUE);
        System.out.println("Максимальне значення: " + Double.MAX_VALUE);
        System.out.println("====================================================\n");

        //  ведення та парсинг даних з терміналу
        Scanner scanner = new Scanner(System.in);
        System.out.println("========== ВВЕДЕННЯ ДАНИХ КОРИСТУВАЧЕМ ==========");

        // Введення byte
        System.out.print("Введіть значення для типу byte (від -128 до 127): ");
        String byteInput = scanner.nextLine();
        byte myByte = Byte.parseByte(byteInput);
        System.out.println("Збережено byte: " + myByte);

        // Введення short
        System.out.print("Введіть значення для типу short: ");
        String shortInput = scanner.nextLine();
        short myShort = Short.parseShort(shortInput);
        System.out.println("Збережено short: " + myShort);

        // Введення int
        System.out.print("Введіть значення для типу int: ");
        String intInput = scanner.nextLine();
        int myInt = Integer.parseInt(intInput);
        System.out.println("Збережено int: " + myInt);

        // Введення long
        System.out.print("Введіть значення для типу long: ");
        String longInput = scanner.nextLine();
        long myLong = Long.parseLong(longInput);
        System.out.println("Збережено long: " + myLong);

        // Введення float
        System.out.print("Введіть значення для типу float (використовуйте крапку, наприклад 3.14): ");
        String floatInput = scanner.nextLine();
        float myFloat = Float.parseFloat(floatInput);
        System.out.println("Збережено float: " + myFloat);

        // Введення double
        System.out.print("Введіть значення для типу double: ");
        String doubleInput = scanner.nextLine();
        double myDouble = Double.parseDouble(doubleInput);
        System.out.println("Збережено double: " + myDouble);

        // Введення boolean
        System.out.print("Введіть значення для типу boolean (true або false): ");
        String booleanInput = scanner.nextLine();
        boolean myBoolean = Boolean.parseBoolean(booleanInput);
        System.out.println("Збережено boolean: " + myBoolean);

        System.out.println("Всі дані успішно зчитано та перетворено!");
        
        scanner.close();
    }
}
