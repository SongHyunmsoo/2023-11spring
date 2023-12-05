package exam;

public class C extends B{

    int numC = 30;

    public C() {
        super(); //B() 기본생성자 이자 지역변수
        System.out.println("C 생성자!");
    }
}
