
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class Task01Test {

    @Test
    void evenNumberTest() {
        assertTrue(Task01.evenOddNumber(4));//Проверка чётного числа


    }

    @Test
    void oddNumberTest() {
        assertFalse(Task01.evenOddNumber(5));//Проверка нечётного числа


    }
}