import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.Comparator.reverseOrder;

public class Numbers {

    public int sumOfElementsImperative(List<Integer> input) {
        int sum = 0;
        for (Integer number : input) {
            sum += number;
        }
        return sum;
    }

    public int sumOfElementsSpecial(List<Integer> input) {
        return input.stream().mapToInt(Integer::intValue).sum();
    }

    public List<Integer> concatenate(List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    public List<Integer> reverseSpecial(List<Integer> integers) {
        return IntStream.range(0, integers.size())
                .boxed()
                .sorted(reverseOrder())
                .map(integers::get)
                .collect(Collectors.toList());
    }

    public List<Integer> reverseImperative(List<Integer> integers) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = integers.size() - 1; i >= 0; i--) {
            reversed.add(integers.get(i));
        }
        return reversed;
    }

    public List<Integer> reverse(List<Integer> integers) {
        List<Integer> reversed = new ArrayList<>(integers);
        Collections.reverse(reversed);
        return reversed;
    }

    public List<Integer> sortImperative(List<Integer> integers) {
        List<Integer> sortedList = new ArrayList<>(integers);
        System.out.println(sortedList);
        boolean isNotFullySorted = true;
        while (isNotFullySorted) {
            isNotFullySorted = false;
            for (int i = 0; i < sortedList.size() - 1; i++) {
                if (sortedList.get(i) > sortedList.get(i + 1)) {
                    int temp = sortedList.get(i);
                    sortedList.set(i, sortedList.get(i + 1));
                    sortedList.set(i + 1, temp);
                    isNotFullySorted = true;
                    System.out.println(sortedList);
                }
            }
        }
        return sortedList;
    }

    public List<Integer> sortSpecial(List<Integer> integers) {
        return integers.stream().sorted().toList();
    }
}