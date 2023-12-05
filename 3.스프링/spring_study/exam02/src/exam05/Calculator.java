package exam05;

public interface Calculator {

    int num = 10; // public static final
    int add(int num1,int num2);
    // public abstract 디폴트 값 으로 붙는다
    // 또한 다른 것 들은 사용할 수 없다

        default int minus(int num1, int num2) {
        return num1 - num2;

    }



}
