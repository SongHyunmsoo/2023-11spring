package exam01;

public class Ex03 {
    public static void main(String[] args) {
        book b1 = new book("책","저자");
        book b2 = new book("책","저자");
        System.out.println("b1==b2:" + (b1 == b2)); // 주소 비교 - 동일성 비교
        System.out.println("b1==b2:" + b1.equals(b2));
        System.out.println("b1.hashCode,b2.hashCode:"
                            + b1.hashCode()+ "," + b2.hashCode());

    }
}
