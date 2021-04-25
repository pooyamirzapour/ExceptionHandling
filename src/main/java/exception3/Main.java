package exception3;

import exception1.InsufficientBalanceException;

public class Main {

    public static void main(String[] args) throws InsufficientBalanceException {
        //some codes for checking balance
        if (true)
            throw new InsufficientBalanceException();
    }
}
