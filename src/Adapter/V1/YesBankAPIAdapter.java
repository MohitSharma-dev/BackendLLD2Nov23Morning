package Adapter.V1;

public class YesBankAPIAdapter implements BankAPI{
    private YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public int checkBalance() {
        return yesBankAPI.getBalance();
    }

    @Override
    public boolean transfer(int amt, int to) {
//        figure out current_user of the application
        int current_user = 1;
        try {
            yesBankAPI.transferMoney(amt , current_user , to);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
        return true;
    }
}
