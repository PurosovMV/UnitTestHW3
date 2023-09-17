import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


class Task02Test {

    @Test
    void lowerBoundOfTheIntervalTest() {
        assertTrue(Task02.numberInIntarval(25)); //Проверка вхождения нижней границы интервала
    }

    @Test
    void upperBoundOfTheIntervalTest() {
        assertTrue(Task02.numberInIntarval(100)); //Проверка вхождения верхней границы интервала
    }

    @Test
    void theAverageBoundaryOfTheIntervalTest() {
        assertTrue(Task02.numberInIntarval(50)); //Проверка вхождения среднего значения в интервал
    }
    @Test
    void underInterval() {
        assertFalse(Task02.numberInIntarval(10)); //Проверка выхода значения за нижнюю границу интервала
    }

    @Test
    void beyondInterval(){
        assertFalse(Task02.numberInIntarval(101));//Негативная проверка выхода значения за верхнюю границу интервала
    }
}



