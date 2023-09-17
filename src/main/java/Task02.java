/*Задание 2. Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли
переданное число в интервал (25;100)*/
public class Task02 {
    public static void main(String[] args) {
        System.out.println(numberInIntarval(25));
    }


    public static boolean numberInIntarval(int n) {
        if (n >= 25 && n <= 100) {
            return true;
        } else {
            return false;
        }
    }
}


