package commons.exceptions;

public class BadRequestException extends RuntimeException{
    public BadRequestException(String messge){
        super(messge);
    }
}
