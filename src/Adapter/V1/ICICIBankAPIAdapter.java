package Adapter.V1;

public class ICICIBankAPIAdapter implements BankAPI{
    private ICICIBankAPI icicibankAPI = new ICICIBankAPI();

    @Override
    public int checkBalance() {
        return icicibankAPI.balanceCheck();
    }

    @Override
    public boolean transfer(int amt, int to) {
        return icicibankAPI.moneyTransfer(amt , 1 , to);
    }
}
