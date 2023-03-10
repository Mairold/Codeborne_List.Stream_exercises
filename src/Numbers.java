import java.util.ArrayList;
import java.util.List;

public class Numbers {

    public int sumOfElements(List<Integer> input) {
        int sum = 0;
        for (Integer number : input) {
            sum += number;
        }
        return sum;
    }
}