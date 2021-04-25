package exception2;

public class ServiceException extends Exception {

    private InternalErrorCode internalErrorCode;

    public ServiceException(InternalErrorCode internalErrorCode ,String message) {
        super(message);
        this.internalErrorCode=internalErrorCode;
    }

    public ServiceException(String message, Throwable cause, InternalErrorCode internalErrorCode) {
        super(message, cause);
        this.internalErrorCode = internalErrorCode;
    }

    public ServiceException() {
    }


}
