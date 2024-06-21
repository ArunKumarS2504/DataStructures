package Arrays;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1, 2, 4, 5};
        Set<Integer> set = new LinkedHashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        Integer[] result = set.toArray(new Integer[set.size()]);
        System.out.println(Arrays.toString(result));
    }
}