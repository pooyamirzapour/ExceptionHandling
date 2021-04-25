package exception3;

import exception1.InsufficientBalanceException;

public class Main {

    public static void main(String[] args) throws InsufficientBalanceException {
        //some codes
        if (true)
            throw new InsufficientBalanceException();
    }
}
