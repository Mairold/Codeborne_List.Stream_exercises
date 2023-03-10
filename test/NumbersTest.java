import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    private final Numbers numbers = new Numbers();

    @Test
    void sumOfElements() {
        assertEquals(6, numbers.sumOfElements(List.of(1, 2, 3)));
    }

    @Test
    void sumOfElements_minus() {
        assertEquals(50, numbers.sumOfElements(List.of(-10, 100, -40)));
    }

    @Test
    void sumOfElements_tyhi() {
        assertEquals(0, numbers.sumOfElements(List.of()));
    }
}