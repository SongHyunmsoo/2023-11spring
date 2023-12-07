package proxyex;

public class ProxyCalculator implements Calculator{

    private Calculator calculator ;

    public ProxyCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public long factorial(long num) {

        long stime = System.nanoTime(); // 핵심 기능을 대신 수행
        try {

            //핵심 기능을 대신 수행
            long result = calculator.factorial(num);

            return result;
        }finally {
            long etime = System.nanoTime(); // 공통기능
            System.out.printf("걸린시간 : %d%n", etime - stime);

        }
    }
}
