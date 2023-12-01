package exam04;


public class Ex01 {
    public static void main(String[] args) {
        //Book b1 = new Book();

        Book b1 = Book.builder()
                .title("책2")
                .author("저자2")
                .publisher("출판사2")
                .build();
        System.out.println(b1);
    }
}

