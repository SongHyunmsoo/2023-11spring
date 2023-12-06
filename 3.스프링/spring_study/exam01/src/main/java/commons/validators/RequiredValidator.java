package commons.validators;

import org.springframework.util.StringUtils;

public interface RequiredValidator {
    default void chekRequired(String str, RuntimeException e) {
        if (StringUtils.hasText(str)){
            throw e;
        }
    }

    default void chekTrue(boolean result, RuntimeException e) {
        if(!result) {
            throw e;
        }
    }

    // 참일때 예외 발생
    default void checkFalse(boolean result, RuntimeException e){
        if (result) {
            throw  e;
        }
    }

}
