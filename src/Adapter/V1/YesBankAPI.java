package Adapter.V1;

public class YesBankAPI {
    int getBalance(){
        System.out.println("Balance is being checked by Yes Bank");
        return 100;
    }
    void transferMoney(int amount , int from, int to){
        System.out.println("Money is being transferred via YES BANK");
    }
}
