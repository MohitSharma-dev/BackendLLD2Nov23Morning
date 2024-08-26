package Adapter.V0;

public class YesBankAPI {
    int getBalance(){
        return 100;
    }
    void transferMoney(int amount , int from, int to){
        System.out.println("Money is being transferred via YES BANK");
    }
}
