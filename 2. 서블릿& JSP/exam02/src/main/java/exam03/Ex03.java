package exam03;

public class Ex03 {
    public static void main(String[] args) {
        A a1 = new C();

        A a2 = new D();

//      C c1 = (C) a2;  // 강제 형변환 에러
        // 객체의 상태를 체크하는 방법 instanceof 클래스

       if(a2 instanceof C){
        C c1 = (C) a2;
       }
    }
}
