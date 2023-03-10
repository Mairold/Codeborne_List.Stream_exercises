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

    @Test
    void concatenate() {
        assertEquals(List.of(1,2,3,4,5,6,7,8), numbers.concatenate(List.of(1,2,3,4),List.of(5,6,7,8)));
    }

    @Test
    void reverse() {
        assertEquals(List.of(1,2,3,4,5), numbers.reverse(List.of(5,4,3,2,1)));
    }

    @Test
    void sort() {
        assertEquals(List.of(1,2,3,4,5), numbers.sort(List.of(3,5,1,4,2)));
    }

    @Test
    void sort_biggerList() {
        assertEquals(List.of(-5,-4,-3,-2,-1,0,1,2,3,4,5), numbers.sort(List.of(-1,3,-5,5,-4,1,0,4,-3,2,-2)));
    }

}