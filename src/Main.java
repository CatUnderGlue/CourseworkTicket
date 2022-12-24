import java.util.Arrays;

public class Main {
    public static int[] numbers = {0, 1, 2, 3, 4, 5, 6, 7 ,8 ,9};
    public static void main(String[] args) {
        // 1 вопрос
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
        System.out.println();

        for (int number : numbers){
            System.out.println(number);
        }
        System.out.println();

        int count = 1;
        while (true) {
            if (count == 5){
                break;
            }
            System.out.println(count);
            count++;
        }
        System.out.println();

        do {
            System.out.println(count);
            count--;
        } while (count < 0);
        System.out.println();

        // 2 вопрос
        System.out.println(numbers[5]);

        // 3 вопрос
        Human someHuman = new Human("Акакий Акакиевич Акакьев", 32, "Moscow");

        System.out.println(Arrays.toString(splitString("abcdefg")));

        printSplitString("abcdefg");
    }

    public static String[] splitString(String str){
        if (str != null) {
            char[] chars = str.toCharArray();
            String[] strings = {"", ""};
            int index;
            if (chars.length % 2 != 0) {
                index = chars.length / 2 + 1;
            } else {
                index = chars.length / 2;
            }
            for (int i = 0; i < index; i++) {
                strings[0] += chars[i];
            }
            for (int i = index; i < chars.length; i++) {
                strings[1] += chars[i];
            }
            return strings;
        } else {
            throw new IllegalArgumentException("Ошибка ввода строки");
        }
    }

    public static void printSplitString(String str){
        if (str != null) {
            char[] chars = str.toCharArray();
            int size = str.length();
            int half;
            if (size % 2 == 0){
                half = size / 2;
            } else {
                half = size / 2 + 1;
            }


            char a[] = Arrays.copyOfRange(chars, 0, half);
            char b[] = Arrays.copyOfRange(chars, half, size);
            System.out.println("A: " + Arrays.toString(a));
            System.out.println("B: " + Arrays.toString(b));
        } else {
            throw new IllegalArgumentException("Ошибка ввода строки");
        }
    }
}