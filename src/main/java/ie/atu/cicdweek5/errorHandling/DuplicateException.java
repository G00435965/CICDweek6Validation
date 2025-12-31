package ie.atu.cicdweek5.errorHandling;

public class DuplicateException extends RuntimeException
{
    private String message;
    private String field;
    public DuplicateException(String field, String message)
    {
        this.field = field;
    }
    public DuplicateException(String messsage)
    {
        super(messsage);
    }
}
