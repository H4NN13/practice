public class tryCatch02 {
    public static void main(String[] args) {
        BankClient Denis = new BankClient();
        BankClient John = new BankClient();
        SmartWorker Stasy = new SmartWorker();
        try {
            Stasy.CheckClientForCredit(Denis);
            Stasy.CheckClientForCredit(John);
        } catch (ProblemWithLawException e) {
            throw new RuntimeException(e);
        } catch (BadCreditHistoryException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Проверка закончена");
        }

    }
    class BadCreditHistoryException extends Exception {}
    class ProblemWithLawException extends Exception {}
    static class BankClient{}
    interface BankWorker{
        boolean CheckClientForCredit (BankClient client) throws BadCreditHistoryException,
                ProblemWithLawException;

    }
    public static class SmartWorker implements BankWorker{
        @Override
        public boolean CheckClientForCredit(BankClient client) throws BadCreditHistoryException,
                ProblemWithLawException {
            return true;
        }
    }


    public static boolean getCreditForClient (BankWorker worker, BankClient client ){
        try {
            return worker.CheckClientForCredit(client);
        } catch (BadCreditHistoryException e) {
            System.out.println("Проблемы с банковской историей");
            return false;
        } catch (ProblemWithLawException e) {
            return false;
        }
    }
}
