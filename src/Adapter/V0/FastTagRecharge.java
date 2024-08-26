package Adapter.V0;

public class FastTagRecharge {
    int recharge(int amount, YesBankAPI yesBankAPI){
       int balance =  yesBankAPI.getBalance();
       if(balance < amount){
           System.out.println("Can't recharge, not enough money");
           return 0;
       }
       return 1;
    }
}
