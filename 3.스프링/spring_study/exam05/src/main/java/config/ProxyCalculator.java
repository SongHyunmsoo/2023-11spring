package config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class ProxyCalculator {

@Pointcut("execution(* aopex..*(..))")
public void publicTarget(){}

    public Object process(ProceedingJoinPoint joinPoint) throws
            Throwable {

        //Signature sig = joinPoint.getSignature();
        //System.out.println(sig.toLongString());
        Object[] args = joinPoint.getArgs();
        long num = (long)args[0];
        System.out.println(num);

        long stime = System.nanoTime();

        try {
        Object result = joinPoint.proceed(); // 핵심 기능을 대신 수행하는 메서드
            //factorial(...)
            return result;
        }finally {
            long etime = System.nanoTime();
            System.out.printf("걸린시간 : %d%n",etime - stime );

        }
    }

}
