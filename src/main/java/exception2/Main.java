package exception2;

public class Main {

    public static void main(String[] args) throws ServiceException {

        try {
            //some codes


        } catch (Exception e) {
            throw new ServiceException( e.getMessage(),e, InternalErrorCode.PERSON_NOT_FOUND);
        }

    }
}
