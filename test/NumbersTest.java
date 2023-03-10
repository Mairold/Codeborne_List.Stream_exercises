import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumbersTest {

    private final Numbers numbers = new Numbers();

    @Test
    void sumOfElements_Imperative() {
        assertEquals(6, numbers.sumOfElementsImperative(List.of(1, 2, 3)));
    }

    @Test
    void sumOfElements_Imperative_negative() {
        assertEquals(50, numbers.sumOfElementsImperative(List.of(-10, 100, -40)));
    }

    @Test
    void sumOfElements_Imperative_empty() {
        assertEquals(0, numbers.sumOfElementsImperative(List.of()));
    }

    @Test
    void sumOfElements_Special() {
        assertEquals(6, numbers.sumOfElementsSpecial(List.of(1, 2, 3)));
    }

    @Test
    void sumOfElements_Special_negative() {
        assertEquals(50, numbers.sumOfElementsSpecial(List.of(-10, 100, -40)));
    }

    @Test
    void sumOfElements_Special_empty() {
        assertEquals(0, numbers.sumOfElementsSpecial(List.of()));
    }

    @Test
    void concatenate() {
        assertEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8), numbers.concatenate(List.of(1, 2, 3, 4), List.of(5, 6, 7, 8)));
    }

    @Test
    void reverse() {
        ArrayList<Integer> original = new ArrayList<>(List.of(2, 3, 5, 4, 1));
        assertEquals(List.of(1, 4, 5, 3, 2), numbers.reverse(original));
        assertEquals(List.of(2, 3, 5, 4, 1), original);
    }

    @Test
    void reverseSpecial() {
        ArrayList<Integer> original = new ArrayList<>(List.of(2, 3, 5, 4, 1));
        assertEquals(List.of(1, 4, 5, 3, 2), numbers.reverseSpecial(original));
        assertEquals(List.of(2, 3, 5, 4, 1), original);
    }

    @Test
    void reverseImperative() {
        ArrayList<Integer> original = new ArrayList<>(List.of(2, 3, 5, 4, 1));
        assertEquals(List.of(1, 4, 5, 3, 2), numbers.reverseImperative(original));
        assertEquals(List.of(2, 3, 5, 4, 1), original);
    }

    @Test
    void sort_Imperative() {
        assertEquals(List.of(1, 2, 3, 4, 5), numbers.sortImperative(List.of(3, 5, 1, 4, 2)));
    }

    @Test
    void sort_Imperative_biggerList() {
        assertEquals(List.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), numbers.sortImperative(List.of(-1, 3, -5, 5, -4, 1, 0, 4, -3, 2, -2)));
    }

    @Test
    void sort_Special() {
        assertEquals(List.of(1, 2, 3, 4, 5), numbers.sortSpecial(List.of(3, 5, 1, 4, 2)));
    }

    @Test
    void sort_Special_BiggerList() {
        assertEquals(List.of(-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5), numbers.sortSpecial(List.of(-1, 3, -5, 5, -4, 1, 0, 4, -3, 2, -2)));
    }
}