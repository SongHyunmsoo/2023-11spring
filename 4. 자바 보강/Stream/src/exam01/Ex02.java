package exam01;

import java.util.Arrays;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {

        String[] words1 = {"aaa","aaa","bb","cc","abcd","abcd"};
        Arrays.stream(words1)
                .distinct()
                .filter(s -> s.length() >= 3)
                .forEach(System.out::println);

        List<String> words2 = Arrays.asList("aaa","aaa","bb","cc","abcd","abcd");
        words2.stream()
                .distinct()
                .filter(s -> s.length() >=3)
                .forEach(System.out::println);





        System.out.println(words2);



    }
}
