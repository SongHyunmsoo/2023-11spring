package exam02;


@MyAnno2(nums=10)  // value= "값"
public class Ex01 {
    public static void main(String[] args) {
        Class cls = Ex01.class;
        MyAnno2 anno = (MyAnno2)cls.getAnnotation(MyAnno2.class);
        String value = anno.value();
        System.out.printf("value=%s%n", value);

        int[] nums = anno.nums();
        System.out.println();

    }
}

