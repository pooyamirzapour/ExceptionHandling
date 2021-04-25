package exception1;

public class Main {

    public static void main(String[] args) throws ServiceException {

        try {
            //some codes
            if (true)
                throw new InsufficientBalanceException();
        } catch (Exception e) {
            throw new ServiceException(e.getMessage(), e);
        }

    }
}
