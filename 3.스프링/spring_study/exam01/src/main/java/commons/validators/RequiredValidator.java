package commons.validators;

public interface RequiredValidator {
    default void chekRequired(String str, RuntimeException e) {
        if (str == null || str.isBlank()){
            throw e;
        }
    }
}
