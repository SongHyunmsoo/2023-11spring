package exam02;

import java.util.Arrays;
import java.util.List;

public class Ex01 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        nums.stream().mapToInt(x -> x );
    }

}
