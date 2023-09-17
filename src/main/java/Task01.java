/* Задание 1. Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли
  переданное число четным или нечетным:*/

public class Task01 {
    public static void main(String[] args) {
        System.out.println(evenOddNumber(6));
    }

    public static boolean evenOddNumber(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

}
