package exam01;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex05 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("이름1");
        names.add("이름2");
        names.add("이름3");
        names.add("이름4");
        names.add("이름5");

        // 반복은 1번만 가능 커서가 마지막에서 고정
        Iterator<String> iter = names.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        }

        // 다시만들어서 커서가 멘처음 이동
        iter = names.iterator();
        while (iter.hasNext()) {
            String name = iter.next();
            System.out.println(name);
        
        /*for (String name : names) { // 항상된 for 문 - 콜렉션,배열
            System.out.println(name);
        }*/
            //names.forEach(System.out::println);
        }
    }
}