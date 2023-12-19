package exam01;

public class Student {
    int id ;
    String name;
    String subject;

    public Student(){
        // 멤버변수의 초기화 작업을 주로 진행 
    }                   // 컴파일러가 목적을 수행하기 위해 만들어놓은 기본 생성자
                        // 반환값은 주소값

    void showInfo(){
        System.out.printf("id=%d,name%s,subject=%s%n"
        ,id,name,subject);
    }
}
