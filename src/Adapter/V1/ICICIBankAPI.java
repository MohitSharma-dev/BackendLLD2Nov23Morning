package Adapter.V1;

public class ICICIBankAPI {
    int balanceCheck(){
        System.out.println("Balance is being checked by ICICI Bank");
        return 50;
    }

    boolean moneyTransfer(int amt, int from, int to){
        System.out.println("Money is being transferred via ICICI BANK");
        return true;
    }
}
