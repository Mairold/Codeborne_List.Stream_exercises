import java.util.ArrayList;
import java.util.List;

public class Numbers {

    public int sumOfElements(List<Integer> input) {
        int sum = 0;
//        for (Integer number : input) {
//            sum += number;
//        }
//        return sum;
        return input.stream().reduce(0, Integer::sum);
    }

    public List<Integer> concatenate(List<Integer> list1, List<Integer> list2) {
        ArrayList<Integer> result = new ArrayList<>(list1);
        result.addAll(list2);
        return result;
    }

    public List<Integer> reverse(List<Integer> integers) {
        List<Integer> reversed = new ArrayList<>();
        for (int i = integers.size() - 1; i >= 0; i--) {
            reversed.add(integers.get(i));
        }
        //        Collections.reverse(reversed);
        return reversed;
    }

    public List<Integer> sort(List<Integer> integers) {
        List<Integer> sortedList = new ArrayList<>(integers);
//        boolean flag = true;
//        while (flag) {
//            flag = false;
//            for (int i = 0; i < sortedList.size()-1; i++) {
//                if (sortedList.get(i) > sortedList.get(i + 1)) {
//                    int temp = sortedList.get(i);
//                    sortedList.set(i, sortedList.get(i + 1));
//                    sortedList.set(i + 1, temp);
//                    flag = true;
//                }
//            }
//        }
//      return sortedList;
        return sortedList.stream().sorted().toList();
    }
}