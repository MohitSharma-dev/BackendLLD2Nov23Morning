package Adapter.V1;

public class BankAPIFactory {
    public static BankAPI getBankAPIByName(String bankName) {
        BankAPI bankAPI = null;
        if(bankName.equals("Yes Bank")){
            bankAPI = new YesBankAPIAdapter();
        } else if (bankName.equals("ICICI Bank")){
            bankAPI = new ICICIBankAPIAdapter();
        }
        return bankAPI;
    }
}
