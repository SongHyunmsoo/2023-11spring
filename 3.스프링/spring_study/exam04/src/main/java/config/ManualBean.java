package config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) // 타겟 시작지점
@Retention(RetentionPolicy.RUNTIME) // 런타임
public @interface ManualBean {
}
