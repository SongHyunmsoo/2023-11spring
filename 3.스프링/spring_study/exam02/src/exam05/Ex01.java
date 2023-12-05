package exam05;

public class Ex01 {
    public static void main(String[] args) {
        Calculator cal = new SimpleCalculator();
        int result = cal.add(10,20);
        System.out.println(result);

        // 마이너스
        int result2 = cal.minus(20,10);
        System.out.println(result2);

        //Calculator.num = 20;
        //파이널이 붙어서 숫자가 들어가지 않는다.
    }
}
